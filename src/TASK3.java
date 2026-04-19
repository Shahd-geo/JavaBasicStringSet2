public class TASK3 {
    public static void main(String[] args) {
        String str="catdog";
        System.out.println(catdog(str));

    }

    public static boolean catdog (String  str){
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return  catCount==dogCount;
    }
}

