/*
 *  Provides a solution to selection problem
 *  Growth rate is approx. O(n^2)
 *  
 *  @author: Brendan Edwards
 *  CIS 360 Fall 2012
 *  
 */ 
 


public class SelectionProblem {
	
	// Simply loops over list for k iterations, seeking the next smallest number
	// each time. By default, comparisons are always started at the index of the
	// first number to be compared with the rest (i.e. curr).
	public static int findKth( int kth, int[] someArray ) {
		
		// Start clockin'...
		long startTime = System.currentTimeMillis();
		
		
		// Set solution at beginning of array to start out with comparisons 
		int currentSmallestInt = someArray[ 0 ];
		
		// Match index of solution
		int indexOfCurr = 0;
		int curr = 0;		
		
		// Loop k number of times through 
		for ( int k=0; k < kth; k++ ){

			// Start at curr, look for next smallest
			int someArrayLength = someArray.length;
			for ( int i=curr; i < someArrayLength; i++ ){
				
					if ( someArray[ i ] < currentSmallestInt ){
						currentSmallestInt = someArray[ i ];
						indexOfCurr = i;
					}
				
				
			}
			
			// Swap value at curr with next smallest
			someArray[ indexOfCurr ] = someArray[ curr ];
			someArray[ curr ] = currentSmallestInt;
			curr++;
			
			// Point solution to next number after curr, so we can start comparisons again
			currentSmallestInt = someArray[ curr ];
			
		}
		
		
		long endTime = System.currentTimeMillis();
		double totalTime = (endTime - startTime);
		System.out.print( "\tTotal running time of " + ( totalTime ) + " ms\n" );
		
		return someArray[ kth-1 ];
	
	}
	

	// Fill an array with random numbers between 1 and 1000
	public  static int[] generateSomeData( int size ){
		int arr[] = new int[ size ];
		
		for ( int k=0; k < size; k++ )
			arr[k] = ( int ) ( Math.random() * 1000 );
		return arr;
	}
	
	public static void main( String argv[] ){
		
		
		System.out.println( "Input\t|\tRunning Time" );
		
		// Let's run some tests, and increase the input size by * 10 each time...
		int input_size = 1;
		for ( int k=1; k <= 6; k++ )
		{			
			input_size*=10;
			int kth = ( input_size/2 );
			System.out.println( "-------------------------------------" );
			System.out.println( input_size  + "\t" + "and solution was " + findKth( kth, generateSomeData( input_size )) );
		}

		
	}
		
}
*/

