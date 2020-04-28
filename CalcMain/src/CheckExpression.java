class CheckExpression {
    private static String first;
    private static String second;
    private static String op;
    static int whatExpression;

    CheckExpression(String firstNumber, String secondNumber, String operator) {
        first = firstNumber;
        second = secondNumber;
        op = operator;
    }

    CheckExpression(){
        first = null;
        second = null;
        op = null;
        whatExpression = -1;
    }

    static void check() {
        check(first, second, op);
    }

    static void check(String firstNumber, String secondNumber, String operator) {
        checkNumberExistAndSame(firstNumber,secondNumber);
        checkRange(firstNumber,secondNumber);
        checkOperator(operator);
    }

    private static void checkNumberExistAndSame(String first, String second){
        try {
            Integer.parseInt(first);
            Integer.parseInt(second);
            whatExpression = 0;
        } catch (Exception e) {
            try {
                ConvertRomanToArabic.parseInt(first);
                ConvertRomanToArabic.parseInt(first);
                whatExpression = 1;
            } catch (Exception e2){
                throw new IllegalArgumentException("Числа написаны неверно и не похоже");
            }
        }

    }

    private static void checkRange(String first, String second){
        if (whatExpression == 0){
            if (!(Integer.parseInt(first) < 11 & Integer.parseInt(second) > 0)) {
                throw new IllegalArgumentException("Число не входит в диапазон от 1 до 10");
            }
        } else if (whatExpression == 1) {
            if (!(ConvertRomanToArabic.parseInt(first) < 11 & ConvertRomanToArabic.parseInt(second) > 0)) {
                throw new IllegalArgumentException("Число не входит в диапазон от I до X");
            }
        }
    }

    private static void checkOperator(String operator){
        if (!(operator.equals("+") | operator.equals("-") | operator.equals("*") | operator.equals("/")) ){
            throw new IllegalArgumentException("Неверный оператор " + operator);
        }
    }

}




