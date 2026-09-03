
public class ExerciseRunner {

    public static void main(String[] args) {

        // ==========================================
        // Test Add and At
        // ==========================================

        LinkedList list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("=== testAddAndAt ===");

        System.out.println(
            "at(0): expected = 1, actual = " + list.at(0)
        );

        System.out.println(
            "at(1): expected = 2, actual = " + list.at(1)
        );

        System.out.println(
            "at(2): expected = 3, actual = " + list.at(2)
        );

        System.out.println(
            "at(-1): expected = -1, actual = " + list.at(-1)
        );

        System.out.println(
            "at(10): expected = -1, actual = " + list.at(10)
        );


        // ==========================================
        // Test Remove
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("\n=== testRemove ===");

        list.remove(1);

        System.out.println(
            "at(0): expected = 1, actual = " + list.at(0)
        );

        System.out.println(
            "at(1): expected = 3, actual = " + list.at(1)
        );


        // ==========================================
        // Test Size
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("\n=== testSize ===");

        System.out.println(
            "size: expected = 3, actual = " + list.size()
        );

        list.remove(1);

        System.out.println(
            "size after remove: expected = 2, actual = " + list.size()
        );

        list.add(4);

        System.out.println(
            "size after add: expected = 3, actual = " + list.size()
        );


        // ==========================================
        // Test Add does not call next/prev
        // ==========================================

        list = new DoubleLinkedList();

        System.out.println("\n=== testNextAndPrevMethodIsNotCalledDuringAdd ===");

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(
            "Expected output during add: nothing"
        );


        // ==========================================
        // Test Next during At
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("\n=== testNextMethodIsCalledDuringAt ===");

        System.out.println("Calling at(1):");
        System.out.println("Expected: Go to next node");

        list.at(1);


        // ==========================================
        // Test Next during Remove
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("\n=== testNextMethodIsCalledDuringRemove ===");

        System.out.println("Removing index 1:");
        System.out.println("Expected: Go to next node");

        list.remove(1);

        System.out.println("Removing index 1 again:");
        System.out.println("Expected: Go to next node");

        list.remove(1);


        // ==========================================
        // Test Prev during At
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("\n=== testPrevMethodIsCalledDuringAt ===");

        System.out.println("Calling at(2):");
        System.out.println("Expected: nothing");

        list.at(2);

        list.add(4);

        System.out.println("Calling at(2) after adding 4:");
        System.out.println("Expected: Go to previous node");

        list.at(2);


        // ==========================================
        // Test Prev during Remove
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("\n=== testPrevMethodIsCalledDuringRemove ===");

        System.out.println("Removing index 2:");
        System.out.println("Expected: Go to previous node");

        list.remove(2);

        System.out.println("Removing index 2 again:");
        System.out.println("Expected: nothing");

        list.remove(2);


        // ==========================================
        // Test Remove Head
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("\n=== testRemoveHead ===");

        list.remove(0);

        System.out.println(
            "at(0): expected = 2, actual = " + list.at(0)
        );

        System.out.println(
            "size: expected = 2, actual = " + list.size()
        );


        // ==========================================
        // Test Remove Tail
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("\n=== testRemoveTail ===");

        list.remove(2);

        System.out.println(
            "at(0): expected = 1, actual = " + list.at(0)
        );

        System.out.println(
            "at(1): expected = 2, actual = " + list.at(1)
        );

        System.out.println(
            "size: expected = 2, actual = " + list.size()
        );


        // ==========================================
        // Test Remove Out Of Bound
        // ==========================================

        list = new DoubleLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("\n=== testRemoveOutOfBound ===");

        list.remove(2);

        System.out.println(
            "size after remove(2): expected = 2, actual = "
            + list.size()
        );

        list.remove(20);

        System.out.println(
            "size after remove(20): expected = 2, actual = "
            + list.size()
        );

        list.remove(-1);

        System.out.println(
            "size after remove(-1): expected = 2, actual = "
            + list.size()
        );

        System.out.println(
            "at(0): expected = 1, actual = " + list.at(0)
        );

        System.out.println(
            "at(1): expected = 2, actual = " + list.at(1)
        );
    }
}
