public class TASK17 {
    static void main(String[] args) {
        String str="abc";
        System.out.println(oneTwo(str));

    }

    public static String oneTwo(String str) {
        String result = "";
        for (int i = 0; i <= str.length() - 1; i += 3) {
            result += str.charAt(i + 1);
            result += str.charAt(i + 2);
            result += str.charAt(i);

        }
        return result;
    }
}
