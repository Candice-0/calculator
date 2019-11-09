package com.example.calculator;

import android.util.Log;

public class Calculate {
    static double result = 0;
    static double sc_result = 0;


    public static double calculate(String string){
        char[] calculateChar = string.toCharArray();
        int count = 0;
        int countSymbol = -1;
        boolean bucket = false;

        for(int i = 0; i < calculateChar.length; i++){
            //不是数字且不是小数点(计算符号数,不算等于号)
            if(Character.isDigit(calculateChar[i]) == false && calculateChar[i] != '.' && calculateChar[i] != 'Π' && calculateChar[i] != 'e' ){
                //待计算数个数
                //countNum++;
                //符号数
                countSymbol++;
                if(calculateChar[i] == '(')
                    bucket =true;

            }

        }
        //System.out.println("countNum:" + countNum);
        System.out.println("countSymbol:" + countSymbol);

        //合成表达式expression
        String[] expression = new String[(countSymbol + 1) * 2];
        String number = "";
        int k = 0;

        //合成计算数
        for(int i = 0; i < calculateChar.length; i++){
            if(Character.isDigit(calculateChar[i]) == true || calculateChar[i] == '.' || calculateChar[i] == 'Π' ||calculateChar[i] == 'e'){
                if(calculateChar[i] == 'Π'){
                    number = "" + Math.PI;
                }else if(calculateChar[i] == 'e'){
                    number = "" + Math.E;
                }else
                    number = number + calculateChar[i];
            }else{
//            	System.out.println(i + "step");
//            	System.out.println("number：" + number);
//            	System.out.println("operation：" + calculateChar[i]);
                if(number != "") {
                    expression[k++] = number;
                }
                number = "";
                expression[k++] = "" + calculateChar[i];
            }
        }

        int equal = 0;
//        System.out.print("表达式分解为：");
//        for(int i = 0; i < expression.length; i++) {
//        	System.out.println(expression[i]);
//        }

//找括号
        System.out.println("bucket:" + bucket);
        if(bucket) {
            System.out.println("进入找括号！");
            String interExpression = "";
            int start = 0, end = 0;
            for(int i = 0; i < expression.length; i++) {

                for(int d = 0; d < expression.length; d++) {
                    System.out.println(expression[d]);
                    if(expression[d].charAt(0) == '=') {
                        equal = d;
                        break;
                    }
                }
                System.out.println("equal：" + equal);
                interExpression = "";
                if(expression[i] == null)
                    break;
                if(expression[i].equals("(") && expression[i + 1].equals("-"))
                    break;
                if(expression[i].equals("(")) {
                    //System.out.println("expression" + i + ":" + expression[i]);
                    System.out.println("i:" + i);
                    start = i;
                    for(int j = i + 1; j < expression.length; j++) {
                        if(expression[j].equals(")")) {
                            end = j + 1;
                            System.out.println("end:" + end);
                            break;
                        }
                        interExpression += expression[j];
                    }
                    System.out.println("括号内的表达式：");
                    System.out.println(interExpression);
                    System.out.println("括号内的表达式计算得：" + calculate(interExpression + "="));
                    System.out.println("括号内计算完毕！");
                    int stop = end;
                    expression[start] = "" + calculate(interExpression + "=");
                    for(int a = start + 1; a < expression.length; a++) {
                        System.out.println("第end位：" + expression[end]);
                        if(expression[end] == null)
                            break;
                        expression[a] = expression[end++];
                    }

                    System.out.println("place = " + (start + equal - stop + 2));
                    System.out.println("start:" + start);
                    System.out.println("equal:" + equal);
                    System.out.println("end:" + stop);
                    for(int b = start + equal - stop + 2; b < expression.length; b++) {
                        expression[b] = null;
                    }
                }

                System.out.print("括号计算后的表达式：");
                for(int c = 0; c < expression.length; c++) {
                    System.out.print(expression[c]);
                }

            }


        }


        for(int c = 0; c < expression.length; c++) {
            System.out.println(expression[c]);
        }

        result = cal(expression);
        return result;

    }

