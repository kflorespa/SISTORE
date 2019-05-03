/*USE MASTER
IF EXISTS (SELECT 1 FROM SYS.DATABASES WHERE NAME='DBSISTORE')
DROP DATABASE DBSISTORE
GO
CREATE DATABASE DBSISTORE
ON PRIMARY (NAME='DBSISTORE.MDF',FILENAME='D:\Database\DBSISTORE.MDF',SIZE=5MB,MAXSIZE=10GB,FILEGROWTH=10%)
LOG ON (NAME='DBSISTORE_LOG.LDF',FILENAME='D:\Database\DBSISTORE_LOG.LDF',SIZE=5MB,MAXSIZE=10GB,FILEGROWTH=10%)
GO

USE DBSISTORE
GO
*/
CREATE TABLE  TTABLA (
  IDTABLA CHAR(3) NOT NULL PRIMARY KEY,
  DESCRIPCION VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
  )
  GO

CREATE TABLE TABLADETALLE (
  IDTABLADETALLE CHAR(6) NOT NULL PRIMARY KEY,
  IDTABLA CHAR(3) DEFAULT NULL,
  DESCRIPCION VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

ALTER TABLE TABLADETALLE ADD CONSTRAINT FK_TABLADETALLE_TTABLA FOREIGN KEY (IDTABLA) REFERENCES TTABLA(IDTABLA)
GO

-------------------------------------
CREATE TABLE TUSUARIO (
  IDUSUARIO INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  TIPO CHAR(6) DEFAULT NULL,
  USUARIO VARCHAR(45) DEFAULT NULL,
  CLAVE VARCHAR(100) DEFAULT NULL,
  EMAIL VARCHAR(45) DEFAULT NULL,
  NOMBRES VARCHAR(45) DEFAULT NULL,
  APELLIDOS VARCHAR(45) DEFAULT NULL,
  FCHNAC DATETIME DEFAULT NULL,
  DNI VARCHAR(9) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

CREATE TABLE TTIENDA (
  IDTIENDA INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
  NOMBRE VARCHAR(100) DEFAULT NULL,
  DIRECCION VARCHAR(100) DEFAULT NULL,
  DEPARTAMENTO VARCHAR(45) DEFAULT NULL,
  PROVINCIA VARCHAR(45) DEFAULT NULL,
  DISTRITO VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

CREATE TABLE TSUCURSAL (
  IDSUCURSAL INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDTIENDA INT NOT NULL,
  DESCRIPCION VARCHAR(100) DEFAULT NULL,
  DIRECCION VARCHAR(100) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATE DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

ALTER TABLE TSUCURSAL ADD CONSTRAINT FK_TSUCURSAL_TTIENDA FOREIGN KEY (IDTIENDA) REFERENCES TTIENDA(IDTIENDA)
GO


CREATE TABLE TSUCURSAL_USUARIO (
  IDREGISTRO INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDSUCURSAL INT NOT NULL,
  IDUSUARIO INT NOT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATE DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

ALTER TABLE TSUCURSAL_USUARIO ADD CONSTRAINT FK_TSUCURSAL_USUARIO_TSUCURSAL FOREIGN KEY (IDSUCURSAL) REFERENCES TSUCURSAL(IDSUCURSAL)
GO
ALTER TABLE TSUCURSAL_USUARIO ADD CONSTRAINT FK_TSUCURSAL_USUARIO_TUSUARIO FOREIGN KEY (IDUSUARIO) REFERENCES TUSUARIO(IDUSUARIO)
GO

CREATE TABLE TPERFILES (
  IDPERFIL INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  DESCRIPCION VARCHAR(45) DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

CREATE TABLE TPERFIL_USUARIO (
  IDREGISTRO INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDUSUARIO INT DEFAULT NULL,
  IDPERFIL INT DEFAULT NULL,
  IDSUCURSAL INT DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

ALTER TABLE TPERFIL_USUARIO ADD CONSTRAINT FK_TPERFIL_USUARIO_TUSUARIO FOREIGN KEY (IDUSUARIO) REFERENCES TUSUARIO(IDUSUARIO)
GO
ALTER TABLE TPERFIL_USUARIO ADD CONSTRAINT FK_TPERFIL_USUARIO_TPERFILES FOREIGN KEY (IDPERFIL) REFERENCES TPERFILES(IDPERFIL)
GO

CREATE TABLE TOPCIONES (
  IDOPCIONES INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  DESCRIPCION VARCHAR(45) DEFAULT NULL,
  ORDEN INT DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 



CREATE TABLE TPERFIL_OPCIONES (
  IDPERFIL_OPCIONES INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDPERFIL INT DEFAULT NULL,
  IDOPCIONES INT DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

ALTER TABLE TPERFIL_OPCIONES ADD CONSTRAINT FK_TPERFIL_OPCIONES_TPERFILES FOREIGN KEY (IDPERFIL) REFERENCES TPERFILES(IDPERFIL)
GO
ALTER TABLE TPERFIL_OPCIONES ADD CONSTRAINT FK_TPERFIL_OPCIONES_TOPCIONES FOREIGN KEY (IDOPCIONES) REFERENCES TOPCIONES(IDOPCIONES)
GO

---------------------------------------------------------------------
CREATE TABLE TCATEGORIA (
  IDCATEGORIA INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  DESCRIPCION VARCHAR(100) DEFAULT NULL,
  DIARETIRO INT DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL
) 
GO

CREATE TABLE TPROVEEDOR (
  IDPROVEEDOR INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  RUC VARCHAR(12) DEFAULT NULL,
  RAZONSOCIAL VARCHAR(100) DEFAULT NULL,
  DIRECCION VARCHAR(100) DEFAULT NULL,
  TELEFONO VARCHAR(15) DEFAULT NULL,
  RUBRO VARCHAR(45) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

CREATE TABLE TALMACEN (
  IDALMACEN INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDSUCURSAL INT DEFAULT NULL,
  DESCRIPCION VARCHAR(100) DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO
ALTER TABLE TALMACEN ADD CONSTRAINT FK_TALMACEN_TSUCURSAL FOREIGN KEY (IDSUCURSAL) REFERENCES TSUCURSAL(IDSUCURSAL)
GO

CREATE TABLE TPRODUCTO (
  IDPRODUCTO INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDCATEGORIA INT DEFAULT NULL,
  CODUME CHAR(6) DEFAULT NULL,
  EAN VARCHAR(15) DEFAULT NULL,
  DESCRIPCION VARCHAR(100) DEFAULT NULL,
  PRECIO FLOAT DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
)
GO

ALTER TABLE TPRODUCTO ADD CONSTRAINT FK_TPRODUCTO_TCATEGORIA FOREIGN KEY (IDCATEGORIA) REFERENCES TCATEGORIA(IDCATEGORIA)
GO
CREATE TABLE TDEPOSITO (
  IDDEPOSITO INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDPRODUCTO INT DEFAULT NULL,
  IDALMACEN INT DEFAULT NULL,
  CANTIDAD FLOAT DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FCHVEN DATETIME DEFAULT NULL,
  FCHRET DATETIME DEFAULT NULL
) 
GO

ALTER TABLE TDEPOSITO ADD CONSTRAINT FK_TDEPOSITO_TPRODUCTO FOREIGN KEY (IDPRODUCTO) REFERENCES TPRODUCTO(IDPRODUCTO)
GO
ALTER TABLE TDEPOSITO ADD CONSTRAINT FK_TDEPOSITO_TALMACEN FOREIGN KEY (IDALMACEN) REFERENCES TALMACEN(IDALMACEN)
GO

CREATE TABLE TMOVIMIENTO (
  IDMOVIMIENTO INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDPROVEEDOR INT DEFAULT NULL,
  IDALMACEN INT  DEFAULT NULL,
  CODOPERACION CHAR(6) DEFAULT NULL,
  MONTOTOTAL FLOAT DEFAULT NULL,
  FCHMOV DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL,
  CODESTADO CHAR(6) DEFAULT NULL
)
GO

ALTER TABLE TMOVIMIENTO ADD CONSTRAINT FK_TMOVIMIENTO_TPROVEEDOR FOREIGN KEY (IDPROVEEDOR) REFERENCES TPROVEEDOR(IDPROVEEDOR)
GO
ALTER TABLE TMOVIMIENTO ADD CONSTRAINT FK_TMOVIMIENTO_TALMACEN FOREIGN KEY (IDALMACEN) REFERENCES TALMACEN(IDALMACEN)
GO




CREATE TABLE TMOVIMIENTODETALLE (
  IDMOVIMIENTODETALLE INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  IDMOVIMIENTO INT DEFAULT NULL,
  IDPRODUCTO INT DEFAULT NULL,
  CANTIDAD CHAR(18) DEFAULT NULL,
  FECHVEN DATETIME DEFAULT NULL,
  FCHCREA DATETIME DEFAULT NULL,
  USRCREA VARCHAR(45) DEFAULT NULL,
  FCHMOD DATETIME DEFAULT NULL,
  USRMOD VARCHAR(45) DEFAULT NULL,
  FLGELI CHAR(1) DEFAULT NULL
) 
GO

ALTER TABLE TMOVIMIENTODETALLE ADD CONSTRAINT FK_TMOVIMIENTODETALLE_TMOVIMIENTO FOREIGN KEY (IDMOVIMIENTO) REFERENCES TMOVIMIENTO(IDMOVIMIENTO)
GO
ALTER TABLE TMOVIMIENTODETALLE ADD CONSTRAINT FK_TMOVIMIENTODETALLE_TPRODUCTO FOREIGN KEY (IDPRODUCTO) REFERENCES TPRODUCTO(IDPRODUCTO)
GO


