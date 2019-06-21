package PRP1819;

import java.util.Scanner;
class Solution {
    public int[] diStringMatch(String S) {
        int last = S.length();
        int first=0;
        int []myarr = new int[(S.length()+1)];
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i) == 'I')
            {
                myarr[i] = first++;
                if(i == S.length()-1)
                   myarr[i+1] = first;
              //  first = first+1;
            }
            else if(S.charAt(i) == 'D')
            {
                myarr[i] = last--;
                if(i == S.length()-1)
                   myarr[i+1] = last;
               // last = last-1;
            }
        }

        return myarr;
    }
}
class Leetcode_DI_String_Match
{
    public static void main(String[] arg)
    {
        Scanner sc =new Scanner(System.in);
        String input = sc.next();
        int []myarr = new int[(input.length()+1)];
Solution s = new Solution();
myarr = s.diStringMatch(input);
for(int i=0;i<myarr.length;i++)
System.out.print(myarr[i]);

  
    }
}

