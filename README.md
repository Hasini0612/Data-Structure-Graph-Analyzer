
# Data Structure and Graph Performance Analyzer

## Project Overview

The Data Structure and Graph Performance Analyzer is a Java console-based application developed for the CIT300 – Data Structures and Algorithms group project at Sri Lanka Technology Campus (SLTC).

The application demonstrates fundamental data structures, searching algorithms, graph traversal techniques, and performance analysis through an interactive menu-driven interface.

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

### Member 1 – G.B. Hasini Kushalya

**Student Name:** G.B. Hasini Kushalya  
**Student ID:** 23DA2-0885  
**GitHub Username:** Hasini0612  
**Assigned Responsibility:** Graph Operations and System Integration  

**Individual Contribution:**
- Implemented graph vertex and edge management.
- Developed adjacency list representation.
- Implemented Breadth-First Search (BFS).
- Implemented Depth-First Search (DFS).
- Developed graph display and statistics features.
- Implemented reusable input validation utilities.
- Developed the result logging component.
- Integrated individual components into the main Java application.

### Member 2 – M.A. Mohamed Rimas

**Student Name:** M.A. Mohamed Rimas  
**Student ID:** 23DA2-0572  
**GitHub Username:** Rimas0711  
**Assigned Responsibility:** Stack and Queue Operations  

**Individual Contribution:**
- Implemented stack push, pop, and peek operations.
- Developed stack display functionality.
- Implemented queue enqueue and dequeue operations.
- Developed front element retrieval.
- Implemented queue display functionality.
- Tested Stack and Queue components.

### Member 3 – K.J.F. Salma Jifry

**Student Name:** K.J.F. Salma Jifry  
**Student ID:** 23DA2-0654  
**GitHub Username:** salmajifry2003-bit  
**Assigned Responsibility:** Linked List Operations and Performance Analysis  

**Individual Contribution:**
- Implemented singly linked list insertion.
- Developed deletion and searching operations.
- Implemented linked list display and clear functions.
- Developed performance comparison between Linear Search and Binary Search.
- Implemented execution time measurement and comparison counting.
- Tested Linked List and Performance Analysis components.

### Member 4 – M.N.M. Rashad

**Student Name:** M.N.M. Rashad  
**Student ID:** 23DA2-1040  
**GitHub Username:** 23da2-1040-cell  
**Assigned Responsibility:** Array Operations and Searching Algorithms  

**Individual Contribution:**
- Implemented array insertion and deletion.
- Developed array searching and display operations.
- Implemented Linear Search.
- Implemented Binary Search.
- Added comparison counting and execution time measurement.
- Tested Array and Searching components.

## Group Collaboration

All four members participated in testing, debugging, project documentation, and GitHub collaboration.

Individual components were developed using separate feature branches and integrated into the main branch through pull requests.

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
├── evidence/
│   └── screenshots/
│       ├── 01_main_menu.png
│       ├── 02_array_operations.png
│       ├── 03_linear_search.png
│       ├── 04_binary_search.png
│       ├── 05_stack_operations.png
│       ├── 06_queue_operations.png
│       ├── 07_linked_list_operations.png
│       ├── 08_graph_bfs.png
│       ├── 09_graph_dfs.png
│       ├── 10_performance_analysis.png
│       └── 11_result_log.png
└── README.md
```

## How to Run the Project

### Requirements

- Java Development Kit (JDK)
- Command Prompt or terminal
- Git (for cloning the repository)

### Step 1: Clone the Repository

```cmd
git clone https://github.com/Hasini0612/Data-Structure-Graph-Analyzer.git
```

### Step 2: Open the Project Directory

```cmd
cd Data-Structure-Graph-Analyzer
```

### Step 3: Compile the Java Application

```cmd
javac -cp src -d out src\Main.java
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

The project includes separate test classes for its major components:

- ArrayTest.java
- SearchingTest.java
- StackQueueTest.java
- LinkedListTest.java
- GraphTest.java
- PerformanceTest.java

The Java application was compiled and launched successfully.

The major features were demonstrated through the integrated console menu, including:

- Array Operations
- Linear Search and Binary Search
- Stack Operations
- Queue Operations
- Linked List Operations
- Graph BFS and DFS
- Performance Analysis
- Result Log

Program output screenshots are included in the `evidence/screenshots/` directory.

## Evidence Screenshots

The repository contains 11 screenshots demonstrating the main application and its major operations.

These screenshots are stored in:

`evidence/screenshots/`

## GitHub Collaboration

The group used GitHub to coordinate development.

- Individual feature branches were created for assigned components.
- Members committed their implementation work.
- Pull requests were used to review and merge contributions.
- Completed modules were integrated into the main application.
- The final source code and evidence screenshots were committed to the repository.

## Conclusion

The Data Structure and Graph Performance Analyzer demonstrates the practical implementation of fundamental data structures and algorithms using Java.

The project provides an interactive console environment for performing data structure operations, exploring BFS and DFS graph traversal, and comparing searching algorithm performance.

Through this project, group members gained practical experience in Java programming, data structures, algorithm analysis, testing, integration, and GitHub collaboration.

## Repository

https://github.com/Hasini0612/Data-Structure-Graph-Analyzer
