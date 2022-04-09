public class StackL {
    LinkedList head;
    int size;

    StackL() {
        head = null;
        size = 0;
    }

    public int top() {
        if (head == null) {
            return -1;
        }

        return head.data;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }
        LinkedList curr = head;
        head = head.next;
        curr.next = null;
        size--;
        return curr.data;

    }

    public boolean push(int x) {
        head = new LinkedList(x, head);
        size++;
        return true;
    }

    public void printStack() {
        LinkedList curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
