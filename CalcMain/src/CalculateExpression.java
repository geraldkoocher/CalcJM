class CalculateExpression {

    private static int plus(int one,int two){ return one + two; }

    private static int minus(int one, int two){
        return one - two;
    }

    private static  int multiplication(int one, int two){ return one * two; }

    private static  int division(int one, int two){
        return one / two;
    }

    static int result(int first, int second, char operator){
        if (operator == '+'){
            return plus(first,second);
        } else if (operator == '-'){
            return minus(first,second);
        } else if (operator == '*'){
            return multiplication(first,second);
        } else {
            return division(first,second);
        }
    }

}

