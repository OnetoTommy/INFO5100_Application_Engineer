package edu.neu.mgen;

import java.util.Scanner;

class arraySum{
    
    public int[] getSumnums(int[] nums){

        int[] numsum = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            if (i == 0){
                numsum[i] = nums[i];
            }else{
                numsum[i] = numsum[i - 1] + nums[i];
            }
        }

        return numsum;
    }

    public static void main (String[] args) {
        /* code */
        arraySum as = new arraySum();
        int[] nums = {1,2,4,5,6,6,7};
        int[] numsum = as.getSumnums(nums);
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please input value a");
            int a = scanner.nextInt();
            System.out.println("Please input value b");
            int b = scanner.nextInt();

            int sum = 0;
            if (a ==0){
                sum = numsum[b];
            }else{
                sum = numsum[b] - numsum[a - 1];
            }

            System.out.println("sum is " + sum);
        }


    }
}