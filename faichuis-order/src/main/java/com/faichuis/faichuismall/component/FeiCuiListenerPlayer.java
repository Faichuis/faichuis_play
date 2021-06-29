package com.faichuis.faichuismall.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ApplicationListenerMethodAdapter;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class FeiCuiListenerPlayer implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
}
