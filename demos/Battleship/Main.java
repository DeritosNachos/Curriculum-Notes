import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		String myMessage = "Hello, World!";
		int[] aListOfInts = {2, 7 , 11, 15};
		game myGame = new game();
		int[] answer = myGame.twoSum(aListOfInts, 9);
		System.out.println(Arrays.toString(answer));

		myGame.initializeBoard(myGame.getBoard(), 10,10);
		myGame.printBoard(10,10);






	}
}