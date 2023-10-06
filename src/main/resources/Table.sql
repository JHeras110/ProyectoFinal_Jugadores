CREATE TABLE `laliga`.`jugadores` (
  `idjugadores` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `idequipo` INT NULL,
  `nacionalidad` VARCHAR(45) NULL,
  `goles` INT NULL,
  PRIMARY KEY (`idjugadores`));
