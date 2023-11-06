import java.util.Scanner;
public class Menu {
    String characterforename;
    String charactersurname;

    public void nameChar(String firstcharname, String lastcharname){ //constuctor of the menu class
        this.characterforename = firstcharname;
        this.charactersurname = lastcharname;

    }

    public void welcomemessage(){

        System.out.println("Welcome to...");
        System.out.println ("Some fukin game idk");


    }

    public void inputcharname(){ //method of the menu class
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your character firstname: ");
        this.characterforename = scan.nextLine();

        System.out.println("Enter Your character lastname: ");
        this.charactersurname = scan.nextLine();

        System.out.println("Your character is called " + characterforename + " " + charactersurname);




    }

}
