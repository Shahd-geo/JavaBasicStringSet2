public class TASK10 {
    static void main(String[] args) {
        String str = "Hello";
        Integer n= 3;
        System.out.println(repeatEnd(str,n));

    }
    public static String repeatEnd(String str,Integer n){
       String end = str.substring(str.length()-n) ;
       String RESULT = "";
       for (int i = 0 ; i < n ; i++){
           RESULT +=end;
       }
        return RESULT;
    }
}
