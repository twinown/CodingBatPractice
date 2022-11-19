public class CodingBat176_ne_sam_ne_doper {
    public boolean closeFar(int a, int b, int c) {

        return Math.abs(b-a)<=1&&Math.abs(c-a)>=2&&Math.abs(c-b)>=2||
                Math.abs(c-a)<=1&&Math.abs(b-a)>=2&&Math.abs(b-c)>=2;

    }

}
