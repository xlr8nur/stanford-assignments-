/* Write a program that displays the terms in the Fibonacci sequence, starting with Fib(0) 
and continuing as long as the terms are less than 10,000 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
       
       private static final int MAX_TERM_VALUE = 10000;
  
       public void run () {
                   println (" This program is lists the Fibonacci sequences.");
                   int t1 = 0; t2 = 1; t3;
                   while (t1 <= MAX_TERM_VALUE) {
                         println (t1);
                         t3 = t2 + 1;
                         t1 = t2;
                         t2 = t3;
                  }         
         }
         
         
}  
                     
