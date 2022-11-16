//package com.example.service;
//
//import com.example.model.entity.Users;
//import com.example.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
//import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Service;
//
////import com.cos.security1.auth.PrincipalDetails;
////import com.cos.security1.model.User;
////import com.cos.security1.repository.UserRepository;
//
//
//@Service
//public class PrincipalOauth2UserService extends DefaultOAuth2UserService{
//
//
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//
//    // 후처리 되는 함수 데이터를 후처리되는 함수
//    // 여기에 토큰 , 정보 들어온다
//    @Override
//    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
//
//        //System.out.println(userRequest.getClientRegistration()); -> goolge
//        //System.out.println(userRequest.getAccessToken());
//        System.out.println(super.loadUser(userRequest).getAttributes());
//
//        OAuth2User oauth2User =   super.loadUser(userRequest);
//
//        String provider =  userRequest.getClientRegistration().getClientId(); // -> google
//        String providerId = oauth2User.getAttribute("sub");
//        String email = oauth2User.getAttribute("email");
//        String username = provider+"_"+providerId;
//        String nickname = oauth2User.getAttribute("nickname");
//        String password = passwordEncoder.encode("비밀번호호호");
//        Boolean agree= oauth2User.getAttribute("localAgree");
//
//
//        Users users = userRepository.findByUserName(username);
//
//        if(users == null) {
//            users = Users.builder()
//                    .userId(username)
//                    .userPw(password)
//                    .userAge(nickname)
//                    .userName(email)
//                    .localAgree(agree)
//                    .build();
//
//            userRepository.save(users);
//
//
//
//        }
//
//
//
//
//        return new PrincipalDetails(users, oauth2User.getAttributes());
//    }
//}