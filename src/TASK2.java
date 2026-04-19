public class TASK2 {
    static void main(String[] args) {
        String countHi="abc hi ho";
        int count=0;
        for (int i = 0 ; i < countHi.length()-1; i++){
            if ((countHi.substring(i , + i+2).equals("hi"))){
                count++;
            }
        }
        System.out.println(count);

    }
}
