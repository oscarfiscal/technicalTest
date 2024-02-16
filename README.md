# Mi Aplicación Spring Boot

Esta es una aplicación Java Spring Boot que permite enviar datos a una API externa y luego mostrar y gestionar los registros guardados.

## Requisitos Previos

- Java 21 (o superior)
- Maven
- Conexión a Internet para acceder a la API externa

## Instalación

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```

2. Importa el proyecto en tu IDE de preferencia (por ejemplo, IntelliJ IDEA, Eclipse).

3. Ejecuta la aplicación desde tu IDE o mediante el siguiente comando Maven:

   ```bash
   mvn spring-boot:run
   ```

## Configuración

1. Asegúrate de tener configurada correctamente la URL de la API externa en el archivo `application.properties`.

   ```properties
   api.url=https://65ce3649c715428e8b40344b.mockapi.io/api/profile/
   ```

## Uso

1. Accede a la aplicación desde tu navegador web ingresando a `http://localhost:8080`.

2. Completa el formulario con los datos que deseas enviar a la API externa y haz clic en "Enviar".

3. Una vez enviado, podrás ver el registro guardado en la página de detalles y también acceder a todos los registros mediante el enlace correspondiente.

