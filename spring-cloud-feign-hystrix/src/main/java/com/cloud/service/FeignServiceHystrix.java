package com.cloud.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService{

    @Override
    public String sayHi(String name) {
        return "hi,"+name+",feign hystrix,sorry,error!";
    }
}
