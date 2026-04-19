public class TASK11 {
    static void main(String[] args) {
        String str ="Chocolate" ;
        int n = 4;
        System.out.println(repeatFront(str,n));

    }
    public static String repeatFront(String str,int n){
        String result = "";
        for (int i = n ; i >0 ; i--){
            result+=str.substring(0,i);
            }
        return result;
        }

    }

