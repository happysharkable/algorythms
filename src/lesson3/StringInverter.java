package lesson3;

public class StringInverter {
    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println(invert(str));
    }

    private static String invert(String str) {
        MyStack<Character> stack = new MyStack<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
