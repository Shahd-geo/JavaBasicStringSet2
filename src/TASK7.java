public class TASK7 {
    static void main(String[] args) {
        String str = "abcbob";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'b' &&
                    str.charAt(i + 2) == 'b'){

                count++;

            }


        }
      //  System.out.println(count);

    }
}
