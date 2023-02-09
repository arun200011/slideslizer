import java.util.Scanner;

public class labb2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String arr[]=new String[1024];
        int namecount =0;
        char cont ='n';


        do{
            System.out.println("1.enter a name \n 2.list all the names \n 3. search name \n 4.delete name \n 5.exit");
            int userchoice=Integer.parseInt(scan.nextLine());

            switch(userchoice){
                case 1:
                    System.out.println("enter the name to inserted");
                    String newname = scan.nextLine();
                    boolean addname =false;
                    if(namecount ==0){
                        addname=true;
                    }
                    else{
                        for(int i=0;i<namecount;i++){
                            if(!arr[i].equalsIgnoreCase(newname)){
                                addname=true;
                            }
                        }
                    }
                    if(addname){
                        arr[namecount]=newname;
                        namecount+=1;
                        System.out.println("name added successfully");
                    }
                    else{
                        System.out.println("name exists..!");
                    }
                    break;
                case 2:
                    System.out.println("listing all the names in the array :");
                    for(int i=0;i<namecount;i++){
                        System.out.print(arr[i]+"\t");
                    }
                    break;
                case 3:
                    System.out.print("enter the name to search: ");
                    String searchName = scan.nextLine();
                    if(namecount==0){
                        System.out.println("empty arry to be searched");

                    }
                    else{
                        for(int i=0;i<namecount;i++){
                            if(arr[i].equalsIgnoreCase(searchName)){
                                System.out.println("name found at index:"+i);
                            }
                        }

                    }
                    break;
                default:
                    System.out.println("invalid choice");                  

            }


            //performs the operation

            System.out.println("press 'y' to continue...");
            cont =scan.nextLine().charAt(0);

        }
        while(cont == 'y' || cont == 'Y');
        System.out.println("program over...!");
    }
    
}
