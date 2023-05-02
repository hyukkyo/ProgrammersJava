class Solution {
    public String solution(String new_id) {
//        String step1 = new_id.toLowerCase();
//        System.out.println(step1);
//
//        String step2 = step1.replaceAll("[^a-z0-9-_.]", "");
//        System.out.println(step2);
//
//        String step3 = step2.replaceAll("[.]{2,}", ".");
//        System.out.println(step3);
//
//        if(step3.startsWith(".")) {
//            step3 = step3.substring(1, step3.length());
//        } else if(step3.endsWith(".")) {
//            step3 = step3.substring(0, step3.length()-1);
//        }
//        String step4 = step3;
//        System.out.println(step4);
//
//        String step5 = step4.isEmpty() ? "a" : step4;
//        System.out.println(step5);
//
//        if(step5.length() >= 16) {
//            step5 = step5.substring(0, 15);
//        }
//        if(step5.endsWith(".")) {
//            step5 = step5.substring(0, step5.length()-1);
//        }
//        String step6 = step5;
//        System.out.println(step6);
//
//        while(step6.length() <= 2) {
//            step6 += step6.charAt(step6.length());
//        }
//        String step7 = step6;
//        System.out.println(step7);
//
//        String answer = step7;
//        return answer;
        // 위 코드에서 out of range 발생

        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
        // 정규표현식에서 하이픈(-)은 (\-)으로 표현되는데 원래 백스페이스(\)문자와 혼동하지 않도록 (\\-)을 사용함
        new_id = new_id.replaceAll("\\.+", ".");
        // 연속된 마침표 ..이나 ...등을 제거함
        new_id = new_id.replaceAll("^\\.+|\\.+$", "");
        // 처음이나 끝에 찍힌 .을 제거함

        if(new_id.isEmpty()) new_id = "a";

        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.+$", "");
        }

        while(new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "...!@BaT#*..y.abcdefghijklm";
        String output = s.solution(input);
        System.out.println(output);
    }
}