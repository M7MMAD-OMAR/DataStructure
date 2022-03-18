package Search_Algorithem;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1122, 1133, 1144, 2288, 2277, 4422, 4411, 8833, 9900, 9901};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
        int x = 4422;
        Linear_Search.checking(array, x);

        Binary_Search.checking(array, x);


        Interpolation_Search.checking(array , x);
    }
}
