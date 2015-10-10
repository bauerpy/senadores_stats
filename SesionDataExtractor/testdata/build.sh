find ../../../TEDIC/DATOS_DIARIO_SESIONES/|grep 2015 |grep doc>sesioneslist.txt
cat sesioneslist.txt |cut -d'/' -f 6-
cat sesioneslist.txt |cut -d'/' -f 6-| cut -d' ' -f 2-| sed -e 's/ [A-Z]*//'




