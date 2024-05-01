package test;

import java.math.BigInteger;

public class AVLRuntimeTest {
    public static void main(String[] args) {
        long startTimeAVL = System.nanoTime();

        // Run standard AVL function
        System.out.println("Standard AVL");
        System.out.println(avl(40));
        System.out.println(avl(41));
        System.out.println(avl(42));
        System.out.println(avl(43));
        System.out.println(avl(44));
        System.out.println(avl(45));
        System.out.println(avl(46));
        long endTime = System.nanoTime();
        long duration = (endTime - startTimeAVL);
        duration = duration / 1000000000;

        System.out.println("AVL standard time is: " + duration + " seconds");
        System.out.println(" ");

        // Run Dynamically programmed AVL function
        long startTimeAVL1 = System.nanoTime();
        System.out.println("Dynamic Programming AVL");
        System.out.println(avl1(40));
        System.out.println(avl1(41));
        System.out.println(avl1(42));
        System.out.println(avl1(43));
        System.out.println(avl1(44));
        System.out.println(avl1(45));
        System.out.println(avl1(46));

        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTimeAVL1);
        duration1 = duration1 / 1000000000;

        System.out.println("AVL dynamic programming time is: " + duration1 + " seconds");

    }
    
    //Dynamic programming AVL function
    public static BigInteger avl1(int height) {
        if (height == 0)
            return BigInteger.valueOf(1);
        if (height == 1)
            return BigInteger.valueOf(2);

        BigInteger[] dp = new BigInteger[height + 1];
        dp[0] = BigInteger.valueOf(1);
        dp[1] = BigInteger.valueOf(2);

        for (int i = 2; i <= height; i++) {
        	dp[i] = dp[i - 1].add(dp[i - 2]).add(BigInteger.valueOf(1));
        }

        return dp[height];

    }

    //Our original AVL function
    public static BigInteger avl(int height) {
        if (height == 0) {
            return BigInteger.valueOf(1);
        } else if (height == 1) {
            return BigInteger.valueOf(2);
        } else {
            return avl(height - 1).add(avl(height - 2)).add(BigInteger.valueOf(1));
        }
    }
}