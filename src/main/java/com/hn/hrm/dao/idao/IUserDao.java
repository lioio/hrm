package com.hn.hrm.dao.idao;

import com.hn.hrm.commons.ResResult;
import com.hn.hrm.dao.pojo.User;

public interface IUserDao {
    ResResult<User> login(String username, String password)throws Exception;
}
