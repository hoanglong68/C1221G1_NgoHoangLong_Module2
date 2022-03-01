package ss11_dsa_stack_and_queue.bai_tap.revert_element_in_stack;
import java.util.Stack;
public class TestStackInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        for (int i = 1; i <= 5; i++) {
            stack.add(i);
        }
        System.out.println(stack);
        while (!stack.isEmpty()){
            stack.pop();
        }
        for (int i = 5; i >= 1; i--) {
            stack.add(i);
        }
        System.out.println(stack);
    }
}
