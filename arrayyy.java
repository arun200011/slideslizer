import java.util.Scanner;

public class arrayyy {
    public static void main(String[] args){
        int arr[]={10,20,30,40};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
        System.out.println();
        for(int i: arr){
            System.out.println(i);
        }
        System.out.println();
        // giving place to insert 5 strings inside new array
        String arr1[]=new String[5];
        System.out.println(arr1[3]);
        arr1[3]="arun";
        System.out.println(arr1[3]);
        

        // create an string array of size 20.use the help of for loop and initialize the values for each index.
        System.out.println();
        String arr3[]= new String[20];
        Scanner scan= new Scanner(System.in);
        for(int i=0;i<arr3.length;i++){
            System.out.println("enter the values");
            String arr3[] = scan.nextLine();

           
        }
        System.out.println(arr[i]);

       
    }
    
}
