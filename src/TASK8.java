public class TASK8 {
    static void main(String[] args) {
    String str = "aaxbby";
    System.out.println(xyBalance(str));

    }
    public static boolean xyBalance(String str){
        for (int i = 0 ; i < str.length()-1 ; i++){
            if (str.contains("x")&& str.contains("y")){
                return true;
            }
        }
        return false;
    }
}
