package String;
public class WordReplacement {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String targetWord = "dogs";
        String replacementWord = "cat";

        String newSentence = replaceWord(sentence, targetWord, replacementWord);
        System.out.println(newSentence);
    }

    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
        char[] sentenceChars = sentence.toCharArray();
        char[] targetChars = targetWord.toCharArray();
        char[] replacementChars = replacementWord.toCharArray();

        int sentenceLength = sentenceChars.length;
        int targetLength = targetChars.length;
        int replacementLength = replacementChars.length;

        StringBuilder result = new StringBuilder();
        System.out.println(sentenceLength);
        int i = 0;

        while (i < sentenceLength) {//43
            boolean found = true;
            for (int j = 0; j < targetLength; j++)//3

            {
                System.out.println(sentenceChars[i+j]);//the quick
                System.out.println("qq---"+targetChars[j]);//
                if (i + j >= sentenceLength || sentenceChars[i + j] != targetChars[j]) {//0>=43||t!=d
                    found = false;
                    break;
                }
            }

            if (found) {
                result.append(replacementWord);
                i += targetLength;
            } else {
                result.append(sentenceChars[i]);
                System.out.println("tttt------" +result.append(sentenceChars[i]));//
                i++;
            }
        }

        return result.toString();
    }
}

