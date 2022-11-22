import React, { useState, useRef, useEffect } from "react";
import {Link} from 'react-router-dom';
import PlayerDetail from "./PlayerDetail";
import PlayerControls from "./PlayerControls";
import styled from "styled-components";

const Button = styled.button`
    background-color:transparent;
    border-color:transparent;
`;

function Song({song}){
    return(
        <div className="songs">
            <img
                className="playlist-img--image"
                src={song.cover_src}
                alt=""
            /> {song.musicName}
        </div>
    );
}

function Vibe({songs}){
    return(
        <div className="vibe" onClick={
            ()=>{
                sessionStorage.setItem("vibe",songs.vibe);
                window.location.href = "/";
                // sessionStorage.removeItem("vibe");
            }
        }>#{songs.vibe}</div>
    );

}




function Player(props) {
    const SearchedLocations = props.songs.filter((songs)=>{
        return songs.location.includes(sessionStorage.getItem("location"));
    });
    const SearchedVibes = props.songs.filter((songs)=>{
        return songs.vibe.includes(sessionStorage.getItem("vibe"));
    });
    const audioElement = useRef(null);
    const [isPlaying, setIsPlaying] = useState(false);
    const [isLogin, setIsLogin] = useState(false); //로그인 관리
    const [isLocation, setIsLocation] = useState(false);
    const [isVibe, setVibe] = useState(false);

    useEffect(() => {
        if (isPlaying) {
            audioElement.current.play();
        } else {
            audioElement.current.pause();
        }

        //로그인 확인
        if (sessionStorage.getItem("name") === null) {
            // sessionStorage 에 name 라는 key 값으로 저장된 값이 없다면
            console.log("isLogin ?? :: ", isLogin);
        } else {
            // sessionStorage 에 name 라는 key 값으로 저장된 값이 있다면
            // 로그인 상태 변경
            setIsLogin(true);
            console.log("isLogin ?? :: ", isLogin);
        }

        //위치설정 확인
        if(sessionStorage.getItem("location") === null){
            console.log("isLocation ?? :: ", isLocation);
        }else{
            setIsLocation(true);
            console.log("location");
        }

        //바이브 클릭 확인
        if(sessionStorage.getItem("vibe") === null){
            console.log("isvibe ?? :: ", isVibe);
        }else{
            setVibe(true);
            console.log("vibe",sessionStorage.getItem("vibe"));
        }
    }, [isPlaying, isLogin, isLocation, isVibe]);




    const SkipSong = (forwards = true) => {
        if (forwards) {
            props.setCurrentSongIndex(() => {
                let temp = props.currentSongIndex;
                temp++;

                if (temp > props.songs.length - 1) {
                    temp = 0;
                }

                return temp;
            });
        } else {
            props.setCurrentSongIndex(() => {
                let temp = props.currentSongIndex;
                temp--;

                if (temp < 0) {
                    temp = props.songs.length - 1;
                }

                return temp;
            });
        }
    };


    return (
        <>
            <div className="container">
            <div className="transform_arrow"><img src="./logos/transform_arrow.png" alt="space" /></div>
            <div className="song-place-container">
                <div className="header">
                    <div className="song-place">
                        <div className="song-place-logo">
                            <img
                                src="./logos/songplace.png"
                                alt=""
                            />
                        </div>
                        <div className="space">space</div>
                    </div>

                    {isLogin ? (
                        <Link to={`/Mypage`} className="user">{sessionStorage.getItem("name")}님</Link>
                    )
                        :(<Link to="/signin"><div className="user">로그인</div></Link>
                        )
                    }
                    {isLogin ?
                            <Button onClick={()=>{
                                setIsLogin(false);
                                console.log("isLogin ?? :: ", isLogin);
                                sessionStorage.removeItem("name");
                            }
                            }>로그아웃 </Button>

                        :   <Link to="/signup"><div className="user">회원가입</div></Link>

                    }
                </div>

                <div className="location">
                    <div className="item">지금나는?</div>
                    {isLocation ? (
                            <div className="item">{sessionStorage.getItem("location")}</div>
                        )
                        : (<div className="item">우주를 헤매는 중</div>)
                    }
                    {isLocation ? (
                            <div className="item">어떤 vibe의 노래를 들을까?</div>
                        )
                        : (<div className="item">현재 위치를 설정해보세요</div>)
                    }

                    {isLocation ? (<div className="vibe_container">{SearchedLocations.map(
                                (songs) =>(<Vibe key={songs.musicId} songs={songs} />)
                            )}</div>
                        )
                        :(<div className="item" onClick={
                            ()=>{
                                sessionStorage.setItem("location","수원시 영통구");
                                window.location.href = "/";
                            }

                        }>내 위치 탐색하기</div>)}


                </div>
                <div className="vibe_name">
                    #{sessionStorage.getItem("vibe")}
                </div>
                {isVibe ? (

                        <div className="playlist-item">
                            {SearchedVibes.map((song) => {
                                console.log(song);
                                return <Song key={song.vibeKey} song={song}/>
                            })}
                        </div>
                    )
                    :
                    (
                        <div className="playlist-item">
                            {props.songs.map((song) => {
                                console.log(song);
                                return <Song key={song.vibeKey} song={song}/>
                            })}
                        </div>
                    )
                }
            </div>


            <div className="song-player-container">
                <div className="song-player">

                    <div className="text-anim">
                       <img
                           src="./logos/nowplaying.png"
                           alt=""
                       />
                    </div>
                    <div className="music-player">
                        <audio
                            src={props.songs[props.currentSongIndex].src}
                            ref={audioElement}
                        ></audio>
                        <PlayerDetail song={props.songs[props.currentSongIndex]} />

                        <PlayerControls
                            isPlaying={isPlaying}
                            setIsPlaying={setIsPlaying}
                            SkipSong={SkipSong}
                        />
                    </div>
                </div>

                <div className="song-playlist">
                    <div className="song-playlist-text">
                        <div className="play-song">재생목록</div>
                        <div className="save-song">저장목록</div>
                    </div>
                    <div className="song-playlist-content"></div>
                </div>

            </div>
            </div>
        </>
    );
}
export default Player;