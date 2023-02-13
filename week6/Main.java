package week6;

import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.print;


public class Main {
   public  static ArrayList<Integer> items = new ArrayList<>();

    private static void addNumber(int i) {
       // ArrayList<Integer> items = new ArrayList<>();
      items.add(i);
        /*for(int number : items){
            System.out.print(i);

        }*/
       //print(items);
        System.out.println(items);
    }

    private static void removeNumber(int i) {

        items.remove((Integer) i);
        System.out.println(items);

    }

    private static String getTotal() {

        int totalSum = 0;
        for(int number : items) {
            totalSum += number;
        }

        return Integer.toString(totalSum);

    }
    private static boolean isFound(int i) {

        if(items.contains(i)) {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8));
        System.out.println("5 in the list : " + isFound(5));
        removeNumber(8);
        System.out.println("The total is: " + getTotal());
    }
}