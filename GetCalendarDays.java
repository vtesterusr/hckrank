import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
      //Calender cal = new Calender();
                    String retValue=null;
            if(year < 2000 || year > 3000){
                return retValue;
            }
//            System.out.println("month :"+month);
//            System.out.println("day :"+day);
//            System.out.println("year :"+year);
            
    //      SimpleDateFormat sdf0 = new SimpleDateFormat(day+"/"+month+"/"+year);
    //      Calendar calendar0 = Calendar.getInstance();
    //      Calendar calendar1 = new GregorianCalendar(2020,11,14,13,24,56);
    //      Date date1 =  calendar0.getTime();
    //      Date dt = new Date();
    //      //System.out.println(dt); //15/12/2020
    //      String date = sdf0.format(dt); 
    //      //System.out.println("date :"+date); //15/10/2013
    //      System.out.println(calendar1.YEAR);
    //      System.out.println(calendar1.WEEK_OF_YEAR); //15/10/2013
    //      
    //      Calendar calendar2 = new GregorianCalendar(2013,10,28);    
    //       System.out.println("Date 1: " + sdf0.format(calendar2.getTime()));
    //       
    //       
    
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");    
         Calendar calendar = Calendar.getInstance();
         Date date =  new Date(month+"/"+day+"/"+year);
         calendar.setTime(date);
//         int year1       = calendar.get(Calendar.YEAR);
//         int month1      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
//         int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
         int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
//         int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
//         int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
    
//         int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
//         int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
//         int minute     = calendar.get(Calendar.MINUTE);
//         int second     = calendar.get(Calendar.SECOND);
//         int millisecond= calendar.get(Calendar.MILLISECOND);
             
//         System.out.println(sdf.format(calendar.getTime()));
             
//         System.out.println("year \t\t: " + year1);
//         System.out.println("month \t\t: " + month1);
//         System.out.println("dayOfMonth \t: " + dayOfMonth);
         //System.out.println("dayOfWeek \t: " + dayOfWeek);
//         System.out.println("weekOfYear \t: " + weekOfYear);
//         System.out.println("weekOfMonth \t: " + weekOfMonth);
             
//         System.out.println("hour \t\t: " + hour);
//         System.out.println("hourOfDay \t: " + hourOfDay);
//         System.out.println("minute \t\t: " + minute);
//         System.out.println("second \t\t: " + second);
//         System.out.println("millisecond \t: " + millisecond);
         
         switch(dayOfWeek){
            case 1: retValue="SUNDAY"; break;
            case 2: retValue= "MONDAY"; break;
            case 3: retValue= "TUESDAY"; break;
            case 4: retValue= "WEDNESDAY"; break;
            case 5: retValue= "THURSDAY"; break;
            case 6: retValue= "FRIDAY"; break;
            case 7: retValue= "SATURDAY"; break;
            //default : retValue= "NONE"; break;
         }
         dayOfWeek=0;
         //System.out.println("retValue : " + retValue);  
            return retValue;
    }

}

public class GetCalendarDays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        res="";
    }
}
