public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(8);

        queue.insert(3);
        queue.insert(8);
        queue.insert(1);
        queue.insert(4);
        queue.insert(20);
        queue.insert(9);
        queue.insert(33);
        queue.insert(12);


        System.out.println("Elements of priority queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}