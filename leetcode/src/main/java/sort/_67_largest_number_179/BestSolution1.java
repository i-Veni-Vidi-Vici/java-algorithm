package sort._67_largest_number_179;

import java.util.Arrays;
import java.util.Comparator;

// TODO : sort이용
public class BestSolution1 {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        if(n==0)
        {
            return "";
        }
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=Integer.toString(nums[i]);
        }

        Arrays.sort(str,new Comparator<String>(){
            public int compare(String a,String b)
            {
                String str1=a+b;
                String str2=b+a;
                return str2.compareTo(str1);
            }
        });

        if(str[0].equals("0"))
        {
            return "0";
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(str[i]);
        }

        return sb.toString();
    }

    // 5ms
}
