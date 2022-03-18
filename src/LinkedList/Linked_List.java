package LinkedList;

public class Linked_List {
    Node head;
    public Linked_List(Node head) {
        this.head = head;
    }

    public void Add(Node newNode) {
        newNode.next=head;
        head=newNode;
    }

    public void Delete() {
        head = head.next;
    }

    public void Display() {
        Node node = head;
            while (node != null) {
                System.out.println(node.value);
                node = node.next;
            }

    }

}
