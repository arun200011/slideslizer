import java.util.Scanner;

public class inpp {
    public static void main(String[] args){
        Scanner scann= new Scanner(System.in);
        System.out.println("enter a number");
        int intval=scann.nextInt();
        for(int i=0;i<=intval;i++){
            System.out.println(intval+"*"+i+"="+intval*i);
        }
    }
    
}
