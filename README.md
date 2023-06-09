# Examen parcial

Examen parcial de la asignatura **Programación II** del [Grado de Ingeniería Informática](https://www.uneatlantico.es/escuela-politecnica-superior/estudios-grado-oficial-en-ingenieria-informatica) la [Universidad Europea del Atlántico](https://www.uneatlantico.es). 

## 📝 Instrucciones

* Cada ejercicio debe ir en un paquete y respetar el esqueleto inicial del proyecto tal como lo indicado [acá](esqueleto/examen-parcial-p2).
* El presente examen debe desarrollarse con los conceptos de programación vistos en clase hasta la sesión anterior a este examen.
* Se deben además respetar los conceptos de código limpio:
  * Indentación.
  * Nombrado adecuado de la clase, las constantes y las variables. 
  * Orden en el código. 
  * Manejar un mismo idioma, como lo explicado en clase se usará Inglés.
* Para la entrega:
  * Haga un fork de éste repositorio.
  * En su repositorio, dentro de la carpeta entregas cree una carpeta con su nombre y apellido en formato `apellidoNombre` (ejemplo: `elderBol`).
  * Publique allí su código fuente en formato compilable, el proyecto puede llamarse `examen-parcial-p2`.
  * Al terminar, realice un pull request a este repositorio con el título: `nombre.apellido + examen parcial P2`.
  
> Muy importante: no se corregirán entregas que obvien las reglas anteriormente indicadas o que se envíen fuera del plazo de entrega del examen.

## 🧠 Enunciado ejercicio 1: Citas para mascotas

**Ubicación**: Paquete `main.ex1`

**Cliente**: Veterinaria "Mascotas Felices"

**Necesidad**: Automatizar el registro de citas y clientes para una gestión más eficiente.

**Problema**: La veterinaria actualmente lleva un registro manual de los clientes y citas programadas, 
lo que resulta en una gestión lenta y poco efectiva. Es necesario un sistema de citas que permita llevar un registro
automatizado de los clientes, las mascotas y las citas programadas, para mejorar la eficiencia en la gestión de la veterinaria.

**Solución**: Desarrollar un sistema de citas que permita crear citas con la fecha, el dueño y diferentes tipos de 
mascotas, según se especifica en el diagrama de clases proporcionado. El sistema debe ser capaz de cargar los clientes 
desde un archivo utilizando la clase `FileHandler`, y debe pasar todas las pruebas proporcionadas. Con esta solución, 
la veterinaria "Mascotas Felices" podrá mejorar la gestión de sus citas y clientes, logrando una mayor eficiencia en su funcionamiento.

Implementar las funcionalidades basándonos en el [diagrama UML](entregas/diegoBarraza/src/main/ex1/ex1-0.png) planteado para que los tests pasen satisfactoriamente 
desarrolladas en el paquete **test.ex1**. 
> Puede cambiar/agregar en las clases lo que considere oportuno para la resolución del ejercicio.

### Diagrama de clases:
[![](entregas/diegoBarraza/src/main/ex1/ex1-0.png)](entregas/diegoBarraza/src/main/ex1/ex1.puml)

> Los siguientes test los encontrará en el paquete `test.ex1`

### `AppointmentTest`
#### Métodos a probar
* [ ] `testToString()`: Validar que retorna un String con el siguiente formato `[dd/mm/yyyy] - nombre completo dueño - nombre mascota - descripción`
#### Clase probada: Appointment
En la clase `Appointment` en el método toString debe retornar un string con este formato.

#### Ejemplo de salida:
``` shell
[25/03/2023] - Emily Smith - Fido - Vaccinatio
```


### `CustomDateTest`
#### Métodos a probar
* [ ] `testToString()`: Validar que se retorne la fecha en formato dd/mm/yyyy
* [ ] `format()`: Validar que se retorne la fecha en formato dd`separador`mm`separador`aaaa
### Clase probada: CustomDate
En la clase `CustomDate` en el método `toString`() retorna la fecha en formato `dd/mm/aaaa`.

#### Ejemplo de salida:
``` shell
25/03/2023
```



En la clase `CustomDate` en el método **format** dado un carácter separador retorna la fecha en formato dd`separador`mm`separador`aaaa.
#### Ejemplo:
* **separador**: `-`
* **retorna**: `dd-mm-aaaa`
#### Ejemplo de salida:
``` shell
25-03-2023
```


### `ClientTest` 
#### Métodos a probar
testEquals(): Validar que dos clientes se consideran igual si tienen el mismo nombre y apellido
#### Clase probada: `Client`
En la clase Client en el método `equals()` que recibe como parámetro otro cliente y debe validar si el cliente ingresado 
es igual a él, se consideran como iguales si el nombre y apellido coinciden.

### `ManagementSystemTest` → 2 puntos
#### Métodos a probar
* [ ] `loadClients()`: Validar que se hayan cargado todos los clientes del archivo clients.dat, en total son 64 clientes.
* [ ]  `addAppointment()`: Validar que se añade una nueva cita, pero se debe de validar que el cliente lo tengamos primero
* registrado en la lista de clientes cargados desde el archivo.

#### Clase probada: `ManagementSystem`
En la clase `ManagementSystem` en el método `loadData()`  que recibe como parámetro una ruta de archivo debe de cargar
los datos de los clientes y guardarlo en una lista.
En la misma clase en `addAppointment()` recibe dos parámetros la cita (un `Appointment`) y un cliente, con el objetivo 
de validar primero si es un cliente registrado la lista de clientes cargado previamente. Si es un cliente de la lista 
de clientes que tenemos registrados se añade una nueva cita y se asigna como dueño de la mascota el cliente ingresado con el método `setOwner()`.

## PUNTO EXTRA (OPCIONAL)
En la clase `ManagementSystem` agregar una funcionalidad donde dada una fecha en formato `dd-mm-aaaa` permitir listar todas las citas dada la fecha ingresada.
``` shell
Entrada: 01-02-2020
``` 
``` shell
Salida esperada:
[01-02-2020 13:30] Garfield - rabies shot
[01-02-2020 14:00] Fido - Radiology
```

## 🧠 Enunciado Ejercicio 2: Clases abstractas y polimorfismo

**Ubicación**: Paquete `main.ex2`
> En este ejercicio, su objetivo es implementar el diagrama propuesto para validar el uso de las clases abstractas y el concepto de polimorfismo. 
> A continuación, se presentan las instrucciones para llevar a cabo el ejercicio:

* Lea cuidadosamente el diagrama propuesto y asegúrese de comprender la estructura y las relaciones entre las clases abstractas y las clases concretas.
* Documente su código de manera clara y concisa, explicando las decisiones tomadas y los problemas encontrados durante la implementación.

Implemente la superclase `Shape` y sus subclases `Circle`, `Rectangle` y `Square`, como se muestra en el diagrama de clases.
### Diagrama de clases:
[![](entregas/diegoBarraza/src/main/ex2/ex2.png)](entregas/diegoBarraza/src/main/ex2/ex2.puml)

> `Shape` es una clase abstracta que contiene 2 métodos abstractos: `getArea()` y `getPerimeter()`, donde sus subclases 
> concretas deben proporcionar su implementación. Todas las variables de instancia tendrán acceso protegido, es decir, 
> accesibles por sus subclases y clases en el mismo paquete. Marque todos los métodos a sobreescribir en las 
> clases hijas con la anotación `@Override`.

Shape debe contener:

* [ ] Dos variables de instancia protegidas `color` (String) y `filled` (boolean). Se puede acceder a las variables 
protegidas por sus subclases y clases en el mismo paquete.
* [ ] Getter y setter para todas las variables de instancia y `toString()`.
* [ ]  Dos métodos abstractos `getArea()` y `getPerimeter()`, mostrado en cursiva en el diagrama de clases.
* [ ]  Dependiendo que clase el método `toString()` retorna una cadena con el formato especificado en las notas del diagrama (en color amarillo).


Las subclases `Circle` y `Rectangle` sobreescribirán los métodos abstractos `getArea()` y `getPerimeter()` y proporcionarán 
la implementación adecuada. También anulan `toString()`.

> Todas las funciones implementadas las debe de usar en una clase Main en `test.ex2` como prueba de que funcionan.


## Links de interés
* [PlantUML](https://plantuml.com/es/)
* [PlantUML - Clases](https://plantuml.com/es/class-diagram)
* [ Formatear strings en Java](https://www.geeksforgeeks.org/java-string-format-method-with-examples/)
* [Java - Formatear números](https://stackoverflow.com/questions/28277181/how-can-i-format-an-integer-to-dd-format)
* [Leer archivos en Java](https://www.geeksforgeeks.org/different-ways-reading-text-file-java/)
* [Split en Java](https://www.geeksforgeeks.org/split-string-java-examples/)
* [replaceAll en Java](https://www.geeksforgeeks.org/matcher-replaceallstring-method-in-java-with-examples)
