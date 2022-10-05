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
            <div class="range"></div>
            <div className="artist-info">
                <h3 className="details-title">{props.song.musicName}</h3>
                <h4 className="details-artist">{props.song.singerName}</h4>
                <div class="line"></div>
            </div>
        </div>
    );
}

export default PlayerDetail;