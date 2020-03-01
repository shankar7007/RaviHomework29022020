package homeworkweek8;

public class Ex4SumDigits {
    public static void main(String[] args) {
        System.out.println(sumFirstLast(125));
    }
    public static int sumFirstLast(int number){
        // number = 12 should output 3
        int num = number;
        int LastDigit , count=0;

        while(num >= 10){
            LastDigit = num % 10;
            num = number / 10;
            number = num;
            count = count + LastDigit;

        }
        return count+1;
    }
}



