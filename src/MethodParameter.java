public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Abdul", "Latif");
        sayHello("Reza", "Abahsky");
        sayHello("Zero", "Programming");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
