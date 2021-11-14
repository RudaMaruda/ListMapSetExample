import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void run(){
        Map<String,String> countriesWithCapitals = new HashMap<>();

        countriesWithCapitals.put("Poland","Warsaw");
        countriesWithCapitals.put("France","Paris");
        countriesWithCapitals.put("Germany","Berlin");
        countriesWithCapitals.put("Switzerland","Bern");
        countriesWithCapitals.put("Czech Republic","Praha");

        System.out.println("Map contains: "+countriesWithCapitals);

        System.out.println("1. Get value from map: map.get(key)");
        System.out.println("Capitals for Poland: "+countriesWithCapitals.get("Poland"));

        System.out.println("2. Put value if absent (method to avoid override value)");
        System.out.println("Put old capitals for Poland: Cracow");
        countriesWithCapitals.putIfAbsent("Poland","Cracow");
        System.out.println("Capital for Poland exist, so check current value for Poland: "+countriesWithCapitals.get("Poland"));

        System.out.println("3. Method getOrDefault: (if value is not exist, then return DefaultValue): ");
        System.out.println("Capital for Italy from our map: "+countriesWithCapitals.getOrDefault("Italy","We havent this Capital in our map :("));

        System.out.println("4. Method to shown all keys from map: ");
        countriesWithCapitals.keySet().forEach(System.out::println);

        System.out.println("5. Method to shown all values from map: ");
        countriesWithCapitals.values().forEach(System.out::println);

        System.out.println("6. Method to replace value for key: ");
        countriesWithCapitals.replace("Poland","Cracow");
        System.out.println("Map after replace for Poland : "+countriesWithCapitals);
    }
}
