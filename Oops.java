
public class Oops{
    public static void main(String[] args) {
        // Pan P1 = new Pan();
        //     P1.setColour("RED");
            
        //     P1.setTip(5);
        //     System.out.println(P1.getColour() + "\n" + P1.getTip());

        // BankAccount MyAcc = new BankAccount();
        // MyAcc.Username = "asdfghhth";
        // MyAcc.setPwd( "Dilkhush");
        // // MyAcc.password = "asdfghhth";

        // System.out.println(MyAcc.Username);

        Student S1 = new Student("Abhishek");
        // S1.name = "Abhishek";
        System.out.println(S1.name);

    }
}


// class BankAccount {
//     public String Username;
//     private String password;
//     public void setPwd(String pwd){
//         password = pwd;
//     }

// }

class Student{
    String  name;
    int roll;

    Student(String name ){
        // System.out.println("Constructor is called: ");
        this.name =  name ;
    }
}
class Pan {
    private String Colour;
    private int tip;

    String getColour(){
        return this.Colour;
    }
    void setColour(String Colour){
        this.Colour = Colour;
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}