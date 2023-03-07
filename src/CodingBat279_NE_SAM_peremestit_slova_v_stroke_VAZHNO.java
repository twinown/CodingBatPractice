public class CodingBat279_NE_SAM_peremestit_slova_v_stroke_VAZHNO {
    public static String endX(String str) {
        if (str.equals("")) return str;
        if (str.charAt(0) == 'x') return endX(str.substring(1)) + 'x';
        else return str.charAt(0) + endX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(endX("xxre")); //rexx
    }
}
