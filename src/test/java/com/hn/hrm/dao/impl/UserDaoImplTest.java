package com.hn.hrm.dao.impl;

import com.hn.hrm.commons.ResResult;
import com.hn.hrm.dao.idao.IUserDao;
import com.hn.hrm.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoImplTest {
    @Autowired
    IUserDao userDao;

    @Test
    public void login() throws Exception {
        ResResult<User> rr = userDao.login("scott","tiger");
        TestCase.assertNotNull(rr);
        System.out.println(rr);
        ResResult<User> rr1 = userDao.login("scott11","tiger");
        System.out.println(rr1);

    }
}