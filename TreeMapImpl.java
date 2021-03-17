import javax.swing.tree.TreeModel;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapImpl {


        public static void main(String[] args) {
            TreeMap<Integer,String> t = new TreeMap<Integer,String>();

            t.put(1,"alice");
            t.put(2,"bob");
            t.put(3,"joe");
            t.put(4,"jack");
            t.put(5,"jill");

            System.out.println(t.descendingMap());

            //prints head of the given number
            System.out.println(t.headMap(3,true));

            //prints the subset of given number
            System.out.println(t.subMap(2,false, 5, true));

            //prints tail of the given number
            System.out.println(t.tailMap(4,true));
        }
    }


