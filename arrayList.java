import java.util.*;

public class arrayList {

    public static void swaparr(ArrayList<Integer> arr ,int ind1, int ind2){
        int temp = arr.get(ind1);
        arr.set(ind1 , arr.get(ind2));
        arr.set(ind2 , temp);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        //add elsement
        arr.add(1); //O(1)
        arr.add(2);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        // arr.add(4 , 1);//O(n);
        //  System.out.println(arr);

        // // get Element
        // int n = arr.get(2); // O(1);
        // System.out.println(n);

        // //remove element;
        // arr.remove(2);   //O(n)
        // System.out.println(arr);

        // //Set index At index 
        // arr.set(2, 10);
        // System.out.println(arr);

        // //check Contains 
        // boolean m =  arr.contains(4); //O(n)
        //  System.out.println(m);

        //reverse The array;
        // for(int i= arr.size() -1 ; i>0;i--){
        //     System.out.print(arr.get(i) + " ");
        // }

        // //max int the arr;
        // int max =Integer.MIN_VALUE;
        // for(int i =0; i < arr.size() ; i++){
        //     max = Math.max(max , arr.get(i));
        // }
        // System.out.println("The max arr num is : " + max);

        // // call Swap function 
        // swaparr(arr, 1, arr.size()-1);
        // System.out.println(arr);

        // //Sort Accending order
        // Collections.sort(arr);
        // System.out.println(arr);

        // //Sort in Desending order
        // Collections.sort(arr , Collections.reverseOrder());
        // System.out.println(arr);


        // // Multi-Level ArrayList 
        // ArrayList<ArrayList<Integer>> mainaArr = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(3);
        // list1.add(5);
        // list1.add(3);
        // list1.add(5);
        // list1.add(3);
        // list1.add(5);
        // mainaArr.add(list1);

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(5);
        // list.add(3);
        // list.add(5);
        // list.add(3);
        // list.add(5);
        // mainaArr.add(list);

        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(5);
        // list3.add(3);
        // list3.add(3);
        // list3.add(5);
        // list3.add(3);
        // list3.add(5);
        // mainaArr.add(list3);

        // System.out.println(mainaArr);
        // list.remove(5);
        // list1.remove(3);
        // list3.remove(5);
        // list3.remove(3);
        

        // for(int i =0; i< mainaArr.size() ; i++){
        //     ArrayList<Integer> Currarr = mainaArr.get(i);
        //     for(int num: Currarr){
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }


       

    }
}
