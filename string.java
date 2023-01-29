import javax.print.DocFlavor.STRING;

public class string {
    public static void main(String[] args){
        String Stringvar = "STRING VARIABLES";
        System.out.println(Stringvar.charAt(4));
        System.out.println(Stringvar.toString());
        System.out.println(Stringvar.trim());
        System.out.println(Stringvar.length());
        System.out.println(Stringvar.isEmpty());
        System.out.println(Stringvar.lastIndexOf(Stringvar));
        System.out.println(Stringvar.replace("STRING","HELLO"));
        System.out.println(Stringvar.concat("hi"));
        System.out.println(Stringvar.endsWith("S"));
        
    }
    
}
