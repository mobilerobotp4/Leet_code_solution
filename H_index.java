package Leetcode;

import java.util.Arrays;

public class H_index {
    public static void main(String args[]){
        int[]citations={25,11,8,75,101,40};
        cal abc= new cal();
        System.out.println(abc.H_ret(citations));


    }
}
 class cal{
   public int H_ret(int []a){
       Arrays.sort(a);
       int H_val=0;
       for(int i=0; i<a.length; i++){
           int smaller = Math.min(a[i], a.length-i);
           H_val = Math.max(H_val, smaller);
       }

       return H_val;
}

}
