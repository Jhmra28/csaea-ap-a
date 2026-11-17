import java.util.Arrays;

/**
 * Native Arrays in Java: Code-Along Demo
 * Topics: declaring, default values, indexes, length, out-of-bounds,
 * parts of a for loop, enhanced for, skipping ahead, going backward.
 */

public class NativeArrays {

        public static void main(String[] args) {

            int[] scores = new int[5];

            System.out.println("Default values: " + Arrays.toString(scores));

            int[] nums = {3, 7, 1, 9, 4};

            System.out.println("Initializer list: " + Arrays.toString(nums));

            String[] names = new String[3];
            boolean[] flags = new boolean[3];
            double[] prices = new double[3];

            System.out.println("String defaults:  " + Arrays.toString(names));
            System.out.println("boolean defaults: " + Arrays.toString(flags));
            System.out.println("double defaults:  " + Arrays.toString(prices));

            // ===== 2. INDEXES AND LENGTH =====

            // Indexes start at 0. The last index is length - 1.
            System.out.println("\nFirst element nums[0]: " + nums[0]);
            System.out.println("Length (a field, no parentheses): " + nums.length);
            System.out.println("Last element nums[nums.length - 1]: " + nums[nums.length - 1]);

            nums[2] = 6;

            // // ===== 3. OUT OF BOUNDS =====
            // System.out.println(nums[5]);
            // System.out.println(nums[-1]);

        // ===== 4. PARTS OF A FOR LOOP =====
        //   for (initialization; condition; update)
        //   initialization -> runs once, sets the starting index
        //   condition      -> checked before every pass; loop stops when false
        //   update         -> runs after every pass

        // int[] nums = {3, 7, 6, 9, 4};

        for (int i = 0; i < nums.length; i++) {

                System.out.println(" index " + i + " -> value " + nums[i]);

        }

       // ===== 5. ENHANCED FOR LOOP =====
    
        // Gives you each VALUE, no index. Good for reading, not for changing.

        for (int i : nums) {
            System.out.println(" enhanced value " + i);
        }

        // Challenge 1: Double It
        // Multiply every element by 2, then print the array.
        int[] challengeOne = {3, 7, 1, 9, 4};
        for (int i = 0; i < challengeOne.length; i++) {
            challengeOne[i] = challengeOne[i] * 2;
        }
        System.out.println("Challenge 1: " + Arrays.toString(challengeOne));

        int[] challengeTwo = {4, 8, 2, 6, 1};
        // Skip every other index: 0, 2, 4
        for (int i = 0; i < challengeTwo.length; i += 2) {
            challengeTwo[i] += 10;
        }
        System.out.println("Challenge 2: " + Arrays.toString(challengeTwo));

        int[] temps = {-2, 13, 0, -5, 21, -9};
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < 0) {
                temps[i] = 0;
            }
        }
        System.out.println("Challenge 3: " + Arrays.toString(temps));

        int[] superScore = {85, 62, 97, 45, 70, 99};
        for (int i = 0; i < superScore.length; i++) {
            superScore[i] += 5;
            if (superScore[i] > 100) {
                superScore[i] = 100;
            }
        }
        System.out.println("Challenge 4: " + Arrays.toString(superScore));

        int[] temperature = {58, 71, 64, 80, 77, 99};
        int max = temperature[0];
        int maxIndex = 0;

        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > max) {
                max = temperature[i];
                maxIndex = i;
            }
        }

        System.out.println("Challenge 5 -> Number: " + max);
        System.out.println("Challenge 5 -> Index: " + maxIndex);
    }
}