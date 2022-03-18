package Search_Algorithem;

public class Binary_Search {
    public static void checking(int[] arr, int number) {
        System.out.println("***************** Binary search *****************");
        int low = 0, high = (arr.length-1), mid, country = 0;
        while (true) {
            country++;
            mid = low + ((high-low)/2); // high + low / 2
            if(low > high) {
                System.out.println("The number is outside in the rang");
                break;
            }
            if (arr[mid] == number) {
                System.out.println("The number is found " + country);
                break;
            }
            if (number > arr[mid])
                low = mid + 1;
            if (number < arr[mid])
                high = mid - 1;
        }
    }
}
