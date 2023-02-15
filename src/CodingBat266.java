/*We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
        the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the
        total number of blocks in such a triangle with the given number of rows.
        triangle(0) → 0
        triangle(1) → 1
        triangle(2) → 3*/
public class CodingBat266 {
    public  static  int triangle(int rows) {
        int blocks;
        if(rows==0){
            blocks = 0;
        } else blocks = triangle(rows-1)+rows;
        return blocks;
    }

    public static void main(String[] args) {
        System.out.println(triangle(2));
    }
}
