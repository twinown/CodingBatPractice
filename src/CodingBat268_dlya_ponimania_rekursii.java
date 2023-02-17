/*Given a non-negative int n, return the count of the occurrences of
        7 as a digit, so for example 717 yields 2. (no loops). Note
        that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        count7(717) → 2
        count7(7) → 1
        count7(123) → 0*/
public class CodingBat268_dlya_ponimania_rekursii {
    public  static int count7(int n) {
        int count;
        //для выхода из рекурсии
        if (n==0){
            count = 0;
            //
         }else if (n%10==7){
            count = count7(n/10)+1;
        } else if (n/10==7){
            count = count7(n%10)+1;
        } else if(n%10!=7){
            count = count7(n/10);
        }
        //для инициализации count
        else count = 0;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count7(70701277));
    }
}
