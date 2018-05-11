-- MySQL dump 10.13  Distrib 5.7.22, for Win64 (x86_64)
--
-- Host: localhost    Database: cmpdb
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `user_roles`
--

drop SCHEMA if EXISTS cmpdb;
CREATE DATABASE cmpdb;
USE cmpdb;

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `uni_username_role` (`role`,`username`),
  KEY `fk_username_idx` (`username`),
  CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (1,'1234','role_admin');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(200) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('1234','$2a$04$xPsK7t0gQ7A3fwO55kU6eeqmEg2EMDwYWwr1s.4Vf.Xhe9VpoZTw6',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `video`
--

DROP TABLE IF EXISTS `video`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `video` (
  `video_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(60) NOT NULL DEFAULT '60',
  `description` varchar(500) NOT NULL,
  `video_url` varchar(500) NOT NULL,
  `photo_url` varchar(500) NOT NULL,
  `rank_number` int(11) NOT NULL,
  `genre` varchar(30) NOT NULL,
  `director` varchar(200) NOT NULL DEFAULT '',
  `production` varchar(200) NOT NULL DEFAULT '',
  `equipment` varchar(200) NOT NULL DEFAULT '',
  PRIMARY KEY (`video_id`),
  UNIQUE KEY `video_id_uindex` (`video_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `video`
--

LOCK TABLES `video` WRITE;
/*!40000 ALTER TABLE `video` DISABLE KEYS */;
INSERT INTO `video` VALUES (14,'Europhonersasssssaaa','Reklamefilm by Film Done Right','https://vimeo.com/98727928','https://i.vimeocdn.com/video/479544158.jpg',96,'commercials','','',''),(15,'Automatic pulling of ribs from pork bellies','DMRI has developed a fully automated robot system capable of performing rib pulling with a process capacity of more than 500 bellies per hour. We plan to find an industrial partner to commercialize the system. ','https://www.youtube.com/watch?v=eqURSZ2y6OI','http://central-media-productions.dk/____impro/1/onewebmedia/DMI.jpg',11,'commercials','','',''),(16,'Seeking the DJ with DJ KROPZ','Morten Jensen was ___ on this 22.','http://iloapp.central-media-productions.dk/video/public/0/142239259827589600_normal.mp4','http://central-media-productions.dk/____impro/1/onewebmedia/DJ2.jpg',110,'music_videos','','',''),(17,'Kim Kim Psychic Spasm - Maj Kjærsig Remix','cinematographer Morten Jensen video edit Kim Richard Adler Mejdahl Offkilter: Sound of The Underground out via SCALA ','https://www.youtube.com/watch?v=OCI3DbfzrNk','http://central-media-productions.dk/____impro/1/onewebmedia/KimkIm.png',3,'music_videos','','',''),(18,'Fri for flemming','Morten Jensen was ___ on this project.','http://www.ekkofilm.dk/media/dyn/film/video/fri-for-flemming_hd.mp4?_=1DKVdh','http://central-media-productions.dk/____impro/1/onewebmedia/FFF.png',10,'short_film','','',''),(19,'Morsss','A Drenna production :: password: magnolia','https://vimeo.com/182969107/password','http://central-media-productions.dk/____impro/1/onewebmedia/13166043_10154157348858609_4122175283290783703_n.jpg',35,'short_film','','',''),(20,'Bøsseskoven','En teaterskuespiller har svært ved at tilfredsstille sin autoritære instruktør med en særligt vanskelig monolog. En pensioneret gymnasielærer begynder at tvivle på sin seksualitet og på sit ægteskab. De søger begge ud i skoven for at finde løsningen på deres problemer.','http://www.ekkofilm.dk/media/dyn/film/video/bosseskoven.mp4?_=1DfEsw','http://www.ekkofilm.dk/media/dyn/film/still/generated/1230_686x386.jpeg',12,'short_film','','',''),(21,'Yepha - Højere Hurtigere Dybere Bredere','Yepha - Højere Hurtigere Dybere Bredere - EPK Jazzhouse','https://www.youtube.com/watch?v=iQUBOBRwmNo','http://central-media-productions.dk/____impro/1/Fotos%20Til%20%22film%20og%20Links%22/jep3.jpg',1,'live','Yepha','EPK Jazzhouse','Mortens Kamera'),(22,'Mads Langer - Vega','Mads langer fra sin sidste af 10 koncerter på Vega 2013/2014','https://www.youtube.com/watch?v=eK9y_7eZBZw','http://central-media-productions.dk/____impro/1/Fotos%20Til%20%22film%20og%20Links%22/Mads.jpg',13,'live','','','');
/*!40000 ALTER TABLE `video` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-11 21:55:00