    public static double cal(String[] expression){
        result = Double.parseDouble(expression[0]);
        System.out.println("初始result:" + result);
        //遍历表达式
        for(int i = 1; i < expression.length; i++){


            if(expression[i] == null)
                break;
            //求阶乘
            if(expression[i].equals("!") == true){
                double lastNumber = Double.parseDouble(expression[i - 1]);
                result = result - Double.parseDouble(expression[i - 1]);
                int in = (int)lastNumber;
                for(int start_in = (int)lastNumber - 1; start_in > 0; start_in--){
                    in = in * start_in;
                }
                result = result + in;
            }
            if(expression[i].equals("^") == true){
                if(expression[i + 1].equals("2") == true){
                    double lastNumber = Double.parseDouble(expression[i - 1]);
                    result = result - Double.parseDouble(expression[i - 1]);
                    result = result +  lastNumber * lastNumber;
                }
                if(expression[i + 1].equals("(") == true){
                    double lastNumber = Double.parseDouble(expression[i - 1]);
                    System.out.println("lastNumber:" + lastNumber);
                    System.out.println("result:" + (1 / lastNumber));
                    result = result - Double.parseDouble(expression[i - 1]);
                    result = result +  1 / lastNumber;
                    break;
                }
            }
            if(expression[i].equals("%") == true){
                double lastNumber = Double.parseDouble(expression[i - 1]);
                result = result - Double.parseDouble(expression[i - 1]);
                result = result +  lastNumber/ 100;
            }


            if(expression[i].equals("×")){
                double number1 = Double.parseDouble(expression[i - 1]);
                double number2 = Double.parseDouble(expression[i + 1]);
                expression[i - 1] = "" + (number1 * number2);
                //result = result * number2;
            }
            if(expression[i].equals("÷")){
                double number1 = Double.parseDouble(expression[i - 1]);
                double number2 = Double.parseDouble(expression[i + 1]);
                expression[i - 1] = "" + (number1 / number2);
                //result = result / number2;
            }



            if(expression[i].equals("+") == true){
                System.out.println("进入计算！");
                double nextNumber = Double.parseDouble(expression[i + 1]);
                result = result + nextNumber;
                System.out.println("!result:" + result);
            }
            if(expression[i].equals("-")){
                double nextNumber = Double.parseDouble(expression[i + 1]);
                result = result - nextNumber;
            }
        }
        System.out.println("interResult1:" + result);
        return result;
    }

    public static double sc_calculate(String string){
        //result = calculate(string);
        sc_result = 0;
        System.out.println("算式：" + string);
        char[] calculateChar = string.toCharArray();
        String interCalculate = "";
        double interResult = 0;
        if(Character.isDigit(calculateChar[0]) == false && calculateChar[0] != '(') {
            for (int i = 0; i < calculateChar.length; i++) {
                System.out.println("开始计算：" + calculateChar[i]);
                if (calculateChar[i] == 's' || calculateChar[i] == 'c' || calculateChar[i] == 't') {
                    for (int j = i + 4; i < calculateChar.length; j++) {
                        if (calculateChar[j] != ')') {
                            interCalculate = interCalculate + calculateChar[j];
                        } else
                            break;
                    }
                    System.out.println("内部算式：" + interCalculate);
                    interResult = calculate(interCalculate + "=");
                    System.out.println("newInterResult:" + interResult);

                    if (calculateChar[i] == 's') {
                        sc_result = sc_result + Math.sin(interResult * Math.PI / 180);
                        System.out.println("sin:" + sc_result);
                        break;
                    } else if (calculateChar[i] == 'c') {
                        sc_result = sc_result + Math.cos(interResult * Math.PI / 180);
                        break;
                    } else if (calculateChar[i] == 't') {
                        sc_result = sc_result + Math.tan(interResult * Math.PI / 180);
                        break;
                    }
                } else if (calculateChar[i] == 'l') {
                    for (int j = i + 3; i < calculateChar.length; j++) {
                        if (calculateChar[j] != ')') {
                            interCalculate = interCalculate + calculateChar[j];
                        } else
                            break;
                    }
                    System.out.println("内部算式：" + interCalculate);
                    interResult = calculate(interCalculate + "=");
                    System.out.println("newInterResult:" + interResult);
                    if (calculateChar[i + 1] == 'g') {
                        sc_result = sc_result + Math.log10(interResult);
                        System.out.println("sin:" + sc_result);
                        break;
                    } else if (calculateChar[i + 1] == 'n') {
                        sc_result = sc_result + Math.log(interResult);
                        break;
                    }
                }else if(calculateChar[i] == '√'){
                    for(int j = 1; j < calculateChar.length - 1; j++){
                        interCalculate = interCalculate + calculateChar[j];
                    }
                    System.out.println("根号内部：" + interCalculate);
                    interResult = calculate(interCalculate + "=");
                    sc_result = sc_result + Math.sqrt(interResult);
                }
            }
        }else{
            System.out.println("sc_result:" + sc_result);
            sc_result = calculate(string);
            System.out.println("sc_result:" + sc_result);
        }
        return sc_result;
    }

}
