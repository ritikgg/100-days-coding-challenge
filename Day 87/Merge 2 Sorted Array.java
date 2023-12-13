import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
       
        Set<Integer> resultSet = new HashSet<>();
        for(int element : a){
            resultSet.add(element);
        }
        for(int element : b){
            resultSet.add(element);
        }
         List<Integer> listFromSet = new ArrayList<>(resultSet);
         return listFromSet;


       }
}
