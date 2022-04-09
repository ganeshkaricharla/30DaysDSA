public class StackA {
    int[] arr;
    int size;

    StackA(int n) {
        arr = new int[n];
        size = 0;
    }

    public int top() {
        if (size <= 0) {
            return -1;
        }
        return arr[size - 1];
    }

    public int size() {
        return size;
    }

    public int pop() {
        if (size <= 0) {
            return -1;
        }
        size = size - 1;
        return arr[size];
    }

    public boolean push(int x) {
        if (size == arr.length) {
            return false;
        }
        size++;
        arr[size - 1] = x;
        return true;
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
