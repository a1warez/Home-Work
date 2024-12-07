package HW.OOP.HW.Exception;

public class metodException {
    public static double delenie(Integer a, Integer b){
        try {
            double result = a / b;
            return result;
        } catch (ArithmeticException o) {
            System.out.println("Деление на: " + o.getMessage() + "не возможно");
        }
        return 0.0;
    }

    public static boolean checkPasswords(String[] str) {
        String s;
        String string;
        Integer num;
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean lengthPassword = false;
        boolean spaceLine;
        for (int i = 0; i < str.length; i++) {
            string = str[i];
            if (true){
                capitalFlag = false;
                lowerCaseFlag = false;
                numberFlag = false;
                lengthPassword = false;
            }
            spaceLine = checkStringSpace(string);
            for(int j = 0; j < string.length(); j++) {
                ch = string.charAt(j);
                s = string;
                num = s.length();
                if(Character.isDigit(ch)) {
                    numberFlag = true;
                }
                else if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                }
                else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                }

                if (num >= 8 && num <= 20) {
                    lengthPassword = true;
                }
                if(numberFlag && capitalFlag && lowerCaseFlag && lengthPassword && spaceLine){
                    System.out.println("Пароль соответствует всем требованиям: " + string);
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkStringSpace(String string){
        char ch;
        boolean space = false;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (ch != ' '){
                space = true;
            }else {
                return false;
            }

        }
        return true;
    }
}

