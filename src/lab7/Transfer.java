package lab7;
import java.util.Stack;
/**
 *
 * @author Azzoz 28/3/2020
 */
public class Transfer {

    public static Stack<Integer> stackPush(Stack<Integer> stack){

        for(int i = 0; i < 10; i++){

            Integer push = (Integer) stack.push(i);

            System.out.println(push);
        }
        return stack;

    }
    public static void pop(Stack<Integer> stack){

        for(int i = 0; i < 5; i++){

            Integer pop = (Integer) stack.pop();
            System.out.println(pop);
        }
    }
    public static void peek(Stack<Integer> stack){
        Integer peek = (Integer) stack.peek();
        System.out.println("The top is: " + peek);
    }
    public static void search(Stack<Integer> stack, int element){
        System.out.println("searched: ");
        Integer search = (Integer) stack.search(element);
        if(element == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Element is: " + search);
        }
    }
    public static Stack<Integer> transfer(Stack<Integer> stack1, Stack<Integer> stack2){
        stack2 = stackPush(stack1);
        System.out.println("Stack transfered successfully: "+ stack2);
        return stack2;
    }
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> finalStack = transfer(stack1, stack2);
    }
}