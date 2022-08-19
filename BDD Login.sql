drop database bdlogin;

create database bdlogin;

	\c bdlogin

create table usuario(
cnsu serial,
id_u varchar primary key not null,
pass varchar not null
);

create table materias(
id_m int primary key,
nombrem varchar not null
);

create table alumnos(
cnsa serial,
matricula varchar not null,
nombre varchar not null,
id_u varchar not null references usuario (id_u),
id_m int references materias (id_m),
constraint alumnos_pkey primary key (matricula, id_u)
);


insert into usuario (id_u, pass) values ('ChemaPF', '12345');

insert into materias values (1, 'Traductores');

insert into alumnos (matricula, nombre, id_u, id_m) values ('B200003', 'Chema Padilla Fernandez', 'ChemaPF', 1);
	