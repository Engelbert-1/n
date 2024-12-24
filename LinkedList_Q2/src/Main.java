public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addToHead("apple");
        list.addToTail("banana");
        list.addToHead("cherry");
        list.addToTail("date");

        Node p = list.search("banana");
        list.addAfter(p, "elderberry");

        list.traverse(); 

        System.out.println("Deleted from head: " + list.deleteFromHead()); 
        list.traverse();  

        System.out.println("Deleted from tail: " + list.deleteFromTail()); 
        list.traverse();  

        list.dele("banana");
        list.traverse();  

        System.out.println("Count of nodes: " + list.count()); 

        list.addToTail("fig");
        list.traverse();  
    }
}