class Solution {
    public String longestCommonPrefix(String[] strs) 
    {        
        Arrays.sort(strs);
        int count=0,max=0;
        boolean flag = false;       
        int index=0;
         for(int i =0;i<strs.length;i++)
        {
        if("".equals(strs[i]))
        {
            flag=false;
            break;
        }
        else
        flag = true;
        }
        if(flag){
            if(1 == strs.length)
            {
             max=1;   
            }
            else{
        for(int i=1;i<strs.length;i++)
        {
            count=0;
            for(int j=0;((j<strs[i].length())&&(strs[0].length()!=j));j++)
            {
            if(strs[0].charAt(index++) == strs[i].charAt(j))
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
        output ="";
        else
        {
            output = (strs[0].substring(0,max));
        }
         return output;
        
    }
}
