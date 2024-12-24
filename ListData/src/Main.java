public class Main {
    public static void main(String[] args) {
        // Test chương trình
        LinkedList list = new LinkedList();
        list.addToTail(1);
        list.addToTail(3);
        list.addToTail(2);
        list.addToTail(5);
        list.addToTail(4);

        list.traverse(); // In danh sách: 1 3 2 5 4

        list.sort();
        list.traverse(); // In danh sách đã sắp xếp: 1 2 3 4 5

        System.out.println("Max value: " + list.max());
        System.out.println("Min value: " + list.min());
        System.out.println("Sum: " + list.sum());
        System.out.println("Average: " + list.avg());

        LinkedList list2 = new LinkedList();
        list2.addToTail(1);
        list2.addToTail(2);
        list2.addToTail(3);
        list2.addToTail(4);
        list2.addToTail(5);

        System.out.println("Is list2 equal to list? " + list.isEqual(list2)); // false

        LinkedList mergedList = new LinkedList();
        mergedList.addToTail(6);
        mergedList.addToTail(7);
        mergedList.addToTail(8);

        list.merge(mergedList);
        list.traverse(); // In danh sách sau khi hợp nhất: 1 2 3 4 5 6 7 8

        LinkedList list3 = new LinkedList();
        list3.addToTail(9);
        list3.addToTail(10);

        list.append(list3);
        list.traverse(); // In danh sách sau khi đính kèm: 1 2 3 4 5 6 7 8 9 10
    }
}