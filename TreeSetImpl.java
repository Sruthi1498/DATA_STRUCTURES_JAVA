import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();

        t.add(11);
        t.add(2);
        t.add(38);
        t.add(14);
        t.add(50);

        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());

        System.out.println(t.descendingSet());

        //prints head of the given number
        System.out.println(t.headSet(38,true));

        //prints the subset of given number
        System.out.println(t.subSet(2,false, 50, true));

        //prints tail of the given number
        System.out.println(t.tailSet(14,true));
    }
}
