

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
        Node n = head;
        Node n1 = null;
        Node n2 = null;
        while (n != null)
        {
            n2 = n.next;
            n.next = n1;
            n1 = n;
            n = n2;
        }


    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}



