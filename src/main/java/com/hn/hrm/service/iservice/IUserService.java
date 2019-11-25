package com.hn.hrm.service.iservice;

import com.hn.hrm.commons.ResResult;
import com.hn.hrm.dao.pojo.User;

public interface IUserService{
    ResResult<User> login(String username, String password);
}
