import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;
import java.util.*;
import java.util.Map;

/**
 * Created by HARDIK on 01-01-2017.
 */
public class HelloWorldOnFreeMarker {

    public static void main(String[] args) {
        //Added Coment
        Configuration config = new Configuration();
        config.setClassForTemplateLoading(HelloWorldOnFreeMarker.class,"/");
        try {
            Template t1 = config.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String,Object> helloMap = new HashMap<String,Object>();

            helloMap.put("name","Hardik");
            helloMap.put("type","BadAss");

            t1.process(helloMap,writer);

            System.out.println(writer);
        }catch(Exception e){e.printStackTrace();}
    }
}
