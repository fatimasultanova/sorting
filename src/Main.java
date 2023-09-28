import sort.MergeSort;
import sort.QuickSort;
import sort.inter.Sorting;

public class Main {
    public static void main(String[] args) {
        int [] arr = FileReaderNumbers.readFile();
        Sorting sorting = new QuickSort();
        sorting.sort(arr);
        sorting.print(arr);

    }
}
