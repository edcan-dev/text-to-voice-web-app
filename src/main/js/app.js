const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');
// const { App} = require('././components/App')


/*
function App() {
    return (
        <h1>asuuu</h1>
    );
}*/

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {

        client({method: 'GET', path: '/api/employees'}).done(response => {
            this.setState({employees: response.entity._embedded.employees});
        });
    }

    render() {

        return (
            <EmployeeList employees={this.state.employees}/>
        )
    }
}



ReactDOM.render(<App />, document.getElementById('app'))