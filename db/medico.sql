-- MySQL dump 10.13  Distrib 8.0.33, for Linux (x86_64)
--
-- Host: localhost    Database: clinica
-- ------------------------------------------------------
-- Server version	8.0.33-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `crm` varchar(20) NOT NULL,
  `especialidade` varchar(20) NOT NULL,
  `contato` varchar(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `data_nascimento` date NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `uf` varchar(2) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `bairro` varchar(15) NOT NULL,
  `rua` varchar(15) NOT NULL,
  `numero` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `senha` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (1,'jo','Cardiologista','(81) 99999-9999','Carlos Henrique de Santana Soares','1111-12-22','111.111.111-11','Masculino','BA','11-111-111','Abaíra','trgeg','gwgre',2,'henrique@hotmail.com','123'),(12,'hggfjhj','Cardiologista','(81) 99999-9999','Paulo','1111-12-22','777.777.777-77','Masculino','AM','99-999-999','Alvarães','ghdghg','gfhdghgh',6,'paulo@hotmail.com','123'),(18,'dfgfdssffhh','Cardiologista','(81) 90921-2222','João Paulo','2021-09-19','444.444.444-44','Masculino','AM','55-555-555','Alvarães','fsfdhsfdh','fgshgfhgh',4,'joao@hotmail.com','123'),(20,'cbvcnvcnxvncn','Infectologista','(88) 88888-8888','ggfshsgjfgj','2010-12-30','222.222.222-22','Masculino','AP','22-222-222','Amapá','ffdhsdfhdsfh','hghsfhgh',7,'fdsgfdhfdshfh','1234');
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-18 18:40:29
