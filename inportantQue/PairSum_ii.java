import java.util.*;
public class PairSum_ii {
    public static int pevit(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i =1; i< n; i++){
            if(arr.get(i) > arr.get(i -1)){
                return i;
            }
        }
        return 0;
    }

    public static Boolean findPairSum(ArrayList<Integer> arr , int key){
        int n = arr.size();
        int start = pevit(arr) +1;
        int end = pevit(arr);

        while(start != end){
            if(arr.get(start) + arr.get(end) == key){
                return true;
            }

            if(arr.get(start) + arr.get(end) < key){
                start = (start +1)% n;
            }else{
                end = (n + end -1)% n;
            }
        }
        return false;
    }

     public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(8);
        list1.add(3);
        list1.add(6);
        list1.add(6);
        list1.add(7);
        int key = 9;

        // System.out.println(FindPAir(list1 ,key));
        System.out.println(findPairSum(list1, key));
    }
    
}
