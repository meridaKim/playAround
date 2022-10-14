import React, {useState, useEffect} from 'react';
import {Link, Route, Switch} from 'react-router-dom';
import styled from "styled-components";
import { createGlobalStyle } from 'styled-components'

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
const Button = styled.div`
    text-align: right;
    margin-bottom: 85px;
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

    const handleInputId = (e) =>{
        setInputId(e.target.value)
    }

    const handleInputPw = (e) =>{
        setInputId(e.target.value)
    }

    //login 버튼 클릭 이벤트
    const onClickLogin = () =>{
        console.log('로그인 클릭함')
    }
    useEffect(()=>{

    })

    return (

        <Container>
            <GlobalStyle />
            <LoginForm>
                <LoginName>로그인</LoginName>
                <P>ID</P>
                <Input id="id" name="id" placeholder=""/>
                <P>PASSWORD</P>
                <Input id="password" name="password" type="password" placeholder="" />
                <Button><img src="./logos/login_button.png" /></Button>
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
