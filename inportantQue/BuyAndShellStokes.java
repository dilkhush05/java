
public class BuyAndShellStokes {

    public static void buyandshellstocks(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i = 0; i<price.length; i++){
            if(buyprice < price[i]){
                int profit = price[i] - buyprice;
                Maxprofit = Math.max(Maxprofit , profit);
            }else{
                buyprice = price[i];
            }
        }
        System.out.println("The Max Profit is  :" + Maxprofit);
    }
    public static void main(StringClass args[]){
        int price[] = {3,5,7,4,1,9,2};
        buyandshellstocks(price);
    }
}
