public class CodingBat269_NE_SAM_dva_returna {
    public static int count8(int n) {
        int count = 0;
        if(n == 0) {
            return  0;
        }
        if(n%10 == 8) {
            if((n/10)%10 == 8){
                count++;
            }
            count++;
        }
        count += count8(n/10);
        return count;
    }


    public static void main(String[] args) {
        System.out.println(count8(88888));
    }
}
