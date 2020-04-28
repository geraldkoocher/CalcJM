import java.util.Scanner;

class CalcMain{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] example = scan.nextLine().split(" ");

        CheckExpression check = new CheckExpression(example[0],example[2],example[1]);
        check.check();

        if (check.whatExpression == 0){ // арабские числа -- 0, римские -- 1
            System.out.println(CalculateExpression.result(Integer.parseInt(example[0]),
                                                          Integer.parseInt(example[2]),
                                                          example[1].charAt(0)));
        } else {
            System.out.println(ConvertRomanToArabic.parseString(
                    CalculateExpression.result(
                            ConvertRomanToArabic.parseInt(example[0]),
                            ConvertRomanToArabic.parseInt(example[2]),
                            example[1].charAt(0))));
        }

    }

}

