
package myjavaprojects;

public class TestClass {
    public void show(String a) {
        int b = 0;
        int size1 = a.length();
        char[] x = new char[100];
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < x.length; i++) {
            x[i] = a.charAt(i);
        }
        for (int i = 0; i < size1; i++) {
            if (v[i] == x[i]) {
                b++;
            }
            System.out.println(x[i]);
        }
        System.out.println(b);
    }
        public void Count(String s)
    {
        int v=0,c=0,n=0,sc=0,ws=0;
        char[] vowels = {'a','e','i','o','u'};
        char[] number = {'0','1','2','3','4','5','6','7','8','9'};
        int size = s.length();
        char [] a =new char[100];
        
        for(int i=0;i<size;i++)
        {
            a[i]=s.charAt(i);
        }
        
        for(int j =0;j<size;j++)
        {
            //if(a[j]=='a' || a[j]=='e' || a[j]=='i' || a[j]=='o' || a[j]=='u' )
            if(a[j]==vowels[j])
            {
                v++;
            }
            //else if(a[j]=='1' || a[j]=='2' || a[j]=='3' || a[j]=='4' || a[j]=='5' || a[j]=='6' || a[j]=='7' || a[j]=='8' || a[j]=='9' || a[j]=='0'  )
            else if(a[j]==number[j] )
            {
                n++;
            }
      
            else{
                c++;
            }
            
            //System.out.println(a[j]);
        }
        System.out.println("Vowels : "+v);
        System.out.println("Consonents : "+c);
        System.out.println("Numbers : "+n);
        System.out.println("Special Charecters : "+sc);
        System.out.println("Spaces : "+ws);
        System.out.println("Vo: " +vowels.length +" Number"+ number.length +" A"+ a.length +" S"+ s.length());
    }
}
