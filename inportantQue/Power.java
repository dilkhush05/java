public class Power {

    public static int ortmisePower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = ortmisePower(a, n/2);
        int power = halfpower * halfpower;

        if( n % 2 != 0){
            power = a * power;
        }
        return power;
    }
    public static void main(String[] args) {
        int a  = 2, n= 5;
        System.out.println(ortmisePower(a , n));
    }
}
