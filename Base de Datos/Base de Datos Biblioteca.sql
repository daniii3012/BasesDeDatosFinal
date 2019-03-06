/* ---------------------------------------------------- */
/*  Generated by Enterprise Architect Version 13.5 		*/
/*  Created On : 06-mar.-2019 12:14:39 p. m. 				*/
/*  DBMS       : PostgreSQL 						*/
/* ---------------------------------------------------- */

/* Drop Tables */

DROP TABLE IF EXISTS Audiovisual CASCADE
;

DROP TABLE IF EXISTS Audiovisual_Autor CASCADE
;

DROP TABLE IF EXISTS Bibliografico CASCADE
;

DROP TABLE IF EXISTS Bibliografico_Autor CASCADE
;

DROP TABLE IF EXISTS Copia CASCADE
;

DROP TABLE IF EXISTS Estudiante CASCADE
;

DROP TABLE IF EXISTS Multa CASCADE
;

DROP TABLE IF EXISTS Prestamo CASCADE
;

DROP TABLE IF EXISTS Reserva CASCADE
;

DROP TABLE IF EXISTS Reserva_Copia CASCADE
;

/* Create Tables */

CREATE TABLE Audiovisual
(
	k_isbnissn numeric(13) NOT NULL,
	n_titulo varchar(30) NOT NULL,
	f_publicacion date NULL,
	n_tipo varchar(10) NOT NULL,
	n_tema varchar(50) NULL,
	n_formato varchar(5) NULL
)
;

CREATE TABLE Audiovisual_Autor
(
	k_autor varchar(30) NOT NULL,
	k_isbnissn numeric(13) NOT NULL
)
;

CREATE TABLE Bibliografico
(
	k_isbnissn numeric(13) NOT NULL,
	n_titulo varchar(30) NOT NULL,
	f_publicacion date NULL,
	n_tipo varchar(10) NOT NULL,
	n_tema varchar(50) NULL
)
;

CREATE TABLE Bibliografico_Autor
(
	k_autor varchar(30) NOT NULL,
	k_isbnissn numeric(13) NOT NULL
)
;

CREATE TABLE Copia
(
	k_copia numeric(5) NOT NULL,
	i_estado_fisico varchar(10) NULL,
	i_estado_prestamo varchar(10) NULL,
	i_disponible varchar(1) NOT NULL,
	k_isbnissn numeric(13) NOT NULL
)
;

CREATE TABLE Estudiante
(
	k_estudiante numeric(11) NOT NULL,
	n_nombre varchar(20) NOT NULL,
	n_apellido varchar(20) NOT NULL,
	q_identificacion numeric(10) NOT NULL,
	n_tipo_identificacion varchar(2) NOT NULL,
	f_nacimiento date NOT NULL,
	n_genero varchar(1) NOT NULL,
	i_estado_estudiante varchar(1) NOT NULL
)
;

CREATE TABLE Multa
(
	k_multa numeric(5) NOT NULL,
	v_multa numeric(6) NOT NULL,
	i_estado_multa varchar(10) NOT NULL,
	f_pago date NULL,
	k_prestamo numeric(5) NOT NULL
)
;

CREATE TABLE Prestamo
(
	k_prestamo numeric(5) NOT NULL,
	f_reclamacion date NOT NULL,
	f_devolucion date NULL,
	f_limite_devolucion date NOT NULL,
	k_reserva numeric(5) NOT NULL
)
;

CREATE TABLE Reserva
(
	k_reserva numeric(5) NOT NULL,
	f_reservacion date NOT NULL,
	f_cancelacion date NULL,
	i_estado_reserva varchar(1) NOT NULL,
	q_nhoras numeric(1) NULL,
	k_estudiante numeric(11) NOT NULL
)
;

CREATE TABLE Reserva_Copia
(
	k_reserva numeric(5) NOT NULL,
	k_copia numeric(5) NOT NULL
)
;

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE Audiovisual ADD CONSTRAINT PK_Audiovisual
	PRIMARY KEY (k_isbnissn)
;

ALTER TABLE Audiovisual ADD CONSTRAINT CK_ISBNISSN CHECK (k_isbnissn >= 0)
;

ALTER TABLE Audiovisual_Autor ADD CONSTRAINT PK_Audiovisual_Autor
	PRIMARY KEY (k_autor,k_isbnissn)
;

ALTER TABLE Bibliografico ADD CONSTRAINT PK_Bibliografico
	PRIMARY KEY (k_isbnissn)
;

