import React, { useState, useRef, useEffect } from "react";
import PlayerDetail from "./PlayerDetail";
import PlayerControls from "./PlayerControls";

function Player(props) {
    const audioElement = useRef(null);
    const [isPlaying, setIsPlaying] = useState(false);

    useEffect(() => {
        if (isPlaying) {
            audioElement.current.play();
        } else {
            audioElement.current.pause();
        }
    });

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
            <div className="song-place-container">
                <div className="header">
                    <div className="song-place">
                        <div className="song-place-logo">
                            <img
                                src="./logos/songplace.png"
                            />
                        </div>
                        <div className="space">space</div>
                    </div>

                    <div className="user">로그인</div>
                </div>
                <div className="location">
                    <div className="item">지금나는?</div>
                    <div className="item">우주를 헤매는 중</div>
                    <div className="item">현재 위치를 설정해보세요</div>
                    <div className="item">내 위치 탐색하기</div>
                </div>
                <div className="playlist">플레이리스트 추천을 받으시려면 <p>위치설정을 완료해주세요</p></div>

            </div>

            <div className="song-player-container">

                <div className="song-player">
                    <div className="text-anim">
                       <img
                           src="./logos/nowplaying.png"
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