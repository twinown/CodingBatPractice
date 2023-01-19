/*
Given two strings, word and a separator sep, return a big string made of count occurrences
        of the word, separated by the separator string.
        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"*/
public class CodingBat191 {
    public static String repeatSeparator(String word, String sep, int count) {
        String str = "";
        for (int i = 0; i<count;i++){
            if (str.length()==(word.length()*(count-1))+(sep.length()*(count-1))){
                str += word;
                break;
            }
            str += word+sep;
        }
        return str;
    }


}
