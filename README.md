1.- Encontrar 5 servicios web y ejecutarlo usando SOAUI.
a) Mostrar el URI.
b) Describir lo que hace en general el servicio.
c) Analizar la estructura SOAP de lo que se envía y recibe en cada operación.
d) Analizar el WSDL y describir:
- cada una de las operaciones. Si el servicio tiene muchas operaciones,
elegir 3 representativas.
- el sitio donde está ubicado el servicio
- nombre del servicio
Utilizar NetBeans para desarrollar los siguientes ejercicios:
2.- Desarrollar un servicio web WSDL/SOAP “Hola Mundo”
1.1.- Consultarlo por SOAPUI de su maquina.
1.2.- Consultarlo por SOAPUI de una maquina de un compañero.
3.- Desarrollar un servicio web WSDL/SOAP que dado un código postal indique a
que ciudad pertenece.
3.1.- Consultarlo por SOAPUI de su maquina.
3.2.- Consultarlo por SOAPUI de una maquina de un compañero.
4.- Desarrollar una aplicación que determina la ubicación de un numero IP. Solicite
por pantalla el ingreso de un IP e imprima por pantalla el pais al que pertenece, la
ciudad, latitud y longitud, o “Invalido” en caso que no retorne nada valido.
En ambos casos utilice el servicio web:
http://ws.cdyne.com/ip2geo/ip2geo.asmx?WSDL
Buscar el servicio que brinda esta funcionalidad (u otro) en caso que el servicio no
este mas disponible.
5. Buscar un programa Java realizado con maven y transformarlo con anotaciones
en un Servicio Web.
6.- Diseñar dos aplicaciones donde cada aplicación invoca a un servicio distinto
seleccionados por usted.
Implementar las invocaciones.
7.- Se desa construir una aplicación Web que consulte un WS que invoca a otros
dos servicios web distintos.
Construya los modelos de la arquitectura de Vista de Modulo estilo Uso, Vista
Componente y Conectores; y la Vista de Asignación estilo Despliegue.
Implementar la aplicación diseñada.
8. Debe resolver con la mejor arquitectura posible el siguiente problema:
Se debe construir un sistema de seguridad en un museo. Se deben detectar por
reconocimiento facial si alguien ingresa al museo por algunas de las X puertas de
ingreso que posee el museo.
Asuma las siguientes hipótesis:
- Existe un algoritmo de reconocimiento de imagen integrado a la camara de
vigilancia.
- Usted debe lanzar los distintos procesos del mismo algoritmo de reconocimiento
(Objeto Reconocimiento con un método que se le pasa el Streaming y la BD de las
caras de personas).
- Hay un servicio que recibe la alarma en caso que surga algun reconocimiento de
las personas con acceso restringuido. Este servicio está desplegado en distintos
organismos de seguridad (Policía Federal, Gendarmería, Comiserías cercanas).
- Hay una BD con las caras de las personas con acceso restringuido.
- Hay una aplicación Web que permite ver el monitoreo de las camaras (asuma
que existe un objeto Streaming que permite visualizar las imagenes de una
camara en tiempo real).
Construya los modelos de la arquitectura de Vista de Modulo estilo Uso, Vista
Componente y Conectores; y la Vista de Asignación estilo Despliegue.
Desarrollar un prototipo esquemático de esta arquitectura implementandolo con
las tecnologías vistas hasta ahora (Servicios Web, Microservicios o Velocity)
según le sea conveniente.
Desarrollar este ejercicio 8 en grupos de dos personas.
