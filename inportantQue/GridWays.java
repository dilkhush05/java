public class GridWays {

    //Exponencial Time Complaxity || using BackTracking
    public static int MaxGridCount(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }
        int left = MaxGridCount(i + 1, j, n, m);
        int right = MaxGridCount(i, j+1, n, m);

        return left +right;
    }

    //using Prmutation Tcomplex: O(n + m) which is Linear 
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n  * factorial(n-1);
    }
    public static int MaxGridCountUsingfact(int n , int  m){

        int nFact = factorial(n-1);
        int mfact = factorial(m-1);
        int NMfact = factorial((n-1) + (m-1));
        return (NMfact)/(nFact * mfact);
    }
    public static void main(String[] args) {
        int n =4, m = 4;
        System.out.print(MaxGridCountUsingfact( n, m));
    }
}
