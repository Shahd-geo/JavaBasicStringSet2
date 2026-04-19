public class TASK5 {
    static void main(String[] args) {
        String str1 = "Hiabc";
        String str2="abc";
        boolean result = str1.endsWith(str2) || str2.endsWith(str1);
        System.out.println(result);

    }
}
