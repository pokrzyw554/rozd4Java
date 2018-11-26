public class MultByTwo {
    public static void main(String args[])
    {
        int counter;
        int num = 0xFFFFFFE;

        for(counter=0; counter<4; counter++)
        {
            num = num << 1;
            System.out.println(num);
        }
    }
}
