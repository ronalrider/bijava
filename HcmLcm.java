import java.util.*;
public class HcmLcm
{
    public static void main(String s[])
    {
        int x,y,n1,n2,temp,hcf,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers\n");
        n1=sc.nextInt();
        n2=sc.nextInt();
        x=n1;
        y=n2;
        while(y != 0)
        {
            temp=y;
            y=x%y;
            x=temp;
        }
        hcf=x;
        lcm=(n1*n2)/hcf;
        System.out.print("\tHCF of "+n1+" & "+n2+" = "+hcf);
        System.out.print("\n\tLCM of "+n1+" & "+n2+" = "+lcm);
    }
}