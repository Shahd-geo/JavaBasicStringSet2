public class TASK18 {
    static void main(String[] args) {
        String str="zipXzap";
        System.out.println(zipZap(str));

    }
    public static String zipZap(String str){
        String RESULT = "";
        for (int i = 0 ; i<str.length();i++){
            if (i <str.length()-2 && str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                RESULT +="zp";
                i+=2;
            }
            else {
                RESULT+=str.charAt(i);
            }
        }
        return RESULT;
    }
}
