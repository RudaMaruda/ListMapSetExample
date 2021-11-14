import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void run() {

        List<String> arrayList = new ArrayList<>();
        System.out.println("Array list size: "+arrayList.size());

        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("gray");
        arrayList.add("green");

        System.out.println("1. ArrayList: ");
        System.out.println("Array list size after adding colors: "+arrayList.size());
        System.out.println("Inside arrayList: "+arrayList);
        System.out.println("Getting color from position [2] from arrayList : arrayList.get(2) -> "+arrayList.get(2));
        System.out.println("ArrayList is faster in getting position (from provided index )than LinkedList, because is similar as standard Array");
        arrayList.add(1,"orange");
        System.out.println("We can add new color in specific index arrayList.add(1,\"orange\"");
        System.out.println("New arrayList: "+arrayList);
        System.out.println("We can replace color in specific index: arrayList.set(1,magenta");
        arrayList.set(1,"magenta");
        System.out.println("Array list with replace color: "+arrayList);
        System.out.println("If you want to use method .remove(NewObject) then remember that you should override method equals/hashcode in NewObject class");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("table");
        linkedList.add("lamp");
        linkedList.add("fridge");
        linkedList.add("washingmachine");
        System.out.println("\n2.LinkedList: (keeps the order of the provided data)");
        System.out.println("table->lamp->fridge->washingmachine");
        System.out.println("Inside LinkedList: "+linkedList);
        System.out.println("Then we get position from list, it take time because we have to skip from one reference to other");
        System.out.println("Position [2] in LintedList: "+linkedList.get(2));
        System.out.println("Faster when we want to extend list");
        linkedList.addAll(arrayList);
        System.out.println("We can add all arrayList with method .addAll");
        System.out.println("Concat linkedList and arraylist: "+linkedList);
        Collections.sort(linkedList);
        System.out.println("Sorted list, using Collections.sort() :");
        linkedList.forEach(System.out::println);
    }

}
