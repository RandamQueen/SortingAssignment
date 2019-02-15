// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2019
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]){
	double temp;
    		int size =  a.length;
    		for( int i =1; i<size; i++ )
    		{ 
    			for( int j = i; j> 0; j--)
    			{ 
    				if( a[j] < a[j-1] )
    				{ 
    					temp = a[j]; 
    					a[j] = a[j-1]; 
    					a[j-1] =temp;
    				}
    			}
    		}
    		return a;
    }//end insertionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){
	
		 //todo: implement the sort

    }//end quicksort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {

		 //todo: implement the sort
	
    }//end mergesortIterative
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	

    	//todo: implement the sort
	
   }//end mergeSortRecursive
    	
    
    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){
			int size = a.length;
    		for( int i =0; i < size; i++) 
    		{
    			int minmumValIndex = i; 
    			for( int j = i+1; j < size;j++) 
    			{ 
    				if( a[j] < a[minmumValIndex] )
    				{ 
    					minmumValIndex =j; 
    				}
    			}
    			double temp = a[minmumValIndex]; 
    			a[minmumValIndex] = a[i]; 
    			a[i] = temp;
    		}
         
    		return a; 
	 }//end selectionsort

    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

 }//end class
