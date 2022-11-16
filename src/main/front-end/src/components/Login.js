import React, {useState, useEffect} from 'react';
import {Link, Route, Switch} from 'react-router-dom';
import styled from "styled-components";
import { createGlobalStyle } from 'styled-components'
import axios from "axios";


const GlobalStyle = createGlobalStyle`
html,body{
   width:100%;
   height:100%;
  }

#root{
    width: 100%;
    height: 100%;
}
`;


const Container = styled.div`
      width:80%;
      height:100%;
      
      margin-right:200px;
      margin-left:200px;
      border-right: 1.30114px solid #474747;
      border-left: 1.30114px solid #474747;
`;

const LoginForm = styled.div`
      display:grid;
      grid-template-rows;
      width:405px;
      margin: auto;
      padding-top: 272px;
   
`;

const LoginName =  styled.div`
      text-align: left;
      font-family: 'Inter';
      font-style: normal;
      font-weight: 700;
      font-size: 25px;
      line-height: 30px;
      margin-bottom: 74px;
      color: #474747;
`;
const P = styled.p`
    font-family: 'Inter';
    font-style: normal;
    font-weight: 400;
    font-size: 18px;
    line-height: 22px;
    margin-bottom: 13px;
    text-align: left;
    
    color: #474747;
`;
const Input = styled.input`
    overflow: hidden;
    height:43.78px;
    margin-bottom: 29px;
    width:100%;
    border: 0.729729px solid #474747;

`;
const Button = styled.button`
    text-align: right;
    margin-bottom: 85px;
    background-color:transparent;
    border-color:transparent;
`;
const Signup = styled.div`
    display:grid;
    margin:auto;
    grid-template-columns: 200px 75px;
    
   
`;
const SignupText = styled.div`
    font-family: 'Inter';
    font-style: normal;
    font-weight: 400;
    font-size: 18px;
    line-height: 22px;
    color: #474747;
`;

const Footer = styled.footer`
    margin:auto;
    width:80%;
    background-color:transparent;
    height:75px;
    bottom: 0px;
    position:absolute;
`;


function Login(props){

    const [inputId, setInputId] = useState('')
    const [inputPw, setInputPw] = useState('')
    //상태변수 초기화
    const handleInputId = (e) => {
        setInputId(e.target.value);
    };
    const handleInputPw = (e) =>{
        setInputPw(e.target.value)
    };



//login 버튼 클릭
    const onSubmit = async () => {
        console.log("click login");
        console.log("ID :", inputId);
        console.log("PW :", inputPw);

        const {data} = await axios.post("http://localhost:8080/api/login", {

            data: {UserId: inputId},
            headers: { 'Access-Control-Allow-Origin' : '*',
                'Access-Control-Allow-Credentials': true,
                'Access-Control-Allow-Methods':'GET,PUT,POST,DELETE,OPTIONS',
                'Access-Control-Allow-Headers' :   'Content-Type, Authorization, Content-Length, X-Requested-With'},
        }).then(r => {
            console.log(r);
            console.log("r.data.userId :: ", r.data.userId);
            console.log("r.data.msg ", r.data.msg);
            if (r.data.userId === undefined) {
                console.log("======================", r.data.msg);
                alert("입력하신 id 가 일치하지 않습니다.");
            } else if (r.data.userId === null) {
                // id는 있지만, pw 는 다른 경우 userId = null , msg = undefined
                console.log(
                    "======================",
                    "입력하신 비밀번호 가 일치하지 않습니다."
                );
                alert("입력하신 비밀번호 가 일치하지 않습니다.");
            } else if (r.data.email === inputId) {
                // id, pw 모두 일치 userId = userId1, msg = undefined
                console.log("======================", "로그인 성공");
                // sessionStorage.setItem("user_id", inputId); // sessionStorage에 id를 user_id라는 key 값으로 저장
                // sessionStorage.setItem("name", r.data.name); // sessionStorage에 id를 user_id라는 key 값으로 저장
            }
        });
        console.log(data);


    };

    return (

        <Container>
            <GlobalStyle />
            <LoginForm>
                <LoginName>로그인</LoginName>
                <P>ID</P>
                <Input id="id" name="id" type="p" placeholder="" value={inputId} onChange={handleInputId}/>
                <P>PASSWORD</P>
                <Input id="password" name="password" type="password" placeholder="" value={inputPw} onChange={handleInputPw}/>
                <Button onClick={onSubmit}><img src="./logos/login_button.png" /></Button>
                <Signup><SignupText>아이디가 없으신가요?</ SignupText><SignupText><Link to="/signup">회원가입</Link></SignupText></Signup>
            </LoginForm>
            <Footer>
                <img
                    src="./logos/songplace.png"
                />
            </Footer>
        </Container>

    );
}

export default Login;
