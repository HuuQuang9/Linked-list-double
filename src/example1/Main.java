package example1;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // lk 1 vs 5
        node1.setNext(node5);
        node5.setPrevious(node1);

        //lk 5 vs 2
        node2.setNext(node5);

        //lk 2 vs 4
        node4.setNext(node2);

        //lk 4 vs 3
        node3.setNext(node4);
        node4.setPrevious(node3);
    }
}
