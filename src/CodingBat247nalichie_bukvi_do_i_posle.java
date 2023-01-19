public class CodingBat247nalichie_bukvi_do_i_posle {
        public static boolean gHappy(String str) {
            boolean b =false;
            for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i)=='g') {
                    if (str.charAt(i+1)=='g'
                            ||str.charAt(i-1)=='g'){
                        b = true;
                    } else{ b = false;}
                }
            }
            if (str.length()==0){
                b = true;
            } else if (str.length()==1||(str.charAt(str.length()-1)=='g'
                    &&str.charAt(str.length()-2)!='g'))
            {
                b = false;}
            return  b;
        }


   //альтернативное решение
   /* str = str.replace("ggg", "");
    str = str.replace("gg", "");
return !str.contains("g");*/
}
