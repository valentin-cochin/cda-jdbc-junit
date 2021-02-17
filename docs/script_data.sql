DROP TABLE IF EXISTS `Subject`;

CREATE TABLE `Subject` (
  `id` INTEGER UNIQUE AUTO_INCREMENT,
  `label` VARCHAR(50) NOT NULL,
  `state` VARCHAR(50) NOT NULL,
  `studyDate` DATE NOT NULL,
  PRIMARY KEY (`id`)
);
ALTER TABLE Subject
ADD CONSTRAINT CHECK_STATE CHECK (state='Vue mais à revoir' OR state='A découvrir' OR state='Compris, à approfondir si possible');


INSERT INTO `Subject` (`id`,`label`,`state`,`studyDate`) VALUES
(1,'Threads','Vue mais à revoir','2020-12-14');

INSERT INTO `Subject` (`id`,`label`,`state`,`studyDate`) VALUES
(2,'Fonctions lambdas','A découvrir','2020-01-05');

INSERT INTO `Subject` (`id`,`label`,`state`,`studyDate`) VALUES
(3,'Tests unitaires','Compris, à approfondir si possible','2020-02-17');

INSERT INTO `Subject` (`id`,`label`,`state`,`studyDate`) VALUES
(4,'JavaFx','Vue mais à revoir','2020-03-07');

INSERT INTO `Subject` (`id`,`label`,`state`,`studyDate`) VALUES
(5,'Spring','A découvrir','2020-03-21');

INSERT INTO `Subject` (`id`,`label`,`state`,`studyDate`) VALUES
(6,'Angular','Compris, à approfondir si possible','2020-04-12');