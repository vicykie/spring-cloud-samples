package org.vicykie.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.vicykie.config.feign.FeignConfig;
import org.vicykie.FeignFallBack;
import org.vicykie.entities.User;

import java.util.List;

/**
 * Created by 李朝衡 on 2016/8/22.
 */
@FeignClient(value = "users-service",configuration = FeignConfig.class,decode404 = true,fallback = FeignFallBack.class)
@Qualifier("usersService")
public interface UsersService {
    @RequestMapping(method = RequestMethod.GET, value = "/users")
    List<User> getUsers();

}
