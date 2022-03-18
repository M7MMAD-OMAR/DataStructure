package Queue_LinkedList;

import sun.misc.ExtensionInstallationException;

import java.security.cert.Extension;

public class Main {
    public static void main(String[] args) {
        Queue_Node<String> q1 = new Queue_Node<String>(null, "ali", null);
        Queue_Node<String> q2 = new Queue_Node<String>(null, "omar", null);
        Queue_Node<String> q3 = new Queue_Node<String>(null, "rama", null);
        Queue_Node<String> q4 = new Queue_Node<String>(null, "fatema", null);

        Queue_LinkedList<String> qL = new Queue_LinkedList<String>(q1);
        qL.queue(q2);
        qL.queue(q3);
        try {
            System.out.println(qL.deQueue());
            System.out.println(qL.deQueue());
            System.out.println(qL.deQueue());
            System.out.println(qL.deQueue());
            System.out.println(qL.deQueue());
            System.out.println(qL.deQueue());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " error the array is Empty");
        }



    }
}
