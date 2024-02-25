# playAround
위치 기반 음악 추천 웹 서비스 개발 프로젝트

![DB 설계](https://docs.google.com/document/d/1WBRHHzJ0-6WsoDrncVob65V4H1zKWEAvVDRm8TDmZDo/edit)
![frontend참고](https://yeun.github.io/open-color/)
```
src
    ├── main
    │   ├── front-end
    │   │   ├── README.md
    │   │   ├── config
    │   │   │   ├── env.js
    │   │   │   ├── getHttpsConfig.js
    │   │   │   ├── jest
    │   │   │   │   ├── babelTransform.js
    │   │   │   │   ├── cssTransform.js
    │   │   │   │   └── fileTransform.js
    │   │   │   ├── modules.js
    │   │   │   ├── paths.js
    │   │   │   ├── webpack
    │   │   │   │   └── persistentCache
    │   │   │   │       └── createEnvironmentHash.js
    │   │   │   ├── webpack.config.js
    │   │   │   └── webpackDevServer.config.js
    │   │   ├── package-lock.json
    │   │   ├── package.json
    │   │   ├── public
    │   │   │   ├── favicon.ico
    │   │   │   ├── index.html
    │   │   │   ├── logo192.png
    │   │   │   ├── logo512.png
    │   │   │   ├── logos
    │   │   │   │   ├── infinite_play.png
    │   │   │   │   ├── left_skip_button.png
    │   │   │   │   ├── login_button.png
    │   │   │   │   ├── nowplaying.png
    │   │   │   │   ├── play_button.png
    │   │   │   │   ├── player_image.png
    │   │   │   │   ├── random_play.png
    │   │   │   │   ├── right_skip_button.png
    │   │   │   │   ├── songplace.png
    │   │   │   │   └── user.png
    │   │   │   ├── manifest.json
    │   │   │   ├── musics
    │   │   │   │   ├── stellar_language.mp3
    │   │   │   │   └── twilight_bird.mp3
    │   │   │   └── robots.txt
    │   │   ├── scripts
    │   │   │   ├── build.js
    │   │   │   ├── start.js
    │   │   │   └── test.js
    │   │   ├── src
    │   │   │   ├── App.css
    │   │   │   ├── App.js
    │   │   │   ├── App.test.js
    │   │   │   ├── Player.css
    │   │   │   ├── Playerlist.css
    │   │   │   ├── box.png
    │   │   │   ├── components
    │   │   │   │   ├── InstructorApp.jsx
    │   │   │   │   ├── ListPlaylistComponent.jsx
    │   │   │   │   ├── Login.jsx
    │   │   │   │   ├── Player.jsx
    │   │   │   │   ├── PlayerControls.js
    │   │   │   │   ├── PlayerDetail.js
    │   │   │   │   └── Signup.js
    │   │   │   ├── index.css
    │   │   │   ├── index.js
    │   │   │   ├── logo.svg
    │   │   │   ├── reportWebVitals.js
    │   │   │   ├── service
    │   │   │   │   └── PlaylistDataService.js
    │   │   │   ├── setupFroxy.js
    │   │   │   └── setupTests.js
    │   │   └── yarn.lock
    │   ├── frontend
    │   │   ├── README.md
    │   │   ├── package-lock.json
    │   │   ├── package.json
    │   │   ├── public
    │   │   │   ├── favicon.ico
    │   │   │   ├── index.html
    │   │   │   ├── logo192.png
    │   │   │   ├── logo512.png
    │   │   │   ├── manifest.json
    │   │   │   └── robots.txt
    │   │   └── src
    │   │       ├── App.css
    │   │       ├── App.jsx
    │   │       ├── App.test.js
    │   │       ├── component
    │   │       │   ├── TodoListTemplate.css
    │   │       │   ├── TodoListTemplate.js
    │   │       │   ├── app-body.js
    │   │       │   ├── app-header.js
    │   │       │   ├── app-modal.js
    │   │       │   └── dropdown.js
    │   │       ├── defaultTheme.js
    │   │       ├── index.css
    │   │       ├── index.js
    │   │       ├── logo.svg
    │   │       ├── redux
    │   │       │   └── store.js
    │   │       ├── reportWebVitals.js
    │   │       ├── setProxy.js
    │   │       └── setupTests.js
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           ├── PlayAroundApplication.java
    │   │           ├── controller
    │   │           │   ├── AuthenticationBean.java
    │   │           │   ├── HelloWorldController.java
    │   │           │   ├── LocationController.java
    │   │           │   ├── LoginController.java
    │   │           │   ├── MusicController.java
    │   │           │   ├── PlaylistResource.java
    │   │           │   └── RegisterController.java
    │   │           ├── model
    │   │           │   ├── dto
    │   │           │   │   └── MusicDto.java
    │   │           │   └── entity
    │   │           │       ├── Course.java
    │   │           │       ├── Location.java
    │   │           │       ├── Music.java
    │   │           │       ├── Playlist.java
    │   │           │       ├── Round.java
    │   │           │       └── User.java
    │   │           ├── mybatis
    │   │           │   └── mapper.xml
    │   │           ├── repository
    │   │           │   ├── MusicRepository.java
    │   │           │   ├── PlaylistRepository.java
    │   │           │   ├── UserRepository.java
    │   │           │   ├── dao
    │   │           │   │   └── LocationDao.java
    │   │           │   └── mybatis
    │   │           │       └── locationMapper.java
    │   │           └── service
    │   │               ├── LocationService.java
    │   │               ├── LocationServiceImpl.java
    │   │               ├── MemberService.java
    │   │               ├── MusicService.java
    │   │               ├── PlaylistService.java
    │   │               └── PrincipalOauth2UserService.java
    │   ├── playAroundDatabase.sql
    │   ├── resources
    │   │   ├── application.properties
    │   │   ├── com
    │   │   │   └── example
    │   │   │       └── repository
    │   │   │           └── mybatis
    │   │   │               └── locationMapper.xml
    │   │   ├── css
    │   │   │   ├── bootstrap-theme.css
    │   │   │   ├── bootstrap-theme.css.map
    │   │   │   ├── bootstrap-theme.min.css
    │   │   │   ├── bootstrap.css
    │   │   │   ├── bootstrap.css.map
    │   │   │   └── bootstrap.min.css
    │   │   ├── js
    │   │   │   ├── bootstrap.js
    │   │   │   ├── bootstrap.min.js
    │   │   │   └── npm.js
    │   │   ├── static
    │   │   │   ├── MainPage.html
    │   │   │   └── image
    │   │   │       └── kakao_login_large_narrow.png
    │   │   └── templates
    │   │       ├── first.html
    │   │       ├── login.html
    │   │       ├── main.html
    │   │       └── register.html
    │   └── webapp
    │       └── WEB-INF
    │           ├── lib
    │           │   └── jakarta.servlet.jsp.jstl-2.0.0.jar
    │           └── views
    │               ├── LocationMarkerCluster.jsp
    │               └── main.jsp
    └── test
        └── java
            └── com
                └── example
                    └── service
                        ├── PlayAroundApplicationTests.java
                        └── RequestController.java

```
# frontend연결법
terminal 클릭 > cd src/main/front-end > npm install > npm audit > locahost:3000확인
