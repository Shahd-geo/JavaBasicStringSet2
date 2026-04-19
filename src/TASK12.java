public class TASK12 {
    static void main(String[] args) {
        String str = "Word";
        String sep = "x";
        int n = 4;
        System.out.println(repeatSeparato(str, sep, n));

    }

    public static String repeatSeparato(String str, String sep, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
            if (i < n - 1) {
                result += sep;
            }

        }
        return result;
    }
}

