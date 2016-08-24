package org.vicykie;

import org.springframework.stereotype.Component;
import org.vicykie.entities.User;
import org.vicykie.service.UsersService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李朝衡 on 2016/8/22.
 */
@Component
public class FeignFallBack implements UsersService {
    @Override
    public List<User> getUsers() {
        return new ArrayList<>();
    }
}
