public class FormattedOutput
{
    public static void main(String[] args)
    {
        int age = 19;
        double salary = 120000.23723;
        String firstName = "Bilbo";

        for(int c = 0; c < 10; c++)
        System.out.printf("%-15s%5d%12.2f\n", firstName , age, salary);
    }
}
