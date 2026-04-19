public class TASK4 {
    public static void main(String[] args) {
        String TEXT = "aaacodebbb";
        int count = 0;
        for (int i = 0; i < TEXT.length() - 1; i++) {
            if (TEXT.charAt(i) == 'c' &&
                    TEXT.charAt(i + 1) == 'o' &&
                    TEXT.charAt(i + 3) == 'e') {
                count++;

            }


        }
        System.out.println(count);

    }
}
