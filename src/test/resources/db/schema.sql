-- MySQL dump 10.13  Distrib 5.6.10, for osx10.8 (x86_64)
--
-- Host: localhost    Database: filmbot_20_development
-- ------------------------------------------------------
-- Server version	5.6.10

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
-- Table structure for table `auth_group`
--

DROP TABLE IF EXISTS `auth_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `auth_group_permissions`
--

DROP TABLE IF EXISTS `auth_group_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_group_permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `group_id` (`group_id`,`permission_id`),
  KEY `auth_group_permissions_bda51c3c` (`group_id`),
  KEY `auth_group_permissions_1e014c8f` (`permission_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `auth_permission`
--

DROP TABLE IF EXISTS `auth_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `content_type_id` int(11) NOT NULL,
  `codename` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `content_type_id` (`content_type_id`,`codename`),
  KEY `auth_permission_e4470c6e` (`content_type_id`)
) ENGINE=MyISAM AUTO_INCREMENT=178 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `auth_user`
--

DROP TABLE IF EXISTS `auth_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(75) NOT NULL,
  `password` varchar(128) NOT NULL,
  `is_staff` tinyint(1) NOT NULL,
  `is_active` tinyint(1) NOT NULL,
  `is_superuser` tinyint(1) NOT NULL,
  `last_login` datetime NOT NULL,
  `date_joined` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `auth_user_groups`
--

DROP TABLE IF EXISTS `auth_user_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_user_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id` (`user_id`,`group_id`),
  KEY `auth_user_groups_fbfc09f1` (`user_id`),
  KEY `auth_user_groups_bda51c3c` (`group_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `auth_user_user_permissions`
--

