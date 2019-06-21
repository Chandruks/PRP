package PRP1819;

import java.util.Scanner;
class Leetcode_Decode_String
{
    public static void main(String[] arg)
    {
        Scanner sc =new Scanner(System.in);
        String input = sc.next();
        String output = "";
        output = decode(input);
        System.out.println(output);
        
  
    }
    static String decode(String s)
    {
        String output="";
        int count =0,k=0,tmp=0;
        String ch;
        for(int i=0;i<s.length();i++)
        {

            if(Character.isDigit(s.charAt(i)))
            {
                count = Integer.parseInt(String.valueOf((s.charAt(i))));
                k+=i;
                while(true)
                {
                    ++k;
                    if(k == s.length())
                        break;
                    else
                    {
                    if(Character.isLetter(s.charAt(k)))
                        ++tmp;
                    else
                        break;
                        
                    }
                }
                ch = s.substring(i+1,i+tmp+1);
                for(int j=0;j<count;j++)
                    output=output+ch;
            }
            i=tmp+i;
            count =0;
            tmp=0;
            k=0;
      
        }
        return output;
    }
}

