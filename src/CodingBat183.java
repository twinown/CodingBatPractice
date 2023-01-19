public class CodingBat183 {
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i<=str.length()-4;i++){
            if (str.startsWith("co", i)&&
                    str.charAt(i + 3) == 'e'){
                count++;
            }
        }
        return count;
    }
}
