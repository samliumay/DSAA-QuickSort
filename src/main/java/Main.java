public class Main {
  public static void main(String[] args) {

  QuickSort quickSort = new QuickSort();

    int [] array = {4,6,1,7,3,2,5};

    quickSort.quickSort(array);

    for(int i: array){
      System.out.print(i + " ");
    }
    
    
  }
}