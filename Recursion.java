public class Recursion {
    public static void printDecrisingnum(int n ){
        System.out.print(n + " " );
        if(n == 1){
            return;
        }    
        printDecrisingnum(n -1);
        
        
    }
    public static void printincreasingnum(int n ){
        
        if(n == 1){
            System.out.print(n + " " );
            return;
        }    
        printincreasingnum(n -1);
        System.out.print(n + " " );
        
        
    }

    public static int factorialOfN(int n){
        if(n == 0){
            return 1;
        }
        // int fn = n * factorialOfN(n-1);
        return n * factorialOfN(n-1);
    }

    public static int sumOfNaturalNum(int n ){
        if(n == 0){
            return 0;
        }
        return n + sumOfNaturalNum(n -1);
    }

    public static int nthFabonacchiNum(int n){
        if( n == 0 || n == 1){
            return n;
        }
        return nthFabonacchiNum(n-1) + nthFabonacchiNum(n-2);
    }

    public static Boolean checkSorted(int arr[], int i){
        if(i == arr.length -1 ){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return checkSorted(arr, i + 1);
    }

    public static int FirstOccarence(int arr[], int key, int i){
        if(i == arr.length ){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return FirstOccarence(arr, key, i+1);
    }
    public static int lastOccarence(int arr[], int key, int i){
        if(i == arr.length ){
            return -1;
        }
        int isFound = lastOccarence(arr ,key, i+1);
        if( isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static int  powerOfN(int x,int n){
        if(n == 0){
            return 1;
        }
        return n * powerOfN(x, n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        // printincreasingnum(n);
        // System.out.println(factorialOfN(5));
        // System.out.println(sumOfNaturalNum(3));
        // System.out.println(nthFabonacchiNum(n));

    int arr[]= {1,2,2,3,6,4,5};
        // System.out.println( checkSorted(arr, 0));

        // System.out.println(FirstOccarence(arr, 2, 0));

        // System.out.println(lastOccarence(arr, 2, 5));

        System.out.println(powerOfN(2, 5));

    }
}
