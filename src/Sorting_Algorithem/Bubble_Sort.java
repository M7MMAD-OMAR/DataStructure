package Sorting_Algorithem;

public class Bubble_Sort {
    public static void sortingAsc(int[] arr) {
        int empt;
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < (arr.length-i); j++) {
                if (arr[j-1] > arr[j]) {
                    empt = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = empt;
                }
            }
        }
        System.out.println("sorting asc");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }

    public static void sortingDes(int[] arr) {
        int empt;
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < (arr.length-i); j++) {
                if (arr[j-1] < arr[j]) {
                    empt = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = empt;
                }
            }
        }
        System.out.println("\n\nsorting dsc");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }
}
