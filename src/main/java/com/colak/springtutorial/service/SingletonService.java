package com.colak.springtutorial.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SingletonService {

    private final ProtoBean protoBean;

    public String executeProtoBean(){
        return protoBean.printAll();
    }
}
