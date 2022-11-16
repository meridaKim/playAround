import React, { Component } from 'react';
import ListPlaylistComponent from './ListPlaylistComponent';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import Login from "./Login";


class InstructorApp extends Component {
    render() {
        return (
            <>

            <Router>
                <>

                        <Route exact path="/signup">
                            <div>회원가입페이지</div>
                        </Route>
                        <Route exact path="/signin">
                            <Login />
                        </Route>

                </>
            </Router>
            </>
        )
    }
}

export default InstructorApp