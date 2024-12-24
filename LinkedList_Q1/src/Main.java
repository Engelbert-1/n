public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.addToHead(3);
        list.addToTail(5);
        list.addToHead(2);
        list.addToTail(7);
        
        Node p = list.search(5);
        list.addAfter(p, 6);
        
        list.traverse();  
        
        System.out.println("Deleted from head: " + list.deleteFromHead()); 
        list.traverse();  
        
        System.out.println("Deleted from tail: " + list.deleteFromTail()); 
        list.traverse();  
        
        list.dele(5);
        list.traverse();  
        
        System.out.println("Count of nodes: " + list.count()); 
        
        list.deleAt(1);
        list.traverse();  
        
        list.addToTail(8);
        list.addToTail(1);
        list.traverse(); 
        list.sort();
        list.traverse();  
        
        System.out.println("Max value: " + list.max());
        System.out.println("Min value: " + list.min()); 
        System.out.println("Sum of values: " + list.sum()); 
        System.out.println("Average of values: " + list.avg()); 
        System.out.println("Is sorted: " + list.sorted()); 
        
        list.reverse();
        list.traverse();  
        
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addToTail(1);
        list2.addToTail(3);
        list2.addToTail(8);
        
        System.out.println("Lists are equal: " + list.isEqual(list2)); 
        
        SinglyLinkedList mergedList = SinglyLinkedList.merge(list, list2);
        mergedList.traverse();  
    }
}
