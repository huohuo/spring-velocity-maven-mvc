CREATE TABLE `utill`.`usr` (
  `emp_id` INT NOT NULL,
  `user_id` VARCHAR(45) NULL,
  `pass` VARCHAR(45) NULL,
  `role_id` INT NULL,
  `last_login` DATETIME DEFAULT NOW(),
  `prc_date` DATETIME NULL,
  PRIMARY KEY (`emp_id`));

