import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution {
    private Set<Integer> getPrimes(int acc, List<Integer> numbers) {

    }

    private void generate(int number, List<Integer> primeNumbers) {
        primeNumbers.add(number);


    }

    public int solution(String numbers) {
        char[] number = numbers.toCharArray();
        List<Integer> primeNumbers = new ArrayList<>();
        generate(Integer.parseInt(String.valueOf(number[0])), primeNumbers);
        return primeNumbers.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "17";
        int output = s.solution(input);
        System.out.println(output);
    }
}