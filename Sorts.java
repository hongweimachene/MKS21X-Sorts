public class Sorts{
  /**Bubble sort of an int array.
 *Upon completion, the elements of the array will be in increasing order.
 *@param data  the elements to be sorted.
 */
  public static void selectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      //stores each index as a variable to compare with rest of the array; it will be the variable that contains smallest number
      int small = ary[i];
      //stores the value and index of each one being compared so it can be switched with another value and index when needed
      int store = small;
      int index = i;
      //loop starts from i because the number of array values to compare will get smaller as you sort the array; you can ignore the previous values
      for (int j = i; j < ary.length; j++) {
        //compares each value of the remaining indices to the smallest value set so far
        if (ary[j] < small) {
          //stores the index of the number being swapped
          index = j;
          //sets the next smallest value in the array
          small = ary[j];
        }
      }
      //swaps values and indices of the next smallest in the array
      ary[i] = small;
      ary[index] = store;
    }
  }

  /**Bubble sort of an int array.
 *Upon completion, the elements of the array will be in increasing order.
 *@param data  the elements to be sorted.
 */
  public static void bubbleSort(int[] ary) {
    //the length of the array you check gets smaller as you sort
    for (int aryLeft = ary.length; aryLeft > 1; aryLeft--) {
      //runs the check to the end of whats left of the array
      for (int i = 0; i < aryLeft-1; i++) {
        //for each index compare two consecutive values and switch them if the second is smaller
        int copy = ary[i];
        if (ary[i] > ary[i+1]) {
          ary[i] = ary[i+1];
          ary[i+1] = copy;
        }
      }
    }
  }

  public static void insertionSort(int[] ary) {
    //the sort starts at index 1 because it is the sorted side
    for (int i = 1; i < ary.length; i++) {
      //unsorted is being compared to each value in the sorted side
      int unsorted = ary[i];
      int sorted = i - 1;
      //checks if sorted side is greater than the unsorted value
      while (sorted >= 0 && ary[sorted] > unsorted ) {
        //shifts each value forward to the right if the sorted is greater
        ary[sorted+1] = ary[sorted];
        sorted--;
      }
      //if the while loop is done, means sorted side is sorted and insert the unsorted
      //into where it belongs,
      //the right of the next smallest number
      ary[sorted+1] = unsorted;
    }
  }

  //added toString to test sort method
  public static String toString(int[] ary) {
    String s = "";
    for (int i = 0; i < ary.length; i++) {
      if (i == ary.length - 1) {
        s+=ary[i];
      } else {
        s+= ary[i]+", ";
      }
    }
    return s;
  }
  //testing
  public static void main(String[] args) {
    int[] ary = new int[] {6,3,9,2,2,1,5};
    int[] ary2 = new int[] {9,9,3,6,72,8,91,4,0};
    int[] ary3 = new int[] {10,32,54,6,7,84,23,9,0,1};
    int[] ary4 = new int[] {5,1,12,-5,16};
    int[] ary5 = new int[] {2,3,4,5,1};
    int[] ary6 = new int[] {6,1,2,3,4,5};
    int[] ary7 = new int[] {4,3,2,10,12,1,5,6};
    System.out.println(toString(ary));
    selectionSort(ary);
    System.out.println(toString(ary));
    System.out.println(toString(ary2));
    selectionSort(ary2);
    System.out.println(toString(ary2));
    System.out.println(toString(ary3));
    selectionSort(ary3);
    System.out.println(toString(ary3));
    System.out.println(toString(ary4));
    bubbleSort(ary4);
    System.out.println(toString(ary4));
    System.out.println(toString(ary5));
    bubbleSort(ary5);
    System.out.println(toString(ary5));
    System.out.println(toString(ary6));
    bubbleSort(ary6);
    System.out.println(toString(ary6));
    System.out.println(toString(ary7));
    insertionSort(ary7);
    System.out.println(toString(ary7));
  }
}
