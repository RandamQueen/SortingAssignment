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
	
		 recursiveQuick( a, 0, a.length-1);
    		return a; 
    }//end quicksort
    
    static void recursiveQuick (double a[],int low, int high){
    		if( high <= low) { 
    			return; 
    		}
    		int pivotIndex = partition(a,low,high); 
    		recursiveQuick(a,low, pivotIndex-1); 
    		recursiveQuick(a, pivotIndex+1,high); 
    }
    
    private static int partition(double[] a,int low, int high){ 
    		int i =low; 
    		int j = high +1; 
    		double pivot = a[low]; 
    		while( true) { 
    		while(a[++i] < pivot ) { 
    				if( i == high )
    				{
    					break; 
    				}
    			}
    			while(pivot < a[--j] ) { 
    				if(j == low)
    				{
    					break; 
    				}
    			}
    			if( i >= j)
    			{ 
    				break; 
    			}
    			double temp = a[i]; 
    			a[i] = a[j]; 
    			a[j] = temp; 
    		}
    		a[low] = a[j]; 
    		a[j] = pivot; 
    		return j; 
    }

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
    		int size = a.length; 
    		double[] aux= new double[size];
    		for( int subSize =1;subSize < size; subSize = subSize + subSize )
    		{ 
    			for ( int low =0; low < size - subSize; low += subSize + subSize)
    			{
    				merge( a,aux,low,low+subSize-1, 
    						Math.min(low+subSize+subSize-1, size-1));
    			}
    		}
		 
    		return a;
    }//end mergesortIterative
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    		double auxilary[] = new double[a.length];
    		recursiveMerge( a, auxilary, 0, a.length -1); 
    		return a; 
    }//end mergeSortRecursive
    	
    static void recursiveMerge(double a[], double aux[], int low, int high) 
    {
    		if( high <= low)
    		{ 
    			return;
    		}
    		int mid = low +( high -low) /2; 
    		recursiveMerge(a,aux,low,mid); 
    		recursiveMerge(a,aux,mid+1,high);
    		merge(a,aux,low,mid,high); 
    }
    
    static void merge(double a[], double aux[], int low, int mid, int high) 
    {
    		for( int index =low; index <= high; index++)
    		{ 
    			aux[index] = a[index]; 
  
    		}
    		int i = low; 
    		int j = mid +1; 
    		for( int index = low; index <= high; index++)
    		{ 
    			if( i > mid)
    			{ 
    				a[index] = aux[j]; 
    				j++; 
    			}
    			else if(j > high)
    			{ 
    				a[index] = aux[i];
    				i++; 
    			}
    			else if( aux[i] <= aux[j])
    			{ 
    				a[index] = aux[i];
    				i++; 
    			}
    			else 
    			{ 
    				a[index] = aux[j]; 
    				j++; 
    			}
    		}
    }
    
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
	FileReader fileRead = new FileReader("numbers10.txt"); 
	BufferedReader buffRead = new BufferedReader(fileRead);
    	int TEST_ARRAY_SIZE = 10; 
    	double[] testArray = new double[TEST_ARRAY_SIZE];
	for(int index = 0; index<TEST_ARRAY_SIZE -1 ; index++ )
	{
		testArray[index] = Double.parseDouble(buffRead.readLine());
	}

    	 buffRead.close(); 
    	 fileRead.close(); 
    	 long startTime = System.currentTimeMillis();
    	 selectionSort( testArray); 
    	 long endTime = System.currentTimeMillis();
	 System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

 }//end class
