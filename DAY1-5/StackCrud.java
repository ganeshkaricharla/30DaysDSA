public class StackCrud {
    public static void main(String[] args) {
        StackL s = new StackL();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.top());
        s.printStack();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.pop());
        s.printStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.printStack();
        if (s.push(6)) {
            System.out.println("Pushed");
        } else {
            System.out.println("NOT PUSHED");
        }

    }
}
