-- MySQL dump 10.13  Distrib 5.5.43, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: senadores
-- ------------------------------------------------------
-- Server version	5.5.43-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `TABLE 8`
--

DROP TABLE IF EXISTS `TABLE 8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TABLE 8` (
  `APELLIDOS` varchar(22) DEFAULT NULL,
  `NOMBRES` varchar(22) DEFAULT NULL,
  `EMAIL_PARLAMENTARIO` varchar(29) DEFAULT NULL,
  `TELEFONO_PARLAMENTARIO` varchar(8) DEFAULT NULL,
  `WEB_PARLAMENTARIO` varchar(10) DEFAULT NULL,
  `CAMARA` varchar(1) DEFAULT NULL,
  `DEPARTAMENTO` varchar(10) DEFAULT NULL,
  `PARTIDO_POLITICO` varchar(7) DEFAULT NULL,
  `PERIODO_LEGISLATIVO` varchar(9) DEFAULT NULL,
  `TIPO_PARLAMENTARIO` varchar(7) DEFAULT NULL,
  `BANCADA` varchar(68) DEFAULT NULL,
  `CARGO_BANCADA` varchar(10) DEFAULT NULL,
  `ID_PARLAMENTARIO` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TABLE 8`
--

LOCK TABLES `TABLE 8` WRITE;
/*!40000 ALTER TABLE `TABLE 8` DISABLE KEYS */;
INSERT INTO `TABLE 8` VALUES ('Masi Jara','Desirée Graciela','dmasi@senado.gov.py','414-5039','','S','','P.D.P.','2013-2018','TITULAR','Partido Demócrata Progresista (PDP)','LIDER',100076),('Alfonso González','Gustavo Javier','galfonso@senado.gov.py','414-5238','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"C\"','LIDER',100055),('Castiglioni Soria','Luis Alberto','luiscastiglioni@senado.gov.py','414-5209','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','LIDER',100045),('Silva Facetti','Fernando Alberto','fsilva@senado.gov.py','414-5137','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','LIDER',100087),('Oviedo Matto','Jorge Antonio','joviedo@senado.gov.py','414-5205','','S','','P.UNACE','2013-2018','TITULAR','Partido Union Nacional de Ciudadanos Eticos (UNACE)','LIDER',100062),('López Perito','Miguel Ángel Ignacio','mlopezperito@senado.gov.py','414-5131','','S','','AP','2013-2018','TITULAR','Avanza País (AP)','LIDER',100084),('Richer Florentín','Oscar Hugo','oricher@senado.gov.py','414-5034','','S','','FG','2013-2018','TITULAR','Frente Guasú (FG)','LIDER',100101),('Petta San Martín','Eduardo Romalino','epetta@senado.gov.py','414-5216','','S','','PEN','2013-2018','TITULAR','Partido Encuentro Nacional (PEN)','LIDER',100074),('Giuzzio Benítez','Arnaldo Euclides','agiuzzio@senado.gov.py','414-5042','','S','','P.D.P.','2013-2018','TITULAR','Partido Demócrata Progresista (PDP)','VICE-LIDER',100053),('Osorio Nunes','Derlis Ariel Alejandro','dosorio@senado.gov.py','414-5284','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"C\"','VICE-LIDER',100077),('Monges Espínola','Juan Darío','jmonges@senado.gov.py','414-5285','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"B\"','VICE-LIDER',100086),('Mignarro de González','María Blanca Lila','blmignarro@senado.gov.py','414-5135','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','VICE-LIDER',100096),('Bóbeda Melgarejo','José Manuel','jbobeda@senado.gov.py','414-5206','','S','','P.UNACE','2013-2018','TITULAR','Partido Union Nacional de Ciudadanos Eticos (UNACE)','VICE-LIDER',100104),('Ferreiro Sanabria','Adolfo Marcelino','aferreiro@senado.gov.py','414-5121','','S','','AP','2013-2018','TITULAR','Avanza País (AP)','VICE-LIDER',100058),('Martínez de Portillo','Esperanza','emartinezl@senado.gov.py','414-5213','','S','','FG','2013-2018','TITULAR','Frente Guasú (FG)','VICE-LIDER',100082),('Núñez Agüero','Carlos','cnunez@senado.gov.py','414-5283','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"C\"','MIEMBRO',100103),('Aguinagalde Gallinar','Nelson Darío','naguinagalde@senado.gov.py','414-5249','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"C\"','MIEMBRO',100100),('Velázquez Tillería','Julio César','jcvelazquez@senado.gov.py','414-5286','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100051),('Quiñónez Daiub','Julio Antonio','jquinonez@senado.gov.py','414-5287','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100063),('Bogado González','Víctor Alcides','vbogado@senado.gov.py','414-5214','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100094),('Salomón Fernández','Oscar Rubén','osalomon@senado.gov.py','414-5204','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100085),('Abdo Benítez','Mario','mabdo@senado.gov.py','414-5282','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100081),('Ovelar de Duarte','Blanca Margarita','bovelar@senado.gov.py','414-5280','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100079),('Galaverna Delvalle','Juan Carlos Román','jgalaverna@senado.gov.py','414-5207','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100073),('Ovelar Benítez','Silvio Adalberto','sovelar@senado.gov.py','414-5217','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100061),('Bacchetta Chiriani','Enrique Fausto','ebachetta@senado.gov.py','414-5288','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','MIEMBRO',100059),('González Daher','Oscar Alberto','gdaher@senado.gov.py','414-5215','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"B\"','MIEMBRO',100054),('Gusinky','Mirta Leonor','mgusinky@senado.gov.py','414-5220','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"B\"','MIEMBRO',100049),('Samaniego González','Lilian Graciela','lsamaniego@senado.gov.py','414-5279','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"B\"','MIEMBRO',100043),('Franco Gómez','Julio César Ramón','jcfranco@senado.gov.py','414-5120','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100064),('Cardozo Jiménez','Enzo','ecardozo@senado.gov.py','414-5147','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100060),('Saguier Carmona','Miguel Abdón','msaguier@senado.gov.py','414-5125','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100083),('Acevedo Quevedo','Roberto Ramón','racevedo@senado.gov.py','414-5138','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100105),('Fonseca Legal','Blanca Beatríz','bfonseca@senado.gov.py','414-5156','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100080),('Wagner Lezcano','Luis Alberto Cayetano','wagner@senado.gov.py','414-5105','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100075),('Gómez Cáceres','Zulma Ramona','zrgomez@senado.gov.py','414-5115','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100057),('Amarilla Cañete','Carlos Alberto','camarilla@senado.gov.py','414-5119','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100052),('Gómez Verlangieri','Ramón','rgverlangieri@senado.gov.py','414-5134','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100050),('Llano Ramos','Blas Antonio','bllano@senado.gov.py','414-5108','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','MIEMBRO',100044),('Pereira Galeano','Sixto','spereira@senado.gov.py','414-5030','','S','','FG','2013-2018','TITULAR','Frente Guasú (FG)','MIEMBRO',100065),('Filizzola Pallarés','Carlos Alberto','cfilizzola@senado.gov.py','414-5210','','S','','FG','2013-2018','TITULAR','Frente Guasú (FG)','MIEMBRO',100056),('Lugo Méndez','Fernando Armindo','flugo@senado.gov.py','414-5202','','S','','FG','2013-2018','TITULAR','Frente Guasú (FG)','MIEMBRO',100048),('Santa Cruz Insaurralde','Pedro Arthuro','psantacruz@senado.gov.py','414-5040','','S','','P.D.P.','2013-2018','TITULAR','Partido Demócrata Progresista (PDP)','SECRETARIO',100098),('Wiens Durksen','Arnoldo','awiens@senado.gov.py','414-5211','','S','','A.N.R.','2013-2018','TITULAR','Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"','SECRETARIO',100047),('Alfaro de Franco','Emilia Patricia','ealfaro@senado.gov.py','414-5146','','S','','P.L.R.A','2013-2018','TITULAR','Partido Liberal Radical Autentico (PLRA)','SECRETARIO',100046);
/*!40000 ALTER TABLE `TABLE 8` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bancadas`
--

DROP TABLE IF EXISTS `bancadas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bancadas` (
  `bancada_id` int(11) NOT NULL AUTO_INCREMENT,
  `bancada_descripcion` varchar(250) DEFAULT NULL,
  `partido_id` int(11) NOT NULL,
  PRIMARY KEY (`bancada_id`),
  KEY `fk_bancadas_partidos1_idx` (`partido_id`),
  CONSTRAINT `fk_bancadas_partidos1` FOREIGN KEY (`partido_id`) REFERENCES `partidos` (`partido_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bancadas`
--

LOCK TABLES `bancadas` WRITE;
/*!40000 ALTER TABLE `bancadas` DISABLE KEYS */;
INSERT INTO `bancadas` VALUES (1,'Partido Demócrata Progresista (PDP)',1),(2,'Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"C\"',2),(3,'Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"A\"',2),(4,'Partido Liberal Radical Autentico (PLRA)',3),(5,'Partido Union Nacional de Ciudadanos Eticos (UNACE)',4),(6,'Avanza País (AP)',5),(7,'Frente Guasú (FG)',6),(8,'Partido Encuentro Nacional (PEN)',7),(9,'Asociación Nacional Republicana Partido Colorado (ANR) - Bloque \"B\"',2);
/*!40000 ALTER TABLE `bancadas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `participaciones`
--

DROP TABLE IF EXISTS `participaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participaciones` (
  `participaciones_id` int(11) NOT NULL,
  `sesion_id` int(11) NOT NULL,
  `senador_id` int(11) NOT NULL,
  `participacion_descripcion` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`participaciones_id`),
  KEY `fk_participaciones_presencias1_idx` (`sesion_id`,`senador_id`),
  CONSTRAINT `fk_participaciones_presencias1` FOREIGN KEY (`sesion_id`, `senador_id`) REFERENCES `presencias` (`sesion_id`, `senador_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `participaciones`
--

LOCK TABLES `participaciones` WRITE;
/*!40000 ALTER TABLE `participaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `participaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partidos`
--

DROP TABLE IF EXISTS `partidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partidos` (
  `partido_id` int(11) NOT NULL AUTO_INCREMENT,
  `partido_iniciales` varchar(45) DEFAULT NULL,
  `partido_descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`partido_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partidos`
--

LOCK TABLES `partidos` WRITE;
/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
INSERT INTO `partidos` VALUES (1,NULL,'P.D.P.'),(2,NULL,'A.N.R.'),(3,NULL,'P.L.R.A'),(4,NULL,'P.UNACE'),(5,NULL,'AP'),(6,NULL,'FG'),(7,NULL,'PEN');
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `periodos`
--

DROP TABLE IF EXISTS `periodos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `periodos` (
  `periodo_id` int(11) NOT NULL AUTO_INCREMENT,
  `periodo_inicio` int(4) DEFAULT NULL,
  `periodo_fin` int(4) DEFAULT NULL,
  PRIMARY KEY (`periodo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodos`
--

LOCK TABLES `periodos` WRITE;
/*!40000 ALTER TABLE `periodos` DISABLE KEYS */;
INSERT INTO `periodos` VALUES (1,2013,2018);
/*!40000 ALTER TABLE `periodos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `presencias`
--

DROP TABLE IF EXISTS `presencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `presencias` (
  `senador_id` int(11) NOT NULL,
  `sesion_id` int(11) NOT NULL,
  `hasta_final` enum('si','no') DEFAULT NULL,
  PRIMARY KEY (`sesion_id`,`senador_id`),
  KEY `fk_presencias_senadores1_idx` (`senador_id`),
  KEY `fk_presencias_sesiones1_idx` (`sesion_id`),
  CONSTRAINT `fk_presencias_senadores1` FOREIGN KEY (`senador_id`) REFERENCES `senadores` (`senador_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_presencias_sesiones1` FOREIGN KEY (`sesion_id`) REFERENCES `sesiones` (`sesion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presencias`
--

LOCK TABLES `presencias` WRITE;
/*!40000 ALTER TABLE `presencias` DISABLE KEYS */;
/*!40000 ALTER TABLE `presencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `senadores`
--

DROP TABLE IF EXISTS `senadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `senadores` (
  `senador_id` int(11) NOT NULL AUTO_INCREMENT,
  `senador_nombre` varchar(45) DEFAULT NULL,
  `senador_apellido` varchar(45) DEFAULT NULL,
  `senador_codigo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`senador_id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `senadores`
--

LOCK TABLES `senadores` WRITE;
/*!40000 ALTER TABLE `senadores` DISABLE KEYS */;
INSERT INTO `senadores` VALUES (1,'Desirée Graciela','Masi Jara','100076'),(2,'Gustavo Javier','Alfonso González','100055'),(3,'Luis Alberto','Castiglioni Soria','100045'),(4,'Fernando Alberto','Silva Facetti','100087'),(5,'Jorge Antonio','Oviedo Matto','100062'),(6,'Miguel Ángel Ignacio','López Perito','100084'),(7,'Oscar Hugo','Richer Florentín','100101'),(8,'Eduardo Romalino','Petta San Martín','100074'),(9,'Arnaldo Euclides','Giuzzio Benítez','100053'),(10,'Derlis Ariel Alejandro','Osorio Nunes','100077'),(11,'Juan Darío','Monges Espínola','100086'),(12,'María Blanca Lila','Mignarro de González','100096'),(13,'José Manuel','Bóbeda Melgarejo','100104'),(14,'Adolfo Marcelino','Ferreiro Sanabria','100058'),(15,'Esperanza','Martínez de Portillo','100082'),(16,'Carlos','Núñez Agüero','100103'),(17,'Nelson Darío','Aguinagalde Gallinar','100100'),(18,'Julio César','Velázquez Tillería','100051'),(19,'Julio Antonio','Quiñónez Daiub','100063'),(20,'Víctor Alcides','Bogado González','100094'),(21,'Oscar Rubén','Salomón Fernández','100085'),(22,'Mario','Abdo Benítez','100081'),(23,'Blanca Margarita','Ovelar de Duarte','100079'),(24,'Juan Carlos Román','Galaverna Delvalle','100073'),(25,'Silvio Adalberto','Ovelar Benítez','100061'),(26,'Enrique Fausto','Bacchetta Chiriani','100059'),(27,'Oscar Alberto','González Daher','100054'),(28,'Mirta Leonor','Gusinky','100049'),(29,'Lilian Graciela','Samaniego González','100043'),(30,'Julio César Ramón','Franco Gómez','100064'),(31,'Enzo','Cardozo Jiménez','100060'),(32,'Miguel Abdón','Saguier Carmona','100083'),(33,'Roberto Ramón','Acevedo Quevedo','100105'),(34,'Blanca Beatríz','Fonseca Legal','100080'),(35,'Luis Alberto Cayetano','Wagner Lezcano','100075'),(36,'Zulma Ramona','Gómez Cáceres','100057'),(37,'Carlos Alberto','Amarilla Cañete','100052'),(38,'Ramón','Gómez Verlangieri','100050'),(39,'Blas Antonio','Llano Ramos','100044'),(40,'Sixto','Pereira Galeano','100065'),(41,'Carlos Alberto','Filizzola Pallarés','100056'),(42,'Fernando Armindo','Lugo Méndez','100048'),(43,'Pedro Arthuro','Santa Cruz Insaurralde','100098'),(44,'Arnoldo','Wiens Durksen','100047'),(45,'Emilia Patricia','Alfaro de Franco','100046');
/*!40000 ALTER TABLE `senadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `senadores_periodos`
--

DROP TABLE IF EXISTS `senadores_periodos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `senadores_periodos` (
  `senador_id` int(11) NOT NULL,
  `periodo_id` int(11) NOT NULL,
  `bancada_id` int(11) NOT NULL,
  PRIMARY KEY (`senador_id`,`periodo_id`),
  KEY `fk_senadores_has_periodos_periodos1_idx` (`periodo_id`),
  KEY `fk_senadores_has_periodos_senadores_idx` (`senador_id`),
  KEY `fk_senadores_periodos_bancadas1_idx` (`bancada_id`),
  CONSTRAINT `fk_senadores_has_periodos_senadores` FOREIGN KEY (`senador_id`) REFERENCES `senadores` (`senador_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_senadores_has_periodos_periodos1` FOREIGN KEY (`periodo_id`) REFERENCES `periodos` (`periodo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_senadores_periodos_bancadas1` FOREIGN KEY (`bancada_id`) REFERENCES `bancadas` (`bancada_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `senadores_periodos`
--

LOCK TABLES `senadores_periodos` WRITE;
/*!40000 ALTER TABLE `senadores_periodos` DISABLE KEYS */;
INSERT INTO `senadores_periodos` VALUES (1,1,1),(9,1,1),(43,1,1),(2,1,2),(10,1,2),(16,1,2),(17,1,2),(3,1,3),(18,1,3),(19,1,3),(20,1,3),(21,1,3),(22,1,3),(23,1,3),(24,1,3),(25,1,3),(26,1,3),(44,1,3),(4,1,4),(12,1,4),(30,1,4),(31,1,4),(32,1,4),(33,1,4),(34,1,4),(35,1,4),(36,1,4),(37,1,4),(38,1,4),(39,1,4),(45,1,4),(5,1,5),(13,1,5),(6,1,6),(14,1,6),(7,1,7),(15,1,7),(40,1,7),(41,1,7),(42,1,7),(8,1,8),(11,1,9),(27,1,9),(28,1,9),(29,1,9);
/*!40000 ALTER TABLE `senadores_periodos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sesiones`
--

DROP TABLE IF EXISTS `sesiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sesiones` (
  `sesion_id` int(11) NOT NULL AUTO_INCREMENT,
  `sesion_fecha` date DEFAULT NULL,
  `periodo_id` int(11) NOT NULL,
  PRIMARY KEY (`sesion_id`),
  KEY `fk_sesiones_periodos1_idx` (`periodo_id`),
  CONSTRAINT `fk_sesiones_periodos1` FOREIGN KEY (`periodo_id`) REFERENCES `periodos` (`periodo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sesiones`
--

LOCK TABLES `sesiones` WRITE;
/*!40000 ALTER TABLE `sesiones` DISABLE KEYS */;
/*!40000 ALTER TABLE `sesiones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-10 15:20:42
