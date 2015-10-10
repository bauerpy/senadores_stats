<?php

/* 
 * devolver participacion en sesiones de senadores
 * 
 * from
 * offset
 * limit
 * 
 */

$con_comunicacion = mysql_connect("localhost", "root", "145541");

mysql_select_db("senadores",$con_comunicacion);
mysql_query("SET NAMES 'utf8'",$con_comunicacion);






