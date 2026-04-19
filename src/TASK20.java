public class TASK20 {
    static void main(String[] args) {
        String str1="12xy34";
        String str2="xy";
        System.out.println(plusOut(str1,str2));
    }
    public static String plusOut(String str1,String str2){
        String RESULT = "";
        for (int i = 0 ; i < str1.length(); i++) {
            if (i <= str1.length() - str2.length() && str1.substring(i, i + str2.length()).equals(str2)) {
                RESULT += str2;
                i += str2.length() - 1;
            } else {
                RESULT += "+";
            }


        }
        return RESULT;

    }
}
