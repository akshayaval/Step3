public class q4
{
    static String normalizeCode(String raw)
    {
        raw = raw.trim();

        String first = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return first + rest;
    }

    static String validateAndFormat(String code)
    {
        if(code.length() != 13)
        {
            return "Invalid because length is not 13";
        }

        for(int i = 0; i < 3; i++)
        {
            if(!Character.isLetter(code.charAt(i)))
            {
                return "Invalid because publisher code must be 3 letters";
            }
        }

        for(int i = 3; i < 13; i++)
        {
            if(!Character.isDigit(code.charAt(i)))
            {
                return "Invalid because body must contain only digits";
            }
        }

        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(publisher);
        result.append("]");
        result.append(" YEAR: ");
        result.append(year);
        result.append(" CATALOG: ");
        result.append(catalog);

        return result.toString();
    }

    public static void main(String[] args)
    {
        String raw = " pen2026004251 ";

        System.out.println("Original Code");
        System.out.println(raw);

        String code = normalizeCode(raw);

        System.out.println("Normalized Code");
        System.out.println(code);

        System.out.println("Validation Result");
        System.out.println(validateAndFormat(code));
    }
}