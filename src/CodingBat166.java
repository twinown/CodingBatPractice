/*
Given a string, return a string made of the chars at indexes
        0,1, 4,5, 8,9 ... so "kittens" yields "kien".
        altPairs("kitten") → "kien"
        altPairs("Chocolate") → "Chole"
        altPairs("CodingHorror") → "Congrr"*/
public class CodingBat166 {
    public  static  String altPairs(String str) {
        String str2 = "";
        for(int i = 0; i<str.length(); i += 4){
            if ( i+2 > str.length()){
                str2 += str.substring(i);
            } else str2 += str.substring(i,i+2);
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(altPairs("y"));
    }
}
