package test.webapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class. Add Spring Beans here.
 */
@Configuration
@ComponentScan({"test.webapp.controller",})
public class WebConfig {

    // Add your Spring Beans here...
}