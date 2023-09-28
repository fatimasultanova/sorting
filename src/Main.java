import sort.InsertionSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.SelectionSort;
import sort.inter.Sorting;

public class Main {
    public static void main(String[] args) {
        int [] arr = FileReaderNumbers.readFile();
        Sorting sorting = new InsertionSort();
        sorting.sort(arr);
        sorting.print(arr);

    }
}
