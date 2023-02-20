import java.util.Scanner;

public class funccc {
    public static void myfirstfunction(){
        System.out.println("my first function");

    }
     //returning value with no parameter
     static int myintfunc(){
        return 1;
    }

    //returning value with parameter
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        String val=scan.nextLine();
        myfirstfunction();

       
    }
    
}
