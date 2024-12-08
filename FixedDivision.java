public class MyClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;
        if (y != 0) {
            z = x / y; 
        } else {
            System.out.println("Error: Division by zero");
        }
        System.out.println(z);
    }
}