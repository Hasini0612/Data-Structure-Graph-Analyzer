# Data Structure and Graph Performance Analyzer

## Project Overview

The Data Structure and Graph Performance Analyzer is a Java console-based application developed for the CIT300 – Data Structures and Algorithms group project at Sri Lanka Technology Campus (SLTC).

The system demonstrates fundamental data structures, searching algorithms, graph traversal techniques, and performance comparison through an interactive menu-driven interface.

## Key Features

### 1. Array Operations
- Insert elements
- Delete elements
- Search for elements
- Display array contents

### 2. Searching Algorithms
- Linear Search
- Binary Search
- Comparison counting
- Execution time measurement

### 3. Stack Operations
- Push
- Pop
- Peek
- Display stack contents

### 4. Queue Operations
- Enqueue
- Dequeue
- View front element
- Display queue contents

### 5. Linked List Operations
- Insert nodes
- Delete nodes
- Search for values
- Display linked list
- Clear linked list

### 6. Graph Operations
- Add vertices
- Add edges
- Display adjacency list
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Display graph statistics

### 7. Performance Analysis
- Compare Linear Search and Binary Search
- Measure execution time
- Count comparisons
- Analyze performance using different dataset sizes

### 8. Result Log
- Record selected operation results
- Display saved results

## Technologies Used

- Programming Language: Java
- Development Environment: Visual Studio Code
- Version Control: Git
- Collaboration Platform: GitHub
- Interface: Command Line (Console)

## Group Members and Individual Contributions

| Member | Student ID | GitHub Username | Contribution |
|---|---|---|---|
| G.B. Hasini Kushalya | 23DA2-0885 | Hasini0612 | Graph Operations, BFS, DFS, Input Utilities, Result Logging, Main Menu Integration |
| M.A. Mohamed Rimas | 23DA2-0572 | Rimas0711 | Stack and Queue Operations |
| K.J.F. Salma Jifry | 23DA2-0654 | salmajifry2003-bit | Linked List Operations and Performance Analysis |
| M.N.M. Rashad | 23DA2-1040 | 23da2-1040-cell | Array Operations and Searching Algorithms |

All members participated in developing and testing their assigned components and collaborating through GitHub branches and pull requests.

## Project Structure

```text
Data-Structure-Graph-Analyzer/
├── src/
│   ├── Main.java
│   ├── datastructures/
│   │   ├── ArrayOperations.java
│   │   ├── ArrayTest.java
│   │   ├── SearchingAlgorithms.java
│   │   ├── SearchingTest.java
│   │   ├── StackOperations.java
│   │   ├── QueueOperations.java
│   │   ├── StackQueueTest.java
│   │   ├── LinkedListOperations.java
│   │   └── LinkedListTest.java
│   ├── graph/
│   │   ├── GraphOperations.java
│   │   └── GraphTest.java
│   ├── performance/
│   │   ├── PerformanceAnalyzer.java
│   │   └── PerformanceTest.java
│   └── util/
│       ├── InputHelper.java
│       └── ResultLog.java
└── README.md
```

## How to Run the Project

### Requirements
- Java Development Kit (JDK)
- Command Prompt or terminal

### Step 1: Clone the Repository

```cmd
git clone https://github.com/Hasini0612/Data-Structure-Graph-Analyzer.git
```

### Step 2: Open the Project Directory

```cmd
cd Data-Structure-Graph-Analyzer
```

### Step 3: Compile the Java Files

```cmd
javac -cp src -d out src\Main.java src\datastructures\*.java src\graph\*.java src\performance\*.java src\util\*.java
```

### Step 4: Run the Application

```cmd
java -cp out Main
```

## Main Menu

```text
1. Array Operations
2. Searching Algorithms
3. Stack Operations
4. Queue Operations
5. Linked List Operations
6. Graph Operations
7. Performance Analysis
8. View Result Log
0. Exit
```

## Testing

The project includes separate test classes for its major components.

- ArrayTest.java
- SearchingTest.java
- StackQueueTest.java
- LinkedListTest.java
- GraphTest.java
- PerformanceTest.java

The main application has been compiled and launched successfully. Array, Searching, Stack, and Queue operations have been manually tested through the integrated menu.

Additional integration testing remains to be completed.

## GitHub Collaboration

The group used GitHub to coordinate development.

- Individual feature branches were created for assigned components.
- Members committed their implementation work.
- Pull requests were used to review and merge contributions.
- Completed modules were integrated into the main application.

## Conclusion

This project demonstrates practical applications of fundamental data structures and algorithms using Java. It provides a console-based environment for performing operations, exploring graph traversal methods, and comparing searching algorithm performance.

## Repository

https://github.com/Hasini0612/Data-Structure-Graph-Analyzer