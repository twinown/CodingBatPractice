import java.util.Arrays;

/*
Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
        Return a new array containing the first N elements from the two arrays. The result array should be in
        alphabetical order and without duplicates. A and B will both have a length which is N or more. The best
        "linear" solution makes a single pass over A and B, taking advantage of the fact that they are
        in alphabetical order, copying elements directly to the new array.
        mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
        mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
        mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]*/
public class CodingBat141_USING_compareTo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        int count = 0;
        String[] arr = new String[a.length + b.length];
        String[] arr2 = new String[n];
        int last = 0;
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
            last = i;
        }
        for (String s : b) {
            last++;
            arr[last] = s;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                if (count < n) {
                    arr2[count] = arr[i];
                    count++;
                    i++;
                } else break;
            } else if (count < n && !arr[i].equals(arr[i + 1])) {
                arr2[count] = arr[i];
                count++;
            }
        }
        return arr2;
    }


    //shorter solution not mine
  /*  public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] out = new String[n];
        int aindex = 0;
        int bindex = 0;
        for (int i = 0; i < n; i++) {
            int cmp = a[aindex].compareTo(b[bindex]);
            if (cmp <= 0) {
                out[i] = a[aindex++];
                if (cmp == 0) bindex++;
            } else {
                out[i] = b[bindex++];
            }
        }
        return out;
    }*/


    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeTwo(new String[]{"a", "c", "z"},
                new String[]{"a", "c", "y", "z"}, 3)));
    }
}


