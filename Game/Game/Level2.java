import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class Level2 extends Menu{

    inventory inv = new inventory();
    Scanner lvl2scan = new Scanner(System.in);

    public void lvl2scenesetter(){

        System.out.println("You see a key on the floor");
        System.out.println("You pick it up");
        inv.addItem("Key");

        System.out.println("Press 1 to view you inventory");


        String lvl2choice1;

        lvl2choice1 = lvl2scan.nextLine();

        switch (lvl2choice1){
            case "1":
                inv.displayInv();
                break;

            case "2":
                System.out.println("you move on without checking you inventory");
                break;
        }

        System.out.println("Having left the switch alone you shine your torch on the door handle in front of you");
        System.out.println("You notice there is a keyhole");



    }


    public void level2door() {

        //key opens door shoulder doesnt if else in the case to open the door

        String lvl2choice2;


        lvl2choice2 = lvl2scan.nextLine();

        switch (lvl2choice2) {
            case "1":
                System.out.println( characterforename + "you reach into your backpack and pull out the key");
                System.out.println("you try the key in the door and it fits perfectly");
                System.out.println("The door swings open...");
                break;

            case "2":
                System.out.println(characterforename + "swings their foot towards the door");
                System.out.println("BANG");
                System.out.println("the door doesn't budge");

                System.out.println("a searing ache goes up your leg");

                Level2 lvl2repeatcase2 = new Level2();
                lvl2repeatcase2.level2door();
                break;


            case "3":
                System.out.println("you roll on it...");

                Dicerollclass diceroll = new Dicerollclass();
                int randomroll = diceroll.Roll();

                if (randomroll <=15){
                    System.out.printf("You try and pick the lock");
                    System.out.println("Now the lock is broken");
                }else {
                    System.out.printf("You try and pick the lock");
                    System.out.println("the lock clicks open");
                    System.out.println("you wonder if this was the best way to open the door...");
                }
                break;

            case "4":
                inv.displayInv();
                Level2 lvl2repeatcase4 = new Level2();
                lvl2repeatcase4.level2door();
                break;







        }

    }



}
