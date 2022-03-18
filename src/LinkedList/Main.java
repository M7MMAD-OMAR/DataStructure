package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node<String>("50", null);
        Linked_List linked_list = new Linked_List(new Node<String>("20", null));
        linked_list.Add(new Node<String>("30", null));
        linked_list.Add(new Node<String>("40",null));

        linked_list.Display();
    }
}
