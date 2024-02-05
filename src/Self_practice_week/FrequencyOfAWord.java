package Self_practice_week;
public class FrequencyOfAWord {
    public static void main(String[] args) {
        String word = "java";
        String sentence = "Java Java Java JAVA Java";

        int frequency = calculateWordFrequency(word, sentence);

        System.out.println("Frequency of the word '" + word + "' in the sentence: " + frequency);
    }

    private static int calculateWordFrequency(String word, String sentence) {
        String[] words = sentence.split("\\s+");
        int frequency = 0;

        for (String w : words) {

            if (w.equalsIgnoreCase(word)) {
                frequency++;
            }
        }

        return frequency;
    }
}
