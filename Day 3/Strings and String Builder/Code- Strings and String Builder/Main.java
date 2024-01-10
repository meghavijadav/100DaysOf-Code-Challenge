public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 9};
        int num = 10;
        String name = "Meghavi Jadav";

        String a = "Meghavi";
        String b = "Meghavi";
        //a and b are pointing to the same object
        System.out.println(a);
        a = "Jadav";
        System.out.println(a);
        System.out.println(b);
    }
}
