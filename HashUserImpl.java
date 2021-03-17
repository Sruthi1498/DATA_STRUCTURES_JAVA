import java.util.HashSet;

public class HashUserImpl {
    public static void main(String[] args) {
        HashSet<HashUser> h = new HashSet<HashUser>();

        HashUser h1 =new HashUser("alice",1,2);
        HashUser h2 =new HashUser("bob",2,3);
        HashUser h3 =new HashUser("joe",3,4);

        h.add(h1);
        h.add(h2);
        h.add(h3);

        for(HashUser i:h)
        {
            System.out.println(i.name + " " + i.id + " " + i.age);
        }
    }
}
