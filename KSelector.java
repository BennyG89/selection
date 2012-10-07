/*
 *  Program to solve selection problem
 *  
 *  @author: Brendan Edwards
 * 
 */


public class KSelector {
	
	
	
	public static int findKth( int kth, int curr, int[] someArray ){
			
			System.out.println("Executing...");
			// Establish a base case
			if ( curr == kth ){
					System.out.println(curr + " is equal to " + kth);
					for ( int a : someArray)
						System.out.print(a + " ");
					return someArray[ 0 ];
					
			}
			
			int tmp = someArray[ curr ];
			int arrayLength = (someArray.length);
			int indexOfTmp = curr;
			
			// Traverse array, looking for next smallest number, beginning at index 'curr'
			for ( int k = curr; k < arrayLength; k++ ){
					if ( k == 0 )
						tmp = someArray[ k ];
					else { 
						if (someArray[ k ] < tmp){
							tmp = someArray[ k ];
							System.out.println( tmp );
							indexOfTmp = k;
						}
					}
			}
			
			curr = (curr+1);
			
			// Swap value of tmp into partition
			someArray[ indexOfTmp ] = someArray[ curr ];
			someArray[ 0 ] = tmp;
			
			return findKth( kth, curr, someArray);
	}
	
	public  static int[] generateSomeData( int arr[] ){
		int arrayLength = arr.length;
		for ( int k=0; k < arrayLength; k++ )
			arr[k] = ( int ) ( Math.random() * 1000 );
		return arr;
	}

	
	public static void main( String argv[] ){
			int[] myArray = new int[10];
			generateSomeData( myArray );
			
			int[] inputData = { 4, 6, 8 };
			
			for ( int a : myArray)
				System.out.print(a + " ");
			
			System.out.println("\nThe solution is " + findKth( 9, 0, myArray ));
			
	}
}
