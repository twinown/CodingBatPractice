public class CodingBat249_ASCII {
    public static int sumDigits(String str) {
         int count = 0;
            for(int i  = 0; i<str.length(); i++){
                if (Character.isDigit(str.charAt(i))){
                  //  count = count + Integer.parseInt(String.valueOf(str.charAt(i)));
                    //or
                    count += Character.getNumericValue(str.charAt(i));
                    //ASCII
                count = count+ (int)str.charAt(i);

                }
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(sumDigits("1"));
    }
}
