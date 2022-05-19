import java.util.Arrays;


public class Nuclearsort {
  public static void main(String[] args) {
    int[] array = {5,10,2,3,12};
        
    System.out.println("original array: " + Arrays.toString(array));
    System.out.println("sorted array. : " + Arrays.toString( nuclearSort(array) ));
  }

  public int[] nuclearSort(int[] array) {
    return Arrays.copyOf(array, 0);
  }
}
