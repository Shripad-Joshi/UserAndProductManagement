package com.expo.managmentSystem.service.serviceImpl;

import com.expo.managmentSystem.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void welcome() {
        log.info("Inside Service.");
    }
}
