package test;

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
    public static int avl1(int height) {
        if (height == 0)
            return 1;
        if (height == 1)
            return 2;

        int[] dp = new int[height + 1];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= height; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + 1;
        }

        return dp[height];

    }

    //Our original AVL function
    public static int avl(int height) {
        if (height == 0) {
            return 1;
        } else if (height == 1) {
            return 2;
        } else {
            return avl(height - 1) + avl(height - 2) + 1;
        }
    }
}