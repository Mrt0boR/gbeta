import java.util.Scanner;
public class Level1 extends Menu {

    delayers delay = new delayers();

    public void scenesetter() throws InterruptedException {

        System.out.println(characterforename + " awakens in a dark chamber.the lights are out.");

        delay.sleep5000();

        System.out.println(characterforename + " places their hands outward, they feels a cold switch");

        delay.sleep2000();

        System.out.println("What do you do?");

        delay.sleep2000();

        System.out.println("\n");
        System.out.println("1.Flick the switch");
        System.out.println("\n");

        delay.sleep2000();

        System.out.println("or");
        System.out.println("\n");

        delay.sleep2000();

        System.out.println("2.Leave it alone");
        System.out.println("\n");

        delay.sleep2000();

        System.out.println("\n");

        System.out.println("Make your choice with keys 1 or 2");
        System.out.println("\n");

        delay.sleep3000();


        System.out.println("Or press 3 to roll a random dice number");

    }



//first options of the first level
    public void lvl1op1() {
        //scanner init
        Scanner lvl1scan = new Scanner(System.in);
        String lvl1choice;

        lvl1choice = lvl1scan.nextLine();



        //options with a switch instead of an if else statement
        switch (lvl1choice) {

            case "1" :
                System.out.println(characterforename + " Flicks the switch.");

                delay.sleep3000();

                Death switchdeath = new Death();
                switchdeath.deathbyexplosion();
                break;


            case "2":
                System.out.println("You leave the lightswitch well alone");

                delay.sleep1000();

                System.out.println("Instead you take out your phone and turn on the torch");

                delay.sleep1000();

                System.out.println("You are safe for now ");
                break;

            case "3":
                Dicerollclass diceroll = new Dicerollclass();
                int randomroll = diceroll.Roll();

                if (randomroll <= 10){

                    System.out.println("Rolling dice");

                    delay.sleep1000();

                    System.out.println(characterforename + " panics and violently bashes the light switch angrily");

                    //initialise unique deathroll method from the Death class
                    //init death class
                    Death death = new Death();
                    //deathclass object + method applied to the death class
                    death.deathroll();


                }else{ //random roll is 11 and up = the player lives
                    System.out.println(characterforename + " ponders the relevance of a lightswitch and why it has a wire connected to what looks like a pipe bomb");

                    delay.sleep1000();

                    System.out.println(" leaves the switch well alone");
                }

        }

    }


}
// add a super to inherit chosen char name
