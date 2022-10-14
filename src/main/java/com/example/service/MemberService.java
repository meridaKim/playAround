package com.example.service;

import com.example.model.entity.Users;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
public class MemberService{
    @Autowired
    private UserRepository userRepository;
    /*회원가입*/
    public void register(Users users){
        userRepository.save(users);
    }

    /*로그인*/
    public boolean login(Users users){
        Users users1= userRepository.findByUserId(users.getUserId());
        if(users1==null){
            return false;
        }

        if(!users1.getUserPw().equals(users.getUserPw())){
            return false;
        }
        return true;
    }
//    public List<Users> login(Users users){
//        return userRepository.findAllByUserId(users.getUserId());
//    }

}
