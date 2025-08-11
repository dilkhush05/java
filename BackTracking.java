public class BackTracking {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SubTractArr(int arr[], int Ind, int Val) {
        // base case
        if (Ind == arr.length) {
            printarr(arr);
            return;
        }
        // recursion
        arr[Ind] = Val;
        SubTractArr(arr, Ind + 1, Val + 1);
        arr[Ind] = arr[Ind] - 2;

    }
 
    // +++++++++++++++++++++++++ SUBSETS +++++++++++++++++++++++++++++++++++++
    public static void FindSubsets(String str, int i, String ans) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // if yes
        FindSubsets(str, i + 1, ans + str.charAt(i));

        // if nOP
        FindSubsets(str, i + 1, ans);
    }

    // Same function using StringBuilder 

    public static void FindSubsetsUsingSB(String str , StringBuilder ans , int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans.toString());
            }
            return;
        }


        //if Yes
        ans.append(str.charAt(i)) ;
        FindSubsetsUsingSB(str, ans, i + 1);
        ans.deleteCharAt(ans.length() - 1);

        // if No 
        FindSubsetsUsingSB(str, ans, i + 1);
    }

     // ++++++++++++++++++++++++++++++++++ FIND PRMUTATIONS ++++++++++++++++++++++++
    public static void PrintPrumatation(String str , String ans ){
        //Base case 
        if( str.length() == 0 ){
            System.out.println(ans);
            return;
        }


        for(int i =0; i< str.length() ; i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            PrintPrumatation(NewStr, ans+curr);
        }
    }

      // Same function using StringBuilder 
public static void PrintPermutationSB(String str, StringBuilder ans) {
    // Base case
    if (str.length() == 0) {
        System.out.println(ans.toString());
        return;
    }

    for (int i = 0; i < str.length(); i++) {
        char curr = str.charAt(i);

        // Create remaining string without curr
        String remaining = str.substring(0, i) + str.substring(i + 1);

        // Choose
        ans.append(curr);

        // Explore
        PrintPermutationSB(remaining, ans);

        // Un-choose (backtrack)
        ans.deleteCharAt(ans.length() - 1);
    }
}

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // SubTractArr(arr, 0, 1);
        // printarr(arr);

        String str = "abc";
        // FindSubsets(str, 0, "");
        // FindSubsetsUsingSB(str, new StringBuilder(), 0);

        // PrintPrumatation(str, "");
        PrintPermutationSB(str, new StringBuilder());

    }
}
