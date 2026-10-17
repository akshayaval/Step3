import java.util.Scanner;

class qs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();

        System.out.println(rev);

        if (s.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}