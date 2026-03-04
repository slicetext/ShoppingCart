import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Item> catalog;
    private HashMap<Item, Integer> inventory;

    public Inventory(){
        catalog = new ArrayList<>();
        inventory = new HashMap<>();
    }

    public Item getItem(String name){
        for(Item i : catalog){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public Item getItem(int id){
        for(Item i : catalog){
            if(i.getId() == id){
                return i;
            }
        }
        return null;
    }

    public int getItemQuantity(Item i){
        return inventory.get(i);
    }

    public ArrayList<Item> getCatalog(){
        return catalog;
    }

    public void loadInventoryFromFile(String filename){
        File file = new File(filename);

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split(",");
                Item item = new Item(Integer.parseInt(arr[1]), arr[0], Double.parseDouble(arr[2]));
                catalog.add(item);
                inventory.put(item, Integer.parseInt(arr[3]));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
