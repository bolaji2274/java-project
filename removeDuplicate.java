
import java.util.ArrayList;
import java.util.List;

public class removeDuplicate {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("good");
        stringList.add("better");
        stringList.add("best");
        stringList.add("best");
        stringList.add("first");
        stringList.add("last");
        stringList.add("last");
        stringList.add("last");
        stringList.add("good");

        System.out.println("Original List: " + stringList);
        removeDuplicates(stringList);
        System.out.println("List after removing duplicates: " + stringList);
    }

    public static void removeDuplicates(List<String> list) {
        if (list == null) {
            System.out.println("The list is null.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (current.equals(list.get(j))) {
                    list.remove(j);
                    j--; // Adjust the index after removal
                }
            }
        }
    }
}
