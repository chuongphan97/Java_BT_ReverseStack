import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stack.add(sc.nextInt());
        }
        System.out.println(stack.toString());

        Stack<Integer> result = new Stack<>();
        while (!stack.isEmpty()){
            result.push(stack.pop());
        }

        System.out.println(result);
    }
}
