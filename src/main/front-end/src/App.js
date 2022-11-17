import axios from 'axios';
import React from "react";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import {useState, useEffect} from 'react';
import './Player.css';
import Player from "./components/Player";
import Login from "./components/Login";
import InstructorApp from "./components/InstructorApp";

function App() {


    const [songs] = useState([
        {
            "musicId": 9,
            "musicName": "-",
            "genre": "발라드",
            "singerName": "-",
            "vibe":"등하교",
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
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./logos/player_image.png",
            "src": "./musics/stellar_language.mp3",
        },
        {
            "musicId": 11,
            "musicName": "황혼의 새",
            "genre": "발라드",
            "singerName": "AOT",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./logos/player_image.png",
            "src": "./musics/twilight_bird.mp3",
        },
        {
            "musicId": 12,
            "musicName": "후유증",
            "genre": "발라드",
            "singerName": "뉴이스트",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./logos/player_image.png",
            "src": "./musics/aftereffect.mp3",
        },
        {
            "musicId": 13,
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
    ]);

    const [currentSongIndex, setCurrentSongIndex] = useState(0);
    const [nextSongIndex, setNextSongIndex] = useState(currentSongIndex + 1);
    const [user,setUser]=useState([]);
    const [hello, setHello] = useState('')



    useEffect(()=>{
        axios.get('/api/hello')
            .then(response => setHello(response.data))
            .catch(error => console.log(error))


        setNextSongIndex(()=>{
            if (currentSongIndex + 1 > songs.length - 1) {
                return 0;
            } else {
                return currentSongIndex + 1;
            }
        });



    },[currentSongIndex]);

    return (

        <div className="App">
                <Route exact path="/">
                            백엔드에서 가져온 데이터입니다 : {hello}
                            <Player currentSongIndex={currentSongIndex}
                                    setCurrentSongIndex={setCurrentSongIndex}
                                    nextSongIndex={nextSongIndex}
                                    songs={songs} />

                </Route>
                <Route exact path="/signup">
                    <Signup />
                </Route>
                <Route exact path="/signin">
                    <Login />
                </Route>

            <Route exact path="/map">
                <Map />
            </Route>
        </div>

    );
}

export default App;