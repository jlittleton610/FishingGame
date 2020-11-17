package com.company;
import java.util.*;

class Die
{
    private int sides;   // Number of sides
    private int value;   // The die's value

    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }

    public void roll()
    {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    public int getSides()
    {
        return sides;
    }

    public int getValue()
    {
        return value;
    }
}

public class Main {

    public static void main(String[] args) {

        String play;
        int score = 0;

        Scanner input = new Scanner(System.in);
        Die roll = new Die(6);

        System.out.print("Would you like to fish? Enter 'y' or 'Y' for yes or 'n' or 'N' for no: ");
        play = input.nextLine();

        //System.out.println("first play: " + play); //test play
        while (!(play.equals("y") || play.equals("Y") || play.equals("n") || play.equals("N")))
        {
            System.out.print("Please enter 'y' or 'Y' for yes or 'n' or 'N' for no: ");
            play = input.nextLine();
        }

        while (play.equals("y") || play.equals("Y"))
        {

            roll.roll();

            switch (roll.getValue())
            {
                case 1:
                    System.out.println("You caught a shoe!");
                    score -= 20;
                    break;

                case 2:
                    System.out.println("You caught seaweed.");
                    score -= 5;
                    break;

                case 3:
                    System.out.println("You caught a tuna!");
                    score += 10;
                    break;

                case 4:
                    System.out.println("You caught a small fish!");
                    score += 5;
                    break;

                case 5:
                    System.out.println("You caught some trash...");
                    score -= 10;
                    break;

                case 6:
                    System.out.println("You caught a shark!");
                    score += 20;
                    break;
            }
            /*score += roll.getValue();

            System.out.println("Die Value: " +roll.getValue());*/

            System.out.print("Would you like to fish again? Enter 'y' or 'Y' for yes or 'n' or 'N' for no: ");
            play = input.nextLine();

            while (!(play.equals("y") || play.equals("Y") || play.equals("n") || play.equals("N")))
            {
                System.out.print("Please enter 'y' or 'Y' for yes or 'n' or 'N' for no: ");
                play = input.nextLine();
            }

        }

        if (score > 0)
        {
            System.out.println("Great job! You ended with a fishing score of: " + score);
        }
        else if (score < 0)
        {
            System.out.println("Better luck next time. Your fishing score is: " + score);
        }
        else if (score == 0)
        {
            System.out.println("It could be worse! Your fishing score is: " + score);
        }



    }
}
