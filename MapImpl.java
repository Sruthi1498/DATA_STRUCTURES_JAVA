import java.util.HashMap;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1,"Alice");
        m.put(2,"Bob");
        m.put(3,"Joe");

        m.remove(1);

        m.replace(2,"Bob","Ben");

        m.replaceAll((k,v) -> "Jack");

        for(Map.Entry mi:m.entrySet())
        {
            System.out.println(mi.getKey() + " " + mi.getValue());
        }
    }
}
