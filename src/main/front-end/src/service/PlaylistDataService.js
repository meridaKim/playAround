import axios from 'axios'

const INSTRUCTOR = 'in28minutes'
const PLAYLIST_API_URL = 'http://localhost:8080'
const INSTRUCTOR_API_URL = `/api/${INSTRUCTOR}`



class PlaylistDataService {


  retrieveAllPlaylists(name){
      return axios.get(`/api/${INSTRUCTOR}`);

  }
}

export default new PlaylistDataService()