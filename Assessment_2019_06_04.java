/*
A string is good if its length is even, and every character in odd position of this string is different from the next character (the first character is different from the second, the third is different from the fourth, and so on). For example, the string xyyx is good string, and the strings aa is not a good string.
Note: The empty string is considered as good string.
INPUT FORMAT:
A line contains a string which contains a word.
OUTPUT FORMAT:
If the given string is good the then output should be "good", otherwise output should be "not good"

TestCase 1
xyyx
Output
good
*/
package PRP1819;
import java.util.Scanner;
class Assessment_2019_06_04
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        boolean flag = false;
        int length = str.length();
        
        if(length%2 != 0)
        System.out.println("not good");
        else
        {

            for(int i=0;i<length-1;i=i+2)
            {
                if(str.charAt(i) != str.charAt(++i))
                {
                   flag = true;
                   i--;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println("good");
            else
                System.out.println("not good");
        }
    }
}
