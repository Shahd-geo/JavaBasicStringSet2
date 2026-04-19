public class TASK7 {
    static void main(String[] args) {
        String str = "abcbob";
        System.out.println(bobThere(str));

    }
    public static boolean bobThere(String str){
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'b' &&
                    str.charAt(i + 2) == 'b'){

                return true;

            }


        }
        return false;

    }
}
