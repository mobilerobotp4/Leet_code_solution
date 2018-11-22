import java.util.Scanner;

public class integer_roman_number {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Integer number");
        int number= in.nextInt();
        if(number <0 || number >3999){
            System.out.println("Invalid input");
        }
        String result=" ";
        String[] RN={"I", "V", "X", "L", "C", "D", "M"};
        int i=0;
        while (number > 0) {
            switch (number % 10) {
                case 1:
                    result = RN[i] + result;
                    break;
                case 2:
                    result = RN[i] + RN[i] + result;
                    break;
                case 3:
                    result = RN[i] + RN[i] + RN[i] + result;
                    break;
                case 4:
                    result = RN[i] + RN[i + 1] + result;
                    break;
                case 5:
                    result = RN[i + 1] + result;
                    break;
                case 6:
                    result = RN[i + 1] + RN[i] + result;
                    break;
                case 7:
                    result = RN[i + 1] + RN[i] + RN[i] + result;
                    break;
                case 8:
                    result = RN[i + 1] + RN[i] + RN[i] + RN[i] + result;
                    break;
                case 9:
                    result = RN[i] + RN[i + 2] + result;
                    break;
            }
            number = (int) number / 10;
            i += 2;

        }
        System.out.println("Integer number convert to Roman Numerals "+result);
    }
}
