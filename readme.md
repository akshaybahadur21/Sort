## Sorting Algorithms
This code helps you to understand the different Sorting algorithms. The sorting algorithms depicted in this code are:
1) Bubble Sort
2)Selection Sort
3)Insertion Sort
4)Quick Sort
5) Merge Sort

### Code Requirements
The example code is in Java ([version 1.8](https://java.com/en/download/) or higher will work). 

### Description
A sorting algorithm is an algorithm made up of a series of instructions that takes an array as input, performs specified operations on the array, sometimes called a list, and outputs a sorted array.
 Efficient sorting is important for optimizing the use of other algorithms (such as search and merge algorithms) which require input data to be in sorted lists; it is also often useful for canonicalizing data and for producing human-readable output. More formally, the output must satisfy two conditions:

    The output is in nondecreasing order (each element is no smaller than the previous element according to the desired total order);
    The output is a permutation (reordering) of the input.


```java
"\n1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort.\n4.Quick Sort.\n5.Merge Sort.\n6.Exit."

switch(ch)
		{
			case 1:
				BinarySort(a,n);
				break;
			case 2:
				SelectionSort(a,n);
				break;
			case 3:
				InsertionSort(a,n);
				break;
			case 4:
				int start=0;
				int end=n-1;
				QuickSort(a,start,end);
				print(a,n);
				break;
			case 5:
				MergeSort(a,n);
				print(a,n);	
				break;
		}
``` 
You can select any algorithm from the list and then enter an array which would get sorted through the selected algorithm.

### Execution
To compile the code, simply run the `javac Sort.java`.
To run the code, type `java Sort`

```
`javac Sort.java`
`java Sort`
```
