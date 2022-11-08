## Clases internas.
### Es una clase dentro de otra. Pueden tener el modificador private.
### Se utilizan para acceder a los campos privados de una clase desde otra clase.
### Para ocultar una clase de otras pertenecientes al mismo paquete.
### Cuando solo una clase debe acceder a los campos de ejemplar de otra clase.
### Existen clase internas "anónimas", útiles para la gestión de eventos y retrollamadas.

## Clases internas locales.
### No llevan modificadores de acceso. Si lo pones, da error.
### Útiles cuando solo se va a utilizar la clase una vez. El objetivo es simplificar más el código.
### Cuando su ámbito queda restringido al método donde son declaradas. Quedando más encapsulada y simple. 