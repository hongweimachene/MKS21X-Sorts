public class Sorts{
  public static void selectionsort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      int small = ary[i];
      int store = small;
      int index = 0;
      for (int j = i; j < ary.length; j++) {
        if (ary[j] < small) {
          index = j;
          small = ary[j];
        }
      }
      ary[i] = small;
      ary[index] = store;
    }
  }
  public String toString(int[] ary) {
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
  public static void main(String[] args) {
    int[] ary = new int[] {6,3,9,2,2,1,5};
    System.out.println(toString(ary));
    selectionsort(ary);
    System.out.println(toString(ary));
  }
}
