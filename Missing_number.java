package Leetcode;


import java.util.Arrays;


public class Missing_number {
    public static void main(String args[]){
        int numbers[]={9,6,4,5,7,0,1};
        Arrays.sort(numbers);
       int i=1;
        while(i< numbers.length) {
            if (numbers[i] - numbers[i-1] == 1) {

            } else {
                for (int j = numbers[i - 1] + 1; j <= numbers[i] - 1; j++) {
                    System.out.println("Missing number is " + (j));
                }
            }

           i++;
        }

    }
}
