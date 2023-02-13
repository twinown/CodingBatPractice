/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with
        duplicates. Return the count of the number of strings which appear in both arrays.
        The best "linear" solution makes a single pass over both arrays, taking advantage
                of the fact that they are in alphabetical order.
                commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
                commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
                commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3*/
public class CodingBat142_NE_SAM_POISK_ODINAK_BUKV_V_2_MASSIVAH {
    public static int commonTwo(String[] a, String[] b) {
        //здесь не нужно искать минимум , либо максимум , чтоб знать, по какому массиву идти
        //здесь фишка проверки на дубликат в том, что кидаешь пройденные символы в string и
        // сравниваешь с ним
        int count = 0;
        String str = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j]) && !str.contains(a[i])) {
                    str += a[i];
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(commonTwo(new String[]{"a", "b", "c", "x", "z"},
                new String[]{"a", "c", "x"}));
    }
}