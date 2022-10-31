import React, { Component } from 'react';
import ListPlaylistComponent from './ListPlaylistComponent';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'


class InstructorApp extends Component {
    render() {
        return (
            <Router>
                <>
                    <h1>플레이리스트를 가져오자</h1>
                    <ListPlaylistComponent/>
                    {/*<Switch>*/}
                    {/*    <Route path="/" exact component={ListPlaylistComponent} />*/}
                    {/*    <Route path="/courses" exact component={ListPlaylistComponent} />*/}

                    {/*</Switch>*/}
                </>
            </Router>
        )
    }
}

export default InstructorApp