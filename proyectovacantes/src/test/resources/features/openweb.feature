# language: es
# autor: Santiago Delgado

Característica: Abrir una página web

Como Santiago
Quiero abrir un sitio web de vacantes
Para posteriormente iniciar sesión

@successful
Escenario: Abrir con el navegador Edge
  Dado "Santiago" abre el sitio web
  Cuando ingresa al sitio con el navegador Edge
  Entonces visualizara el login de la pagina


