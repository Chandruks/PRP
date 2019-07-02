package PRP1819;
import java.util.Scanner;
class Leetcode_Reverse_Words {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []tmp = s.split(" ");
        String str="",output="";
        for(int i=0;i<tmp.length;i++)
        {
            str = tmp[i];
            StringBuffer sb = new StringBuffer(str);
            str = String.valueOf(sb.reverse());
            if(i == tmp.length-1)
            {
                output += str;
                break;
            }
            else
            {
                output = output+str+" ";
            }
        }

System.out.println(output);
    }
}


