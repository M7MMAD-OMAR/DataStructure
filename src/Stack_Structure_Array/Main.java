package Stack_Structure_Array;

public class Main {
    public static void main(String[] args) {
        Stack_Array<String> stack_array = new Stack_Array<String>(5);
        stack_array.push("33");
        stack_array.push("44");
        stack_array.pop();
        System.out.println(stack_array.top);
        System.out.println(stack_array.size);
    }
}
