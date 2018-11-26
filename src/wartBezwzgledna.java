public class wartBezwzgledna {
    public static void main(String args[])
    {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;     //zawsze zwraca wartosc dodatnio
        System.out.print("wartosc bezwzgledna z ");
        System.out.println(i+" wynosi "+k);

        i = -10;
        k =  i < 0 ? -i : i;
        System.out.print("wartość bezwzględna z ");
        System.out.println(i+ " wynosi " +k);
    }
}
