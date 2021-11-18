package com.baeldung.um.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.baeldung.um.web" })
public class UmWebConfig {

    public UmWebConfig() {
        super();
    }
}
