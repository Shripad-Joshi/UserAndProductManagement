package com.expo.managmentSystem.service.serviceImpl;

import com.expo.managmentSystem.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Override
    public void welcome() {
        log.info("Inside Product Service.");
    }
}
