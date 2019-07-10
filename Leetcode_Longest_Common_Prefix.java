//Leetcode_Longest_Substr_Without_Repeat
/*Input: ["flower","flow","flight"]
Output: "fl"
*/

package PRP1819;
import java.util.*;

class Leetcode_Longest_Common_Prefix
{
    public static void main(String[] arg)
    {
//        Scanner sc = new Scanner(System.in);
        String tmp_str[] = {"cc","c"};
        boolean flag=false;
        int count=0,max=0;
        int index=0;
        Arrays.sort(tmp_str);
        for(int i=0;i<tmp_str.length;i++)
      System.out.println(tmp_str[i]);
        for(int i =0;i<tmp_str.length;i++)
        {
        if("".equals(tmp_str[i]))
        {
            flag = false;
            max=0;
            break;
        }
        else
        flag = true;
        }
        if(flag){
            if(1 == tmp_str.length)
            {
             max=1;   
            }
            else{
        for(int i=1;i<tmp_str.length;i++)
        {
            count=0;
            for(int j=0;((j<tmp_str[i].length()) && (tmp_str[0].length() !=j)) ;j++)
            {
            if(tmp_str[0].charAt(index++) == tmp_str[i].charAt(j))
            ++count;
            else 
            break;
            }
            if(i == 1)
            max = count;
            if(count<max)
            {
                max = count;
            }
            index = 0;
        }
            }
        }
        String output="";
        if(0 == max)
        output="";
        else
        output = (tmp_str[0].substring(0,max));
        System.out.println(output);

    }
}
        



