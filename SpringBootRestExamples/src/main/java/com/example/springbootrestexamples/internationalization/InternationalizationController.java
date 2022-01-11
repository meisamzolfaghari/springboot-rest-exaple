package com.example.springbootrestexamples.internationalization;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@RequiredArgsConstructor
public class InternationalizationController {


    private final MessageSource messageSource;

//    @GetMapping("/hello")
//    public String greetings(@RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, required = false) Locale locale) {
//        return messageSource.getMessage("good.morning.message", null, locale);
//    }

    @GetMapping("/hello")
    public String greetings() {
        return messageSource.getMessage("good.morning.message", null,
                LocaleContextHolder.getLocale());
    }

}
