import java.util.Scanner;


public class function {
    public static void Swap(int n, int m){
        int temp = n;
        n = m;
        m = temp;

        System.out.println("The swaped number of n & m  is: "+ n + " and " + m  );
    }
    
    public static int product(int a, int b){
        int c = a*b;
        return c;

    }

    public static int factroial(int n ){
        int x =  1;
        for(int i = 1; i <=n ; i++){
            x = x * i;
        }
        return x ;
    }
    public static int BinomialCofficient(int n, int m){
         int bino =  factroial(n) / factroial(m)* factroial(n-m);
         return bino;

    }

    //  Function Overloading wit the same Data Types  
     public static int sum(int a , int b ){
        return (a+b);
     }
     public static int sum(int a , int b , int  c ){
        return (a+b+c);
     }

    // function overloading with different data type parameter 
     public static float mul(int a , float b ){
        return (a*b);
     }
     public static float mul(int a , int b , float c ){
        return (a*b*c);
     }

    public static Boolean primeORnot(int n ){
        if(n == 2){
            return true;
        }
        for(int i =2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // OPTIMIZE TYPE  
    public static Boolean isprime(int n ){
        if (n == 2){
            return true;
        }
        for(int i = 2 ;i <= Math.sqrt(n); i++){
            if(n%i == 0 ){
                return false ;
            }
        }
        return true;
    }

//  print all prime number in Range 
    public static void yesprime(int n){
        for (int i = 2; i<= n ; i++){
            if(isprime(i) == true){
                System.out.println("the prime is: "+ i) ;
            }
        }
    }


//  Binary number to Decimal conversion 
    public static void BINtoDC(int n){
        int pow = 0;
        int Decimal = 0;

        while (n > 0) {
            int lastdigit = n % 10;

            Decimal = Decimal + (lastdigit * (int)Math.pow(2, pow));
            n = n /10;   
            pow++;
        }
        System.out.println("The Decimal of "+ n +"is : " + Decimal);

    }

    //Decimal  number to Binary conversion 
    public static void DECtoBIN(int n){
        int pow = 0;
        int binary = 0;

        while ( n > 0){
            int rem =  n % 2;
            binary = binary + (rem * (int)Math.pow(10, pow));
            pow ++;
            n = n / 2;
        }
        System.out.println("Binary is :" + binary);

    }

    
    public static void main(StringClass[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number n :");
        int n = scn.nextInt();
        // System.out.println("Enter a second number m :");
        // int m = scn.nextInt();

        // // Swap(n,m);

        // // // multiply 
        // // int mul = product(n, m);
        // // System.out.println("The multiply of n and m is : " + mul);

        // // factorial
        // int fact = factroial(n);
        // System.out.println("The factroial of n is : " + fact);

        // // Binomial officient l 
        // int bino =  BinomialCofficient(n, m);
        // System.out.println("The Binomial factroiial of N and m is: " + bino);

        // // function overloading with same data type parameter 
        // System.out.println("The sum of two number is : " + sum(5 ,8));
        // System.out.println("the sum of three number is " +  sum(4,6,8));


        // // function overloading with different data type parameter 
        // System.out.println("The sum of two number is : " + mul(5 ,2.5f));
        // System.out.println("the sum of three number is " +  mul(4,6,5.5f));

        //  check prime Or not 
        // System.out.println( primeORnot(n) );

        //  //  check prime Or not (optimize way )
        // System.out.println( isprime(n) );

        // yesprime(n);

        // // Binary to Decimal conversion 
        // BINtoDC(n);

        // // Binary to Decimal conversion 
        DECtoBIN(n);


        scn.close();
    }
}
