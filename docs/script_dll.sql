CREATE DATABASE IF NOT EXISTS  cda_junit_jdbc;
CREATE USER IF NOT EXISTS 'userJunit1'@'localhost' IDENTIFIED BY 'user1pwd';
GRANT ALL PRIVILEGES ON cda_junit_jdbc . * TO 'userJunit1'@'localhost';
FLUSH PRIVILEGES;