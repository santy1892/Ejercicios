# language: es
# autor: Santiago Delgado

Característica: Abrir una página web

  Como Santiago
  Quiero abrir un sitio web de vacantes
  Para posteriormente iniciar sesión

  Antecedentes:
    Dado "Santiago" abre el sitio web

  @successful
  Escenario: Abrir con el navegador Edge
    Cuando ingresa al sitio con el navegador Edge
    Entonces visualizara el login de la pagina


