create table persona(
perid int primary key auto_increment,
nombre Varchar (50),
apellido Varchar (50),
telefonofijo Varchar (20),
fechanacimiento Varchar (20),
cedula Varchar (20)
);

create table linea(
numerolinea  varchar (30) primary key ,
perid int,
estado varchar(20),
constraint perid foreign key (perid) references persona (perid)
);

create table equipo(
equserial  int primary key auto_increment,
numerolinea  varchar (30),
marca Varchar (50),
descripcion Varchar (50),
estado Varchar (50),
constraint numerolinea foreign key (numerolinea) references linea (numerolinea)

);

create table factura(
factnumero  Int primary key auto_increment,
numerolineas  varchar (30),
facfechaemision Date,
valor Decimal,
constraint numerolineas foreign key (numerolineas) references linea (numerolinea)

);