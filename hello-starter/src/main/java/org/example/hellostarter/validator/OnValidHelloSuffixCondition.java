package org.example.hellostarter.validator;

import org.springframework.boot.autoconfigure.condition.ConditionMessage;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * This is a SpringBootCondition class.
 * Which doesn't require the spring-boot-starter-validation.
 * This is another way to validate the configuration property
 */
public class OnValidHelloSuffixCondition extends SpringBootCondition {
    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConditionMessage.Builder condition = ConditionMessage.forCondition("ValidHelloSuffix");
        try {
            String keyValue = context.getEnvironment().getRequiredProperty("hello.suffix");
            if (keyValue.isEmpty())
                return ConditionOutcome.noMatch(condition.because("suffix needs at least one character"));
            return ConditionOutcome.match(condition.available(String.format("valid suffix ('%s')", keyValue)));
        } catch(Exception ex) {
            return ConditionOutcome.noMatch(condition.notAvailable("Missing hello.suffix property"));
        }
    }
}
