import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void run(){
        Set<String> colors = new HashSet<>();

        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("1.HashSet");
        System.out.println("All colors in our set: (Remember: we havent duplicate!) "+colors);

        colors.add("Red");
        colors.add("Red");
        colors.add("Red");

        System.out.println("After adding 3 times color 'Red' our set have inside: "+colors);
        System.out.println("Rest methods for HashSet are similar as methods dedicate for ArrayList");



    }
}
