# Prueba Selenium Actions

Repositorio que contiene pruebas automatizadas desarrolladas con Selenium para validar funcionalidades de aplicaciones web.

## Descripción

Este proyecto incluye ejemplos de automatización de pruebas utilizando Selenium WebDriver.  
El objetivo es demostrar cómo ejecutar pruebas automatizadas y cómo integrarlas con procesos de integración continua.

## Tecnologías utilizadas

- Java
- Selenium WebDriver
- Maven
- GitHub Actions
- JUnit / TestNG (según configuración del proyecto)

## Estructura del proyecto

src/test/java  
Contiene las clases de pruebas automatizadas.

src/main/java  
Contiene clases de soporte o configuración del proyecto.

pom.xml  
Archivo de configuración de Maven donde se definen las dependencias del proyecto.

.github/workflows  
Contiene la configuración de GitHub Actions para la ejecución automática de las pruebas.

## Ejecución de pruebas

Para ejecutar las pruebas de forma local:

1. Clonar el repositorio

git clone https://github.com/usuario/repositorio.git

2. Ingresar al proyecto

cd repositorio

3. Ejecutar las pruebas

mvn test

## Integración continua

El proyecto utiliza GitHub Actions para ejecutar automáticamente las pruebas cada vez que se realiza un push al repositorio.

## Autor

Proyecto de práctica para automatización de pruebas con Selenium.
