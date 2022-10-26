/*
Given an array of strings, return a new array without the strings that
        are equal to the target string. One approach is to count the
        occurrences of the target string, make a new array of the correct
        length, and then copy over the correct strings.
        wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
        wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
        wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]*/
public class CodingBat135 {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for(int i = 0;i<=words.length-1;i++){
            if(words[i].equals(target)){
                count++;
            }
        }
        String [] arr = new String [words.length-count];
        for(int j = 0;j<=arr.length-1;j++){
            for(int k =0;k<=words.length-1;k++){
                if(!words[k].equals(target)&&!words[k].equals("zz")){
                    arr[j] = words[k];
                    words[k] = "zz";
                    break;
                }
            }
        }
        return arr;
    }
}
