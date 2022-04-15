package com.company.service.user;

import com.company.model.User;
import com.company.service.IServiceGeneric;

public interface IUserService extends IServiceGeneric<User> {
    boolean existedByUsername(String username);
}
