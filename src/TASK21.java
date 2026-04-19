public class TASK21 {
    static void main(String[] args) {
        String str="abcXY123XYijk";
        String word = "XY";
        System.out.println(wordEnds(str,word));



    }
    public static String wordEnds(String str, String word) {

        String result = "";

        for (int i = 0; i <= str.length() - word.length(); i++) {

            if (str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) {
                    result += str.charAt(i - 1);
                }

                if (i + word.length() < str.length()) {
                    result += str.charAt(i + word.length());
                }
            }
        }

        return result;
    }

}


