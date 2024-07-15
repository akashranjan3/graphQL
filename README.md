#DB set up 


CREATE TABLE IF NOT EXISTS `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `student` (`id`, `first_name`, `last_name`, `location`, `dob`) VALUES
(1, 'akash', 'verma', 'lucknow', '12-23-90'),
(2, 'anurag', 'singh', 'lucknow', '12-23-90'),
(3, 'shivam', 'rawat', 'delhi', '1-23-90');
COMMIT;

