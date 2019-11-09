package com.example.calculator;

public class Number_conversion {

    //输入：a为待转换的进制数，b为a的进制
    public static int getTen(String a,String b) {
        int bb = Integer.parseInt(b);
        int result = 0;
        if(bb == 10) {
            result = Integer.parseInt(a);
        }
        //2转10
        else if(bb == 2) {
            result = Integer.parseInt(a,2);
        }
        //8转10
        else if(bb == 8) {
            result = Integer.parseInt(a,8);
        }
        //16转10
        else if(bb == 16) {
            result = (int) Long.parseLong(a, 16);
        }
        return result;
    }

    //十进制转其他进制输入：a为待转换的进制数，b为a的待转进制
    public static String getNum(String a,String b) {
        int bb = Integer.parseInt(b);
        int aa = Integer.parseInt(a);
        String result = "";
        if(bb == 10) {
            result = "" + a;
        }
        //10转2
        else if(bb == 2) {
            result = Integer.toBinaryString(aa);
        }
        //10转8
        else if(bb == 8) {
            result = Integer.toOctalString(aa);
        }
        //10转16
        else if(bb == 16) {
            result = Integer.toHexString(aa);
        }
        return result;
    }

//    //二进制 → 十进制
//    public static String two_ten_translate(String translateString) {
//
//        char[] allNumber = translateString.toCharArray();
//        String pointNumber = "0";
//        String number = "";
//        int place = 0;
//        for(int j = 0; j < allNumber.length; j++) {
//            if(allNumber[j] == '.') {
//                place = j;
//                for(int k = j; k < allNumber.length; k++) {
//                    pointNumber += allNumber[k];
//                }
//                break;
//            }else {
//                place = allNumber.length;
//            }
//        }
//        for(int j = 0; j < place; j++) {
//            number += allNumber[j];
//        }
//
//        double point = Double.parseDouble(pointNumber);
//        System.out.println("小数：" + point);
//        System.out.println("整数：" + number);
//
//        //整数处理部分
//        double after = 0;
//        char[] string = ("" + number).toCharArray();
//        for(int i = string.length - 1; i >= 0; i--) {
//            if(string[i] == '0') {
//                after += 0;
//            }else {
//                double multiply = 1;
//                for(int j = 0; j < string.length - 1 - i; j++) {
//                    multiply = multiply * 2;
//                }
//                after += Double.parseDouble("" + string[i]) * multiply;
//            }
//        }
//
//        //小数处理部分
//        double afterPoint = 0.0;
//        char[] stringPoint = ("" + point).toCharArray();
//        System.out.println("point:" + stringPoint.length);
//        for(int i = 2; i < stringPoint.length; i++) {
//            if(stringPoint[i] == '0') {
//                afterPoint += 0;
//            }else {
//                double multiplyPoint = 1;
//                for(int j = 0; j < i - 1; j++) {
//                    multiplyPoint = multiplyPoint / 2;
//                    System.out.println("multiplyPoint:" + multiplyPoint);
//                }
//                afterPoint += Double.parseDouble("" + stringPoint[i]) * multiplyPoint;
//                System.out.println("afterPoint:" + afterPoint);
//            }
//        }
//
//        return "" + (after + afterPoint);
//    }
//
//    //十进制 → 二进制
//    public static String ten_two_translate(String translateString) {
//
//        char[] allNumber = translateString.toCharArray();
//        String pointNumber = "0";
//        String number = "";
//        int place = 0;
//        for(int j = 0; j < allNumber.length; j++) {
//            if(allNumber[j] == '.') {
//                place = j;
//                for(int k = j; k < allNumber.length; k++) {
//                    pointNumber += allNumber[k];
//                }
//                break;
//            }else {
//                place = allNumber.length;
//            }
//        }
//        for(int j = 0; j < place; j++) {
//            number += allNumber[j];
//        }
//
//        double point = Double.parseDouble(pointNumber);
//        System.out.println("小数：" + point);
//        System.out.println("整数：" + number);
//        String pointNumberTranslate = "0.";
//        while(true) {
//            double inter = point * 2;
//            System.out.println("inter:" + inter);
//            if(inter == 0.0) {
//                break;
//            }
//            else if(inter == 1) {
//                pointNumberTranslate += "1";
//                break;
//            }else {
//                pointNumberTranslate += "" + (int)Math.floor(inter);
//                if(inter > 1) {
//                    point = point - Math.floor(inter);
//                    System.out.println("1point:" + point);
//                }else {
//                    point = inter;
//                    System.out.println("2point:" + point);
//                }
//                System.out.println("3point:" + point);
//            }
//
//        }
//        double num1 = Double.parseDouble(pointNumberTranslate);
//
//        int num = Integer.parseInt(number);
//        System.out.println("整数：" + num);
//        String numberTranslate = "0";
//        while(true) {
//            if(num == 0) {
//                break;
//            }else if(num / 2 == 1) {
//                numberTranslate += "1" + num % 2;
//                break;
//            }else {
//                numberTranslate += "" + (num % 2);
//                num = num / 2;
//            }
//        }
//        char[] after = numberTranslate.toCharArray();
//        numberTranslate = "";
//        for(int i = after.length - 1; i >= 0; i--) {
//            numberTranslate += after[i];
//        }
//        double num2 = Double.parseDouble(numberTranslate);
//
//        return "" + (num1 + num2);
//    }
//
//    //八进制 → 十进制
//    public static String eight_ten_translate(String translateString) {
//        char[] allNumber = translateString.toCharArray();
//        String pointNumber = "0";
//        String number = "";
//        int place = 0;
//        for(int j = 0; j < allNumber.length; j++) {
//            if(allNumber[j] == '.') {
//                place = j;
//                for(int k = j; k < allNumber.length; k++) {
//                    pointNumber += allNumber[k];
//                }
//                break;
//            }else {
//                place = allNumber.length;
//            }
//        }
//        for(int j = 0; j < place; j++) {
//            number += allNumber[j];
//        }
//
//        double point = Double.parseDouble(pointNumber);
//        System.out.println("小数：" + point);
//        System.out.println("整数：" + number);
//
//        //整数处理部分
//        double after = 0;
//        char[] string = ("" + number).toCharArray();
//        for(int i = string.length - 1; i >= 0; i--) {
//            if(string[i] == '0') {
//                after += 0;
//            }else {
//                double multiply = 1;
//                for(int j = 0; j < string.length - 1 - i; j++) {
//                    multiply = multiply * 8;
//                }
//                after += Double.parseDouble("" + string[i]) * multiply;
//            }
//        }
//
//        //小数处理部分
//        double afterPoint = 0.0;
//        char[] stringPoint = ("" + point).toCharArray();
//        System.out.println("point:" + stringPoint.length);
//        for(int i = 2; i < stringPoint.length; i++) {
//            if(stringPoint[i] == '0') {
//                afterPoint += 0;
//            }else {
//                double multiplyPoint = 1;
//                for(int j = 0; j < i - 1; j++) {
//                    multiplyPoint = multiplyPoint / 8;
//                    System.out.println("multiplyPoint:" + multiplyPoint);
//                }
//                afterPoint += Double.parseDouble("" + stringPoint[i]) * multiplyPoint;
//                System.out.println("afterPoint:" + afterPoint);
//            }
//        }
//
//        return "" + (after + afterPoint);
//    }
//
//    //十进制 → 八进制
//    public static String ten_eight_translate(String translateString) {
//
//        char[] allNumber = translateString.toCharArray();
//        String pointNumber = "0";
//        String number = "";
//        int place = 0;
//        for(int j = 0; j < allNumber.length; j++) {
//            if(allNumber[j] == '.') {
//                place = j;
//                for(int k = j; k < allNumber.length; k++) {
//                    pointNumber += allNumber[k];
//                }
//                break;
//            }else {
//                place = allNumber.length;
//            }
//        }
//        for(int j = 0; j < place; j++) {
//            number += allNumber[j];
//        }
//
//        double point = Double.parseDouble(pointNumber);
//        System.out.println("小数：" + point);
//        System.out.println("整数：" + number);
//
//        //小数处理部分
//        String pointNumberTranslate = "0.";
//        while(true) {
//            double inter = point * 8;
//            System.out.println("inter:" + inter);
//            if(inter == 0.0) {
//                break;
//            }
//            else if(inter % 1 == 0) {
//                pointNumberTranslate += (int)inter;
//                break;
//            }else {
//                pointNumberTranslate += "" + (int)Math.floor(inter);
//                if(inter > 1) {
//                    point = point - Math.floor(inter);
//                    System.out.println("1point:" + point);
//                }else {
//                    point = inter;
//                    System.out.println("2point:" + point);
//                }
//                System.out.println("3point:" + point);
//            }
//
//        }
//        double num1 = Double.parseDouble(pointNumberTranslate);
//
//        //整数处理部分
//        int num = Integer.parseInt(number);
//        System.out.println("整数：" + num);
//        String numberTranslate = "";
//        while(true) {
//            if(num == 0) {
//                break;
//            }else if(num / 8 == 1) {
//                numberTranslate += "1" + num % 8;
//                break;
//            }else {
//                numberTranslate += "" + (num % 8);
//                num = num / 8;
//            }
//        }
//        char[] after = numberTranslate.toCharArray();
//        numberTranslate = "";
//        for(int i = after.length - 1; i >= 0; i--) {
//            numberTranslate += after[i];
//        }
//        double num2 = Double.parseDouble(numberTranslate);
//        System.out.println("num1:" + num1);
//        System.out.println("num2:" + num2);
//        return "" + (num1 + num2);
//    }
//
//    //十六进制 → 十进制
//    public static String sixteen_ten_translate(String translateString) {
//        String after = Integer.toHexString(Integer.parseInt(translateString));
//        return "" + after;
//    }
//
//    //十进制 → 十六进制
//    public static String ten_sixteen_translate(String translateString) {
//        int after = (int) Long.parseLong(translateString, 16);
//        return "" + after;
//    }
//
//    //二进制 → 八进制
//    public static String two_eight_translate(String translateString) {
//        return ten_eight_translate(two_ten_translate(translateString));
//    }
//
//    //八进制 → 二进制
//    public static String eight_two_translate(String translateString) {
//        return ten_two_translate(eight_ten_translate(translateString));
//    }
//
//    //二进制 → 十六进制
//    public static String two_sixteen_translate(String translateString) {
//        return ten_sixteen_translate(two_ten_translate(translateString));
//    }
//
//    //十六进制 → 二进制
//    public static String sixteen_two_translate(String translateString) {
//        return ten_two_translate(sixteen_ten_translate(translateString));
//    }
//
//    //八进制 → 十六进制
//    public static String eight_sixteen_translate(String translateString) {
//        return ten_sixteen_translate(eight_ten_translate(translateString));
//    }
//
//    //十六进制 → 八进制
//    public static String sixteen_eight_translate(String translateString) {
//        return ten_eight_translate(sixteen_ten_translate(translateString));
//    }

}
