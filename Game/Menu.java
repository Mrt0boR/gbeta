import java.util.Scanner;
//this is the main menu - as it is the beginning the funcitonality of the code starts here with this parent class
public class Menu {
    String characterforename;
    String charactersurname;

    //consturctor for assigned character names; allows assigned name to be carries across runtime
    public void nameChar(String firstcharname, String lastcharname) { //constuctor of the menu class
        this.characterforename = firstcharname;
        this.charactersurname = lastcharname;

    }

    public void welcomemessage() {

        System.out.println("Welcome to...");
        System.out.println("Some game idk");


    }

    //charactername input using the scanner class -- allows user to sign their name
    //this is linked to the constructor variables with character forname and surname global vars.
    public void inputcharname() { //method of the menu class
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your character firstname: ");
        this.characterforename = scan.nextLine();

        System.out.println("Enter Your character lastname: ");
        this.charactersurname = scan.nextLine();

        System.out.println("Your character is called " + characterforename + " " + charactersurname);


    }
}
