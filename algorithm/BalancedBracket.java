package algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedBracket {
    public boolean isBalanced(String str){
        /*
         * to solve this problem, I chose to use Deque
         * Deque is a form of the Queue that provides add, retrieve and peek operations at
         * both ends of the queue.
         */
        Deque<Character> deque = new LinkedList<>();
        for (char ch: str.toCharArray()) {
            //If the character is an opening bracket, then we will add it as the first
            // element in the Deque:
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
