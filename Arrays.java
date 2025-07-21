import java.util.*;
import java.lang.String;
public class Arrays {
    public static int findname(String name[] , String key){
        for(int i = 0;i<name.length;i++){
            if(key == name[i]){
                return i;
            }
        }
        return -1;
    }
    public static int largestInArray (int arr[] ){
        int lrg = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if( lrg < arr[i]){
                lrg = arr[i];

            }
        }
        return lrg;
    }
    public static int SmallestInArray (int arr[] ){
        int sma = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            if( arr[i] < sma){
                 sma = arr[i];

            }
        }
        return sma;
    }
    public static int linearSearch (int arr[],int key){
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        //HOW TO CREATE ARRAY
        // int marks[] = new int[50];
        // int numbers[] = {1,2,2,3,};

        String names[] = {"HariKishor" , "Radhe", "Dilkhush", "Manish", "Rajiv", "hero"};

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Key : ");
        // String key = Sc.next();

        // int key = Sc.nextInt();

        // int arr[]= {1,45,23,78,6,44,69,64,63,34};

        // arr[0] = Sc.nextInt();
        // arr[1] = Sc.nextInt();
        // arr[2] = 100;

        // System.out.println("The marks of che is :" + arr[0]);
        // System.out.println("The marks of Math is :" + arr[1]);
        // System.out.println("The marks of Phy is :" + arr[2]);
        // int avg = (arr[0] + arr[1] +arr[2])/3;

        // System.out.println("The aVarege of all subject is : " + avg + "%");

        // System.out.println("The length of array is :" + arr.length);

        // int index = linearSearch(arr, key);
        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("The number " + key + "is on " + index + " ind" );
        // }
        // System.out.println("the largest valu of arr is :"+ largestInArray(arr)  );
        // System.out.println("the Smallest valu of arr is :"+ SmallestInArray(arr)  );
         

         int index = findname(names, "hero");
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println( " Hero is Avalibal on " + index  );
        }

        Sc.close();
    }
}
