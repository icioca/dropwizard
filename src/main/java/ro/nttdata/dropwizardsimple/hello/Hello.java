package ro.nttdata.dropwizardsimple.hello;

/**
 * Created by ioana.cioca on 10/7/2016.
 */
public class Hello {

    private final String time;

    public Hello(String message){
        this.time = message;
    }

    public String getMessage(){
        return time;
    }


}
