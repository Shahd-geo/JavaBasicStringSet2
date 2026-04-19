public class TASK13 {
    static void main(String[] args) {
        String str="abXYabc";
        int n=1;
        System.out.println(prefixAgain(str,n));

    }
    public static boolean prefixAgain(String str,int n){
        String prefix = str.substring(0, n);

        for (int i = 1; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }

        return false;
    }


}
