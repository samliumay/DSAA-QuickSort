
public class QuickSort {

  private void swap(int[] array, int firstindex, int secondIndex) {
    int temp = array[firstindex];
    array[firstindex] = array[secondIndex];
    array[secondIndex] = temp;
  }

  private int pivot(int[] array, int pivotIndex, int endIndex) {
    int swapIndex = pivotIndex;
    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (array[i] < array[pivotIndex]) {
        swapIndex++;
        swap(array, swapIndex, i);
      }
    }

    swap(array, swapIndex, pivotIndex);

    return swapIndex;
  }

  private void quickSort(int[] array, int left, int right) {

    if (left < right) {
      int pivotIndex = pivot(array, left, right);
      quickSort(array, left, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, right);
    }

  }


  public void quickSort(int[] array){
    quickSort(array, 0, array.length - 1);
  }

}