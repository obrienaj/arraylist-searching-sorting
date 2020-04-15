import java.util.*;

public class Search{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("apple",
        "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", 
        "pear", "strawberry", "watermelon"));

        System.out.println(search(fruits, "blueberry"));
    }

    public static int search(ArrayList<String> haystack, String needle){
        for (int i = 0; i < haystack.size(); i++){
            if (haystack.get(i).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<String> haystack, String needle){
        return -1;
    }
}