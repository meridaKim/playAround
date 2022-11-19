//package com.example.service;
//
//import com.example.model.entity.User;
//import com.example.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//
//@Service
//@RequiredArgsConstructor
//@Transactional
//public class MemberService{
//    @Autowired
//    private static UserRepository userRepository;
////    @Autowired
////    private UserRepository userRepository;
//    /*회원가입*/
//    public void register(User users){
//        userRepository.save(users);
//    }
//
//    /*로그인*/
//    public static User login(User users){
//        User users1= userRepository.findByUserId(users.getUserId());
//        if(users1==null){
//            return null;
//        }
//
//        if(!users1.getUserPw().equals(users.getUserPw())){
//            return null;
//        }
//        return users1;
//    }
//    public List<User> getAlluser(User users){
//        return userRepository.findAllByUserId(users.getUserId());
//    }
//
//}