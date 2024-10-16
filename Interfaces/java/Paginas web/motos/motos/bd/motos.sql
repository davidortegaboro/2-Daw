drop database motos;
create database motos;
use motos;
create table equipo (id_equipo smallint primary key, name varchar(50));

create table moto (id_moto smallint primary key, brand varchar(50) not null, horses int not null, id_equipo smallint not null,
foreign key (id_equipo) references equipo (id_equipo));

create table piloto (id_piloto smallint primary key, name varchar(50), age int not null, id_equipo smallint not null,
foreign key (id_equipo) references equipo (id_equipo));


insert into equipo (id_equipo, name) values (1, 'Honda');
insert into equipo (id_equipo, name) values (2, 'Ducati');
insert into equipo (id_equipo, name) values (3, 'Ktm');
insert into equipo (id_equipo, name) values (4, 'Suzuki');
insert into equipo (id_equipo, name) values (5, 'Triumph');

insert into moto (id_moto, brand, horses, id_equipo) values (1, 'honda', 200, 1);
insert into moto (id_moto, brand, horses, id_equipo) values (2, 'honda', 200, 1);
insert into moto (id_moto, brand, horses, id_equipo) values (3, 'Ducati', 206, 2);
insert into moto (id_moto, brand, horses, id_equipo) values (4, 'Ducati', 206, 2);
insert into moto (id_moto, brand, horses, id_equipo) values (5, 'Ktm', 202, 3);
insert into moto (id_moto, brand, horses, id_equipo) values (6, 'Ktm', 202, 3);
insert into moto (id_moto, brand, horses, id_equipo) values (7, 'Suzuki', 205, 4);
insert into moto (id_moto, brand, horses, id_equipo) values (8, 'Suzuki', 205, 4);
insert into moto (id_moto, brand, horses, id_equipo) values (9, 'Triumph', 205, 5);
insert into moto (id_moto, brand, horses, id_equipo) values (10, 'Triumph', 205, 5);

insert into piloto (id_piloto, name, age, id_equipo) values (1, 'marc', 20, 1);
insert into piloto (id_piloto, name, age, id_equipo) values (2, 'marc', 20, 1);
insert into piloto (id_piloto, name, age, id_equipo) values (3, 'marc', 20, 2);
insert into piloto (id_piloto, name, age, id_equipo) values (4, 'marc', 20, 2);
insert into piloto (id_piloto, name, age, id_equipo) values (5, 'marc', 20, 3);
insert into piloto (id_piloto, name, age, id_equipo) values (6, 'marc', 20, 3);
insert into piloto (id_piloto, name, age, id_equipo) values (7, 'marc', 20, 4);
insert into piloto (id_piloto, name, age, id_equipo) values (8, 'marc', 20, 4);
insert into piloto (id_piloto, name, age, id_equipo) values (9, 'marc', 20, 5);
insert into piloto (id_piloto, name, age, id_equipo) values (10, 'marc', 20, 5);

CREATE USER 'moto'@'localhost' IDENTIFIED BY '12345';
GRANT ALL PRIVILEGES ON motos.* TO 'moto"'@'localhost';