ALTER TABLE Bibliografico ADD CONSTRAINT CK_ISBNISSN CHECK (k_isbnissn >= 0)
;

ALTER TABLE Bibliografico_Autor ADD CONSTRAINT PK_Bibliografico_Autor
	PRIMARY KEY (k_autor,k_isbnissn)
;

ALTER TABLE Copia ADD CONSTRAINT PK_Copia
	PRIMARY KEY (k_copia)
;

ALTER TABLE Copia ADD CONSTRAINT CK_Copia CHECK (k_copia >= 0)
;

ALTER TABLE Copia ADD CONSTRAINT CK_Disponible CHECK (i_disponible IN('S','N'))
;

ALTER TABLE Estudiante ADD CONSTRAINT PK_Estudiante
	PRIMARY KEY (k_estudiante)
;

ALTER TABLE Estudiante ADD CONSTRAINT CK_Estudiante CHECK (k_estudiante >= 0)
;

ALTER TABLE Estudiante ADD CONSTRAINT CK_Identificacion CHECK (q_identificacion >= 0)
;

ALTER TABLE Estudiante ADD CONSTRAINT CK_Tipo_identificacion CHECK (n_tipo_identificacion IN('TI','CC','CE'))
;

ALTER TABLE Estudiante ADD CONSTRAINT CK_Genero CHECK (n_genero IN('M','F','O'))
;

ALTER TABLE Estudiante ADD CONSTRAINT CK_Estado_estudiante CHECK (i_estado_estudiante IN('A','S','R','I'))
;

ALTER TABLE Multa ADD CONSTRAINT PK_Multa
	PRIMARY KEY (k_multa)
;

ALTER TABLE Multa ADD CONSTRAINT CK_Multa CHECK (k_multa >= 0)
;

ALTER TABLE Multa ADD CONSTRAINT CK_Valor_multa CHECK (v_multa >= 0)
;

ALTER TABLE Prestamo ADD CONSTRAINT PK_Prestamo
	PRIMARY KEY (k_prestamo)
;

ALTER TABLE Prestamo ADD CONSTRAINT CK_Prestamo CHECK (k_prestamo >= 0)
;

ALTER TABLE Reserva ADD CONSTRAINT PK_Reserva
	PRIMARY KEY (k_reserva)
;

ALTER TABLE Reserva ADD CONSTRAINT CK_Reserva CHECK (k_reserva >= 0)
;

ALTER TABLE Reserva ADD CONSTRAINT CK_Nhoras CHECK (q_nhoras >= 0)
;

ALTER TABLE Reserva ADD CONSTRAINT CK_Estado_Reserva CHECK (i_estado_reserva IN('A','C'))
;

ALTER TABLE Reserva_Copia ADD CONSTRAINT PK_Reserva_Copia
	PRIMARY KEY (k_reserva,k_copia)
;

/* Create Foreign Key Constraints */

ALTER TABLE Audiovisual_Autor ADD CONSTRAINT FK_Audiovisual_Autor_Audiovisual
	FOREIGN KEY (k_isbnissn) REFERENCES Audiovisual (k_isbnissn) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Bibliografico_Autor ADD CONSTRAINT FK_Bibliografico_Autor_Bibliografico
	FOREIGN KEY (k_isbnissn) REFERENCES Bibliografico (k_isbnissn) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Copia ADD CONSTRAINT FK_Copia_Audiovisual
	FOREIGN KEY (k_isbnissn) REFERENCES Audiovisual (k_isbnissn) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Copia ADD CONSTRAINT FK_Copia_Bibliografico
	FOREIGN KEY (k_isbnissn) REFERENCES Bibliografico (k_isbnissn) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Multa ADD CONSTRAINT FK_Multa_Prestamo
	FOREIGN KEY (k_prestamo) REFERENCES Prestamo (k_prestamo) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Prestamo ADD CONSTRAINT FK_Prestamo_Reserva
	FOREIGN KEY (k_reserva) REFERENCES Reserva (k_reserva) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Reserva ADD CONSTRAINT FK_Reserva_Estudiante
	FOREIGN KEY (k_estudiante) REFERENCES Estudiante (k_estudiante) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Reserva_Copia ADD CONSTRAINT FK_Reserva_Copia_Copia
	FOREIGN KEY (k_copia) REFERENCES Copia (k_copia) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Reserva_Copia ADD CONSTRAINT FK_Reserva_Copia_Reserva
	FOREIGN KEY (k_reserva) REFERENCES Reserva (k_reserva) ON DELETE No Action ON UPDATE No Action
;