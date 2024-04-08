package utils;

import org.aeonbits.owner.Config;

@org.aeonbits.owner.Config.LoadPolicy(org.aeonbits.owner.Config.LoadType.MERGE)
@org.aeonbits.owner.Config.Sources({
        "system:properties",
        "system:env",
        "classpath:config.properties"
})

public interface Configurations extends Config {

    @Key("base.url")
    String baseUrl();

}