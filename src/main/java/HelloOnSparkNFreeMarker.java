import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HARDIK on 02-01-2017.
 */
public class HelloOnSparkNFreeMarker {
    public static void main(String[] args) {
        Spark.get(new Route("/"){
            public Object handle(final Request req, final Response resp) {
                final Configuration config = new Configuration();
                StringWriter writer = new StringWriter();
                config.setClassForTemplateLoading(HelloOnSparkNFreeMarker.class, "/");
                try {
                    Template t1 = config.getTemplate("hello.ftl");
                    Map<String, Object> helloMap = new HashMap<String, Object>();

                    helloMap.put("name", "Hardik");
                    helloMap.put("type", "BadAss");

                    t1.process(helloMap, writer);
                } catch (Exception e) {
                    halt(500);
                    e.printStackTrace();
                    //
                }
                return writer;
            }
            });
    }
}