DROP TABLE IF EXISTS `auth_user_user_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auth_user_user_permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id` (`user_id`,`permission_id`),
  KEY `auth_user_user_permissions_fbfc09f1` (`user_id`),
  KEY `auth_user_user_permissions_1e014c8f` (`permission_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `beta_user`
--

DROP TABLE IF EXISTS `beta_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `beta_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `beta_user_211d6733` (`password_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bot_body`
--

DROP TABLE IF EXISTS `bot_body`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bot_body` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `build_image` varchar(2000) NOT NULL,
  `extra_large_image` varchar(2000) NOT NULL,
  `large_image` varchar(2000) NOT NULL,
  `small_image` varchar(2000) NOT NULL,
  `definition_id` int(11) DEFAULT NULL,
  `variant` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bot_body_1d304ded` (`definition_id`),
  CONSTRAINT `definition_id_refs_id_2bc3ecd4f4197bdc` FOREIGN KEY (`definition_id`) REFERENCES `bot_botdefinition` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bot_bot`
--

DROP TABLE IF EXISTS `bot_bot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bot_bot` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `head_id` int(11) DEFAULT NULL,
  `left_arm_id` int(11) DEFAULT NULL,
  `right_arm_id` int(11) DEFAULT NULL,
  `body_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bot_bot_aec3f24e` (`head_id`),
  KEY `bot_bot_a37a3a0` (`left_arm_id`),
  KEY `bot_bot_d4565774` (`right_arm_id`),
  KEY `bot_bot_5b892844` (`body_id`),
  CONSTRAINT `body_id_refs_id_21433373ff80b695` FOREIGN KEY (`body_id`) REFERENCES `bot_body` (`id`),
  CONSTRAINT `head_id_refs_id_2b89454ef3fa7331` FOREIGN KEY (`head_id`) REFERENCES `bot_head` (`id`),
  CONSTRAINT `left_arm_id_refs_id_6ebecfe34b60da9` FOREIGN KEY (`left_arm_id`) REFERENCES `bot_leftarm` (`id`),
  CONSTRAINT `right_arm_id_refs_id_5931790f6386819d` FOREIGN KEY (`right_arm_id`) REFERENCES `bot_rightarm` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bot_botdefinition`
--

DROP TABLE IF EXISTS `bot_botdefinition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bot_botdefinition` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bot_head`
--

DROP TABLE IF EXISTS `bot_head`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bot_head` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `build_image` varchar(2000) NOT NULL,
  `extra_large_image` varchar(2000) NOT NULL,
  `large_image` varchar(2000) NOT NULL,
  `small_image` varchar(2000) NOT NULL,
  `definition_id` int(11) DEFAULT NULL,
  `variant` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bot_head_1d304ded` (`definition_id`),
  CONSTRAINT `definition_id_refs_id_2695eb9fdf0b126e` FOREIGN KEY (`definition_id`) REFERENCES `bot_botdefinition` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bot_leftarm`
--

DROP TABLE IF EXISTS `bot_leftarm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bot_leftarm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `build_image` varchar(2000) NOT NULL,
  `extra_large_image` varchar(2000) NOT NULL,
  `large_image` varchar(2000) NOT NULL,
  `small_image` varchar(2000) NOT NULL,
  `definition_id` int(11) DEFAULT NULL,
  `variant` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bot_leftarm_1d304ded` (`definition_id`),
  CONSTRAINT `definition_id_refs_id_7d549705a67561e0` FOREIGN KEY (`definition_id`) REFERENCES `bot_botdefinition` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bot_rightarm`
--

DROP TABLE IF EXISTS `bot_rightarm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bot_rightarm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `build_image` varchar(2000) NOT NULL,
  `extra_large_image` varchar(2000) NOT NULL,
  `large_image` varchar(2000) NOT NULL,
  `small_image` varchar(2000) NOT NULL,
  `definition_id` int(11) DEFAULT NULL,
  `variant` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bot_rightarm_1d304ded` (`definition_id`),
  CONSTRAINT `definition_id_refs_id_37cf0af89c8561c` FOREIGN KEY (`definition_id`) REFERENCES `bot_botdefinition` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `core_deliverytype`
--

DROP TABLE IF EXISTS `core_deliverytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `core_deliverytype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `core_password`
--

DROP TABLE IF EXISTS `core_password`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `core_password` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(2000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `django_admin_log`
--

DROP TABLE IF EXISTS `django_admin_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_admin_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `action_time` datetime NOT NULL,
  `user_id` int(11) NOT NULL,
  `content_type_id` int(11) DEFAULT NULL,
  `object_id` longtext,
  `object_repr` varchar(200) NOT NULL,
  `action_flag` smallint(5) unsigned NOT NULL,
  `change_message` longtext NOT NULL,
  PRIMARY KEY (`id`),
  KEY `django_admin_log_fbfc09f1` (`user_id`),
  KEY `django_admin_log_e4470c6e` (`content_type_id`)
) ENGINE=MyISAM AUTO_INCREMENT=485 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `django_content_type`
--

DROP TABLE IF EXISTS `django_content_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_content_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `app_label` varchar(100) NOT NULL,
  `model` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `app_label` (`app_label`,`model`)
) ENGINE=MyISAM AUTO_INCREMENT=60 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `django_session`
--

DROP TABLE IF EXISTS `django_session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_session` (
  `session_key` varchar(40) NOT NULL,
  `session_data` longtext NOT NULL,
  `expire_date` datetime NOT NULL,
  PRIMARY KEY (`session_key`),
  KEY `django_session_c25c2c28` (`expire_date`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `django_site`
--

DROP TABLE IF EXISTS `django_site`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `django_site` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `domain` varchar(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_approvalstatus`
--

DROP TABLE IF EXISTS `film_approvalstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_approvalstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_feature`
--

DROP TABLE IF EXISTS `film_feature`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_feature` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` varchar(2000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_film`
--

DROP TABLE IF EXISTS `film_film`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_film` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `posterImage` varchar(2000) NOT NULL,
  `releaseStatus_id` int(11) DEFAULT NULL,
  `approvalStatus_id` int(11) DEFAULT NULL,
  `scrapeName` varchar(200) NOT NULL,
  `releaseDate` datetime DEFAULT NULL,
  `filmStatistic_id` int(11) DEFAULT NULL,
  `quick_access_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `film_film_3a698df8` (`releaseStatus_id`),
  KEY `film_film_328298d3` (`approvalStatus_id`),
  KEY `film_film_f1ee1f9b` (`filmStatistic_id`),
  KEY `film_film_2a9fe13e` (`quick_access_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2744 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_film_filmtypes`
--

DROP TABLE IF EXISTS `film_film_filmtypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_film_filmtypes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `film_id` int(11) NOT NULL,
  `filmtype_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `film_film_filmTypes_film_id_26f60c1467cf6e56_uniq` (`film_id`,`filmtype_id`),
  KEY `film_film_filmTypes_65dfe046` (`film_id`),
  KEY `film_film_filmTypes_4624895a` (`filmtype_id`)
) ENGINE=MyISAM AUTO_INCREMENT=456 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_film_genres`
--

DROP TABLE IF EXISTS `film_film_genres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_film_genres` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `film_id` int(11) NOT NULL,
  `genre_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `film_film_genres_film_id_1d8494396714244e_uniq` (`film_id`,`genre_id`),
  KEY `film_film_genres_65dfe046` (`film_id`),
  KEY `film_film_genres_f8d711d0` (`genre_id`)
) ENGINE=MyISAM AUTO_INCREMENT=558 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_filmdetailed`
--

DROP TABLE IF EXISTS `film_filmdetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_filmdetailed` (
  `film_ptr_id` int(11) NOT NULL,
  `runningTime` int(11) DEFAULT NULL,
  `synopsis` varchar(6000) DEFAULT NULL,
  `feature_id` int(11) DEFAULT NULL,
  `legacyFilm_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`film_ptr_id`),
  KEY `film_filmdetailed_7be9b9ad` (`feature_id`),
  KEY `film_filmdetailed_f932e43b` (`legacyFilm_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_filmdisplay`
--

DROP TABLE IF EXISTS `film_filmdisplay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_filmdisplay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `absoluteIndex` int(11) NOT NULL,
  `hide` tinyint(1) NOT NULL,
  `film_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `film_filmdisplay_film_id_aeabcf613d2c145_uniq` (`film_id`),
  KEY `film_filmdisplay_65dfe046` (`film_id`),
  CONSTRAINT `film_id_refs_id_73b0f4e214439c52` FOREIGN KEY (`film_id`) REFERENCES `film_film` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2201 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_filmtype`
--

DROP TABLE IF EXISTS `film_filmtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_filmtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_genre`
--

DROP TABLE IF EXISTS `film_genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_genre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_quickaccess`
--

DROP TABLE IF EXISTS `film_quickaccess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_quickaccess` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `show_times_today` tinyint(1) NOT NULL,
  `show_times_tomorrow` tinyint(1) NOT NULL,
  `show_times_next_day` tinyint(1) NOT NULL,
  `show_times_next_next_day` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `film_releasestatus`
--

DROP TABLE IF EXISTS `film_releasestatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `film_releasestatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `legacy_legacycinema`
--

DROP TABLE IF EXISTS `legacy_legacycinema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `legacy_legacycinema` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `city_id` int(11) NOT NULL,
  `address` varchar(200) NOT NULL,
  `map_coords` varchar(200) NOT NULL,
  `google_maps_link` varchar(600) NOT NULL,
  `ticketing_data` longtext NOT NULL,
  `ticket_url` varchar(600) NOT NULL,
  `dot_coords` varchar(200) NOT NULL,
  `label_coords` varchar(200) NOT NULL,
  `priority` int(11) NOT NULL,
  `google_url` varchar(600) NOT NULL,
  `ticketing_organisation` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `legacy_legacyfilm`
--

DROP TABLE IF EXISTS `legacy_legacyfilm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `legacy_legacyfilm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `running_time` int(11) NOT NULL,
  `synopsis` longtext NOT NULL,
  `poster` varchar(600) NOT NULL,
  `trailer_embed_data` varchar(600) NOT NULL,
  `is_available` tinyint(1) NOT NULL,
  `rotten_tomato_rating` double NOT NULL,
  `rotten_tomato_link` varchar(600) NOT NULL,
  `rotten_tomato_symbol` int(11) NOT NULL,
  `nyt_critics_pick` tinyint(1) NOT NULL,
  `is_approved` tinyint(1) NOT NULL,
  `imdb_link` varchar(600) NOT NULL,
  `scrape_name` varchar(200) NOT NULL,
  `parent_id` int(11) NOT NULL,
  `feature` tinyint(1) NOT NULL,
  `nytimes_review_link` varchar(600) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1471 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `legacy_legacyshowtime`
--

DROP TABLE IF EXISTS `legacy_legacyshowtime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `legacy_legacyshowtime` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cinema_id` int(11) NOT NULL,
  `film_id` int(11) NOT NULL,
  `showtime` datetime NOT NULL,
  `ticket_url` varchar(600) NOT NULL,
  `authority` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1531669 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `location_city`
--

DROP TABLE IF EXISTS `location_city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `state_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `location_city_b9608dc2` (`state_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `location_mapinfo`
--

DROP TABLE IF EXISTS `location_mapinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location_mapinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `coordinates` varchar(200) NOT NULL,
  `dotCoordinates` varchar(200) NOT NULL,
  `labelCoordinates` varchar(200) NOT NULL,
  `googleMapsLink` varchar(600) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `location_neighbourhood`
--

DROP TABLE IF EXISTS `location_neighbourhood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location_neighbourhood` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `city_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `location_neighbourhood_586a73b5` (`city_id`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `location_state`
--

DROP TABLE IF EXISTS `location_state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location_state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `movie_moviescore`
--

DROP TABLE IF EXISTS `movie_moviescore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_moviescore` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` int(11) NOT NULL,
  `comments` varchar(400) DEFAULT NULL,
  `film_id` int(11) NOT NULL,
  `film_bot_user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `movie_moviescore_65dfe046` (`film_id`),
  KEY `movie_moviescore_d18ae35` (`film_bot_user_id`),
  CONSTRAINT `film_bot_user_id_refs_user_ptr_id_61e2d13c71dba2f3` FOREIGN KEY (`film_bot_user_id`) REFERENCES `profile_filmbotuser` (`user_ptr_id`),
  CONSTRAINT `film_id_refs_id_51e3530355fd9c0` FOREIGN KEY (`film_id`) REFERENCES `film_film` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `operation`
--

DROP TABLE IF EXISTS `operation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `is_running` tinyint(1) DEFAULT NULL,
  `started_at` datetime DEFAULT NULL,
  `ended_at` datetime DEFAULT NULL,
  `results` text,
  `successful` tinyint(1) DEFAULT '1',
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `task` (`task`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profile_filmbotuser`
--

DROP TABLE IF EXISTS `profile_filmbotuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_filmbotuser` (
  `user_ptr_id` int(11) NOT NULL,
  `bot_id` int(11) DEFAULT NULL,
  `user_check_points_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_ptr_id`),
  KEY `profile_filmbotuser_6e32b4b0` (`bot_id`),
  KEY `profile_filmbotuser_82dbe351` (`user_check_points_id`),
  CONSTRAINT `user_check_points_id_refs_id_37abcc338f7c177b` FOREIGN KEY (`user_check_points_id`) REFERENCES `profile_usercheckpoints` (`id`),
  CONSTRAINT `bot_id_refs_id_7ec90eb22f26faac` FOREIGN KEY (`bot_id`) REFERENCES `bot_bot` (`id`),
  CONSTRAINT `user_ptr_id_refs_id_6b700d231d8f3907` FOREIGN KEY (`user_ptr_id`) REFERENCES `auth_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profile_friendship`
--

DROP TABLE IF EXISTS `profile_friendship`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_friendship` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `giver_id` int(11) NOT NULL,
  `receiver_id` int(11) NOT NULL,
  `receiver_email` varchar(400) NOT NULL,
  `receiver_full_name` varchar(400) NOT NULL,
  `status_id` int(11) NOT NULL,
  `sent_at` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `profile_friendship_81588a32` (`giver_id`),
  KEY `profile_friendship_6828e8a9` (`receiver_id`),
  KEY `profile_friendship_44224078` (`status_id`),
  CONSTRAINT `status_id_refs_id_2fc8e42807c7dc9b` FOREIGN KEY (`status_id`) REFERENCES `profile_friendshipstatus` (`id`),
  CONSTRAINT `giver_id_refs_user_ptr_id_2ff8ddc66edb5dae` FOREIGN KEY (`giver_id`) REFERENCES `profile_filmbotuser` (`user_ptr_id`),
  CONSTRAINT `receiver_id_refs_user_ptr_id_2ff8ddc66edb5dae` FOREIGN KEY (`receiver_id`) REFERENCES `profile_filmbotuser` (`user_ptr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profile_friendshipstatus`
--

DROP TABLE IF EXISTS `profile_friendshipstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_friendshipstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profile_savedfilm`
--

DROP TABLE IF EXISTS `profile_savedfilm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_savedfilm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `film_bot_user_id` int(11) NOT NULL,
  `film_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `profile_savedfilm_d18ae35` (`film_bot_user_id`),
  KEY `profile_savedfilm_65dfe046` (`film_id`),
  CONSTRAINT `film_id_refs_id_69de93c35bf263f9` FOREIGN KEY (`film_id`) REFERENCES `film_film` (`id`),
  CONSTRAINT `film_bot_user_id_refs_user_ptr_id_19f374075580f814` FOREIGN KEY (`film_bot_user_id`) REFERENCES `profile_filmbotuser` (`user_ptr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profile_trustability`
--

DROP TABLE IF EXISTS `profile_trustability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_trustability` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `giver_id` int(11) NOT NULL,
  `applies_to_id` int(11) NOT NULL,
  `value` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `profile_trustability_81588a32` (`giver_id`),
  KEY `profile_trustability_b134f7fe` (`applies_to_id`),
  CONSTRAINT `applies_to_id_refs_user_ptr_id_115e14a1f64c71ca` FOREIGN KEY (`applies_to_id`) REFERENCES `profile_filmbotuser` (`user_ptr_id`),
  CONSTRAINT `giver_id_refs_user_ptr_id_115e14a1f64c71ca` FOREIGN KEY (`giver_id`) REFERENCES `profile_filmbotuser` (`user_ptr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `profile_usercheckpoints`
--

DROP TABLE IF EXISTS `profile_usercheckpoints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_usercheckpoints` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `completed_new_user_tutorial` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `report_builder_displayfield`
--

DROP TABLE IF EXISTS `report_builder_displayfield`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `report_builder_displayfield` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `report_id` int(11) NOT NULL,
  `path` varchar(2000) NOT NULL,
  `path_verbose` varchar(2000) NOT NULL,
  `field` varchar(2000) NOT NULL,
  `field_verbose` varchar(2000) NOT NULL,
  `name` varchar(2000) NOT NULL,
  `sort` int(11) DEFAULT NULL,
  `sort_reverse` tinyint(1) NOT NULL,
  `width` int(11) NOT NULL,
  `aggregate` varchar(5) NOT NULL,
  `position` smallint(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `report_builder_displayfield_29fa1030` (`report_id`),
  CONSTRAINT `report_id_refs_id_ebb88d0b30ef681` FOREIGN KEY (`report_id`) REFERENCES `report_builder_report` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `report_builder_filterfield`
--

DROP TABLE IF EXISTS `report_builder_filterfield`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `report_builder_filterfield` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `report_id` int(11) NOT NULL,
  `path` varchar(2000) NOT NULL,
  `path_verbose` varchar(2000) NOT NULL,
  `field` varchar(2000) NOT NULL,
  `field_verbose` varchar(2000) NOT NULL,
  `filter_type` varchar(20) NOT NULL,
  `filter_value` varchar(2000) NOT NULL,
  `filter_value2` varchar(2000) NOT NULL,
  `exclude` tinyint(1) NOT NULL,
  `position` smallint(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `report_builder_filterfield_29fa1030` (`report_id`),
  CONSTRAINT `report_id_refs_id_67fdfbe6a961fc1e` FOREIGN KEY (`report_id`) REFERENCES `report_builder_report` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `report_builder_report`
--

DROP TABLE IF EXISTS `report_builder_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `report_builder_report` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `root_model_id` int(11) NOT NULL,
  `created` date NOT NULL,
  `modified` date NOT NULL,
  `distinct` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `report_builder_report_fb1883a4` (`root_model_id`),
  CONSTRAINT `root_model_id_refs_id_f5b9666b1ed485a` FOREIGN KEY (`root_model_id`) REFERENCES `django_content_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `showtime_screeningtype`
--

DROP TABLE IF EXISTS `showtime_screeningtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `showtime_screeningtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `showtime_showtime`
--

DROP TABLE IF EXISTS `showtime_showtime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `showtime_showtime` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `theater_id` int(11) NOT NULL,
  `film_id` int(11) NOT NULL,
  `showTime` datetime NOT NULL,
  `ticketUrl` varchar(600) NOT NULL,
  `soldOut` tinyint(1) NOT NULL,
  `screeningType_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `showtime_showtime_9ba30a20` (`theater_id`),
  KEY `showtime_showtime_65dfe046` (`film_id`),
  KEY `showtime_showtime_690127e1` (`screeningType_id`)
) ENGINE=MyISAM AUTO_INCREMENT=455779 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `south_migrationhistory`
--

DROP TABLE IF EXISTS `south_migrationhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `south_migrationhistory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_name` varchar(255) NOT NULL,
  `migration` varchar(255) NOT NULL,
  `applied` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `statistic_filmstatistic`
--

DROP TABLE IF EXISTS `statistic_filmstatistic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statistic_filmstatistic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2861 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `statistic_imdbstatistic`
--

DROP TABLE IF EXISTS `statistic_imdbstatistic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statistic_imdbstatistic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link` varchar(2000) NOT NULL,
  `filmStatistic_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `filmStatistic_id` (`filmStatistic_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2861 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `statistic_nytimesstatistic`
--

DROP TABLE IF EXISTS `statistic_nytimesstatistic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statistic_nytimesstatistic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link` varchar(2000) NOT NULL,
  `criticsPick` tinyint(1) NOT NULL,
  `filmStatistic_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `filmStatistic_id` (`filmStatistic_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2861 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `statistic_rottentomatostatistic`
--

DROP TABLE IF EXISTS `statistic_rottentomatostatistic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statistic_rottentomatostatistic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link` varchar(2000) NOT NULL,
  `rating` double DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `filmStatistic_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `filmStatistic_id` (`filmStatistic_id`),
  KEY `statistic_rottentomatostatistic_777d41c8` (`type_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2861 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `statistic_rottentomatotype`
--

DROP TABLE IF EXISTS `statistic_rottentomatotype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statistic_rottentomatotype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `theater_theater`
--

DROP TABLE IF EXISTS `theater_theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `theater_theater` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `address` varchar(400) NOT NULL,
  `city_id` int(11) NOT NULL,
  `neighbourHood_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `theater_theater_586a73b5` (`city_id`),
  KEY `theater_theater_5eb110ce` (`neighbourHood_id`)
) ENGINE=MyISAM AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `theater_theaterdetailed`
--

DROP TABLE IF EXISTS `theater_theaterdetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `theater_theaterdetailed` (
  `theater_ptr_id` int(11) NOT NULL,
  `mapInfo_id` int(11) DEFAULT NULL,
  `legacyCinema_id` int(11) DEFAULT NULL,
  `ticketingInfo_id` int(11) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `googleUrl` varchar(600) NOT NULL,
  `homePage` varchar(600) NOT NULL,
  PRIMARY KEY (`theater_ptr_id`),
  KEY `theater_theaterdetailed_de4015d5` (`mapInfo_id`),
  KEY `theater_theaterdetailed_c17fd1ec` (`legacyCinema_id`),
  KEY `theater_theaterdetailed_1533746d` (`ticketingInfo_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ticketing_ticketinginfo`
--

DROP TABLE IF EXISTS `ticketing_ticketinginfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticketing_ticketinginfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ticketUrl` varchar(600) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trailer_trailer`
--

DROP TABLE IF EXISTS `trailer_trailer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trailer_trailer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `film_id` int(11) DEFAULT NULL,
  `url` varchar(2000) NOT NULL,
  `host_id` int(11) DEFAULT NULL,
  `trailerType_id` int(11) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `selected` tinyint(1) NOT NULL,
  `uid` varchar(800) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `trailer_trailer_65dfe046` (`film_id`),
  KEY `trailer_trailer_83f54662` (`host_id`),
  KEY `trailer_trailer_1dccf9c6` (`trailerType_id`)
) ENGINE=MyISAM AUTO_INCREMENT=266 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trailer_trailerhost`
--

DROP TABLE IF EXISTS `trailer_trailerhost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trailer_trailerhost` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `homePage` varchar(600) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trailer_trailertype`
--

DROP TABLE IF EXISTS `trailer_trailertype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trailer_trailertype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `www_sitetuning`
--

DROP TABLE IF EXISTS `www_sitetuning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `www_sitetuning` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `filmsPerLoadingBlock` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-05-09 20:25:11
