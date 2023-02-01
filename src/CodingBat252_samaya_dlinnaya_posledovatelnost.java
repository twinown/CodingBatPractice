<<<<<<< HEAD
=======

>>>>>>> 5e378d3 (257)
public class CodingBat252_samaya_dlinnaya_posledovatelnost {
    public static int maxBlock(String str) {
        int max = 0;
        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else  break;
            }
            if (count>max){
                max = count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxBlock("XX2222BBBbbXX2222"));
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 5e378d3 (257)
