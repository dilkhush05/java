public class Patterns {

    public static void Hollow_pattern(int totrows , int totalcol){
        for(int i = 1; i<= totrows; i++){
            for(int j =1 ; j <= totalcol ; j++){
                if( i == 1 || i == totrows|| j == 1  || j == totalcol){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_para(int n){
        for(int i = 1; i <= n; i++ ){
            for(int j= 1; j <= n-i; j++ ){
                System.out.print(" ");
            }
            for(int j =1 ; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_Half_para(int n){
        for(int i = 1; i <= n; i++ ){
            for(int j= 1; j <= n-i+1; j++ ){
                System.out.print(j);
            }
            for(int j =1 ; j<= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Floyed_traingle(int n){
        int count= 1;
        for(int i = 1; i <= n ; i++){
            for(int j=1; j<=i ;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
     public static void Zero_One_traingle(int n){
        // int count= 1;
        for(int i = 1; i <= n ; i++){
            for(int j=1; j<=i ;j++){
                if((i+j) % 2 == 0){      // bacically used in Matrix odd-Even rule in this Triangle 
                    System.out.print(" 1 ");
                    
                }else{
                    System.out.print( " 0 ");
                    
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly_pattern(int n){
        // 1st half of Butterfly 
        for(int i= 1 ; i<= n; i++){
            for(int j=1; j<= i; j++){              //to print 1st side of star
                System.out.print(" * ");
            }
            for(int j = 1; j<= 2*(n-i); j++){   //To Print the space 
                System.out.print("   ");
            }
            for(int j= 1; j<= i; j++){             // After space print a star (*)
                System.out.print(" * ");
            }
            System.out.println();
        }

        // second half of Butterfly

          for(int i = n ; i>= 1 ; i--){
            for(int j=1; j<= i; j++){              //to print 1st side of star
                System.out.print(" * ");
            }
            for(int j = 1; j<= 2*(n-i); j++){   //To Print the space 
                System.out.print("   ");
            }
            for(int j= 1; j<= i; j++){             // After space print a star (*)
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    public static void Romboue(int n){
        for(int i = 1; i<= n; i++){
            //Spaces---------
            for(int j = 1; j <=(n-i) ; j ++){
                System.out.print(" ");
            }
            //Stars _________

            for(int j =1 ; j<= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollow_rombus(int n){
        for(int i =1 ; i<=n ; i++){
            for(int j= 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j =1 ; j <= n ; j++){
                if( i == 1 || i == n|| j == 1  || j == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(StringClass args[]){
        // Hollow_pattern(4, 5);
        // inverted_rotated_para(5);
        // inverted_Half_para(5);
        // Floyed_traingle(4);
        // Zero_One_traingle(6);
        // Butterfly_pattern(4);
        // Romboue(5);
        Hollow_rombus(5);
    }
}
