package Sorting_Algorithem;

public class Merge_Sort {
    int[] arr;
    int[] tempArr;

    public void prepareForSort(int[] arr) {
        this.arr = arr;
        tempArr = new int[arr.length];
        mergeSort(0, arr.length-1);
    }

    // small problem
    void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            mergeSort(lowerIndex, middle);
            mergeSort(middle + 1, higherIndex);
            mergePort(lowerIndex, middle, higherIndex);
        }
    }
    // merge problem to sort
    void mergePort(int lI, int mI, int hI) {
        for (int i = lI; i<=hI;i++)
            tempArr[i] = arr[i];
        int i = lI;
        int j = mI+1;
        int k = lI;
        while(i <=mI && j <=hI) {
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            }else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while(i <= mI) {
            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }


}
