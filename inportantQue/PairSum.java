import java.util.*;
public class PairSum {
    //Brute Forse TCom : O(n^2)
    public static Boolean FindPAir(ArrayList<Integer> arr, int key){
        for(int i =0; i< arr.size();i++){
            for(int j = 0 ; j<arr.size(); j++){
                if(arr.get(i) + arr.get(j) == key){
                    return true;
                }
            }
        }
        return false ;
    }

    // optimise way (Two Pointer)
    public static Boolean FindPairSum(ArrayList<Integer> arr ,int key ){
        Collections.sort(arr);
        int n = arr.size();
        int start = 0, end = n-1;

        while(start < end){
            if(arr.get(start) + arr.get(end) == key){
                return true;
            }

            if(arr.get(start) + arr.get(end) < key){
                start ++;
            }
            
            if(arr.get(start) + arr.get(end) > key){
                end--;
            }
            
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        list1.add(4);
        // list1.add(6);
        // list1.add(6);
        // list1.add(7);
        int key = 6;

        // System.out.println(FindPAir(list1 ,key));
        System.out.println(FindPairSum(list1, key));
    }
}
