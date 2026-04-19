public class TASK16 {
    static void main(String[] args) {
        String str = "xy*yzz";
        System.out.println(sameStarChar(str));

    }
    public static boolean sameStarChar(String str){
        for(int i =0 ; i <=str.length()-1;i++){
            if (str.charAt(i)=='*'){
                if (str.charAt(i-1)!=str.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
}
