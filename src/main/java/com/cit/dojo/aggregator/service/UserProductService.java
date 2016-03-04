package com.cit.dojo.aggregator.service;

import com.cit.dojo.aggregator.feign.ProductClient;
import com.cit.dojo.aggregator.feign.UserClient;
import com.cit.dojo.domain.Product;
import com.cit.dojo.domain.User;
import com.cit.dojo.domain.UserProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProductService {

    @Autowired
    UserClient userClient;

    @Autowired
    ProductClient productClient;

    public UserProduct getUserProduct(String id) {
        User user = userClient.getUser(id);
        Product product = productClient.getProduct(id);
        return new UserProduct(user.getId(), user.getName(), product.getEan(), product.getDescription());
    }
}
