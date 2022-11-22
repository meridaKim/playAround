import axios from 'axios';
import React from "react";
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import {useState, useEffect} from 'react';
import './Player.css';
import Player from "./components/Player";
import Login from "./components/Login";
import Signup from "./components/Signup";
import Space from "./components/Space";


function App() {


    const [songs] = useState([
        {
            "musicId": 9,
            "vibeKey":"asdf",
            "musicName": "-",
            "genre": "발라드",
            "singerName": "-",
            "vibe":"등하교",
            "location":"부산시 남구",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/stellar_language.mp3",
        },
        {
            "musicId": 10,
            "vibeKey":"b",
            "musicName": "별의 언어",
            "genre": "발라드",
            "singerName": "뉴이스트",
            "location":"수원시 영통구",
            "vibe":"캠퍼스",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/stellar_language_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/stellar_language.mp3",
        },
        {
            "musicId": 11,
            "vibeKey":"c",
            "musicName": "황혼의 새",
            "genre": "발라드",
            "singerName": "AOT",
            "location":"수원시 영통구",
            "vibe":"출퇴근",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/twilight_bird_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/twilight_bird.mp3",
        },
        {
            "musicId": 12,
            "vibeKey":"d",
            "musicName": "후유증",
            "genre": "발라드",
            "singerName": "뉴이스트",
            "location":"수원시 영통구",
            "vibe":"월요일",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/aftereffect.mp3",
        },
        {
            "musicId": 13,
            "vibeKey":"e",
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "location":"수원시 영통구",
            "vibe":"따뜻한",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
        {
            "musicId": 14,
            "vibeKey":"f",
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "location":"수원시 영통구",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
        {
            "musicId": 15,
            "vibeKey":"g",
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "location":"수원시 영통구",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
        {
            "musicId": 16,
            "vibeKey":"h",
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "location":"수원시 영통구",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
        {
            "musicId": 17,
            "vibeKey":"i",
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "location":"수원시 영통구",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
        {
            "musicId": 18,
            "vibeKey":"j",
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "location":"수원시 영통구",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
        {
            "musicId": 19,
            "vibeKey":"k",
            "musicName": "VOYAGER",
            "genre": "시티팝",
            "singerName": "SHIN EVA",
            "location":"수원시 영통구",
            "vibe":"등하교",
            "countUp": 0,
            "countDown": 0,
            "cover_src":"./covers/aftereffect_cover.jpg",
            "img_src": "./logos/player_image.png",
            "src": "./musics/VOYAGER.mp3",
        },
    ]);

    function Song({song}){
        return(


            <div>
                <img
                    className="playlist-img--image"
                    src={song.cover_src}
                    alt=""
                /> {song.musicName}
            </div>
        );
    }


    const [currentSongIndex, setCurrentSongIndex] = useState(0);
    const [nextSongIndex, setNextSongIndex] = useState(currentSongIndex + 1);
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

                <Player currentSongIndex={currentSongIndex}
                        setCurrentSongIndex={setCurrentSongIndex}
                        nextSongIndex={nextSongIndex}
                        songs={songs} />

            </Route>
            <Route exact path="/space">
                <Space currentSongIndex={currentSongIndex}
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

        </div>

    );
}

export default App;