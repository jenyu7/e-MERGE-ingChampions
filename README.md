# e-MERGE-ingChampions
Jennifer Yu, Eric Zhang, Brandon Zhang: Period 5 APCS2 Brown-Mykolyk <br> <br> 
**This document has been updated as of 02/26/2017. The update is at the bottom.** <br> <br> 
***HW #07: What Does the Data Say?*** <br> 
**Plan:** Find the runtime of MergeSort on four arrays of different sizes, and graph the trend by graphs of n, n^2 and nlogn to see which best fits. <br> 
**Method:**
  1. Create 8 arrays of size 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000. 
  2. Create a 2D Array holding these 8 arrays. 
  3. Run through these arrays via the 2D array, and populate them with random numbers. 
  4. Sort each one of these arrays using MergeSort, and store the runtimes of the sorting into a string. 
  5. Print the string at the end, and graph the times measured. 
  
**What we did:**
  * Ran through the arrays thirty times. 
  * Took the average of the runtimes. 
  * Reduced the averages by a factor of 100 for a better visualization. 
  * Graphed these averages to see the trend. 

**Graph (Link)** <br> 
 [MergeSort vs. n, nlog(n) and n^2](https://docs.google.com/document/d/1VB3V4dNLcd05KYYzLG7QXkBsOT2EIJXENATCzGV4F_Q/pub)<br> 
 Includes a table with values as well as a comprehensive graph that evaluates the runtime of MergeSort. <br> 
 <br> 
 **UPDATE:**<br> 
 In order to further investigate the runtime of the merge sort algorithm, we decided to add a few more arrays of larger sizes to the code in `MergeSortTester.java`: <br> <br> 
 `int[] buffer = {0,0};` <br> 
	`int[] arr1 = new int[1];`
	`int[] arr2 = new int[1];` <br> 
	`int[] arr3 = new int[10];` <br> 
	`int[] arr4 = new int[100];` <br> 
	`int[] arr5 = new int[1000];` <br> 
	`int[] arr6 = new int[10000];` <br> 
	`int[] arr7 = new int[100000];` <br> 
	`int[] arr8 = new int[1000000];` <br> 
	`int[] arr9 = new int[10000000];` <br> 
	`int[] arr10 = new int[100000000];`<br> <br> 
Though the file was able to compile, during runtime, arr10 produced an error, stating: <br> 
`Exception in thread "main" java.lang.OutOfMemoryError: Java heap space at MergeSortTester.main(MergeSortTester.java:43)` <br> 
After commenting out arr10, the file was compiled once more. The testing was done incrementally. When arr7 was added, the compiling time was reasonable, not much slower than with only the first six arrays. After arr8 was added, the wait was distingushably longer, but still manageable. Then, arr9 was added, and the perception of compiling time was that it was very long, and hardly user friendly. The suggestion is that if sorting through an array size 1.0 * 10^8 long, Merge sort may not be the best way to manage. Perhaps the best is to never have an array THAT big. 

