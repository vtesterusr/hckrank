import java.util.Scanner;

public class ScannerSInSout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s =scan.next();
        //System.out.println("Value of:-"+s);
        //int len = scan.next().length();
        
         while(scan.hasNext()){
                //System.out.println("Value of:-"+s);
                s=s+" "+scan.next();
                //System.out.println("Value of:-"+s);
            }

        
        // Write your code here.
        
                    
            
            
      /*  for(int j=-1; j < len ;j++){
            while(scan.hasNext()){
                s=s+" "+scan.next();
                
            }
            System.out.println("Value of"+s);
            
            System.out.println("Value of"+s);
        } */
        
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
