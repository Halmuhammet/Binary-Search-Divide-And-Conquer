# Binary Search (Divide and Conquer)

This Java program implements the **Binary Search** algorithm using the **Divide and Conquer** strategy (just for fun and to learn about D&C).

## Description

The program searches for a target integer within a sorted array of integers. If the target exists in the array, its index is returned. If not, the method returns `-1`. The implementation recursively narrows the search range until the target is found or the base case is reached.

### Features

- Recursive binary search.
- Uses divide and conquer technique.
- Returns `-1` if the target is not found.
- Handles base cases explicitly.

## Example

```java
int[] myArray = {-57, -8, 3, 5, 8, 9, 10};
int foundIndex = binarySearch_divide_and_conquer(myArray, 0, myArray.length - 1, 1);
System.out.println(foundIndex); // Output: -1 (target not found)
