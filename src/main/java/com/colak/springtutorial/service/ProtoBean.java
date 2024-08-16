package com.colak.springtutorial.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// This ensures that a CGLIB proxy wraps the prototype bean, allowing Spring to manage the scope correctly and
// to provide a new instance of ProtoBean each time it is injected into the singleton SingletonService.
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProtoBean {

    public String printAll() {
        return String.valueOf(this.hashCode());
    }
}
