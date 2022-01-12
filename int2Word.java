
package myjavaprojects;

public class int2Word {
       public static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven","eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
       public static final String[] ty = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
       public  void method1(int n)
       {
           String s = "";
           while(n>0)
           {
                if(n<20)
               {
                    s = s+ units[n];
                  break;
               }
                else  if(n<100)
               {
                    s = s+ ty[n/10];
                    n= n%10;
               }
                else if(n<1000)
               {
                   s = s+ units[n/100] +" Hundred ";
                   n=(n%100);
               }
                else if(n<10000)
               {
                   s = s+ units[n/1000] +" Thousands ";
                   n=(n%1000);
               }
           }
              
            System.out.println(s);  
           
           
       
       }
    public static void main(String args[]) {
        int2Word x =new int2Word();
       x.method1(115);
     
        
    }
}
