package com.xuecheng.framework.annotationMine.annotationImpl;

public class Fileterimpl {

    public static void main(String[] args) {
        String fs =" ";
        fs=find("str1235tu","str","tu");
        System.out.println(fs);
    }

    public  static  String  find(String str, String begin, String end){
        if(str.toLowerCase().startsWith(begin.toLowerCase()) && str.toLowerCase().endsWith(end.toLowerCase())){
            return str;
        }
        return "";
    }



}
