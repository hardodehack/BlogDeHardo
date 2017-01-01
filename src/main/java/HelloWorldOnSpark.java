import spark.Spark;
import spark.Route;
import spark.Request;
import spark.Response;
/**
 * Created by HARDIK on 01-01-2017.
 */
public class HelloWorldOnSpark {

    public static void main(String[] args) {
        Spark.get(new Route("/"){
            public Object handle(final Request req,final Response resp){
                return "Hi Leee....."+"\nI'm Spark in Java";
            }
        });
    }
}
