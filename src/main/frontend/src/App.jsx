import React, {useEffect, useState} from 'react';
import{Provider} from "react-redux";
import CssBaseline from '@material-ui/core/CssBaseline';
import { MuiThemeProvider } from '@material-ui/core/styles';
import { createMuiTheme } from '@material-ui/core/stsyles';
import axios from 'axios';
import store from "./redux/store";
import defaultTheme from "./defaultTheme";

const jwtToken = localStorage.jwtToken;

if (jwtToken) {
    setJwtToken(jwtToken);
    const decodedJWT = jwt_decode(jwtToken);
    store.dispatch(setCurrentUser(decodedJWT));

    const currentTime = Date.now() / 1000;
    if (decodedJWT.exp < currentTime) {
        localStorage.removeItem('jwtToken');
        setJwtToken(false);
        store.dispatch(logout());
        window.location.href = '/';
    }
}

function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    axios.get('/api/hello')
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
  }, []);
  return (
      <Provider store={store}>
        <MuiThemeProvider theme={createMuiTheme(defaultTheme)}>
          <CssBaseline />
          <Routes />
        </MuiThemeProvider>
      </Provider>
  );
}

export default App;