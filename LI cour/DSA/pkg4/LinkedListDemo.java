package pkg4;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);

        System.out.println(list);
        System.out.println(list.length());
        list.deletefromhead();
        System.out.println(list);
        System.out.println("Found: " + list.find(15));

    }
}
