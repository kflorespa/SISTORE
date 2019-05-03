use DBSISTORE
SELECT * FROM TTABLA
INSERT INTO TTABLA VALUES ('001','TIPO_USUARIO',GETDATE(),'ADMIN','0')
INSERT INTO TTABLA VALUES ('002','UME',GETDATE(),'ADMIN','0')
INSERT INTO TTABLA VALUES ('003','OPERACION',GETDATE(),'ADMIN','0')
INSERT INTO TTABLA VALUES ('004','ESTADO',GETDATE(),'ADMIN','0')

SELECT * FROM TABLADETALLE
INSERT INTO TABLADETALLE VALUES ('001001','001','ADMIN',GETDATE(),'MASTER',GETDATE(),'MASTER','0')
INSERT INTO TABLADETALLE VALUES ('001002','001','USUARIO',GETDATE(),'MASTER',GETDATE(),'MASTER','0')
INSERT INTO TABLADETALLE VALUES ('002001','002','UN',GETDATE(),'MASTER',GETDATE(),'MASTER','0')
INSERT INTO TABLADETALLE VALUES ('002002','002','CAJ',GETDATE(),'MASTER',GETDATE(),'MASTER','0')

INSERT INTO TABLADETALLE VALUES ('003001','003','SALIDA',GETDATE(),'MASTER',GETDATE(),'MASTER','0')
INSERT INTO TABLADETALLE VALUES ('003002','003','INGRESO',GETDATE(),'MASTER',GETDATE(),'MASTER','0')

INSERT INTO TABLADETALLE VALUES ('004001','004','CREADO',GETDATE(),'MASTER',GETDATE(),'MASTER','0')
INSERT INTO TABLADETALLE VALUES ('004002','004','MODIFICADO',GETDATE(),'MASTER',GETDATE(),'MASTER','0')
INSERT INTO TABLADETALLE VALUES ('004003','004','GUARDADO',GETDATE(),'MASTER',GETDATE(),'MASTER','0')

SELECT * FROM TTIENDA
INSERT INTO TTIENDA VALUES ('MASTI CENTER','ICABOTS','ICA','ICA','ICA',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')

SELECT * FROM TSUCURSAL
INSERT INTO TSUCURSAL VALUES ('1','CHINCHA','AV. BENAVIDES 530',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TSUCURSAL VALUES ('1','PISCO','AV. LOS OLIVOS 530',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')

SELECT * FROM TUSUARIO
INSERT INTO TUSUARIO VALUES ('001001','KEVIN.FLORES','123','KEVIN.FLORES@GG.COM','KEVIN','FLORES','07/01/1997','72793128',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TUSUARIO VALUES ('001001','ANDERS.ROMERO','123','ANDERS.ROMERO@GG.COM','ANDERS','ROMERO','07/01/1997','72793128',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')

SELECT * FROM TSUCURSAL_USUARIO
INSERT INTO TSUCURSAL_USUARIO VALUES ('1','2',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TSUCURSAL_USUARIO VALUES ('2','2',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')

SELECT T.IDSUCURSAL,USUARIO,DESCRIPCION AS TIENDA, T.FLGELI FROM TSUCURSAL T INNER JOIN
 TSUCURSAL_USUARIO TSU ON T.IDSUCURSAL=TSU.IDSUCURSAL INNER JOIN TUSUARIO TU ON TSU.IDUSUARIO=TU.IDUSUARIO WHERE T.FLGELI='0'

SELECT *FROM TALMACEN
INSERT INTO TALMACEN VALUES ('1','FRIO PISCO',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TALMACEN VALUES ('1','ALMACEN 1 PISCO',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TALMACEN VALUES ('2','ALMACEN 1 CHINCHA',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')

SELECT * FROM TCATEGORIA
INSERT INTO TCATEGORIA VALUES ('LECHE','15',GETDATE(),'ADMIN',GETDATE(),'ADMIN')
INSERT INTO TCATEGORIA VALUES ('GASEOSAS','15',GETDATE(),'ADMIN',GETDATE(),'ADMIN')

SELECT * FROM TPRODUCTO
INSERT INTO TPRODUCTO VALUES ('1','002001','775757575','LECHE ENTERA GLORIA 400GR','3.10',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TPRODUCTO VALUES ('1','002001','775757572','LECHE LIGTH GLORIA 400GR','3.10',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TPRODUCTO VALUES ('1','002001','775757573','LECHE ULTRALIGTH GLORIA 400GR','3.10',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TPRODUCTO VALUES ('1','002002','775757574','GASEOSA GUARANA 3LT','9.10',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')

SELECT * FROM TPROVEEDOR
INSERT INTO TPROVEEDOR VALUES ('10407374334','DATEC S.A.C','CALLE ALFONSO UGARTE 532','5555-5555','PRODUCTOS GENERALES',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TPROVEEDOR VALUES ('10407374334','LINDLEY CORPORATION S.A','CALLE LIMA 532','5555-5555','GASEOSAS',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')

USE DBSISTORE

SELECT*FROM TALMACEN
SELECT*FROM TMOVIMIENTO
SELECT*FROM TABLADETALLE
INSERT INTO TMOVIMIENTO VALUES ('1','2','003002','0.0',GETDATE(),'ADMIN','0','004001')
--ESTADO CREADO

SELECT*FROM TPRODUCTO
SELECT*FROM TMOVIMIENTODETALLE
INSERT INTO TMOVIMIENTODETALLE VALUES ('1','1','100','02/05/2020',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TMOVIMIENTODETALLE VALUES ('1','2','24','01/05/2020',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TMOVIMIENTODETALLE VALUES ('1','3','48','02/05/2020',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
INSERT INTO TMOVIMIENTODETALLE VALUES ('1','4','120','01/05/2020',GETDATE(),'ADMIN',GETDATE(),'ADMIN','0')
--ESTADO MODIFICADO


SELECT MD.IDPRODUCTO,M.IDALMACEN,MD.CANTIDAD,GETDATE() AS FCHCREA,'ADMIN' AS USRCREA,GETDATE()
 AS FCHMOD,'ADMIN' AS USRMOD,MD.FECHVEN, MD.FECHVEN+C.DIARETIRO AS FECHA_RETIRO FROM TMOVIMIENTO
  M INNER JOIN (TMOVIMIENTODETALLE MD INNER JOIN (TPRODUCTO P INNER JOIN TCATEGORIA C ON 
  P.IDCATEGORIA=C.IDCATEGORIA) ON MD.IDPRODUCTO=P.IDPRODUCTO) ON M.IDMOVIMIENTO=MD.IDMOVIMIENTO

SELECT*FROM TDEPOSITO

--ESTADO GUARDADO


