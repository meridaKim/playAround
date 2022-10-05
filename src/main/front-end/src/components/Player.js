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
                <div className="playlist">플레이리스트리스트 추천을 받으시려면 위치설정을 완료해주세요</div>

            </div>

            <div className="song-player-container">
            <p>
                <div className="text-anim">
                   <img
                       src="./logos/nowplaying.png"
                   />
                </div>


            </p>
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

                <div class="player__footer">
                    <ul class="list list--footer">
                        <li>
                            <a href="#" class="list__link">
                                <i class="fa fa-heart-o"></i>
                            </a>
                        </li>

                        <li>
                            <a href="#" class="list__link">
                                <i class="fa fa-random"></i>
                            </a>
                        </li>

                        <li>
                            <a href="#" class="list__link">
                                <i class="fa fa-undo"></i>
                            </a>
                        </li>

                        <li>
                            <a href="#" class="list__link">
                                <i class="fa fa-ellipsis-h"></i>
                            </a>
                        </li>
                    </ul>
                </div>
                <div className="song-playlist">
                </div>
                {/* <h4>Lofi Music Player React </h4> */}
            </div>
            </div>
            </div>
        </>
    );
}
export default Player;