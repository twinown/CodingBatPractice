public class CodingBat279 {
    public static String endX(String str) {
        // TODO: 01.03.2023 this shit 
        String s = "";
        int index = str.length()-1;
        if(str.charAt(index)!='x'){
            s+= str.charAt(index);
            //index--;
            str  =   s+endX(str.substring(0,index));
        } else {
            //index--;
            str = str.charAt(0)+endX(str.substring(index));
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(endX("xxre"));
    }
}
