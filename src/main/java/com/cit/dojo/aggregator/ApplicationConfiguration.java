package com.cit.dojo.aggregator;

import com.cit.dojo.aggregator.service.UserProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cit.dojo.domain.UserProduct;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RibbonClient(name = "aggregator")
@EnableFeignClients
@RestController
@ComponentScan
public class ApplicationConfiguration {

    @Autowired
    private UserProductService userProductService;

    @RequestMapping("/")
    public UserProduct home() {
        return userProductService.getUserProduct("teste");
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

}
