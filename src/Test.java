/**
 * Created by osman on 6/15/17.
 */
public class Test {
    public static void main(String[] args)
    {
        String a = "Pocetak";
        String b = "Posta";
        if (a.substring(0,2) == b.substring(0,2))
            System.out.println("isti1");
        if (a.substring(0,2).equals(b.substring(0,2)))
            System.out.println("isti2");
    }
}
