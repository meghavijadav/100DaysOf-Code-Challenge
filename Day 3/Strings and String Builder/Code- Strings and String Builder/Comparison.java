public class Comparison {
    public static void main(String[] args) {
        String a = "Meghavi";
        String b = "Meghavi";
        //How can we prove this is in the same pool. Using ==
        System.out.println(a == b); //This will give true

        //Here we are creating a new object outside the pool in the heap
        String x = new String("Meghavi");
        String y = new String("Meghavi");
        System.out.println(x == y); //This will give false

        //If we want to only check the values are same or not
        System.out.println(x.equals(y)); //This will give true
        System.out.println(x.charAt(0));

    }
}
