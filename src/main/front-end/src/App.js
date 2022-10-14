import React from "react";
import {Link, Route, Switch} from 'react-router-dom';
import {useState, useEffect} from 'react';
import './Player.css';
import Player from "./components/Player";
import Login from "./components/Login";

function App() {

    const [songs] = useState([
        {
            "musicId": 9,
            "musicName": "-",
            "genre": "발라드",
            "singerName": "-",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./logos/player_image.png",
            "src": "./musics/stellar_language.mp3",
        },
        {
            "musicId": 10,
            "musicName": "별의 언어",
            "genre": "발라드",
            "singerName": "뉴이스트",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./musics_images/stellar_language_cover.jpg",
            "src": "./musics/stellar_language.mp3",
        },
        {
            "musicId": 11,
            "musicName": "황혼의 새",
            "genre": "발라드",
            "singerName": "AOT",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./musics_images/twilight_bird_cover.jpg",
            "src": "./musics/twilight_bird.mp3",
        },
        {
            "musicId": 12,
            "musicName": "후유증",
            "genre": "발라드",
            "singerName": "뉴이스트",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./musics_images/aftereffect_cover.jpg",
            "src": "./musics/aftereffect.mp3",
        },
    ]);

    const [currentSongIndex, setCurrentSongIndex] = useState(0);
    const [nextSongIndex, setNextSongIndex] = useState(currentSongIndex + 1);
    const [message, setMessage]=useState([]);

    useEffect(()=>{
        fetch("/hello")
            .then((res)=>{
                return res.json();
            })
            .then((data)=>{
                setMessage(data);
            })
        setNextSongIndex(()=>{
            if (currentSongIndex + 1 > songs.length - 1) {
                return 0;
            } else {
                return currentSongIndex + 1;
            }
        });

    },[currentSongIndex]);

    return (
        <div>
            <Route exact path="/">
                <div className="App">
                    <Player currentSongIndex={currentSongIndex}
                            setCurrentSongIndex={setCurrentSongIndex}
                            nextSongIndex={nextSongIndex}
                            songs={songs} />
                    <ul>
                        {message.map((v,idx)=><li key={`${idx}-${v}`}>{v}</li>)}
                    </ul>
                </div>
            </Route>
            <Route path="/signup">
                <div>회원가입페이지</div>

            </Route>
            <Route path="/signin">
                <div>로그인페이지</div>
                <Login />
            </Route>
        </div>
    );
}

export default App;