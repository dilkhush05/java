import java.util.Scanner;
public class functionPracticeSet {

    public static int AvaregeThreeNum(int a ,int b, int c){
        return (a+b+c)/3;
    }

    public static void CheckOddOrEven(int a){
        if(a % 2 == 0){
            System.out.println("Given number " + a + " is Even");
        }else {
            System.out.println("Given number " + a + " is Odd");
        }
    }

    public static Boolean ispalindrome(int a ){
        int org = a;
        int reverseNum = 0;
        while (a > 0) {
            int rem = a % 10;
                reverseNum = reverseNum * 10 + rem;
            a  = a /10 ;  
        }
        if(org == reverseNum){
            return true;
        }
        return false;
    }
    public static int ComputeThreeDigitNum( int a){
        int sum = 0;
        while (a > 0) {
            int rem = a % 10 ;
                sum = sum + rem;
            a = a /10;

        }
        return sum;
    }
    public static void main(StringClass args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = Sc.nextInt();
        // System.out.println("Enter a number : ");
        // int m = Sc.nextInt();
        // System.out.println("Enter a number : ");
        // int o = Sc.nextInt();

        // System.out.println("Avarege of Three number is : " + AvaregeThreeNum(n, m, o));

        // CheckOddOrEven(n);
    //     System.out.println(ispalindrome(n));

       System.out.println(ComputeThreeDigitNum(n));

        Sc.close();
    }
}
