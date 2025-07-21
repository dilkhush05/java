import java.util.*;
import java.lang.String;

public class StringClass {

    public static Boolean StrindPalindrom(String Str){
        for(int i =0; i< Str.length();i++){
            if(Str.charAt(i) != Str.charAt(Str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float SortestPathInEWSN(String path){
        int n = path.length();
        int x =0, y =0;

        for(int i =0; i<n; i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }else if (dir == 'S') {
                y--;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str = new String("rfg");
        String name = "Dilkhush";

        //STRING IS IMMUTABLE
        Scanner Sc = new Scanner(System.in);
        // String clg = Sc.next();
        // System.out.println(clg);

        // String city = Sc.nextLine();
        // System.out.println(city.length());

        //concotination
        // String firstname = "tony";
        // String lastname = "Stark";

        // String fullname = firstname + " " +lastname;
        // System.out.println(fullname);
        // System.out.print(fullname.charAt(0));

        

        // System.out.println(StrindPalindrom("madan"));
        String path = "SNEW";
        System.out.println(SortestPathInEWSN(path));
    }
}
