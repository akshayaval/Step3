public class qs2
{
    static String reverseEachWord(String sentence)
    {
        String[] words = sentence.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++)
        {
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();

            result = result + word;

            if(i < words.length - 1)
            {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        String sentence = "hello club";

        System.out.println("Original Sentence");
        System.out.println(sentence);

        String answer = reverseEachWord(sentence);

        System.out.println("Reversed Sentence");
        System.out.println(answer);
    }
}