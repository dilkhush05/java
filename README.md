# Java Algorithms & Problem Solving

Repository of Java algorithms, data-structure examples and small practice programs. Files are organized for learning and quick testing on a Windows machine.

## What’s included
- Daily-added Java solutions for algorithms and DSA topics.
- Small runnable examples (each with a `main` when applicable).
- Simple utilities and practice problems.

## Project layout (root)
- AllSortingTechnique/        # Sorting & linked-list implementations (e.g., MargeLinkedList.java)
- AssimentQuestion/           # Assignment-style problems
- inportantQue/               # Important question practice sets
- Arrays.java
- BinarySearch.java
- Matrix.java
- Patterns.java
- StringClass.java
- SubArrays.java
- function.java
- functionPracticeSet.java
- loops.java
- tempCodeRunnerFile.java
- StackWithArrayList.java     # Stack implementation using ArrayList
- QueueImpQuestion.java       # Queue practice: non-repeating chars, interleave, reverse

## Notable files
- AllSortingTechnique/MargeLinkedList.java
  - Merge sort on linked list, find-mid, zig-zag reorder.
- StackWithArrayList.java
  - Simple stack built on `ArrayList<Integer>` with push/pop/peek.
- QueueImpQuestion.java
  - Print first non-repeating char stream, interleave queue, reverse queue.



## Common issues & quick fixes
- "The type Queue is not generic" — caused by a local `Queue` class shadowing `java.util.Queue`. Fix by:
  - Renaming your custom `Queue` class or
  - Using fully-qualified types (`java.util.Queue`) or
  - Putting your custom class in a package.
- If IDE shows stale errors: clean build or delete `.class` files and recompile.

## Contributing
- Add new problems or algorithms in appropriate folders.
- Use descriptive filenames and include a short comment at file top about the purpose.
- Prefer small, focused commits.

## Notes
- Files are mostly in the default (unnamed) package — consider adding packages for larger refactors.
- If you want, I can:
  - Add a CONTRIBUTING.md template,
  - Convert code to use packages,
  - Add simple unit tests or build automation (e.g., Ant, Maven, Gradle).
