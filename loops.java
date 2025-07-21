import java.util.Scanner;

public class loops {
    public static void main (StringClass[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // WHILE LOOP: Print "Hello Duniya" n times
        int count = 1;
        while (count <= n) {
            System.out.println("Hello Duniya!!  :" + count);
            count++;
        }

        // Reverse the number
        int original = n;
        int rev = 0;
        while(original != 0){
            int last_dgt = original % 10;
            rev = (rev * 10 ) + last_dgt;
            original = original / 10;
        }
        System.out.println("Reversed Number: " + rev);
          scn.close();
    }
  

}
