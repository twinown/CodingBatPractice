
/*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
        so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
        front22("kitten") → "kikittenki"
        front22("Ha") → "HaHaHa"
        front22("abc") → "ababcab"*/
public class CodingBat15 {
    public static String front22(String str) {
        if(str.length()>2){
            String rep = str.substring(0,2);
            return rep+str+rep;
        }else return str+str+str;
    }
}
