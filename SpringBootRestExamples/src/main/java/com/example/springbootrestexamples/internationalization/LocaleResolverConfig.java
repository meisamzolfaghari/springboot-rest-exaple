package com.example.springbootrestexamples.internationalization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@Configuration
public class LocaleResolverConfig {

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }

//    @Bean
//    public LocaleResolver localeResolver() {
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(Locale.US);
//        return localeResolver;
//    }

//    @Bean //configured in application.properties (spring.messages.basename=messages)
//    public ResourceBundleMessageSource messageSource() {
//        ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
//        bundleMessageSource.setBasename("messages");
//        return bundleMessageSource;
//    }

}
