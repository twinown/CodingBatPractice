public class CodingBat181 {
    public int countHi(String str) {
        int count= 0;
        for(int i = 0; i<=str.length()-2;i = i+1){
            if(str.startsWith("hi", i)){
                count++;
            }
        }

        return count;
    }
}
