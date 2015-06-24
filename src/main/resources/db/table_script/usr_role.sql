CREATE TABLE `utill`.`usr_role` (
  `role_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(45) NULL,
  `description` VARCHAR(200) NULL COMMENT 'description for the user role.',
  PRIMARY KEY (`role_id`),
  UNIQUE INDEX `role_id_UNIQUE` (`role_id` ASC));
