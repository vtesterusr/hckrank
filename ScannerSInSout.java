import java.util.Scanner;

public class ScannerSInSout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Write your code here.
        scannerInOut(scan);
    }
    
    public static void scannerInOut (Scanner scan){
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s =scan.next();
        
         while(scan.hasNext()){
                //System.out.println("Value of:-"+s);
                s=s+" "+scan.next();
                //System.out.println("Value of:-"+s);
            }
        
        if(s != null){
           System.out.println("String: "+s); 
        }
        if( d >=0){
            System.out.println("Double: "+d);
        }
        if (i >=0){
            System.out.println("Int: "+i);
        }
        
    }
}
