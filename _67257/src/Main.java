import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    private static final String[][] precedences = {
            "+-*".split(""),
            "+*-".split(""),
            "-+*".split(""),
            "-*+".split(""),
            "*+-".split(""),
            "*-+".split(""),
    };

    private long calculate(long lhs, String op, long rhs) {
        return switch(op) {
            case "+" -> lhs + rhs;
            case "-" -> lhs - rhs;
            case "*" -> lhs * rhs;
            default -> 0;
        };
    }

    private long calculate(List<String> tokens, String[] precedure) {
        for(String op : precedure) {
            for(int i=0; i<tokens.size(); i++) {
                if(tokens.get(i).equals(op)) {
                    long lhs = Long.parseLong(tokens.get(i-1));
                    long rhs = Long.parseLong(tokens.get(i+1));
                    long result = calculate(lhs, op, rhs);
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    tokens.add(i-1, String.valueOf(result));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }

    public long solution(String expression) {
        // 연산자 갯수만큼 순회하면 됨
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while(tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        long max = 0;
        for(String[] precedence : precedences) {
            long value = Math.abs(calculate(new ArrayList<>(tokens), precedence));
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "100-200*300-500+20";
        long output = s.solution(input);
        System.out.println(output);
    }
}