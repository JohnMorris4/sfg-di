package com.morrisje.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class I18nEnglishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello in English";
    }
}
