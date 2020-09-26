
CREATE TABLE IF NOT EXISTS `Inventory` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `Product_Name` VARCHAR(45),
  `Product_Description` VARCHAR(45),
  `Product_Type` VARCHAR(45),
  `Product_Accessory_Type` INT
);


INSERT INTO `Inventory` (`id`, `Product_Name`, `Product_Description`, `Product_Type`, `Product_Accessory_Type`) VALUES
('1', 'SAMSUNG GALAXY A80', 'SAMSUNG GALAXY A80', 'MOBILE', null ),
('2', 'SAMSUNG GALAXY A20', 'SAMSUNG GALAXY A20', 'MOBILE', null ),
('3', 'SAMSUNG GALAXY A10', 'SAMSUNG GALAXY A10', 'MOBILE', null );
