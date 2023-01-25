public class CodingBat253 {
    public static int sumNumbers(String str) {
        String numb = "";
        int sum = 0;
        str = str.replaceAll("\\D", "*");
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)!='*'){
                numb+=str.charAt(i);
            } else if (!numb.equals("")){
                sum+=Integer.parseInt(numb);
                numb = "";
            }
        }if (!numb.equals("")) {
            sum += Integer.parseInt(numb);
        }
        return sum ;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("11 3"));
    }
}
