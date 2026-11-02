package fundamental-lessons.equals;

public class PasswordTester {
    public static void main(String[] args) {
        String a = "lion"
        String b = new String("lion")
        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String cut = "dandelion".substring(5);
        System.out.println(cut);
        System.out.println(cut == a);
        System.out.println(cut.equal(a));

        String c = "lion";
        System.out.println(a==c); //false

        int x = 5;
        int y = 5;

        Password p = new Password("lion");
        String attempt = new String("lion");
        System.out.println(p.checkBroken(attempt));        
        System.out.println(p.check(attempt));        


    }
}
