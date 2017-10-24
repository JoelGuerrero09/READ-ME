package serie1;

import java.util.Scanner;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;


public class Producto {
    
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num =s.nextInt();
        while(num!=0)
            {
            int k=s.nextInt();
            int n=s.nextInt();
            String a=s.next();
            int i,j,count=0,max=0,sum=1;
            j=n;
            while(j!=k)
            {
                 String b=a.substring(count,j);
                 count++;
                 j++;
                sum=1;
               for(i=0;i<b.length();i++)
                {
                 sum=sum*Character.getNumericValue(b.charAt(i));
               }
               if(max<sum)
               max=sum;
            }
            System.out.println(max);
            }
            num--;
        }
    
}
