package Sorting_Algorithem;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {55, 2, 4, 44, 9, 3, 22, 0, 2, 224};
//        Bubble_Sort.sortingAsc(arr);
//        Bubble_Sort.sortingDes(arr);
//        new Merge_Sort().prepareForSort(arr);
//        System.out.println("After");
        System.out.println("Before");
        Quick_Sort.printArray(arr);

        System.out.println("\n\nAfter 1");
        new Heap_Sort().sort(arr);
        Quick_Sort.printArray(arr);

        System.out.println("\n\nAfter 2");
        int n = arr.length;
        Quick_Sort.quickSort(arr, 0, n - 1);
//        System.out.println("Sorted array: ");
        Quick_Sort.printArray(arr);

    }


}
