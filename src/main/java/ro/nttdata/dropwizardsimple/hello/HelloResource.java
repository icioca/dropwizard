package ro.nttdata.dropwizardsimple.hello;


import com.google.common.base.Optional;
import com.google.common.base.Strings;
import ro.nttdata.dropwizardsimple.config.ExampleServiceConfiguration;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by ioana.cioca on 10/6/2016.
 */

@Path(value ="/time")

@Produces(MediaType.APPLICATION_JSON)

public class HelloResource {

    private final String defaultTimezone;

    public HelloResource(String defaultMessage){
        this.defaultTimezone = defaultMessage;
    }


    @GET
    //public Hello sayHello(@QueryParam("timezone")Optional timezone){
   // public Hello sayHello(){
    public Hello sayHello(@QueryParam("timezone")Optional<String> timezone){
        String output = new String( timezone.or(defaultTimezone));
        if (Strings.isNullOrEmpty(output)) {
            output = defaultTimezone;
        }

        final String value = new String( output);



/*
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        TimeZone timeZone = TimeZone.getTimeZone((String) timezone.or(defaultTimezone));
        formatter.setTimeZone(timeZone);
        String formatted = formatter.format(new Date());
        */
        //return new Hello(defaultTimezone);
        return new Hello(value);
    }
}
