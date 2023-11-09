import java.lang.reflect.Array;
import java.util.ArrayList;

public class inventory extends Menu{

    String item;

    private ArrayList<String> inventory = new ArrayList<>();

    public void playerInv(){

        inventory = new ArrayList<>();


    }

    public void addItem(String item){

        inventory.add(item);

    }

    public void removeItem(){

        inventory.remove(item);


    }

    public void displayInv(){

        if (inventory.isEmpty()){
            System.out.println("You inventory is empty");
        }else{
            System.out.println(inventory);
        } for (String item : inventory){
            System.out.println(" - " + item);
        }


    }



}
