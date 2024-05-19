package org.example.hellostarter;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "hello")
@Validated
public class HelloServiceProperties {

    /**
     * Prefix for message & required to set.
     * Prefix must start with an uppercase letter
     * A space is included after prefix.
     * If we don't have default value & validation for property &
     * also not specified this in the client's app.properties, then it will null value
     */
    @NotBlank(message = "cannot be blank")
    @Pattern(regexp = "^[A-Z]+.*", message = "Should start with Uppercase letter")
    private String prefix;

    /**
     * Suffix for message.
     * No space before suffix
     */
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
