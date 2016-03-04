package com.cit.dojo.aggregator.feign;

import com.cit.dojo.domain.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("product")
public interface ProductClient {
    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}", consumes = "application/json")
    Product getProduct(@PathVariable("id") String id);
}
