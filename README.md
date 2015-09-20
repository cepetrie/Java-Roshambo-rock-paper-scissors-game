Create the Roshambo (rock paper scissors) game

Console:

Welcome to the game of Roshambo

Enter your name: Stani

Would you like to play Bart or Lisa? (B/L): b

Rock, paper, or scissors? (R/P/S): r

Stani: rock
Bart: rock
Draw!

Play again? (y/n): y

Rock, paper, or scissors? (R/P/S): p

Stani: paper
Bart: rock
Stani wins!

Play again? (y/n): y

Rock, paper, or scissors? (R/P/S): s

Stani: scissors
Bart: rock
Bart wins!

Play again? (y/n): n

Operation:

The application prompts the player to enter a name and select an opponent.

The application prompts the player to select rock, paper, or scissors. Then, the application displays the player’s choice, the opponent’s choice, and the result of the match.

The application continues until the user doesn’t want to play anymore.

If the user makes an invalid selection, the application should display an appropriate error message and prompt the user again until the user makes a valid selection.

Specifications:

Create an enumeration named Roshambo that stores three values: rock, paper, and scissors. This enumeration should include a toString method that can convert the selected value to a string.

Create an abstract class named Player that stores a name and a Roshambo value. This class should include an abstract method named generateRoshambo that allows an inheriting class to generate and return a Roshambo value. It should also include get and set methods for the name and Roshambo value.

Create classes named Bart and Lisa that inherit the Player class and implement the generateRoshambo method. The Bart class should always select rock. The Lisa class should randomly select rock, paper, or scissors (a 1 in 3 chance of each).

Create a class named Player1 that inherits the Player class and implements the generateRoshambo method (even though it isn’t necessary for this player). This method can return any value you choose.

Create a class named RoshamboApp that allows the player to play Bart or Lisa as shown in the console output. Rock should beat scissors, paper should beat rock, and scissors should beat paper.

Use the Validator class or a variation of it to validate the user’s entries.
