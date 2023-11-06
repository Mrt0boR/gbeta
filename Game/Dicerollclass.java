import java.util.Random;
public class Dicerollclass {
    public int Roll(){

        //initialises the ranodom method
        Random randomgen = new Random();

        //assign int random roll for if statement parameters
        int randomroll = randomgen.nextInt(20) + 1; //sets a bount of 1-19+ to make it a 20d

        //conditions for success -- less then or equal to 10 is too low and you die.

        return randomroll;

    }



}
