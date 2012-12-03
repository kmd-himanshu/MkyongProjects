CREATE TABLE  `mkyong`.`product` (
  `PRODUCT_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `PRODUCT_CODE` varchar(20) NOT NULL,
  `PRODUCT_DESC` varchar(255) NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE  `mkyong`.`product_qoh` (
  `QOH_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `PRODUCT_ID` bigint(20) unsigned NOT NULL,
  `QTY` int(10) unsigned NOT NULL,
  PRIMARY KEY (`QOH_ID`),
  KEY `FK_product_qoh_product_id` (`PRODUCT_ID`),
  CONSTRAINT `FK_product_qoh_product_id` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `product` (`PRODUCT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;