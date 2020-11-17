# FishingGame
Fishing game for Java class.

For this assignment, you will write a program that simulates a fishing game.  In this game, a six-sided die is rolled to determine what the user has caught.  Each possible item is worth a certain number of fishing points.  The points will remain hidden until the user is finished fishing, and then a message is displayed congratulating the user, depending on the number of fishing points gained.

Here are some suggestions for the game's design:

Each round of the game is performed as an iteration of a loop that repeats as long as the player wants to fish for more items.
At the beginning of each round, the program will ask the user whether or not he or she wants to continue fishing.
The program simulates the rolling of a six-sided die.  Use the attached Die.javaPreview the document class (the code for this class can also be found in Code Listing 6-14 in Gaddis) to accomplish this.
Each item that can be caught is represented by a number generated from the die; for example, 1 for a 'huge fish", 2 for "an old shoe", 3 for "a little fish" and so on.
Each item the user catches is worth a different amount of points.
The loop keeps a running total of the user's fishing points.
After the loop has finished, the total number of fishing points is displayed, along with a message that varies depending on the number of points earned.
