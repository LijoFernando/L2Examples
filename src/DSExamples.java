import java.util.*;
public class DSExamples {
    public void stack(){
        Stack<String> stack = new Stack<>();
        stack.push("Z");
        stack.push("O");
        stack.push("H");
        stack.push("O");
        stack.push("CORP");
        System.out.println(stack);
        stack.pop();
        stack.peek();
        System.out.println(stack
        );
    }
    public void linkdList(){
        LinkedList<String> linkList = new LinkedList<>();
        System.out.println(linkList.size());
        linkList.add("Hello");
        linkList.add("Wor");
        linkList.add("lD");
        linkList.add("Prgm");
        linkList.addFirst("Rojo");
        linkList.addLast("The End");
        System.out.println(linkList.getFirst().hashCode());
        linkList.getLast();
        System.out.println("Elemenet: "+linkList.element());
        System.out.println("2 element: "+linkList.get(1).hashCode());
        System.out.println(linkList.get(3));
    }
    public void dblLinkList(){
//        Stack<String> lineQueue = new Queue<>();
//        lineQueue.push("I am");
//        lineQueue.push("Lijo");
    }

    public static void main(String[] args) {
        DSExamples ds = new DSExamples();
         //  ds.stack();
           ds.linkdList();
    }
}
