package ss11_dsa_stack_and_queue.bai_tap.revert_element_in_stack;

import java.util.Stack;

public class TestStackString {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack();
        String mWord = "hello world";
        for (int i = 0; i < mWord.length(); i++) {
            wStack.add(mWord.charAt((i)));
        }
        System.out.println(wStack);
        String newMWord = "";
        for (int i = 0; i < mWord.length(); i++) {
            newMWord += wStack.pop();
        }
        String outp = "outp";
      String newString = outp + newMWord;
        System.out.println(newString);
    }
}
