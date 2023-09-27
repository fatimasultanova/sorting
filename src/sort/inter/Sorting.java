package sort.inter;

public interface Sorting {
    void sort(int [] arr);

     default void print(int [] arr){
        System.out.print("{ ");
        for (int z = 0; z < arr.length; z++) {
            System.out.print(arr[z]);
            if (z != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");
    }
}
