public class OpEquals {
    public static void main(String args[])     //w przykładzie było public zamiast static, ale sprawdze to
    {                                           // no jednak musi być public, bo sie IDE czepia
        int a=1;
        int b=2;
        int c =3;

        a +=5;
        b*=4;
        c += a * b;
        c%= 6;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);


    }
}
