/*
Jennifer Yu 
APCS2 Period 5
HW #06: Step 1: Split, Step 2: ?, Step 3: Sorted!
2017-02-11
*/
/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
	int[] merge (int[] a, int[] b): 
		1. Creates a new array c, size of the sum of the length of a and b
		2. Declares three separate count variables, one to iterate through a (aC), one through b (bC), and one overarching count (count).
		3. While aC is still less than the length of a, and bC is still less than the length of b (avoids index errors):
			a. if the element at a is less than the element at b according to their unique counts, then add the element at a to the array c at the index indicated by 'count'
			b. if else (element at b is less than or equal to the one at a), add the b element. 
		4. If there are elements still remaining in a or b, then append them to the end of the array c. 
		5. Return c. 
	Runtime: O(n)
	
	
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[])
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b )
    {
		int[] c = new int[a.length + b.length];
		int aC = 0;
		int bC = 0;
		int count = 0;
		while (aC < a.length && bC < b.length){
			if (a[aC] < b[bC]){
				c[count] = a[aC];
				aC ++; 
				count ++;
			}
			else{
				c[count] = b[bC];
				bC ++;
				count ++;
			}
		}
		
		if (b.length-bC > 0){
			for (int i = 0; i < b.length-bC; i ++){
				c[count + i] = b[bC+ i];
			}
		}
		else{
			for (int k = 0; k < a.length-aC; k ++){
				c[count+k] = a[aC+ k];
			}
		}
		return c;
    }//end merge()


    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] deck )
    {	
		/*
		if (deck.length <= 1){return deck;}
		else{
			int[] branch1 = sort(java.util.Arrays.copyOfRange(deck, 0,(deck.length)/2));
			int[] branch2 = sort(java.util.Arrays.copyOfRange(deck,((deck.length)/2), deck.length));
			return merge(branch1, branch2);}
		*/
		
		return sortHelp(deck, 0, (deck.length)/2, deck.length);
		
    }//end sort()

	public static int[] sortHelp(int[] deck, int start, int mid, int end){
		if (mid-start <= 0){
			int[] a = {deck[mid]};
			return a;}
		else{
			int[] branch1 = sortHelp(deck, start, (start + mid)/2, mid);
			int[] branch2 = sortHelp(deck, mid , (mid + end)/2, end);
			return merge(branch1, branch2);
		}
	}


    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
        for( int i = 0 ; i<a.length; i++ )
            a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
        System.out.print("[");
        for( int i : a )
            System.out.print( i + ",");
        System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

        
        int[] arr0 = {0};
        int[] arr1 = {1};
        int[] arr2 = {1,2};
        int[] arr3 = {3,4};
        int[] arr4 = {1,2,3,4};
        int[] arr5 = {4,3,2,1};
        int[] arr6 = {9,42,17,63,0,512,23};
        int[] arr7 = {9,42,17,63,0,9,512,23,9};

        System.out.println("\nTesting mess-with-array method...");
        printArray( arr3 );
        mess(arr3);
        printArray( arr3 );

        System.out.println("\nMerging arr1 and arr0: ");
        printArray( merge(arr1,arr0) );

        System.out.println("\nMerging arr4 and arr6: ");
        printArray( merge(arr4,arr6) );

        System.out.println("\nSorting arr4-7...");
        printArray( sort( arr4 ) );
        printArray( sort( arr5 ) );
        printArray( sort( arr6 ) );
        printArray( sort( arr7 ) );
		/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
