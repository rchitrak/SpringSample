CREATE TABLE `students` (
  `id`         INT          NOT NULL AUTO_INCREMENT,
  `version`    INT          NOT NULL DEFAULT 0,
  `name`       VARCHAR(45)  NOT NULL,
  `age`        INT          NOT NULL,
  `gender`     varchar(10)  NOT NULL,
  `created`    DATETIME     NOT NULL DEFAULT now(),
  `modified`   DATETIME     NOT NULL DEFAULT now(),
  PRIMARY KEY (`id`));