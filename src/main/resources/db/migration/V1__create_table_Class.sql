CREATE TABLE `class` (
  `id`         INT          NOT NULL AUTO_INCREMENT,
  `version`    INT          NOT NULL DEFAULT 0,
  `name`       VARCHAR(45)  NOT NULL,
  `section`    VARCHAR(45)  NOT NULL,
  `capacity`   INT          NOT NULL,
  `created`    DATETIME     NOT NULL DEFAULT now(),
  `modified`   DATETIME     NOT NULL DEFAULT now(),
  PRIMARY KEY (`id`));