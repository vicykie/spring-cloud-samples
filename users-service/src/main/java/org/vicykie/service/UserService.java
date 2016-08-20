package org.vicykie.service;

import org.springframework.stereotype.Service;
import org.vicykie.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李朝衡 on 2016/8/20.
 */
@Service
public class UserService {
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setAddress("address "+ i);
            user.setIcon("icon "+ i);
            user.setName("name "+ i);
            users.add(user);
        }
        return users;
    }
}
