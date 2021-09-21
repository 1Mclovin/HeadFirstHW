package Game;

import org.w3c.dom.ls.LSOutput;

public class SimpleDotComGame<locationCells> {
    int [] locationCells;
    int numOfHits=0;
    private String StringGuess;


    public String checkYourself(String userGuess){
        Integer integer = null;
        int guess = integer.parseInt(StringGuess);
        String result ="miss";
    }

    public void setLocationCells(int [] locationCells){

    }


    for(int cell : locationCells ){
        int guess = 0;
        if (guess == cell){
            String result = "hit";
            numOfHits++;
            break;
        }
    }

    if(numOfHits == locationCells.length){
        result = "kill";}


    System.out.println(result);
    return result;

}
