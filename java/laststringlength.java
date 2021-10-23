public class laststringlength
{
public int length(final String a)
    {
        int len = 0;
        String x = a.trim();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }

        return len;
    }

    public static void main(String[] args)
    {
        String input = laststringlength "Hello World ";
        Main hw = new ();
        System.out.println("The length of last word is " + hw.length(input));
    }
}