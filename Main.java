//Parts 1 and 2:: Ayro Escrobar
// Parts 3 and 5: Atrin Shahroudi
// Part 4: Simar Rekhi


// PRELIMINARY TESTING WINDOW -------------------
public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.insertAtHead(3);
    list.insertAtTail(5);
    list.insertAt(1, 4);
    list.display(); // Should display [3, 4, 5]

    list.bubbleSort();
    System.out.println("After Bubble Sort: " + list); // [3, 4, 5]

    list.selectionSort();
    System.out.println("After Selection Sort: " + list); // [3, 4, 5]

    int index = list.linearSearch(4);
    System.out.println("Index of 4: " + index); // 1
  }
}


