import React from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
    faPlay,
    faPause,
    faForward,
    faBackward,
} from "@fortawesome/free-solid-svg-icons";

function PlayerControls(props) {

    return (
        <div className="music-player--controls">

            <div className="random-play">
            <a href="#" className="list__link">
                <img
                    src="./logos/random_play.png"
                />
            </a>
            </div>
            <button className="skip-btn" onClick={() => props.SkipSong(false)}>
                <img
                    src="./logos/left_skip_button.png"
                />
            </button>
            <button
                className="play-btn"
                onClick={() => props.setIsPlaying(!props.isPlaying)}
            >
                <img
                    src="./logos/play_button.png"
                />
            </button>
            <button className="skip-btn" onClick={() => props.SkipSong()}>
                <img
                    src="./logos/right_skip_button.png"
                />
            </button>
            <div className="infinite-play">
                <a href="#" className="list__link">
                    <img
                        src="./logos/infinite_play.png"
                    />
                </a>
            </div>
        </div>
    );
}

export default PlayerControls;