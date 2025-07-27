<!-- part 5 begins here -->

## Part 5

<br>
<br>

### Student Management & Sorting System

This is a simple Java project that shows how to use basic programming concepts like object-oriented design, data structures, sorting, and saving data to a file. It manages a list of undergraduate and graduate students.

<br>

### Key Features

- **Student Classes:** Models different student types using inheritance.
- **Input Checks:** Validates student names and IDs to keep data clean.
- **Sorting:** Includes Selection Sort and Merge Sort to organize the student list.
- **Searching:** Uses Binary Search to quickly find students.
- **Save/Load:** Saves student records to a file (`students.dat`) and loads them back.
- **Error Handling:** Deals with bad input or file problems without crashing.

<br>

### How to Run

- Put all `.java` files in the same folder.
- Open a terminal and go to that folder.
- Compile the code: `javac *.java`
- Run the main programs:
  - For file saving/loading: `java StudentRegistry`
  - For sorting/searching: `java Main`

<br>

### Code Files

- `Student.java`: The main abstract class for all students.
- `UndergraduateStudent.java`: A class for undergrads.
- `GraduateStudent.java`: A class for grad students.
- `Sorter.java`: Contains the sorting and searching algorithms.
- `StudentRegistry.java`: Manages the student list and file I/O.
- `Main.java`: A simple program to demonstrate sorting and searching.
- `LinkedList.java`: A generic linked list implementation used for dynamic data storage.

<br>

### Generic Linked List Design

The project includes a generic `LinkedList<T>` class that supports dynamic memory allocation. This allows the student registry to grow or shrink at runtime as students are added or removed. Unlike arrays or ArrayLists, the linked list is ideal for operations where frequent insertion/deletion is required without shifting elements.

<br>

### Sorting & Searching Algorithms

- **Selection Sort**: A simple algorithm with O(n²) time complexity, used here for demonstration and small datasets.
- **Merge Sort**: A more efficient algorithm with O(n log n) time complexity, better suited for larger datasets.
- **Binary Search**: Used to locate student records after sorting. Has O(log n) complexity, but requires sorted data.

<br>

### Rule-Based Classification Logic

Instead of using a machine learning model, students are classified based on preset conditions like GPA, credit hours, or standing (graduate vs. undergrad). For example, if a graduate student has a GPA below 3.0, they are flagged. These rules are hard-coded into the logic, making the system predictable but non-adaptive.

<br>

### Comparison: Static vs. Dynamic Structures

- **Arrays**: Best for fixed-size data; fast access but resizing is costly.
- **ArrayLists**: Combines the benefits of arrays with dynamic resizing; ideal for most general-purpose tasks.
- **LinkedLists**: Ideal when the number of elements frequently changes; slower access but efficient insert/delete.

This flexibility is crucial in AI workflows where data volume can grow unpredictably.

<br>

### Rule-Based Simulation vs. Machine Learning

- **Rule-Based (This Project)**: Uses explicit if-else logic and user-defined conditions. Works well when behavior is known and fixed.
- **Machine Learning (e.g., k-NN)**: Learns from data. Can handle noise and complex patterns but may behave unpredictably or opaquely. Unlike this simulation, ML models require training and feature selection.

<br>

### Connection to Assignment 1's Genre-Tagging Prototype

The project builds upon Assignment 1’s genre-tagging system by expanding the rule-based classification from text analysis to structured student records. Previously, we matched keywords to genres. Now, we evaluate academic criteria to classify student types. Both use deterministic logic, but this assignment introduces deeper sorting, searching, and data structure design.

<br>
