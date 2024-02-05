drop table if exists users;

create table users
(
  id identity primary key,
  name varchar(20),
  email varchar(50),
  password varchar(30),
  role varchar(20)
);

