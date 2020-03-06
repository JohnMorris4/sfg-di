package com.morrisje.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {

        return "Hola";
    }
}
