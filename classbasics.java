import java.util.Scanner;

class student{
    String firstname;
    String lastname;
    String rollnumber;


    Scanner scan = new Scanner(System.in);

    void collectdetails(){
        System.out.println("enter first name");
        firstname=scan.nextLine();
        System.out.println("enter last name");
        lastname=scan.nextLine();
        System.out.println("enter the rollnumber");
        rollnumber=scan.nextLine();
    }
    void displaydetails(){
        
        System.out.println("name is" +  tocombinename());
        System.out.println("rollnumber  :"+rollnumber);

       
    }
    String tocombinename(){
        String newname=firstname+" "+lastname;
        return newname;
    }
}


public class classbasics {
    public static void main(String[] args){
        student obj =new student();
        obj.collectdetails();
        obj.displaydetails();
        obj.tocombinename();
        System.out.println(obj.firstname);

    }

    
}
