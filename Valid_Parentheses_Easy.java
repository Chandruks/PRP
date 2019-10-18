/*
Input: "([)]"       Output: false
Input: "()[]{}"     Output: true
Input: "{[]}"       Output: true
*/
package Leetcode;

import java.util.Scanner;
import java.util.Stack;

class Valid_Parentheses_Easy
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        boolean flag=true;
        char ch;
        int count=0;
        Stack<Character> stack = new Stack<Character>();
        if(0 == input.length()%2)
        {
        for(int i=0;i<input.length();i++)
        {              
            if ('(' == input.charAt(i) || '{'== input.charAt(i) || '[' == input.charAt(i))
            {
                stack.push(input.charAt(i));
                ch = input.charAt(i);
                ++count;
            }
            else if (')' == input.charAt(i))
            {
                 --count;
                if((-1 == count)||('(' != (Character)stack.pop()))
                {
                    flag = false;
                    break;
                }
            }
            else if ('}' == input.charAt(i))
            {
                 --count;
                if((-1 == count)||'{' != (Character)stack.pop())
                {
                    flag = false;
                    break;
                }
            }
            else if (']' == input.charAt(i))
            {
                 --count;
                if((-1 == count)||('[' != (Character)stack.pop()))
                {
                    flag = false;
                    break;
                }
            }
        }
        if(count!=0)
            flag= false;
        }
        else
            flag= false;
        
        
        System.out.println(flag);
    }
}


