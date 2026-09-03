package CrashCourse;
// If your Java file isn't running, you *might* need to add the following line and uncomment it, at the top of your file: 
// package CrashCourse (the name of the folder that includes CrashCourse.java)

public class CrashCourse {     // class header. Always PascalCase. 

    public static void main(String[] args) {

        // comments 
        
        /*  Multiline 
         Comment
         Here
         */

        System.out.print("Hello");
        System.out.println("World"); // prints on a new line
        System.out.println("Hello world");

        // VARIABLE DECLARATIONS:
        // primitive variables:

        int a; // integer
        double b; // decimal, or float
        boolean c; // true or false;
        
        a = 4;
        b = 5.5;
        c = false; // lowercase

        // Arithmetic Operators 
        // + - / *  %
        // += -= /=  %=  (compound assignment operators)

        int d = 3 - 1; // d => 2
        d += 7; // d => 9

        System.out.println("d is equal to " + d);

        // increment and decrement by one:
        // --  ++
        d--; // 9 - 1 = 8
        d--; // 8 - 1 = 7
        d++; // 7 + 1 = 8
        System.out.println("d is NOW equal to " + d); // => 8

        //COMPARISONS (always returns true or false)
        //  <  >   <=   >=   ==   !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(1 != 2);

        // LOGICAL OPERATORS 
        // In order of presedence: NOT:  !   AND: &&   OR: ||

        boolean f = false; boolean t = true;

        // predict output: true or false? 
        System.out.println(!f);  //true
        System.out.println(f && t);// false
        System.out.println(f || t); //true
        System.out.println(f || t && !f); // true

        System.out.println(f && t); // short circuits to FALSE after checking f && -- java does not need to check t.
        System.out.println(t || (f && t)); //short circuits after checking the first t.

        // CASTING (converting)

        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);

        // Strings

        int p = 3;
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "Goodbye";

        String result = s1+s2+s3;
        result += ", reverse";
        System.out.println(result);

        // what is this diddyblud doing o n the calculator is blud epstien... what is blud doing with those numbers is he tung tung sahur or a suswinning or an anti furry posting based art memes WAIT i think know whathes typing now wait... 6 7? 

        int[] arry1 = new int[10];

        int[] arry2 = {34,52,3,64,32};

        int[][] arryGrid1 = new int[4][3]; //rows, then columns

        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0

        System.out.println("Rows: " + arryGrid1.length);
        System.out.println("Columns: " + arryGrid1[0].length);




    }
}