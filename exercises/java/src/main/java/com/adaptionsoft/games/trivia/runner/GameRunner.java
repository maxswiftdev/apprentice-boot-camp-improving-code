
package com.adaptionsoft.games.trivia.runner;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;
import com.adaptionsoft.games.uglytrivia.Player;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		Game aGame = new Game();
		aGame.addPlayer(new Player("Chet"));
		aGame.addPlayer(new Player("Pat"));
		aGame.addPlayer(new Player("Sue"));

		Random rand = new Random(Integer.parseInt(args[0]));
	
		do {
			
			aGame.moveOnRoll(rand.nextInt(5) + 1);
			
			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
			
			
			
		} while (notAWinner);
		
	}
}
