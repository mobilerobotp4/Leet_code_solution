package Leetcode;

import java.util.Scanner;

public class Paint_fence {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of posts");
        int post=input.nextInt();
        System.out.println("Enter the number of color");
        int color=input.nextInt();
        Paint_fence a=new Paint_fence();
        int k=a.cal_fun(post,color);
        System.out.println(k);


    }
    public int cal_fun(int p,int c){
        int ans=0;
        if(p==0){  //If the number of post=0
            return 0;
        }
        //If there is only one post we don't bother about number of way we can paint the post.It always have k possibilities
        if(p==1){
            return c;
        }
        int same=c;
        int diff=c*(c-1);
        for(int i=3;i<=p;i++){
            int previous_diff=diff;
            diff=(same+diff)*(c-1);
            same=previous_diff*1;
        }
        ans=(same+diff);
        return ans;
    }
}

