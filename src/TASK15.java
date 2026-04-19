public class TASK15 {
    static void main(String[] args) {
        String str = "breadjambread";
        System.out.println(getSandwich(str));

    }
    public static String getSandwich(String str){
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first != -1 && last != -1 && first != last) {

            return str.substring(first + 5, last);
        }

        return "";
    }

}
