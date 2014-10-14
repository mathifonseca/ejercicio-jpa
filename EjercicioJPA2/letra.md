#Ejercicio JPA 2

Una casa de cambio quiere empezar a destacarse de la competencia ofreciendo nuevos servicios. Su sitio web tiene demasiado contenido y las pruebas de usabilidad realizadas recientemente demuestran que la gran mayoría de los usuarios solamente ingresan para consultar las cotizaciones diarias. Además, los empleados están cansados de recibir llamadas telefónicas para consultar por estas cotizaciones.

Otras casas de cambio ofrecen widgets embeddables en otros sitios, pero también se quieren ofrecer las cotizaciones a través de un Web Service que pueda integrarse con sistemas de facturación externos desarrollados en cualquier plataforma.

Además, se quiere implementar este Web Service de manera que al agregar nuevas sucursales de la casa en distintos lugares, se puedan integrar al sistema a través de él. Por lo tanto, los usuarios pueden ser empleados de la empresa o cualquier persona en el mundo.

Cada moneda en el sistema tiene un código que respeta las normas ISO y un nombre que la describe.

Cualquier usuario sin ningún tipo de autentificación puede consultar las cotizaciones actuales de las monedas. Estas consultas no pueden demorar más de 20 ms.

Los empleados de la empresa pueden tener distintos roles y permisos. Por ejemplo, algunos pueden agregar monedas pero no cotizaciones, otros solo cotizaciones, etc.

Cada día, un proceso automático actualiza la cotización actual de las monedas a partir de un archivo de texto con determinado formato.

El historial de cotizaciones se mantiene para poder ser consultado en el futuro. Sin embargo, las cotizaciones mayores a dos años son descartadas de todas las consultas que no lo soliciten puntualmente.

Los clientes registrados pueden solicitar que se les alerte cuando la cotización de cierta moneda llegue a determinado valor.

Existen procesos largos que generan distintos reportes en Excel para que los economistas puedan analizar los datos cómodamente. Estos reportes no deben afectar a la disponibilidad ni eficiencia del sistema.

Un cliente solicita un servicio especial en el que dado un costo de un producto, una fecha y una moneda origen, se retorna el costo del producto en la moneda destino teniendo en cuenta la cotización para esa fecha.

El sistema actual está desarrollado en JavaEE. El equipo de desarrollo es experto en esta tecnología y son reacios a aprender otras.

La base de datos de la empresa es Oracle 10g y se cuenta con un contrato a 50 años que no permite cambiarla. Sin embargo, la información legal sobre los empleados contadores está en una base de datos SQL Server, de la cual se debe poder obtener datos de manera transparente.