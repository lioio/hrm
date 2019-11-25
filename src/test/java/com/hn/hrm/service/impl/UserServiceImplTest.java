package com.hn.hrm.service.impl;

import com.hn.hrm.commons.ResResult;
import com.hn.hrm.dao.pojo.User;
import com.hn.hrm.service.iservice.IUserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    IUserService userService;

    @Test
    public void login() {
        ResResult<User> rr = userService.login("scott","tiger");
        TestCase.assertNotNull(rr);
        System.out.println(rr);
        ResResult<User> rr1 = userService.login("scottffsd","tiger34");
        System.out.println(rr1);
    }
}