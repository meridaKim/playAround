<?php
 require "conn.php";

 $username = $_POST["username"];
 $email = $_POST["email"];
 $password = $_POST["psw"];
 $mobile = $_POST["mobile"];
 $gender = $_POST["gender"];

//  아래는 미리 박아둔 데이터들을 써서 앱이 잘 작동하는지 확인하려고 임의로 만든 변수들이다.
//  $username = "test";
//  $email = "test@naver.com";
//  $password = "1234567";
//  $mobile = "011000000";
//  $gender = "Male";

 $isValidEmail = filter_var($email, FILTER_VALIDATE_EMAIL);
 if ($conn) {
     
    if ($isValidEmail === false) {

        echo "This Email is not valid";
    }
    else {

        $sqlCheckUsername = "SELECT * FROM users_table WHERE username LIKE '$username'";
        $usernameQuery = mysqli_query($conn, $sqlCheckUsername);

        $sqlCheckEmail = "SELECT * FROM users_table WHERE email LIKE '$email'";
        $usernameQuery = mysqli_query($conn, $sqlCheckEmail);


        if (mysqli_num_rows($usernameQuery) > 0) {
            echo "User name is already used, type another one";
        } else if (mysqli_num_rows($usernameQuery) > 0) {
            echo "This email is already registered, type another Email";
        }

        else {

            $sql_register = "INSERT INTO users_table (username, email, password, mobile, gender) VALUES('$username', '$email', '$password', '$mobile', '$gender')";

            if (mysqli_query($conn, $sql_register)) {
                echo "Successfully Registered";
            } else {
                echo "Failed to register";
            }

        }

    }

 }
 else {
     echo "Connection Error";
 }

?>