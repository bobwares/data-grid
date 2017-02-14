package com.bobwares.databus.server.config;

import com.bobwares.core.bean.Registry;
import com.bobwares.databus.server.registry.model.AuthorizationDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorizationConfiguration {
    final Logger logger = LoggerFactory.getLogger(getClass());

    public AuthorizationConfiguration() {
        logger.info("Start");
    }

    @Bean
    public Registry<AuthorizationDefinition> authorizationDefinitionRegistry() {
        return new Registry<>();
    }

}
