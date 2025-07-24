public class BitManipulation {



    public static void OddAndEven(int n){
        int Bitmask = 1;
        if((n & Bitmask) == 0){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number is Odd"); 
        }
    }

    public static void GetIthBit(int n, int i){
        int BitMask = (1 << i);
        if((n & BitMask)== 0){
            System.out.println("the bit is : 0");
        }else{
            System.out.println("the bit is : 1");
        }
    }

    public static void SetIthBit(int n, int i){
        int BitMask = 1<< i;
        System.out.println("the number after Set ith Bit : "+ ( n|BitMask));
    }

    public static int ClearithBit(int n, int i){
        int Bitmask = ~(1 << i);
       
        return (n&Bitmask);
    }
    public static void UpdateIthBit(int n, int i,int newBit){
        // int Bitmask = ~(1 << i);
        
        n = ClearithBit(n, i);
        int Bitmask = (newBit << i);
        System.out.println("The number after Update Ith Bit : " + (n|Bitmask));
    }

    public static int ClearlastIbits(int n, int  i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }


    public static Boolean PowerOfTwo(int n ){
        return (n & (n-1)) == 0;
    } 


    public static void SetBitCount(int n ){
        int count = 0;
        while( n > 0){
            if((n & 1 ) != 0){
                count++;
            }
            n = n>> 1;
        }
       System.out.print(count);
    }
    public static void main(String[] args) {
     // Bitwise AND &
        // System.out.print(5 & 6);

    // Bitwise OR |
        // System.out.print(5|6);

     // Bitwise XOR ^
        // System.out.print(5^6);

    // Bitwise One's complement  ~
        // System.out.print(~0);

     // Bitwise Right Shift >>
        // System.out.println(6 >>1);

    // Bitwise Left Shift <<
        // System.out.print(6 <<1);

        // OddAndEven(5);
        // OddAndEven(45);
        // OddAndEven(22);
        // OddAndEven(44);

    // GetIthBit(15 ,2);
    // GetIthBit(15 ,4);

    // SetIthBit(10, 2);

    // ClearithBit(10,1);

    


    // UpdateIthBit(10,2,0);
    // System.out.println(ClearlastIbits(15, 2));

    //   System.out.println(PowerOfTwo(1));  

    // SetBitCount(16);


    }
}
