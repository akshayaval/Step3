public class q3
{
    static void parseInventoryRecord(String csvLine)
    {
        String[] data = csvLine.split(",");

        if(data.length != 3)
        {
            System.out.println("Invalid Record");
        }
        else
        {
            System.out.println("Product: " + data[0]);
            System.out.println("SKU: " + data[1]);
            System.out.println("Qty: " + data[2]);
        }
    }

    public static void main(String[] args)
    {
        String csvLine = "Wireless Mouse,WM-2201,150";

        System.out.println("Inventory Record");
        parseInventoryRecord(csvLine);
    }
}