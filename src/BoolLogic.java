public class BoolLogic {
    public static void main(String args[])
    {                               //zrobiłem leniwe kopiuj wklej, bo już ogarnąłem
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
        System.out.println("         b = "+c);
        System.out.println("       a&b = "+d);
        System.out.println("      a^b = "+e);
        System.out.println("  !a&b|a&!b = "+f);
        System.out.println("         !a = "+g);
    }
}
