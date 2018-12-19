import config.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = "config")
@EnableConfigurationProperties(Properties.class)
public class Application
{
    public static void main(final String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
