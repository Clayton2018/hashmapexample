import javax.print.DocFlavor;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String args[]){

        HashMap<String, String> fruitBowl = new HashMap<String, String>(2);

        addElements(fruitBowl);

        displayElements(fruitBowl);

        //Getting the value by getting the key
        String bananaColour = fruitBowl.get("Banana");

        //Searching for fruit in the bowl
        findElements(fruitBowl, "Pear");
        findElements(fruitBowl, "Banana");

    } //end main

    public static void addElements(HashMap<String, String> fruitBowl) {

        fruitBowl.put("Apple", "Green");
        fruitBowl.put("Cherry", "Red");
        fruitBowl.put("Orange", "orange");
        fruitBowl.put("Banana", "Yellow");

    }//end of addElements

    public static void displayElements(HashMap<String, String> fruitBowl){

        for (HashMap.Entry<String, String> fruit : fruitBowl.entrySet()) {

            System.out.println("Fruit: " + fruit.getKey()
                               + " - Color: " + fruit.getValue());

        }

    }//end of displayElements

    public static void findElements(HashMap<String, String> fruitBowl, String fruit){

        if(fruitBowl.containsKey(fruit)){

            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));

        }

        else {

            System.out.println("There is no " + fruit + " in the bowl!");

        }

    }

}//end class

