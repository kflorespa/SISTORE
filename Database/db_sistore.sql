-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-04-2019 a las 18:52:57
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `db_sistore`
--

CREATE DATABASE IF NOT EXISTS db_sistore;
USE db_sistore;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ttabla`
--

CREATE TABLE IF NOT EXISTS `ttabla` (
  `IdTabla` char(3) NOT NULL primary key,
  `Descripcion` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabladetalle`
--

CREATE TABLE IF NOT EXISTS `tabladetalle` (
  `IdTablaDetalle` char(6) NOT NULL primary key,
  `IdTabla` char(3) DEFAULT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `tabladetalle`
ADD CONSTRAINT `R_2` FOREIGN KEY (`IdTabla`) REFERENCES `ttabla` (`IdTabla`);
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ttienda`
--

CREATE TABLE IF NOT EXISTS `ttienda` (
  `IdTienda` int(11) NOT NULL auto_increment primary key,
  `Nombre` varchar(100) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `Departamento` varchar(45) DEFAULT NULL,
  `Provincia` varchar(45) DEFAULT NULL,
  `Distrito` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `talmacen`
--

CREATE TABLE IF NOT EXISTS `talmacen` (
`IdAlmacen` int(11) NOT NULL auto_increment primary key,
  `Descripcion` varchar(100) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `IdTienda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `talmacen`
ADD CONSTRAINT `R_6` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcategoria`
--

CREATE TABLE IF NOT EXISTS `tcategoria` (
  `IdCategoria` int(11) NOT NULL auto_increment primary key,
  `Descripcion` varchar(100) DEFAULT NULL,
  `IdTienda` int(11) DEFAULT NULL,
  `DiaRetiro` int(11) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tproveedor`
--

CREATE TABLE IF NOT EXISTS `tproveedor` (
  `IdProveedor` int(11) NOT NULL auto_increment primary key,
  `Ruc` varchar(12) DEFAULT NULL,
  `RazonSocial` varchar(100) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Rubro` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL,
  `IdTienda` int(11) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `tproveedor`
ADD CONSTRAINT `R_4` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tmovimiento`
--

CREATE TABLE IF NOT EXISTS `tmovimiento` (
  `IdMovimiento` int(11) NOT NULL auto_increment primary key,
  `IdTienda` int(11) NOT NULL,
  `CodOperacion` char(6) DEFAULT NULL,
  `IdProveedor` int(11) DEFAULT NULL,
  `MontoTotal` float DEFAULT NULL,
  `FchMov` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL,
  `CodEstado` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `tmovimiento`
ADD CONSTRAINT `R_18` FOREIGN KEY (`IdProveedor`) REFERENCES `tproveedor` (`IdProveedor`),
ADD CONSTRAINT `R_30` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`);
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tproducto`
--

CREATE TABLE IF NOT EXISTS `tproducto` (
  `IdProducto` int(11) NOT NULL auto_increment primary key,
  `CodUme` char(6) DEFAULT NULL,
  `CodGrupo` char(6) DEFAULT NULL,
  `Ean` varchar(15) DEFAULT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Precio` float DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `IdTienda` int(11) DEFAULT NULL,
  `IdCategoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
ALTER TABLE `tproducto`
ADD CONSTRAINT `R_9` FOREIGN KEY (`IdCategoria`) REFERENCES `tcategoria` (`IdCategoria`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tmovimientodetalle`
--

CREATE TABLE IF NOT EXISTS `tmovimientodetalle` (
`IdMovimientoDetalle` int(11) NOT NULL auto_increment primary key,
  `IdMovimiento` int(11) DEFAULT NULL,
  `IdProducto` int(11) DEFAULT NULL,
  `Cantidad` char(18) DEFAULT NULL,
  `FechVen` datetime DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `tmovimientodetalle`
ADD CONSTRAINT `R_15` FOREIGN KEY (`IdMovimiento`) REFERENCES `tmovimiento` (`IdMovimiento`),
ADD CONSTRAINT `R_17` FOREIGN KEY (`IdProducto`) REFERENCES `tproducto` (`IdProducto`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdeposito`
--

CREATE TABLE IF NOT EXISTS `tdeposito` (
`IdDeposito` int(11) NOT NULL auto_increment primary key,
  `IdProducto` int(11) DEFAULT NULL,
  `IdTienda` int(11) DEFAULT NULL,
  `IdAlmacen` int(11) DEFAULT NULL,
  `Cantidad` float DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FchRet` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `tdeposito`
ADD CONSTRAINT `R_12` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`) on update cascade on delete cascade,
ADD CONSTRAINT `R_13` FOREIGN KEY (`IdProducto`) REFERENCES `tproducto` (`IdProducto`)on update cascade on delete cascade,
ADD CONSTRAINT `R_24` FOREIGN KEY (`IdAlmacen`) REFERENCES `talmacen` (`IdAlmacen`)on update cascade on delete cascade;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tusuario`
--

CREATE TABLE IF NOT EXISTS `tusuario` (
  `IdUsuario` int(11) NOT NULL auto_increment primary key,
  `Tipo` char(6) DEFAULT NULL,
  `Usuario` varchar(45) DEFAULT NULL,
  `Clave` varchar(100) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Nombres` varchar(45) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `FchNac` datetime DEFAULT NULL,
  `DNI` varchar(9) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `IdTienda` int(11) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `tusuario`
ADD CONSTRAINT `R_3` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opciones`
--

CREATE TABLE IF NOT EXISTS `opciones` (
  `IdOpciones` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `Descripcion` varchar(45) DEFAULT NULL,
  `IdTienda` int(11) DEFAULT NULL,
  `Orden` int(11) DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `opciones`
ADD CONSTRAINT `R_31` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfiles`
--

CREATE TABLE IF NOT EXISTS `perfiles` (
  `IdPerfil` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `Descripcion` varchar(45) DEFAULT NULL,
  `IdTienda` int(11) DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `perfiles`
ADD CONSTRAINT `R_26` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil_opciones`
--

CREATE TABLE IF NOT EXISTS `perfil_opciones` (
  `IdRegistro` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `IdPerfil` int(11) DEFAULT NULL,
  `IdOpciones` int(11) DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `perfil_opciones`
ADD CONSTRAINT `R_25` FOREIGN KEY (`IdOpciones`) REFERENCES `opciones` (`IdOpciones`),
ADD CONSTRAINT `R_33` FOREIGN KEY (`IdPerfil`) REFERENCES `perfiles` (`IdPerfil`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil_usuario`
--

CREATE TABLE IF NOT EXISTS `perfil_usuario` (
  `IdRegistro` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `IdUsuario` int(11) DEFAULT NULL,
  `IdPerfil` int(11) DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `perfil_usuario`
ADD CONSTRAINT `R_28` FOREIGN KEY (`IdUsuario`) REFERENCES `tusuario` (`IdUsuario`),
ADD CONSTRAINT `R_29` FOREIGN KEY (`IdPerfil`) REFERENCES `perfiles` (`IdPerfil`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursal`
--

CREATE TABLE IF NOT EXISTS `sucursal` (
  `IdSucursal` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `IdTienda` int(11) NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchMod` date DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `sucursal`
ADD CONSTRAINT `R_20` FOREIGN KEY (`IdTienda`) REFERENCES `ttienda` (`IdTienda`);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_sucursal`
--

CREATE TABLE IF NOT EXISTS `usuario_sucursal` (
  `IdRegistro` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `IdUsuario` int(11) DEFAULT NULL,
  `IdSucursal` int(11) DEFAULT NULL,
  `UsrCrea` varchar(45) DEFAULT NULL,
  `FchCrea` datetime DEFAULT NULL,
  `UsrMod` varchar(45) DEFAULT NULL,
  `FchMod` datetime DEFAULT NULL,
  `FlgEli` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `usuario_sucursal`
ADD CONSTRAINT `R_22` FOREIGN KEY (`IdUsuario`) REFERENCES `tusuario` (`IdUsuario`),
ADD CONSTRAINT `R_23` FOREIGN KEY (`IdSucursal`) REFERENCES `sucursal` (`IdSucursal`);


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
