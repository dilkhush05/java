import java.security.Key;

public class Recursion {
    
//     Question 1 : For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
// Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output : 1 5 7 8

public static void findIndx(int arr[] , int key , int i){
    int n = arr.length;
    if(i == n){
        return;
    }
    
    if(arr[i] == key){
        System.out.print(i + " ");
       
    } 
    findIndx(arr, key , i+1);

}

// Question 2 :
// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.
// Sample Input : 1947
// Sample Output : “one nine four seven”
 static String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

public static void convertintStr(int n){
    if(n == 0){
        return;
    }

    convertintStr(n / 10);

    int digit =  n % 10;

    System.out.print(words[digit] + " ");
}

// Write a program to find Length of a String using Recursion.

   public static int findLength(String str) {
        // Base case: when string is empty
        if (str.equals("")) {
            return 0;
        }
        // Recursive case: remove first character and count
        return 1 + findLength(str.substring(1));
    }
public static void main(String[] args) {
    // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    // int k = 2;
    // findIndx(arr, k, 0);
    // int n =2025555839;
    // convertintStr(n);

    String str = "HelloWorld";
    System.out.println("Length: " + findLength(str));


}

}
