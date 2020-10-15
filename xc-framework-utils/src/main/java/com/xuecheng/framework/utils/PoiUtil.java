package com.xuecheng.framework.utils;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;

public class PoiUtil {
    public static void main(String[] args) {
        int a= 12;  //  | (一个为 1 结果为 1)     &(一个为0 结果为0) ~(单数操作 二进制 取反 0->1, 1->0)  ^(相同为 0 不同 为 1)
        int b= 26;
        //a^a = 0  一个数 自己^自己为 0;   0^b=b  任意数与 0 ^ 等于自己
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:  "+a+"  b:  "+b);
        Integer res= 0 << 16 | 49;
        System.out.println("\n A:"+Integer.toBinaryString(a)+"\n B:"+Integer.toBinaryString(b)+"\n res"+Integer.toBinaryString(res)+" \n  a和b或的结果是："+res);
    }


    /**
     * @param inUrl  模版文件路径
     * @param outUrl 输出文件路径
     * @param params 参数
     * @throws Exception
     */
    public void replaceDoc(String inUrl, String outUrl, Map<String, String> params) {
        try {
            FileInputStream in1 = new FileInputStream(inUrl);
            HWPFDocument doc = new HWPFDocument(in1);
            Range range = doc.getRange();
            for (Map.Entry<String, String> entry :
                    params.entrySet()) {
                range.replaceText(entry.getKey(), entry.getValue());
            }
            // 另存模板文件为exportTestg.doc
            FileOutputStream out = new FileOutputStream(outUrl);
            doc.write(out);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }




}










