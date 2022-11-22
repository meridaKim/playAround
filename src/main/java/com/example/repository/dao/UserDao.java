package com.example.repository.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UserDao() {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/playrounds?useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&serverTimezone=Asia/Seoul";
            String dbID = "root";
            String dbPassword = "0331";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int login(String userNo, String userPw) {
        String SQL = "SELECT userPw FROM USER WHERE userNo=?";
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, userNo);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                if(rs.getString(1).equals(userPw))
                    return 1;  // 로그인 성공
                else
                    return 0;  // 비밀번호 불일치
            }
            return -1;  // 아이디가 없음

        } catch(Exception e) {
            e.printStackTrace();
        }
        return -2; // 데이터 베이스 오류

    }
}
