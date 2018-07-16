CREATE TABLE `class_students` (
  `id`         INT          NOT NULL AUTO_INCREMENT,
  `version`    INT          NOT NULL DEFAULT 0,
  `class_id`   INT          NOT NULL,
  `student_id` INT          NOT NULL,
  `created`    DATETIME     NOT NULL DEFAULT now(),
  `modified`   DATETIME     NOT NULL DEFAULT now(),
  CONSTRAINT class_id_fk FOREIGN KEY(class_id) REFERENCES class(id),
  CONSTRAINT student_id_fk FOREIGN KEY(student_id) REFERENCES students(id),
  PRIMARY KEY (`id`));
