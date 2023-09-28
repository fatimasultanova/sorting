package searching;

public class BinarySearch implements Searching{

    @Override
    public int search(int[] arr, int targetValue) {
        return binarySearch(arr,targetValue,0,arr.length);
    }
    private int binarySearch(int [] arr , int targetValue , int firstIndex , int lastIndex){
        if (firstIndex<=lastIndex && (lastIndex+firstIndex) / 2 != arr.length) {
            int midIndex = (lastIndex+firstIndex) / 2;
            if (arr[midIndex] == targetValue) return midIndex;
            if (arr[midIndex] > targetValue) return binarySearch(arr, targetValue, 0, midIndex - 1);
            if (arr[midIndex] < targetValue) return binarySearch(arr, targetValue, midIndex + 1, lastIndex);
        }
        return -1;
    }
}
