/*
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
To get you started, a portion of the solution is provided for you in the editor.
Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
Input Format
The first line contains an integer, , denoting the number of test cases. 
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.
Output Format
For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:
n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).
If the number cannot be stored in one of the four aforementioned primitives, print the line:
n can't be fitted anywhere.
Sample Input
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
Explanation
 can be stored in a short, an int, or a long.
 is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //byte  => -128 to 127
        //short => -32768 to 32767
        //int   => -2147483648 to 2147483647
        //long  => -9223372036854775808 to 9223372036854775807
        //float => 1.175494351 E - 38 to 3.402823466 E + 38
        //double=> 2.2250738585072014 E - 308  to  1.7976931348623158 E + 308
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                //Complete the code
                
                long x=sc.nextLong();
                long lmin = -9223372036854775808L;
                //double lmax = 9223372036854775809;
                System.out.println(x+" can be fitted in:");
                
                //Short.MIN_VALUE & Short.MAX_VALUE
                /*
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }
                */
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                
                //Short.MIN_VALUE & Short.MAX_VALUE
                /*
                if(x>=-2147483648 && x<=2147483647){
                    System.out.println("* short");
                }
                */
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE ){
                    System.out.println("* short");
                }

                //Integer.MIN_VALUE & Integer.MAX_VALUE
                /*
                if(x>=-2147483648 && x<=2147483647){
                    System.out.println("* int");
                }
                */
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                
                if(x>= Long.MIN_VALUE && x<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


