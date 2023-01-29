import java.util.Scanner;

public class details {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name age and class");
        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String classs = scan.nextLine();
        System.out.println("name:"+ name+"age:"+age+"class:"+classs);

        ;
    }
       
}

