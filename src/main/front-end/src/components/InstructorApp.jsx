import ListCoursesComponent from "./ListCourseComponent";
import {Component} from "react";

class InstructorApp extends Component {
    render() {
        return (<>
                <h1>Instructor Application</h1>
                <ListCoursesComponent/>
            </>
        )
    }
}

export default InstructorApp