import {Component} from "react";

class ListCoursesComponent extends Component {

    /*단순한 목록나열 컴포넌트*/
    constructor(props) {
        super(props)
        this.refreshCourses = this.refreshCourses.bind(this)
    }

    /*컴포넌트가 마운트되는 즉시 refreshCourses를 호출*/
    componentDidMount() {
        this.refreshCourses();
    }


    refreshCourses() {
        this.CourseDataService.retrieveAllCourses(this.INSTRUCTOR)//HARDCODED
            .then(
                response => {
                    console.log(response);
                }
            )
    }

    render() {
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
                        <tr>
                            <td>1</td>
                            <td>Learn Full stack with Spring Boot and Angular</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

export default ListCoursesComponent