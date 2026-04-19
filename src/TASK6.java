public class TASK6 {
    static void main(String[] args) {
    String str="abcxyz";
    System.out.println(xyzThere(str));


    }
    public static boolean xyzThere(String str){
        for (int i = 0 ; i < str.length()-1 ; i++){
            if (str.substring(i , i+3).equals("xyz")){
                if (i == 0 || str.charAt(i - 1) != '.'){
                    return true;
                }
            }
        }
        return false;
    }
}
