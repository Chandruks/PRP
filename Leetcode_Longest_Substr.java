//Leetcode_Longest_Substr_Without_Repeat
/*Input: "abcabcbb"
Output: 3 */

package PRP1819;
import java.util.*;

class Leetcode_Longest_Substr
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str;
        int j=0;
        HashSet<Character> hset = new HashSet<Character>();
        int Length=0;
        
        for(int i=0;j<(str.length());)
        {
            if(hset.add(str.charAt(j)))
            {
                j++;
                if(Length >(j-i))
                    Length = Length;
                else
                    Length = (j-i);
            }
            else
            {
                hset.remove(str.charAt(i));
                i++;
            }
            
        }
        System.out.println(Length);
    }
}


