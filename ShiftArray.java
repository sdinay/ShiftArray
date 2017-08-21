/* Java Shift Array
 * sdinay
 * July 31, 2017
 *
 * desc: rotates an array of size n by d elements
 */

import java.util.Scanner;
import java.util.Arrays;

class ShiftArray {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);

  	System.out.print("How big is your array? ");
  	String inputArrayLength = sc.next();
  	if(!isInteger(inputArrayLength)) {
  		System.out.println("Array length is invalid");
  		return;
  	}

  	int inputArrayLengthInt = Integer.parseInt(inputArrayLength);
  	int[] array2 = new int[inputArrayLengthInt];

  	System.out.println("Please enter elements of an int array seperated by a space");
  	System.out.print("Integer Array: ");

  	int tracker = 0;
	while(tracker < inputArrayLengthInt) {
		String s1 = sc.next();
		if(isInteger(s1)) {
			array2[tracker] = Integer.parseInt(s1);
			tracker++;
		} else {
			System.out.println("> Not recorded: " + s1);
		}
  	}

  	System.out.print("Array shift: ");
  	int arrayShift = sc.nextInt();
  		
   	rotate(array2, arrayShift);
  }

  // rotate(ar[], d)
  // d is the number of elements to shift the array by
  static int[] rotate(int[] array, int d) {
  	int n = array.length;
  	int[] temp = new int[d];
  	int[] newArray = new int[n];

  	if( d > n )
  		d = d % n;
  	
	for(int i = 0; i < d; i++) {
  		temp[i] = array[i];
  	}
  	for(int i = 0; i < n - d; i++) {
  		newArray[i] = array[i+d];
  	}
  	int j = 0;
  	for(int i = n - d; i < n; i ++) {
  		newArray[i] = temp[j];
  		j++;
  	}

  	System.out.println(Arrays.toString(newArray));
  	return newArray;
  	
  }

  public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // only got here if we didn't return false
    return true;
  }
}
