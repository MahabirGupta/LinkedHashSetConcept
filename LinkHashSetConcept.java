import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkHashSetConcept {
    public static void main(String[] args) {
//        Declare a LinkedHashSet

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Hello");
        linkedHashSet.add(32);
        linkedHashSet.add(45.67);
        linkedHashSet.add(false);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet); // insertion order is preserved

//        declare a HashSet
        HashSet hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add(32);
        hashSet.add(45.67);
        hashSet.add(false);
        hashSet.add(null);

        System.out.println(hashSet); // insertion order is not preserved
    }
}
