public class CodingBat182 {
    public boolean catDog(String str) {
        boolean b = false;
        int countc = 0;
        int countd = 0;
        for (int i = 0; i<=str.length()-3; i++){
            if(str.startsWith("cat", i)){
                countc++;
            } else if(str.startsWith("dog", i)){
                countd++;
            }
        }
        if(countc==countd){
            b = true;
        }
        return b;
    }

}
