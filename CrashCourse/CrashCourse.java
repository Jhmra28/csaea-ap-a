package CrashCourse;

public class CrashCourse {     // class header
    public static void main(String[] args) {

        // comments 
        
        /*  Multiline 
         Comment
         Here
         */

         System.out.print("Hello");
         System.out.println("World"); // auto-prints on a new line
         System.out.println("Hello world");

         // varialbe declarations:
         // PRIMITIVE VARIABLES
         int a; // integer
         double b; // decimal, or float
         boolean c; // true or false;

         a = 4;
         b = 5.5;
         c = false; // lowercase

         // Arithmetic Operators 
         // + - / *  %
         // += -= /=  %=

        int d = 3;
        d += 7;

        // increment n decrement by one
        // --, ++

        System.out.println("d is equal to " + d);
           
        d--;


        System.out.println("d is equal to " + d);

        //COMPARISONS (always t or f)
        // <  > <=  >=  == !=

        System.out.println(4 < 5);
        System.out.println(7 == 5);
        System.out.println(41 != 5);

        // LOGICAL OPERATORS 
        // In order of presedence: NOT:  !   AND: &&   OR: ||

        e = false; f = true;
        System.out.println(!e); // true
        System.out.println(e && f); // false
        System.out.println(e || f); // true
        System.out.println(e || f && !e); // true
        



    }
}