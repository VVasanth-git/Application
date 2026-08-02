package com.VVK.Testapp.Service;

import com.VVK.Testapp.Model.User;
import com.VVK.Testapp.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getalluser(){
        return userRepo.findAll();
    }
    public User createuser(User user){
        return userRepo.save(user);
    }
}
