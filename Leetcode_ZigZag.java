package PRP1819;
import java.util.Scanner;
class Leetcode_ZigZag {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int numRows = sc.nextInt();
if(numRows <=1)
System.out.println(s);
StringBuilder[] sb = new StringBuilder[numRows];
for(int i=0;i<sb.length;i++)
{
sb[i]= new StringBuilder("");
}
for(int i=0;i<s.length();i++)
{
int index = i%(2*numRows-2);
index = index<numRows?index:2*numRows-2-index;
sb[index].append(s.charAt(i));
}
for(int i=1;i<sb.length;i++)
sb[0].append(sb[i]);

System.out.println(sb[0].toString());
    }
}


