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
countUp bigint(100),
countDown bigint(100)
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

-- -----------------------------------------------------
-- Table `playground`.`playlist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `playground`.`playlist` (
  `playlistId` INT(11) NOT NULL,
  `countPlaylist` VARCHAR(45) NULL DEFAULT NULL,
  `user_userId` VARCHAR(17) NOT NULL,
  `music_musicId` INT(11) NOT NULL,
  PRIMARY KEY (`playlistId`, `user_userId`, `music_musicId`),
  INDEX `fk_playlist_user_idx` (`user_userId` ASC),
  INDEX `fk_playlist_music1_idx` (`music_musicId` ASC) ,
  CONSTRAINT `fk_playlist_user`
    FOREIGN KEY (`user_userId`)
    REFERENCES `playground`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_playlist_music1`
    FOREIGN KEY (`music_musicId`)
    REFERENCES `playground`.`music` (`musicId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `playground`.`local`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `playground`.`local` (
  `localId` INT NOT NULL,
  `localName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`localId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `playground`.`round`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `playground`.`round` (
  `RoundId` INT(11) NOT NULL,
  `Roundname` VARCHAR(45) NOT NULL,
  `vibe` VARCHAR(45) NULL DEFAULT NULL,
  `createDate` DATETIME NOT NULL,
  `createuserId` VARCHAR(17) NOT NULL,
  `local_localId` INT NOT NULL,
  PRIMARY KEY (`RoundId`, `createuserId`, `local_localId`),
  INDEX `fk_round_user1_idx` (`createuserId` ASC),
  INDEX `fk_round_local1_idx` (`local_localId` ASC),
  CONSTRAINT `fk_round_user1`
    FOREIGN KEY (`createuserId`)
    REFERENCES `playground`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_round_local1`
    FOREIGN KEY (`local_localId`)
    REFERENCES `playground`.`local` (`localId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `playground`.`participation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `playground`.`participation` (
  `user_userId` VARCHAR(17) NOT NULL,
  `round_RoundId` INT(11) NOT NULL,
  `participationDate` DATETIME NOT NULL,
  PRIMARY KEY (`user_userId`, `round_RoundId`),
  INDEX `fk_user_has_round_round1_idx` (`round_RoundId` ASC),
  INDEX `fk_user_has_round_user1_idx` (`user_userId` ASC) ,
  CONSTRAINT `fk_user_has_round_user1`
    FOREIGN KEY (`user_userId`)
    REFERENCES `playground`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_round_round1`
    FOREIGN KEY (`round_RoundId`)
    REFERENCES `playground`.`round` (`RoundId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
