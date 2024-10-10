package Problem5;

public class Problem5 {

    public static void findCombinations(String expression, int pos, int currentSum, int previousNumber) {
        // Base case: when reaching number 9, check if the total sum equals 100
        if (pos == 10) {
            if (currentSum == 100) {
                System.out.println(expression + " = 100");
            }
            return;
        }

        // The next number to include in the expression
        String nextNumberStr = Integer.toString(pos);
        int nextNumber = pos;

        // Option 1: Add '+'
        findCombinations(expression + "+" + nextNumberStr, pos + 1, currentSum + nextNumber, nextNumber);

        // Option 2: Add '-'
        findCombinations(expression + "-" + nextNumberStr, pos + 1, currentSum - nextNumber, -nextNumber);

        // Option 3: Concatenate the current number with the previous one
        int concatenatedNumber = Integer.parseInt(previousNumber + nextNumberStr);
        int newSum = currentSum - previousNumber + concatenatedNumber;
        findCombinations(expression + nextNumberStr, pos + 1, newSum, concatenatedNumber);
    }

    public static void main(String[] args) {

        findCombinations("1", 2, 1, 1);
    }
}
