import java.util.*;

public class Search{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("apple",
        "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", 
        "pear", "strawberry", "watermelon"));

        System.out.println(binarySearch(fruits, "watermelon"));
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
        int midIndex, i;
        int from = 0;
        int to = haystack.size();

        while ((to - from) > 1){
            
            midIndex = from + ((to - from) / 2);
            
            i = needle.compareTo(haystack.get(midIndex));
            
            System.out.println("to = " + to);
            System.out.println("from = " + from);
            System.out.println("i = " + i);

            if (i == 0){
                return midIndex;
            }

            if (i > 0){
                from = midIndex + 1;
            }

            if (i < 0){
                to = midIndex - 1;
            }
        }
        if (needle.compareTo(haystack.get(to)) == 0){
            return to;
        }
        if (needle.compareTo(haystack.get(from)) == 0){
            return from;
        }
        return -1;
    }
}