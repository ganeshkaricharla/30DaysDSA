
public class LinkedListCRUD {

    public static LinkedList insertAtStart(LinkedList head, int value) {
        LinkedList newNode = new LinkedList(value, head);
        return newNode;
    }

    public static LinkedList insertAtEnd(LinkedList head, int val) {
        if (head == null) {
            return new LinkedList(val);
        }

        LinkedList curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new LinkedList(val);
        return head;
    }

    public static void printLinkedList(LinkedList head) {
        if (head == null) {
            System.out.print("ITS NULL");
            return;
        }
        LinkedList curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static LinkedList insertAtGivenIndex(LinkedList head, int val, int index) {
        if (head == null) {
            return new LinkedList(val);
        }

        LinkedList newNode = new LinkedList(val);
        if (index <= 0) {
            newNode.next = head;
            return newNode;
        }

        LinkedList curr = head;
        for (int i = 0; i < index - 1 && curr.next != null; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public static LinkedList insertInSortedLinkedList(LinkedList head, int x) {
        if (head == null || head.data > x) {
            return new LinkedList(x, head);
        }

        LinkedList newNode = new LinkedList(x);
        LinkedList curr = head;

        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public static LinkedList deletFirstElement(LinkedList head) {
        if (head == null || head.next == null) {
            return null;
        }
        LinkedList curr = head.next;
        head.next = null;
        return curr;

    }

    public static LinkedList deletLastElement(LinkedList head) {
        if (head == null || head.next == null) {
            return null;
        }
        LinkedList curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }

    public static LinkedList deleteNodeAtNthPlace(LinkedList head, int index) {
        if (head == null) {
            return head;
        }

        if (index == 0) {
            LinkedList curr = head.next;
            head.next = null;
            return curr;
        }

        LinkedList curr = head;
        int i = 0;
        for (i = 0; i < index - 1 && curr.next != null; i++) {
            curr = curr.next;
        }

        if (curr.next == null || i < index - 1) {
            return head;
        }

        LinkedList temp = curr;
        temp = temp.next;
        curr.next = temp.next;
        temp.next = null;
        return head;

    }

    public static LinkedList deleteNodeAGivenValue(LinkedList head, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            LinkedList curr = head.next;
            head.next = null;
            return curr;
        }

        LinkedList curr = head;
        while (curr.next != null && curr.next.data != val) {
            curr = curr.next;
        }
        if (curr.next == null) {
            return head;
        }

        LinkedList temp = curr;
        temp = temp.next;
        curr.next = temp.next;
        temp.next = null;
        return head;

    }

    public static int printNthElement(LinkedList head, int n) {
        if (head == null) {
            return -1;
        }
        LinkedList curr = head;
        for (int i = 0; i < n && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            return -1;
        }

        return curr.data;

    }

    public static int findMiddleElement(LinkedList head) {
        if (head == null) {
            return -1;
        }

        if (head.next == null || head.next.next == null) {
            return head.data;
        }

        LinkedList slow = head;
        LinkedList fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static boolean checkIfLLHasLoop(LinkedList head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }

        LinkedList slow = head;
        LinkedList fast = head;
        while ((fast.next != null && fast.next.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static boolean checkIFLLisSorted(LinkedList head) {
        if (head == null || head.next == null) {
            return true;
        }

        LinkedList curr = head;
        while (curr.next != null) {

            if (curr.next.data < curr.data) {
                return false;
            }
            curr = curr.next;
        }

        return true;

    }

    public static LinkedList removeDuplicatesFromSortedLL(LinkedList head) {
        LinkedList curr = head;
        while (curr != null) {
            LinkedList temp = curr;
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next = new LinkedList(4);
        // head.next.next.next.next.next = head.next.next;

        LinkedList res = removeDuplicatesFromSortedLL(head);
        printLinkedList(res);
        // System.out.println(res);

    }
}
