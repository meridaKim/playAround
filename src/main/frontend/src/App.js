import React from 'react';
import {useState,useEffect} from "react";
import './Player.css';
import Player from "./components/Player";

const App=()=> {

    const [songs] = useState([
        {
            "musicId": 10,
            "musicName": "별의 언어",
            "genre": "발라드",
            "singerName": "뉴이스트",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./musics_images/별의 언어_cover.jpg",
            "src": "./musics/별의 언어.mp3"
        },
        {
            "musicId": 11,
            "musicName": "황혼의 새",
            "genre": "발라드",
            "singerName": "AOT",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./musics_images/황혼의 새_cover.jpg",
            "src": "./musics/황혼의 새.mp3"
        },
        {
            "musicId": 12,
            "musicName": "후유증",
            "genre": "발라드",
            "singerName": "뉴이스트",
            "countUp": 0,
            "countDown": 0,
            "img_src": "./musics_images/후유증_cover.jpg",
            "src": "./musics/후유증.mp3"
        },

    ]);

    const [currentSongIndex, setCurrentSongIndex] = useState(0);
    const [nextSongIndex, setNextSongIndex] = useState(currentSongIndex + 1);

    useEffect(() => {
        setNextSongIndex(()=>{
        if (currentSongIndex + 1 > songs.length - 1) {
            return 0;
        } else {
            return currentSongIndex + 1;
        }
    });
},[currentSongIndex])



    return (
        <div className="App">
         <Player currentSongIndex={currentSongIndex}
         setCurrentSongIndex={setCurrentSongIndex}
          nextSongIndex={nextSongIndex}
         songs={songs} />
        </div>
    );


}

export default App;