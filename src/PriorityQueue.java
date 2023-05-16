public class PriorityQueue {
    private int[] queue;
    private int size;
    public PriorityQueue(int maxSize) {
        queue = new int[maxSize];
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == queue.length;
    }
    public void insert(int item) {
        if (isFull()) {
            throw new RuntimeException("Priority queue is full");
        }
        if (isEmpty()) {
            queue[0] = item;
        } else {
            int i;
            for (i = size - 1; i >= 0; i--) {
                if (item > queue[i]) {
                    queue[i + 1] = queue[i];
                } else {
                    break;
                }
            }
            queue[i + 1] = item;
        }
        size++;
    }
    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        int item = queue[--size];
        queue[size] = 0;
        return item;
    }
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);

        queue.insert(3);
        queue.insert(8);
        queue.insert(1);
        queue.insert(4);
        queue.insert(6);

        System.out.println("Elements of priority queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
