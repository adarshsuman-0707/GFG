package collection.queues;

public class queue_array {

    public class Innerqueue_array {
        int n, front, rear, arr[];
        int pee;

        Innerqueue_array(int n) {
            this.n = n;
            this.front = -1;
            this.rear = -1;
            this.pee = -1;
            this.arr = new int[n];
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == n - 1;
        }

        public void add(int e) {
            if (isFull()) {
                System.out.println("Queue is fukk");
            }
            if (isEmpty()) {
                front = 0;
            }
            arr[++rear] = e;
        }

        public int removeElement() {
            if (isEmpty()) {
                System.out.println("queue is empty");
            }
            int remove = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
            return remove;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty in peek");
            }
            return isEmpty() ? -1 : arr[front];
        }

    }

    public static void main(String[] args) {
        queue_array q1 = new queue_array();
        Innerqueue_array q2 = q1.new Innerqueue_array(4);
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        System.out.println(q2.isEmpty());
        System.out.println(q2.isFull());
        System.out.println(q2.removeElement());
        System.out.println(q2.removeElement());
        System.out.println(q2.removeElement());
        System.out.println("Deleted element ");

        while (!q2.isEmpty()) {
            System.out.print(q2.removeElement() + " ");
        }

        System.out.println();

        System.out.println(q2.peek());

    }
}
