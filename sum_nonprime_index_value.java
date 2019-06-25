//sum_nonprime_index_value 
package PRP1819;
import java.util.Scanner;

class sum_nonprime_index_value
{
    public static void main(String[] arg)
    {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int sum=0,count=0;
        int myarr[] = new int[size];
        for(int i=0;i<size;i++)
            myarr[i] = sc.nextInt();
        
        
        if(1==size)
            sum = myarr[0];
        if(2 == size)
        {
            sum = myarr[0]+myarr[1];
        }
        else{
            sum = myarr[0]+myarr[1];
        for(int i=2;i<size;i++)
        {
            for(int j=2;j<=i;j++)
            {
                if(i%j == 0)
                count++;
                if(1 < count)
                {
                    sum = sum+myarr[i];
                    break;
                }
            }
            count=0;
        }
        System.out.println(sum);
        
    }
    }
   
}

