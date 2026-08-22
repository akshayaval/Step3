public class qs1
{
    static void checkPinLength(String pin)
    {
        if(pin.length() == 4)
        {
            System.out.println("PIN length OK");
        }
        else
        {
            System.out.println("Invalid PIN");
            System.out.println("PIN must be exactly 4 digits");
        }
    }

    public static void main(String[] args)
    {
        String pin = "4820" ;

        System.out.println("Checking PIN");
        checkPinLength(pin);
    }
}