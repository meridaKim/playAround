-- 1.cmd 접속
-- 2. cd (mysql bin폴더 경로)
--    경로 찾는법 - mysql 검색 후 command line 클릭, 파일 위치 찾기로 bin 폴더 이동가능.
--                이후 작업탐색기 복사+ 붙여넣기
-- 3. mysql -u root -p
-- 4. CREATE DATABASE playAround;
-- 5. USE playAround;
-- 6. 아래 내용 테이블 하나씩 복사 붙여넣기
--
CREATE TABLE music (
musicId bigint(11) PRIMARY KEY,
musicName varchar(50) NOT NULL,
genre varchar(45) NOT NULL,
singerName VARCHAR(45) NOT NULL,
countUp VARCHAR(45) NULL DEFAULT NULL,
countDown VARCHAR(45) NULL DEFAULT NULL
);
CREATE TABLE playlist (
 playlistId bigint(11) PRIMARY KEY,
 userId VARCHAR(17) NOT NULL,
 musicId bigint(11) NOT NULL
);
CREATE TABLE round (
 roundId bigint(11) PRIMARY KEY,
 roundname VARCHAR(45) NOT NULL,
 vibe VARCHAR(45),
 createDate DATE NOT NULL,
 createuserId VARCHAR(17) NOT NULL,
 localId bigint(100) NOT NULL,
 playlistId bigint(11) NOT NULL
);
CREATE TABLE user (
userId VARCHAR(17) PRIMARY KEY,
userPw VARCHAR(17) NOT NULL,
userAge bigint(11) NOT NULL,
userName VARCHAR(45) NOT NULL,
localAgree bigint(2) NOT NULL
);
CREATE TABLE local (
localId bigint(100) PRIMARY KEY,
localName VARCHAR(30) NOT NULL,
categoryId VARCHAR(50) NOT NULL,
categoryName VARCHAR(50) NOT NULL
);

