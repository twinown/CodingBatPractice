public class CodingBat249 {
    public static int sumDigits(String str) {
            int count = 0;
            for(int i  = 0; i<str.length(); i++){
                if (Character.isDigit(str.charAt(i))){
                  //  count = count + Integer.parseInt(String.valueOf(str.charAt(i)));
                    //or
                    count = count + Character.getNumericValue(str.charAt(i));
                }
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
    }
}
