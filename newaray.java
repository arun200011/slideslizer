import java.util.Scanner;

public class newaray {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the length of the array");
        int len = Integer.parseInt(scan.nextLine());
        int arr[]=new int[len];
        int choice,counter=0;
        for(int i=0;i<len;i++){
            System.out.print("enter value for"+i+"th index :");
            arr[i]=Integer.parseInt(scan.nextLine());
            counter+=1;
            System.out.print("0 to quit,any other number to continue:");
            choice=Integer.parseInt(scan.nextLine());
            if(choice== 0){
                break;
            }
        }
        for(int i=0;i<counter;i++){
            System.out.println(arr[i]+"");
        }
    }
    
}
