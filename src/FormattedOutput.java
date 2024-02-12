public class FormattedOutput
{
    public static void main(String[] args)
    {
        int age = 19;
        double salary = 120000.23723;
        String firstName = "Bilbo";

        System.out.printf("%15s%5d%12.2f", firstName , age, salary);
    }
}
