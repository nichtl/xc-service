package com.xuecheng.manage_cms.Template;

/*import com.deepoove.poi.XWPFTemplate;*/

import com.xuecheng.framework.utils.PoiUtil;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Poitest {

    public static void main(String[] args) throws IOException {
        try {
    /*        FileReader  fd  =new FileReader("D:/BaiduNetdiskDownload/day01 搭建环境 CMS服务端开发/代码/xcEduService01/xcEduService01/xc-service-manage-cms/target/classes/template.doc");
            System.out.println("============"+fd.read());
            fd.close();*/
     /*       XWPFTemplate template = XWPFTemplate.compile("D:/BaiduNetdiskDownload/day01 搭建环境 CMS服务端开发/代码/xcEduService01/xcEduService01/xc-service-manage-cms/target/classes/template.docx").render(
                    new HashMap<String, Object>() {{
                        put("title", "Hi, poi-tl Word模板引擎");
                    }});*/

       /*     FileOutputStream out = new FileOutputStream("output.doc");*/
           /* template.write(out);
            out.flush();
            out.close();
            template.close();*/
            String path = "D:/BaiduNetdiskDownload/day01 搭建环境 CMS服务端开发/代码/xcEduService01/xcEduService01/xc-framework-utils/src/main/resources/template.doc";
            String outpath = "D:/BaiduNetdiskDownload/day01 搭建环境 CMS服务端开发/代码/xcEduService01/xcEduService01/xc-framework-utils/src/main/resources/template.doc";

            PoiUtil poiUtil = new PoiUtil();
            Map<String,String> map = new HashMap();
            map.put("name","张三");
            map.put("sex","男");
            map.put("age","1974-11-06");
            poiUtil.replaceDoc(path,outpath,map);
        }catch (Exception e){e.printStackTrace();}

    }
    

    
    
    
}
