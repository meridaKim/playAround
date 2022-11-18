import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import Login from "./Login";
import Signup from "./Signup";


class InstructorApp extends Component {
    render() {
        return (
            <>

            <Router>
                <>

                        <Route exact path="/signup">
                            <Signup />
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