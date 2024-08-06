# API de Gestión de Usuarios

Este proyecto es una API RESTful para la gestión de usuarios, (un abm de la entidad), desarrollada con Spring Boot. El proposito de esta RestApi es practicar el desarrollo con esta tecnologia.

## Descripción del Proyecto

La API permite realizar operaciones CRUD (Crear, Leer, Actualizar, Borrar) sobre los usuarios del sistema. Cada usuario tiene un nombre, apellido, email y número de DNI. La API incluye validaciones para asegurar la integridad de los datos y manejar errores de manera adecuada.

## Características

- **CRUD de Usuarios**: Crear, leer, actualizar y eliminar usuarios.
- **Validación de Datos**: Uso de anotaciones para validar los datos recibidos del cliente.
- **Manejo de Excepciones**: Controlador global de excepciones para manejar errores de validación y otros errores.
- **Persistencia**: Uso de JPA y MySQL para la persistencia de datos.
- **Configuración de Spring Boot**: Configuración detallada en `application.properties`.

## Tecnologías Utilizadas

- **Spring Boot**: Herramienta del Framework Spring, para el desarrollo de la aplicación.
- **Spring Data JPA**: Para la persistencia de datos.
- **Hibernate**: Implementación de JPA.
- **MySQL**: Base de datos relacional.
- **Jakarta Validation**: Para la validación de datos (anotaciones como `@NotBlank`, `@Size`, `@Email`, etc).
- **Maven**: Gestior de dependencias.
- **Lombok**: Reducción de código boilerplate. (evito hacer a mano getters, setters, toString, entre otros..)

## Endpoints de la API

- **Crear Usuario**
  - **URL**: `/usuarios/crear`
  - **Método**: `POST`
  - **Body**: `{"nombre": "gianmarco", "apellido": "zodda", "email": "gianzodda@example.com", "dni": 3111544}`

- **Listar Usuarios**
  - **URL**: `/usuarios/listar`
  - **Método**: `GET`

- **Obtener Usuario por ID**
  - **URL**: `/usuarios/obtener/{id}`
  - **Método**: `GET`

- **Eliminar Usuario**
  - **URL**: `/usuarios/borrar/{id}`
  - **Método**: `DELETE`

- **Editar Usuario**
  - **URL**: `/usuarios/editar/{id}`
  - **Método**: `PUT`
  - **Body**: `{"nombre": "Juan", "apellido": "Pérez", "email": "juanperez@example.com", "dni": 12345678}`


## Comentarios

- Este es solo un proyecto de practica que hice hace un tiempo, cuando termine mi primer curso de Spring Boot a principios de este año. Mi objetivo con el es repasar mis habilidades con esta herramienta, para terminar un proyecto mas grande que estare subiendo mas adelante. Aqui, pruebo las diferentes anotaciones que existen para los atributos de la entidad y como, segun las que utilize, Hibernate (ORM que implementa JPA), se encarga de crear la tabla en la base de datos especificada, con las restricciones para cada uno de los campos segun corresponda.
