package ro.nttdata.dropwizardsimple;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import ro.nttdata.dropwizardsimple.config.ExampleServiceConfiguration;
import ro.nttdata.dropwizardsimple.hello.HelloResource;

/**
 * Created by ioana.cioca on 10/6/2016.
 */
public class ExampleService extends Service<ExampleServiceConfiguration> {

    static final String USERNAME ="ioana.cioca@ebsromania.ro";
    static final String PASSWORD="Devilishly1994";
    static final String LOGINURL="https://login.salesforce.com";
    static final String GRANTSERVICE="/services/oauth2/token?grant_type=password";
    static final String CLIENTID="3MVG98_Psg5cppyYXgD0hRssi8J6brVYRBi4QV.JYILHCSuNR6i6Vx7e6GSGPbhn1ABChiWs5EKUh.NYuZbgm";
    static final String CLIENTSECRET="28789354731339570";


    public static void main (String[] args) throws Exception{
        new ExampleService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ExampleServiceConfiguration> bootstrap){
        bootstrap.setName("dropwizard-simple");
    }

    @Override
    public void run(ExampleServiceConfiguration conf, Environment env) throws Exception{
        //laters
        //resource classes here
        String defaultTimezone = conf.getMessages();
        HelloResource timeResource = new HelloResource(defaultTimezone);
        env.addResource(timeResource);
    }
}
