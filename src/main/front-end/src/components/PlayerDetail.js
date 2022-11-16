import React from "react";

function PlayerDetail(props) {
    return (
        <div className="music-player--details">
            <div className="details-img">
                <img
                    className="details-img--image"
                    src={props.song.img_src}
                    alt={props.song.musicName}
                />
            </div>
            {/*<div class="range"></div>*/}
            <div className="artist-info">
                <div className="details-title">{props.song.musicName}</div>
                <div className="details-artist">{props.song.singerName}</div>
                <div className="line"></div>
            </div>
        </div>
    );
}

export default PlayerDetail;