# language: es
# autor: Santiago Delgado

Feature: Abrir una página web

Como Santiago
Quiero abrir un sitio web de vacantes
Para posteriormente iniciar sesión

@successful
Scenario: Abrir con el navegador Edge
  Given que Santiago abre el sitio web "https://opensource-demo.orangehrmlive.com/"
  When ingresa al sitio con el navegador Edge
  Then debe visualizar el login de la página