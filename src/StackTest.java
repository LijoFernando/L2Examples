import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stackTest = new Stack<>();
        for (int i = 1; i < 17; i++) {
            stackTest.push(i);
        }
        System.out.println(stackTest);
        System.out.println("print top element "+stackTest.peek());
        stackTest.pop();
        System.out.println(stackTest);
        System.out.println("search 17's  position: "+stackTest.search(11));
        System.out.println(stackTest);
        System.out.println("check is empty or not "+stackTest.empty());
        System.out.println("push and return the item "+stackTest.push(17));
        stackTest.add(0);
        stackTest.addElement(16);
        System.out.println(stackTest);
        System.out.println("Capacity"+stackTest.capacity());
    }
}
