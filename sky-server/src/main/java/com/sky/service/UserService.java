package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.stereotype.Service;

/**
 * Classname: UserService
 * Package: com.sky.service
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 10:50
 * @Version: v1.0
 */
@Service
public interface UserService {

    User wxLogin(UserLoginDTO userLoginDTO);
}
