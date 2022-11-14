package com.example.service;

import com.example.model.dto.MemberResponseDto;
import com.example.model.entity.User;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
@Transactional
public class MemberService{

    private final UserRepository userRepository;

    /*회원가입*/
    public void register(User users){
        userRepository.save(users);
    }

    /*로그인*/
//    public MemberResponseDto findBy(final MemberResponseDto params){
//        MemberResponseDto entity = UserRepository.findByUserId(params.getUserId());
//        return entity;
//    }
//    public List<User> login(Users users){
//        return userRepository.findAllByUserId(users.getUserId());
//    }

}
