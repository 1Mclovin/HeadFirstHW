package Game;

public class GameTest {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameTest helper = new GameTest();


        SimpleDotComGame theDotCom = new SimpleDotComGame();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you took" + numOfGuesses + "guesses");
            }
        }



    }

    private String getUserInput(String enter_a_number) {
        return enter_a_number;
    }
}
