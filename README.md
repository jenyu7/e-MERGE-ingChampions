# e-MERGE-ingChampions
Jennifer Yu, Eric Zhang, Brandon Zhang: Period 5 APCS2 Brown-Mykolyk <br> 

***HW #07: What Does the Data Say?*** <br> 
**Plan:** Find the runtime of MergeSort on four arrays of different sizes, and graph the trend by graphs of n, n^2 and nlogn to see which best fits. <br> 
**Method:**
  1. Create 6 arrays of size 1, 10, 100, 1000, 10000, 100000. 
  2. Create a 2D Array holding these 6 arrays. 
  3. Run through these four arrays via the 2D array, and populate them with random numbers. 
  4. Sort each one of these arrays using MergeSort, and store the runtimes of the sorting into a string. 
  5. Print the string at the end, and graph the times measured. 
  
**What we did:**
  * Ran through the four arrays thirty times. 
  * Took the average of the runtimes. 
  * Reduced the averages by a factor of 100 to avoid skewing. 
  * Graphed these averages to see the trend. 

**Graph (Link)** <br> 
 [MergeSort vs. n, nlog(n) and n^2](https://docs.google.com/document/d/1VB3V4dNLcd05KYYzLG7QXkBsOT2EIJXENATCzGV4F_Q/pub)<br> 
 Includes a table with values as well as a comprehensive graph that evaluates the runtime of MergeSort. 

