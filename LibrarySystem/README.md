# Library Management System
A Java system built with **7 classes** as a guided practice project to prepare for my CSC113 test

## Project Structure (7 Classes)

| Class | Purpose |
|-------|---------|
| **LibraryItem**  | An abstract superclass that implements Borrowable interface. Contains abstract method `calculateLateFee()` |
|**DVD** | Subclass of LibraryItem. Own fields + implementation of `calculateLateFee()` |
| **Book** | Subclass of LibraryItem. Own fields + implementation of `calculateLateFee()`  |
| **Borrowable** | Interface with 3 methods implemented by LibraryItem |
| **Library** | Holds LibraryItem and Member arrays (aggregation). Methods to add/find items and members, handles borrowing/returning items.| 
| **Member** | Holds borrowed items(max 5 per member). Methods to borrow and return items. |
| **LibrarySystem** | Main class. Creates objects and runs the program |
---

## OOP Concepts Used
| Concept | Where |
|---------|-------|
| Inheritance | Book and DVD extend LibraryItem |
| Abstraction | `calculateLateFee()` abstract method |
| Interface | Borrowable interface |
| Aggregation | Library contains arrays of LibraryItem and Member |
| Encapsulation | Private fields with public methods |
| Method Overriding | Each subclass implements `calculateLateFee()` differently |
---

## Honest Disclosure
I did **not** build this entirely on my own. Here's exactly how it was made:

- I received **step-by-step prompts** from an AI assistant 
- The AI suggested the class structure and OOP concepts to use
- **I wrote every line of code myself**
- I understand how all 7 classes work together
- I debugged my own errors

---

## What I Learned

- How to create an abstract superclass with subclasses
- Implementing interfaces
- How to perform aggregation between two classes
- How to manage multi-class Java project

## What I Can Improve Later
- Calculate late fees based on borrow date.
- Add subclasses(StudentMember/RegularMember) to Member, to customize borrowing based on the borrower.
- Turn it into a menu-driven system.

  
## How to Run

```bash
javac LibrarySystem.java
java LibrarySystem
```

Added README for LibrarySystem
