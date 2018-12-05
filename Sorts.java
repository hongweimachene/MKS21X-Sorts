public class Sorts{
  public static void selectionsort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      //stores each index as a variable to compare with rest of the array; it will be the variable that contains smallest number
      int small = ary[i];
      //stores the value and index of each one being compared so it can be switched with another value and index when needed
      int store = small;
      int index = i;
      //loop starts from i because the number of array values to compare will get smaller as you sort the array
      for (int j = i; j < ary.length; j++) {
        //compares each value of the remaining indices to the smallest value set so far
        if (ary[j] < small) {
          //stores the index of the number if being swapped
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
  //
  public static void main(String[] args) {
    int[] ary = new int[] {6,3,9,2,2,1,5};
    int[] ary2 = new int[] {9,9,3,6,72,8,91,4,0};
    int[] ary3 = new int[] {10,32,54,6,7,84,23,9,0,1};
    System.out.println(toString(ary));
    selectionsort(ary);
    System.out.println(toString(ary));
    System.out.println(toString(ary2));
    selectionsort(ary2);
    System.out.println(toString(ary2));
    System.out.println(toString(ary3));
    selectionsort(ary3);
    System.out.println(toString(ary3));
  }
}
