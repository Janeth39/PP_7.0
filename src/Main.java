public class Main
{
    public static void main(String [] args)
    {
        MonetaryCoin mc1 = new MonetaryCoin( 25 );
        MonetaryCoin mc2 = new MonetaryCoin( 10 );
        MonetaryCoin mc3 = new MonetaryCoin( 33 );
        System.out.println(mc1.toString());
        System.out.println(mc2.toString());
        System.out.println(mc3.toString());


        int[] array = {mc2.getValue() , mc3.getValue()};
        int total = mc1.sum( array);
        System.out.println("Total: " + total);
    }
}
