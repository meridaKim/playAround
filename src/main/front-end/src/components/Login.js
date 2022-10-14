import React, {useState, useEffect} from 'react';
import {Link, Route, Switch} from 'react-router-dom';
import styled from "styled-components";

const Container = styled.div`
      margin-top:100px;
      width: 1518px;

`
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
            <div className="login-form">
                <p>로그인</p>
                <div className="login">
                    <p>ID</p>
                    <p>PASSWORD</p>
                </div>
                <div className="login-button"></div>
                <p>아이디가 없으신가요?</p><Link to="/signup">회원가입</Link>
            </div>
            {/*<div class="range"></div>*/}
            <div className="footer">
                <p>song place</p>
            </div>
        </Container>
    );
}

export default Login;
