/*There is a fence with n posts, each post can be painted with one of the k colors. You have to paint all the posts such that no 
more than two adjacent fence posts have the same color. Return the total number of ways you can paint the fence.

Approach: Dynamic Programming

Key Idea: To solve the problem find this relation: f(n) = (k-1)(f(n-1)+f(n-2))

Explanation: Assuming there are 3 posts, if the first one and the second one has the same color, then the third one has k-1 options. 
The first and second together has k options.If the first and the second do not have same color, the total is k * (k-1), then the third 
one has k options. 
Therefore, f(3) = (k-1)*k + k*(k-1)*k = (k-1)(k+k*k)
*/

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

