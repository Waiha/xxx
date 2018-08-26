

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void deleteAt(int data1) {
        if (data1 == head.data) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;

            while (data1 != n.next.data) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }


    }


    public void reverse()
    {
        Node current = head;
        Node prev = null;
        while (current != null)
        {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head = prev;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node node = head;
        builder.append('[');
        while (node != null) {
            builder.append(node.data);
            builder.append(',');
            node = node.next;
        }
        builder.append(']');

        return builder.toString();
    }
}



