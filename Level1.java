import java.util.Scanner;
public class Level1 extends Menu {

    public void scenesetter() throws InterruptedException {

        System.out.println(characterforename + " awakens in a dark chamber.the lights are out.");

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(characterforename + " places his hands outward, he feels a cold switch");

        System.out.println("What do you do?");
        System.out.println("1.Flick the switch");
        System.out.println("or");
        System.out.println("2.Leave it the fuck alone");
        System.out.println("Make your choice with keys 1 or 2");
    }




    public void lvl1op1() {
        Scanner lvl1scan = new Scanner(System.in);
        String lvl1choice;

        lvl1choice = lvl1scan.nextLine();







        switch (lvl1choice) {

            case "1" :
                System.out.println( characterforename + " Flicks the switch.");
                Death switchdeath = new Death();
                switchdeath.deathbyexplosion();
                break;


            case "2":
                System.out.println("You leave the lightswitch well the fuck alone");
                System.out.println("Instead you take out your phone and turn on the torch");
                System.out.println("You are safe for now ");
                break;



        }

    }


}
// add a super to inherit chosen char name