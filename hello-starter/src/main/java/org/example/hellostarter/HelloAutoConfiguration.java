package org.example.hellostarter;

import hello.ConsoleHelloService;
import hello.HelloService;
import org.example.hellostarter.validator.OnValidHelloSuffixCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @Conditional(OnValidHelloSuffixCondition.class)
    public HelloService helloService(HelloServiceProperties serviceProperties) {
        return new ConsoleHelloService(serviceProperties.getPrefix(), serviceProperties.getSuffix());
    }
}
