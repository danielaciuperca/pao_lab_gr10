create database pao_lab11;
use pao_lab11;

CREATE TABLE `pao_lab11`.`diplomas` (
`id` INT NOT NULL AUTO_INCREMENT,
`series` VARCHAR(45) NOT NULL,
`graduate` VARCHAR(100) NOT NULL,
`year` INT NOT NULL,
`faculty` VARCHAR(100) NOT NULL,
`specialization` VARCHAR(45) NOT NULL,
`grade` DOUBLE NOT NULL,
PRIMARY KEY (`id`));