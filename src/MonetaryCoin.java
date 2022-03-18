public class MonetaryCoin extends Coin
{
    private int value;

    public MonetaryCoin (int value)
    {
        this.value = value;
    }
    public int getValue()
    {
        return this.value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }

    public int sum( int[] mc)
    {
        int sum = value;

        for ( int i = 0; i < mc.length; i++ )
        {
            sum += mc[i];
        }
        return sum;
    }

}
