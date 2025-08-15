import java.util.*;
public class ContainerWithMaxWater {
    //Brute Force TCom: O(n^2);
      public static int MosrtWater(ArrayList<Integer> arr){
        int ans =0;
        for(int i =0; i < arr.size();i++){
            for(int j = 1; j<arr.size();j++){
                int height = Math.min(arr.get(i) ,arr.get(j));
                int width = j -i;
                ans = Math.max(ans , (height * width));
            }
        }
        return ans ;
    }

    //Usind two pointer , TCom : O(n);
    public static int maxwater(ArrayList<Integer> arr){
        int maxWater = 0;
        int n = arr.size();
        int Lpntr = 0, Ppntr = n-1;
        while(Lpntr < Ppntr){
            int hieght = Math.min(arr.get(Lpntr) , arr.get(Ppntr));
            int width = Ppntr - Lpntr;
            maxWater = Math.max(maxWater , (hieght * width));

            if(arr.get(Lpntr) > arr.get(Ppntr)){
                 Ppntr--;
            }else{
                Lpntr++;
            }
        }
        return  maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(8);
        list1.add(3);
        list1.add(6);
        list1.add(3);
        list1.add(7);

        // int maxwater = MosrtWater(list1);
        // System.out.println(maxwater);

        int ans = maxwater(list1);
        System.out.print(ans);

    }
}
