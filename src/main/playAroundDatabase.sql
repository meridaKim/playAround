-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema playground
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema playground
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `playground` DEFAULT CHARACTER SET utf8 ;
USE `playground` ;

-- -----------------------------------------------------
-- Table `playground`.`music`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `playground`.`music` (
  `musicId` INT(11) NOT NULL,
  `genre` VARCHAR(45) NOT NULL,
  `singerName` VARCHAR(45) NOT NULL,
  `releaseDate` DATETIME NOT NULL,
  `distributor` VARCHAR(45) NULL DEFAULT NULL,
  `countUp` VARCHAR(45) NULL DEFAULT NULL,
  `countDown` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`musicId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `playground`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `playground`.`user` (
  `userId` VARCHAR(17) NOT NULL,
  `userPw` VARCHAR(17) NOT NULL,
  `userAge` INT(11) NOT NULL,
  `userName` VARCHAR(45) NOT NULL,
  `localAgree` INT(11) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE INDEX `userPw_UNIQUE` (`userPw` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


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
