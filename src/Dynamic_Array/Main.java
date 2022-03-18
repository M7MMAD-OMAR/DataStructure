package Dynamic_Array;

public class Main {
    public static void main(String[] args) {
        Dynamic_Array<String> dynamic_array = new Dynamic_Array<String>();
        dynamic_array.set("20");
        System.out.println(dynamic_array.getSize());
        dynamic_array.set("2");
        System.out.println(dynamic_array.getSize());
        dynamic_array.set("222");
        dynamic_array.set("333");
        System.out.println(dynamic_array.getSize());
        dynamic_array.delete(2);
        System.out.println("Size Array: " + dynamic_array.getSize());

        System.out.println("Get Element: " + dynamic_array.get(2));
    }
}
