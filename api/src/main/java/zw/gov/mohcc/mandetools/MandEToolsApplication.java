package zw.gov.mohcc.mandetools;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@EnableEncryptableProperties
@SpringBootApplication
public class MandEToolsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MandEToolsApplication.class, args);
    }
}
