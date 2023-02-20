import java.util.Scanner;

public class hi {
    public static int meanfunction(int[] arr){
        int sum=0;
        int num=0;
        int mean;
        for(int i=0;i<arr.length;++i){
            sum+=arr[i];
            for(int j=0;j<arr.length;j++){
                num+=i;
            }

        }
        mean=sum/num;
        return mean;
        
    }
    public static void main(String[] args){
        int arr[]=new int[20];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the numbers in array");
            arr[i] =scan.nextInt();
        }
        System.out.println("the arry is"+arr);
       int mean =  meanfunction(arr);
        System.out.println("th mean of the arry is"+mean);
    }
    
}
