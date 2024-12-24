public class Main {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addToHead("Hello");
        myList.addToHead("World");
        myList.addToTail("Java");
        myList.traverse();
        System.out.println("Count: " + myList.count());
        System.out.println("Deleting from head: " + myList.deleteFromHead());
        myList.traverse();
        System.out.println("Deleting from tail: " + myList.deleteFromTail());
        myList.traverse();
        Node searchResult = myList.search("Hello");
        if (searchResult != null) {
            System.out.println("Found: " + searchResult.data);
        } else {
            System.out.println("Not found.");
        }
    }
}