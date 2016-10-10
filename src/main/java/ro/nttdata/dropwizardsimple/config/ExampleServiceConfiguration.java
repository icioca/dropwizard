package ro.nttdata.dropwizardsimple.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.validation.MessageInterpolator;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ioana.cioca on 10/6/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExampleServiceConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String defaultTimezone;


    public String getMessages(){
        return defaultTimezone;
    }

    /*
    ublic void setMessages(MessageConfiguration messages){
        this.messages = messages;
    }
    */

}
