public class TASK9 {
    static void main(String[] args) {
        String str1="abc";
        String str2= "xyz";
        System.out.println(mixString(str1,str2));

    }
    public static String mixString(String str1, String str2) {
        String result = "";

        for (int i = 0; i < str1.length() || i < str2.length(); i++) {

            if (i < str1.length()) {
                result += str1.charAt(i);
            }

            if (i < str2.length()) {
                result += str2.charAt(i);
            }
        }

        return result;
    }
}
