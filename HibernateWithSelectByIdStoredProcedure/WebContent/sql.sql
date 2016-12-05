CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `quantity` int(45) DEFAULT NULL,
  `description` varchar(450) DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `createiondate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
)

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getproductsbyid`(
in productid int)
BEGIN

SELECT id as id,
name as name,
price as price,
quantity as quantity ,
description as description,
photo as photo ,
active as active,
createiondate as createiondate
 FROM product where id=productid;
END$$
DELIMITER ;
