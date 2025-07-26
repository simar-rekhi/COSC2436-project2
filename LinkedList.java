/*parts 1 and 2 begin here*/

public class LinkedList<T> {
public class LinkedList<T> {

  //create private class Node
  // This class represents a single node in the linked list
  private class Node {
    T data;
    Node next;

    Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  // LinkedList beginning variables
  private Node head;
  private Node tail;
  private int size;

  // Setting beginning variables
  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  // helper method for sorting methods
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void insertAtHead(T data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    size++;
  }

  public void insertAtTail(T data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  // Insert anywhere in the list
  public void insertAt(int index, T data) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    if (index == 0) {
      insertAtHead(data);
      return;
    }

    if (index == size) {
      insertAtTail(data);
      return;
    }

    Node newNode = new Node(data);
    Node current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }

    newNode.next = current.next;
    current.next = newNode;
    size++;
  }

  //removal by-value method
  public boolean removeByValue(T value) {
    if (head == null) {
      return false;
    }
    // edge-case if only node left is the head
    if (head.data.equals(value)) {
      head = head.next;
      if (head == null) {
        tail = null;
      }
      size--;
      return true;
    }

    Node current = head;
    while (current.next != null) {
      if (current.next.data.equals(value)) {
        if (current.next == tail) {
          tail = current;
        }
        current.next = current.next.next;
        size--;
        return true;
      }
      current = current.next;
    }

    return false;
  }

  //removal by specifying index
  public T removeAt(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    T removedData;

    if (index == 0) {
      removedData = head.data;
      head = head.next;
      if (head == null) {
        tail = null;
      }
      size--;
      return removedData;
    }

    Node current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }

    removedData = current.next.data;
    if (current.next == tail) {
      tail = current;
    }
    current.next = current.next.next;
    size--;

    return removedData;
  }

  // Search for a node by value
  public int indexOf(T value) {
    Node current = head;
    int index = 0;

    while (current != null) {
      if (current.data.equals(value)) {
        return index;
      }
      current = current.next;
      index++;
    }

    return -1;
  }

  public boolean contains(T value) {
    return indexOf(value) != -1;
  }

  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    Node current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    return current.data;
  }

  public void display() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node current = head;
    System.out.print("[");
    while (current != null) {
      System.out.print(current.data);
      if (current.next != null) {
        System.out.print(", ");
      }
      current = current.next;
    }
    System.out.println("]");
  }

  // Override toString for easy printing of the whole list
  @Override
  public String toString() {
    if (head == null) {
      return "[]";
    }

    StringBuilder sb = new StringBuilder();
    sb.append("[");
    Node current = head;
    while (current != null) {
      sb.append(current.data);
      if (current.next != null) {
        sb.append(", ");
      }
      current = current.next;
    }
    sb.append("]");
    return sb.toString();
  }

  // Clear the list
  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  // Creating 2 sorting algorithms and 1 searching algorithm

  // Add these 3 simple methods to your LinkedList<T> class

  /*
   * For this section since the data is 'unknown' of the type by using T
   * I used GeeksforGeeks to get help on using Comparable and the warning
   * supressor just so my screen did not go red haha.
   * 
   */

  // Bubble Sort
  public void bubbleSort() {
    if (head == null)
      return;

    boolean swapped;
    do {
      swapped = false;
      Node current = head;

      while (current.next != null) {
        @SuppressWarnings("unchecked")
        Comparable<T> currentData = (Comparable<T>) current.data;

        if (currentData.compareTo(current.next.data) > 0) {
          // Swap the data
          T temp = current.data;
          current.data = current.next.data;
          current.next.data = temp;
          swapped = true;
        }
        current = current.next;
      }
    } while (swapped);
  }

  // Selection Sort
  public void selectionSort() {
    if (head == null)
      return;

    Node current = head;

    while (current != null) {
      Node smallest = current;
      Node temp = current.next;

      // Find the smallest element in remaining list
      while (temp != null) {
        @SuppressWarnings("unchecked")
        Comparable<T> smallestData = (Comparable<T>) smallest.data;

        if (smallestData.compareTo(temp.data) > 0) {
          smallest = temp;
        }
        temp = temp.next;
      }

      if (smallest != current) {
        T tempData = current.data;
        current.data = smallest.data;
        smallest.data = tempData;
      }

      current = current.next;
    }
  }


  // Linear Search
  public int linearSearch(T target) {
    Node current = head;
    int index = 0;

    while (current != null) {
      if (current.data.equals(target)) {
        return index;
      }
      current = current.next;
      index++;
    }

    return -1;
  }
}