package com.example.calculator;

import android.util.Log;

public class Translate {
    public static String translate(String former, String later, String tranlateString, String type) {
        String afterTranslate = "";
        if(type == "length"){
            if(former.equals("千米km") && later.equals("千米km")){
                afterTranslate = "" + tranlateString;
                Log.d("转换完：", "" + afterTranslate);
            }else if(former.equals("千米km") && later.equals("米m")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 1000);
            }else if(former.equals("千米km") && later.equals("分米dm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 10000);
            }else if(former.equals("千米km") && later.equals("厘米cm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 100000);
            }else if(former.equals("千米km") && later.equals("毫米mm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 1000000);
            }else if(former.equals("千米km") && later.equals("微米μm")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 1000);
            }else if(former.equals("千米km") && later.equals("纳米nm")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 1000000);
            }else if(former.equals("千米km") && later.equals("皮米pm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1000000) * 1000);
            }
            else if(former.equals("米m") && later.equals("千米km")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("米m") && later.equals("米m")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("米m") && later.equals("分米dm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("米m") && later.equals("厘米cm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }else if(former.equals("米m") && later.equals("毫米mm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("米m") && later.equals("微米μm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1) * 1);
            }else if(former.equals("米m") && later.equals("纳米nm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1000) * 1);
            }else if(former.equals("米m") && later.equals("皮米pm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1000000) * 1);
            }
            else if(former.equals("分米dm") && later.equals("千米km")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            }else if(former.equals("分米dm") && later.equals("米m")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("分米dm") && later.equals("分米dm")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("分米dm") && later.equals("厘米cm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("分米dm") && later.equals("毫米mm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }else if(former.equals("分米dm") && later.equals("微米μm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100000) * 1) * 1);
            }else if(former.equals("分米dm") && later.equals("纳米nm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 100) * 1);
            }else if(former.equals("分米dm") && later.equals("皮米pm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 100000) * 1);
            }
            else if(former.equals("厘米cm") && later.equals("千米km")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000);
            }else if(former.equals("厘米cm") && later.equals("米m")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("厘米cm") && later.equals("分米dm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("厘米cm") && later.equals("厘米cm")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("厘米cm") && later.equals("毫米mm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("厘米cm") && later.equals("微米μm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10000) * 1) * 1);
            }else if(former.equals("厘米cm") && later.equals("纳米nm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 10) * 1);
            }else if(former.equals("厘米cm") && later.equals("皮米pm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 10000) * 1);
            }
            else if(former.equals("毫米mm") && later.equals("千米km")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("毫米mm") && later.equals("米m")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("毫米mm") && later.equals("分米dm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("毫米mm") && later.equals("厘米cm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("毫米mm") && later.equals("毫米mm")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("毫米mm") && later.equals("微米μm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("毫米mm") && later.equals("纳米nm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1) * 1);
            }else if(former.equals("毫米mm") && later.equals("皮米pm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1000) * 1);
            }
            else if(former.equals("微米μm") && later.equals("千米km")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000000);
            }else if(former.equals("微米μm") && later.equals("米m")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("微米μm") && later.equals("分米dm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000);
            }else if(former.equals("微米μm") && later.equals("厘米cm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            }else if(former.equals("微米μm") && later.equals("毫米mm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("微米μm") && later.equals("微米μm")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("微米μm") && later.equals("纳米nm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("微米μm") && later.equals("皮米pm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1) * 1);
            }
            else if(former.equals("纳米nm") && later.equals("千米km")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000000) / 1000);
            }else if(former.equals("纳米nm") && later.equals("米m")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000000);
            }else if(former.equals("纳米nm") && later.equals("分米dm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000000);
            }else if(former.equals("纳米nm") && later.equals("厘米cm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000000);
            }else if(former.equals("纳米nm") && later.equals("毫米mm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("纳米nm") && later.equals("微米μm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("纳米nm") && later.equals("纳米nm")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("纳米nm") && later.equals("皮米pm")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }
            else if(former.equals("皮米pm") && later.equals("千米km")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000000) / 1000000);
            }else if(former.equals("皮米pm") && later.equals("米m")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000000) / 1000);
            }else if(former.equals("皮米pm") && later.equals("分米dm")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 100000000) / 1000);
            }else if(former.equals("皮米pm") && later.equals("厘米cm")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 10000000) / 1000);
            }else if(former.equals("皮米pm") && later.equals("毫米mm")){
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000) / 1000);
            }else if(former.equals("皮米pm") && later.equals("微米μm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("皮米pm") && later.equals("纳米nm")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("皮米pm") && later.equals("皮米pm")){
                afterTranslate = "" + tranlateString;
            }
        }else if(type == "volume"){
            if(former.equals("立方米m³") && later.equals("立方米m³")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("立方米m³") && later.equals("立方分米dm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("立方米m³") && later.equals("立方厘米cm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1) * 1);
            }else if(former.equals("立方米m³") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1000) * 1);
            }else if(former.equals("立方米m³") && later.equals("公石hl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("立方米m³") && later.equals("升l")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("立方米m³") && later.equals("分升dl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10000) * 1) * 1);
            }else if(former.equals("立方米m³") && later.equals("厘升cl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100000) * 1) * 1);
            }else if(former.equals("立方米m³") && later.equals("毫升ml")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1) * 1);
            }
            else if(former.equals("立方分米dm³") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("立方分米dm³") && later.equals("立方分米dm³")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("立方分米dm³") && later.equals("立方厘米cm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("立方分米dm³") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1) * 1);
            }else if(former.equals("立方分米dm³") && later.equals("公石hl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("立方分米dm³") && later.equals("升l")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("立方分米dm³") && later.equals("分升dl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("立方分米dm³") && later.equals("厘升cl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }else if(former.equals("立方分米dm³") && later.equals("毫升ml")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }
            else if(former.equals("立方厘米cm³") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("立方厘米cm³") && later.equals("立方分米dm³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("立方厘米cm³") && later.equals("立方厘米cm³")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("立方厘米cm³") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("立方厘米cm³") && later.equals("公石hl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000);
            }else if(former.equals("立方厘米cm³") && later.equals("升l")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("立方厘米cm³") && later.equals("分升dl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("立方厘米cm³") && later.equals("厘升cl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("立方厘米cm³") && later.equals("毫升ml")){
                afterTranslate = "" + tranlateString;
            }
            else if(former.equals("立方毫米mm³") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000000);
            }else if(former.equals("立方毫米mm³") && later.equals("立方分米dm³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("立方毫米mm³") && later.equals("立方厘米cm³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("立方毫米mm³") && later.equals("立方毫米mm³")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("立方毫米mm³") && later.equals("公石hl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000000);
            }else if(former.equals("立方毫米mm³") && later.equals("升l")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("立方毫米mm³") && later.equals("分升dl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000);
            }else if(former.equals("立方毫米mm³") && later.equals("厘升cl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            }else if(former.equals("立方毫米mm³") && later.equals("毫升ml")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }
            else if(former.equals("公石hl") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("公石hl") && later.equals("立方分米dm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }else if(former.equals("公石hl") && later.equals("立方厘米cm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100000) * 1) * 1);
            }else if(former.equals("公石hl") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 100) * 1);
            }else if(former.equals("公石hl") && later.equals("公石hl")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("公石hl") && later.equals("升l")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }else if(former.equals("公石hl") && later.equals("分升dl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("公石hl") && later.equals("厘升cl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10000) * 1) * 1);
            }else if(former.equals("公石hl") && later.equals("毫升ml")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100000) * 1) * 1);
            }
            else if(former.equals("升l") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("升l") && later.equals("立方分米dm³")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("升l") && later.equals("立方厘米cm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("升l") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000000) * 1) * 1);
            }else if(former.equals("升l") && later.equals("公石hl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("升l") && later.equals("升l")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("升l") && later.equals("分升dl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("升l") && later.equals("厘升cl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }else if(former.equals("升l") && later.equals("毫升ml")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }
            else if(former.equals("分升dl") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            }else if(former.equals("分升dl") && later.equals("立方分米dm³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("分升dl") && later.equals("立方厘米cm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }else if(former.equals("分升dl") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100000) * 1) * 1);
            }else if(former.equals("分升dl") && later.equals("公石hl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("分升dl") && later.equals("升l")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("分升dl") && later.equals("分升dl")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("分升dl") && later.equals("厘升cl")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("分升dl") && later.equals("毫升ml")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 100) * 1) * 1);
            }
            else if(former.equals("厘升cl") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000);
            }else if(former.equals("厘升cl") && later.equals("立方分米dm³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("厘升cl") && later.equals("立方厘米cm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }else if(former.equals("厘升cl") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10000) * 1) * 1);
            }else if(former.equals("厘升cl") && later.equals("公石hl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            }else if(former.equals("厘升cl") && later.equals("升l")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("厘升cl") && later.equals("分升dl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("厘升cl") && later.equals("厘升cl")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("厘升cl") && later.equals("毫升ml")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 10) * 1) * 1);
            }
            else if(former.equals("毫升ml") && later.equals("立方米m³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            }else if(former.equals("毫升ml") && later.equals("立方分米dm³")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("毫升ml") && later.equals("立方厘米cm³")){
                afterTranslate = "" + tranlateString;
            }else if(former.equals("毫升ml") && later.equals("立方毫米mm³")){
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 1000) * 1) * 1);
            }else if(former.equals("毫升ml") && later.equals("公石hl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100000);
            }else if(former.equals("毫升ml") && later.equals("升l")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000);
            }else if(former.equals("毫升ml") && later.equals("分升dl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            }else if(former.equals("毫升ml") && later.equals("厘升cl")){
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10);
            }else if(former.equals("毫升ml") && later.equals("毫升ml")){
                afterTranslate = "" + tranlateString;
            }
        }else if(type == "square") {
            if (former.equals("平方千米km²") && later.equals("平方千米km²")) {
                afterTranslate = "" + tranlateString;
            } else if (former.equals("平方千米km²") && later.equals("公顷ha")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 100);
            } else if (former.equals("平方千米km²") && later.equals("公亩a")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 10000);
            } else if (former.equals("平方千米km²") && later.equals("平方米m²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 1000000);
            } else if (former.equals("平方千米km²") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 100);
            } else if (former.equals("平方千米km²") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 10000);
            } else if (former.equals("平方千米km²") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 1000000);
            } else if (former.equals("平方千米km²") && later.equals("英亩ac")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 247.105407);
            }
            else if (former.equals("公顷ha") && later.equals("平方千米km²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            } else if (former.equals("公顷ha") && later.equals("公顷ha")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 1);
            } else if (former.equals("公顷ha") && later.equals("公亩a")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 100);
            } else if (former.equals("公顷ha") && later.equals("平方米m²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 10000);
            } else if (former.equals("公顷ha") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 1);
            } else if (former.equals("公顷ha") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 100);
            } else if (former.equals("公顷ha") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 10000);
            } else if (former.equals("公顷ha") && later.equals("英亩ac")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 2.47105407);
            }
            else if (former.equals("公亩a") && later.equals("平方千米km²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            } else if (former.equals("公亩a") && later.equals("公顷ha")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            } else if (former.equals("公亩a") && later.equals("公亩a")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 1);
            } else if (former.equals("公亩a") && later.equals("平方米m²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 100);
            } else if (former.equals("公亩a") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 10000) * 1);
            } else if (former.equals("公亩a") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 1);
            } else if (former.equals("公亩a") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 100);
            } else if (former.equals("公亩a") && later.equals("英亩ac")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 2.47105407) / 100);
            }
            else if (former.equals("平方米m²") && later.equals("平方千米km²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            } else if (former.equals("平方米m²") && later.equals("公顷ha")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            } else if (former.equals("平方米m²") && later.equals("公亩a")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            } else if (former.equals("平方米m²") && later.equals("平方米m²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 1);
            } else if (former.equals("平方米m²") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 100) * 1);
            } else if (former.equals("平方米m²") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 10000) * 1);
            } else if (former.equals("平方米m²") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1000000) * 1);
            } else if (former.equals("平方米m²") && later.equals("英亩ac")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 2.47105407) / 10000);
            }
            else if (former.equals("平方分米dm²") && later.equals("平方千米km²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000) / 100);
            } else if (former.equals("平方分米dm²") && later.equals("公顷ha")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            } else if (former.equals("平方分米dm²") && later.equals("公亩a")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            } else if (former.equals("平方分米dm²") && later.equals("平方米m²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 100);
            } else if (former.equals("平方分米dm²") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1) * 1);
            } else if (former.equals("平方分米dm²") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 100) * 1);
            } else if (former.equals("平方分米dm²") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 10000) * 1);
            } else if (former.equals("平方分米dm²") && later.equals("英亩ac")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 2.47105407) / 1000000);
            }
            else if (former.equals("平方厘米cm²") && later.equals("平方千米km²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000) / 10000);
            } else if (former.equals("平方厘米cm²") && later.equals("公顷ha")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000) / 100);
            } else if (former.equals("平方厘米cm²") && later.equals("公亩a")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            } else if (former.equals("平方厘米cm²") && later.equals("平方米m²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 10000);
            } else if (former.equals("平方厘米cm²") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 100) * 1);
            } else if (former.equals("平方厘米cm²") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1) * 1);
            } else if (former.equals("平方厘米cm²") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 100) * 1);
            } else if (former.equals("平方厘米cm²") && later.equals("英亩ac")) {
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 2.47105407) / 1000000) / 100);
            }
            else if (former.equals("平方毫米mm²") && later.equals("平方千米km²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000) / 1000000);
            } else if (former.equals("平方毫米mm²") && later.equals("公顷ha")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000) / 10000);
            } else if (former.equals("平方毫米mm²") && later.equals("公亩a")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 1000000) / 100);
            } else if (former.equals("平方毫米mm²") && later.equals("平方米m²")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) / 1000000);
            } else if (former.equals("平方毫米mm²") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 10000) * 1);
            } else if (former.equals("平方毫米mm²") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) / 100) * 1);
            } else if (former.equals("平方毫米mm²") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 1) * 1);
            } else if (former.equals("平方毫米mm²") && later.equals("英亩ac")) {
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 2.47105407) / 1000000) / 10000);
            }
            else if (former.equals("英亩ac") && later.equals("平方千米km²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 4.046856) / 1000);
            } else if (former.equals("英亩ac") && later.equals("公顷ha")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 4.046856) / 10);
            } else if (former.equals("英亩ac") && later.equals("公亩a")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 4.046856) * 10);
            } else if (former.equals("英亩ac") && later.equals("平方米m²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 4.046856) * 1000);
            } else if (former.equals("英亩ac") && later.equals("平方分米dm²")) {
                afterTranslate = "" + ((Double.parseDouble(tranlateString) * 4.046856) * 100000);
            } else if (former.equals("英亩ac") && later.equals("平方厘米cm²")) {
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 4.046856) * 1000000) * 10);
            } else if (former.equals("英亩ac") && later.equals("平方毫米mm²")) {
                afterTranslate = "" + (((Double.parseDouble(tranlateString) * 4.046856) * 1000000) * 1000);
            } else if (former.equals("英亩ac") && later.equals("英亩ac")) {
                afterTranslate = "" + (Double.parseDouble(tranlateString) * 1);
            }
        }else if(type == "math"){
            if(former.equals("二进制") && later.equals("二进制")){
                afterTranslate = tranlateString;
            }else if(former.equals("二进制") && later.equals("八进制")){
                afterTranslate = Number_conversion.getNum("" + Number_conversion.getTen(tranlateString, "2"), "8");
            }else if(former.equals("二进制") && later.equals("十进制")){
                afterTranslate = "" + Number_conversion.getTen(tranlateString, "2");
            }else if(former.equals("二进制") && later.equals("十六进制")){
                afterTranslate = Number_conversion.getNum("" + Number_conversion.getTen(tranlateString, "2"), "16");
                char[] after = afterTranslate.toCharArray();
                char afterChar;
                String afterString = "";
                for(int i = 0; i < after.length; i++){
                    if(Character.isDigit(after[i]) == false){
                        afterChar = String.valueOf(after[i]).toUpperCase().charAt(0);
                        after[i] = afterChar;
                    }
                    afterString += after[i];
                }
                afterTranslate = afterString;
            }
            else if(former.equals("八进制") && later.equals("二进制")){
                afterTranslate = Number_conversion.getNum("" + Number_conversion.getTen(tranlateString, "8"), "2");
            }else if(former.equals("八进制") && later.equals("八进制")){
                afterTranslate = tranlateString;
            }else if(former.equals("八进制") && later.equals("十进制")){
                afterTranslate = "" + Number_conversion.getTen(tranlateString, "8");
            }else if(former.equals("八进制") && later.equals("十六进制")){
                afterTranslate = Number_conversion.getNum("" + Number_conversion.getTen(tranlateString, "8"), "16");
                char[] after = afterTranslate.toCharArray();
                char afterChar;
                String afterString = "";
                for(int i = 0; i < after.length; i++){
                    if(Character.isDigit(after[i]) == false){
                        afterChar = String.valueOf(after[i]).toUpperCase().charAt(0);
                        after[i] = afterChar;
                    }
                    afterString += after[i];
                }
                afterTranslate = afterString;
            }
            else if(former.equals("十进制") && later.equals("二进制")){
                afterTranslate = Number_conversion.getNum(tranlateString, "2");
            }else if(former.equals("十进制") && later.equals("八进制")){
                afterTranslate = Number_conversion.getNum(tranlateString, "8");
            }else if(former.equals("十进制") && later.equals("十进制")){
                afterTranslate = tranlateString;
            }else if(former.equals("十进制") && later.equals("十六进制")){
                afterTranslate = Number_conversion.getNum(tranlateString, "16");
                char[] after = afterTranslate.toCharArray();
                char afterChar;
                String afterString = "";
                for(int i = 0; i < after.length; i++){
                    if(Character.isDigit(after[i]) == false){
                        afterChar = String.valueOf(after[i]).toUpperCase().charAt(0);
                        after[i] = afterChar;
                    }
                    afterString += after[i];
                }
                afterTranslate = afterString;
            }
            else if(former.equals("十六进制") && later.equals("二进制")){
                afterTranslate = Number_conversion.getNum("" + Number_conversion.getTen(tranlateString, "16"), "2");
            }else if(former.equals("十六进制") && later.equals("八进制")){
                afterTranslate = Number_conversion.getNum("" + Number_conversion.getTen(tranlateString, "16"), "8");
            }else if(former.equals("十六进制") && later.equals("十进制")){
                afterTranslate = "" + Number_conversion.getTen(tranlateString, "16");
            }else if(former.equals("十六进制") && later.equals("十六进制")){
                afterTranslate = tranlateString;
            }
        }
        else if(type == "rate"){
            if(former.equals("人民币CNY") && later.equals("人民币CNY")){
                afterTranslate = tranlateString;
            }else if(former.equals("人民币CNY") && later.equals("美元USD")){
                afterTranslate = "" + Double.parseDouble(tranlateString) / 7.1209;
            }else if(former.equals("美元USD") && later.equals("人民币CNY")){
                afterTranslate = "" + Double.parseDouble(tranlateString) * 7.1209;
            }else if(former.equals("美元USD") && later.equals("美元USD")){
                afterTranslate = tranlateString;
            }
        }
        return afterTranslate;
    }
}
