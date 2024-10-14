package list;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // define stack
        Stack<String> stck1 = new Stack<>();

        // adding data into stack
        stck1.push("ABCD");
        stck1.push("klsjo");
        stck1.push("ABCD");
        stck1.push("hjsks");
        System.out.println("Stck1 is : "+stck1);

        // removing element
        stck1.pop();
        System.out.println("after 1st pop"+stck1);
        stck1.pop();
        System.out.println("after 1st pop"+stck1);

    }
}
