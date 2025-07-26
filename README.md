<!-- part 5 begins here -->

Student Management & Sorting System
What It Is
This is a simple Java project that shows how to use basic programming concepts like object-oriented design, data structures, sorting, and saving data to a file. It manages a list of undergraduate and graduate students.

Key Features
Student Classes: Models different student types using inheritance.

Input Checks: Validates student names and IDs to keep data clean.

Sorting: Includes Selection Sort and Merge Sort to organize the student list.

Searching: Uses Binary Search to quickly find students.

Save/Load: Saves student records to a file (students.dat) and loads them back.

Error Handling: Deals with bad input or file problems without crashing.

How to Run
Put all .java files in the same folder.

Open a terminal and go to that folder.

Compile the code: javac \*.java

Run the main programs:

For file saving/loading: java StudentRegistry

For sorting/searching: java Main

Code Files
Student.java: The main abstract class for all students.

UndergraduateStudent.java: A class for undergrads.

GraduateStudent.java: A class for grad students.

Sorter.java: Contains the sorting and searching algorithms.

StudentRegistry.java: Manages the student list and file I/O.

Main.java: A simple program to demonstrate sorting and searching.

Quick Comparisons

1. Data Structures
   Arrays: Good for data that doesn't change size. Fast access.

ArrayLists: The best all-around choice. Flexible size and still has fast access.

LinkedLists: Best for lists that have a lot of additions and removals, but slow for searching.

2. Our Program vs. Real AI
   Our Program (Rule-Based): Follows strict, hand-written rules. It's predictable but can't handle anything it wasn't programmed for. It doesn't learn.

Real AI (Learning-Based): Learns its own rules by finding patterns in data. It's flexible and can adapt, but its reasoning isn't always obvious.
