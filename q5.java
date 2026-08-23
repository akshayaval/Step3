import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class q5
{
    static void printFilteredWordFrequency(String feedback)
    {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for(int i = 0; i < words.length; i++)
        {
            boolean stopWord = false;

            for(int j = 0; j < stopWords.length; j++)
            {
                if(words[i].equals(stopWords[j]))
                {
                    stopWord = true;
                    break;
                }
            }

            if(!stopWord)
            {
                if(frequency.containsKey(words[i]))
                {
                    frequency.put(words[i], frequency.get(words[i]) + 1);
                }
                else
                {
                    frequency.put(words[i], 1);
                }
            }
        }

        ArrayList<Map.Entry<String, Integer>> list =
            new ArrayList<>(frequency.entrySet());

        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(j).getValue() > list.get(i).getValue())
                {
                    Map.Entry<String, Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Word Frequency Report");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(
                list.get(i).getKey() + " " +
                list.get(i).getValue()
            );
        }
    }

    public static void main(String[] args)
    {
        String feedback =
            "The mentor was great, the session was great and clear.";

        printFilteredWordFrequency(feedback);
    }
}
