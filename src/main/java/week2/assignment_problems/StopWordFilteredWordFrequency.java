package week2.assignment_problems;

public class StopWordFilteredWordFrequency {

    static void wordFrequency(String sentence) {
        String[] words = sentence.toLowerCase().split(" ");
        String[] stopWords = {"the", "is", "a", "and"};
        boolean[] counted = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            boolean stop = false;

            for (int j = 0; j < stopWords.length; j++) {
                if (words[i].equals(stopWords[j])) {
                    stop = true;
                    break;
                }
            }

            if (stop || counted[i]) {
                continue;
            }

            int count = 0;

            for (int j = i; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(words[i] + ": " + count);
        }
    }

    public static void main(String[] args) {
        wordFrequency("the cat is a cat and the dog");
    }
}
