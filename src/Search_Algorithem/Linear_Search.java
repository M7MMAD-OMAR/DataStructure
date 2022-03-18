package Search_Algorithem;

public class Linear_Search {
    public static void checking(int[] arr, int number) {
        System.out.println("***************** Linear search *****************");
        for (int ar : arr) {
            if (ar == number) {
                System.out.println("The number is in range, After many attempt " + number);
                break;
            }
        }
    }
}
