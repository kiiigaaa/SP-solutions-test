package Problem1;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

    public static int sumUsingForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int sumUsingWhileLoop(List<Integer> numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }
        return sum;
    }

    public static int sumUsingRecursion(List<Integer> numbers, int index) {
        if (index == numbers.size()) {
            return 0;
        }
        return numbers.get(index) + sumUsingRecursion(numbers, index + 1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Sum using for-loop: " + sumUsingForLoop(numbers));
        System.out.println("Sum using while-loop: " + sumUsingWhileLoop(numbers));
        System.out.println("Sum using recursion: " + sumUsingRecursion(numbers, 0));
    }
}
