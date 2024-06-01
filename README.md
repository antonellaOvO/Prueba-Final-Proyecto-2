# Prueba-Final-Proyecto-2

Parte 2: Migración a un sistema distribuido con métodos HTTP (proyecto 2)
El servicio de venta de vehículos desea migrar su sistema a una arquitectura distribuida. En esta nueva configuración, se mantendrán las funcionalidades de la clase Vehículo y sus métodos, pero la comunicación se realizará a través de métodos HTTP (GET, POST, PUT y DELETE). La base de datos seguirá siendo la misma, llamada vehiculos.

1. Mantener la clase Vehículo con sus atributos y métodos.

2. Creación del VehículoController:
Métodos HTTP:

GET para consultar todos los vehículos.
GET para consultar un vehículo por su ID.
POST para insertar un nuevo vehículo.
DELETE para eliminar un vehículo por su ID.
PUT para actualizar los datos de un vehículo.
GET para obtener la potencia media según el tipo de vehículo.
GET para obtener la potencia máxima según el tipo de vehículo.


3. Creación del VehículoRepository:
Métodos para interactuar con la base de datos vehiculos.


4. Creación de la clase Main para el servidor:
Configuración del servidor para manejar las solicitudes HTTP.


5. Configuración del archivo application.properties para la conexión a la base de datos.

6. Creación del archivo pom.xml con las dependencias necesarias para el proyecto.

*En este segundo proyecto se debe comprobar con Postman que los distintos métodos HTTP funcionan correctamente. Se deben entregar las pruebas de que los métodos funcionan correctamente (capturas de pantalla añadidas al PDF de la entrega).
