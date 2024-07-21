package com.ds.Arrays;
//N = 5, S = 12
//        A[] = {1,2,3,7,5}
//        Output: 2 4
//        Explanation: The sum of elements
//        from 2nd position to 4th position
//        is 12.
public class subarrayGivenSum {

    public static void main(String[] args) {
        int[] nums= {23,2,4,6,7};
        int n=6;
        int total=0;
        for(int i=0, j=0; i<nums.length;)
        {
            if(total < n){
                total+=nums[i];
                i++;
            }
           else if(total == n )
           {
                System.out.println(j+1 +" "+ (i+1));
                System.out.println(total);
                break;
            }
          else if(total > n)
          {
                total-=nums[j];
                j++;
            }
        }
    }
}
