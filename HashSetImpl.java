import java.util.*;

public class HashSetImpl {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("aaaaa");
        set.add("bbbbb");
        set.add("ccccc");
        
        //no duplicate values
        set.add("aaaaa");
        set.add("bbbbb");

        //remove a string
        set.remove("aaaaa");

        //remove all
        set.removeAll(set);

        set.add("hello");
        set.add("world");
        set.add("welcome");

        //remove specific
        set.removeIf(s -> s.contains("world"));

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("alice");
        arr.add("bob");
        arr.add("joe");

        //arraylist to hashset
        HashSet<String> set1 = new HashSet<String>(arr);

        Iterator<String>  i = set1.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }


    }
}
