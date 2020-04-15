import java.util.*;

public class Sort{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("cherry", 
        "apple", "mango", "watermelon", "pear", "papaya", "banana", "banana", 
        "lemon", "strawberry", "lime"));

        System.out.println("Original: " + fruits);
        selectionSort(fruits);
        System.out.println("Sorted: " + fruits);
    }

    public static void selectionSort(ArrayList<String> list){
        
        int minIndex;
        String temp;

        for (int n = 0; n < list.size(); n++){
            minIndex = n;

            for (int i = n; i < list.size(); i++){
                if (list.get(i).compareTo(list.get(minIndex)) < 0) {
                    minIndex = i;
                }
            }

            temp = list.get(n);
            list.set(n, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
    
    public static void insertionSort(ArrayList<String> list){

    }

    public static void bubbleSort(ArrayList<String> list){

    }
}