import React from "react";

function VibeSongCard(props) {




    const lists = [1,2,3,4,5];
    const data = props.list.musicName;
    let i = 1;
    while(i<5){
        lists.push(data[i]);
        i = i+1;
    }


    return (


        <div className="vibeSong-list">
            <div className="details-title">{lists}</div>
        </div>
    );

}

export default VibeSongCard;