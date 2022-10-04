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
                <div className="header">헤더</div>
                <div className="location">위치찾기</div>
                <div className="playlist">플레이리스트</div>

            </div>
            <div className="song-player-container">
            <p>
                <div className="text-anim">
                    <strong>SongPlace</strong>
                </div>

                <div className="nextsong-details">
                    <img
                        src={props.songs[props.nextSongIndex].img_src}
                        alt={props.songs[props.nextSongIndex].musicName}
                        style={{ width: "4em", height: "auto" }}
                    />
                    <p>
                        <b>{props.songs[props.nextSongIndex].musicName} </b>&nbsp; by &nbsp;
                        <b>{props.songs[props.nextSongIndex].singerName}</b>
                        {/* &nbsp; from album
            &nbsp; */}
                        {/* <b>{props.songs[props.nextSongIndex].album}</b> */}
                    </p>
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