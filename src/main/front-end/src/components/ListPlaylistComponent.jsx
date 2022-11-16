import {Component} from "react";
import PlaylistDataService from "../service/PlaylistDataService.js";

const INSTRUCTOR = 'in28minutes'

class ListPlaylistComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            playlist: [],
            message: null
        }
        this.refreshPlaylists = this.refreshPlaylists.bind(this)
    }

    componentDidMount() {
        this.refreshPlaylists();
    }

    refreshPlaylists() {
        PlaylistDataService.retrieveAllPlaylists(INSTRUCTOR)
            .then(
                response => {
                    console.log('하');
                    console.log(response);
                    this.setState({ playlist: response.data})
                }

            )
    }

    render() {
        console.log('render')
        return (
            <div className="container">
                <h3>All Courses</h3>
                <div className="container">
                    <table className="table">
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>Description</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.playlist.map(
                                playlist =>
                                    <tr key={playlist.id&&playlist[1].id}>
                                        <td>{playlist.id}</td>
                                        <td>{playlist.username}</td>
                                        <td>{playlist.description}</td>
                                    </tr>
                            )
                        }

                        </tbody>
                    </table>

                </div>
            </div>
        )
    }
}


export default ListPlaylistComponent