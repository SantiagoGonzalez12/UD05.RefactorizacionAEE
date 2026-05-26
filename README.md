# AEE: Limpieza de Primavera — Refactorización de Código Legado

**Módulo:** Entornos de Desarrollo (EDD) | DAM 
**Centro:** Campus Cámara de Comercio Sevilla 
**Equipo:** Álvaro López de San Román | Santiago González
 
---

## ¿Qué hemos hecho?

Hemos refactorizado el método  de la clase `FacturacionLegacy.java`, un fragmento de código del sistema de facturación, sin alterar su comportamiento. Los tests de _JUnit 5_ salieron en verde en todo momento excepto en uno que otro error sin importancia, los cuales podíamos ignorar por recomendación del profesor.


###  Álvaro López — Turnos 1, 3 y 6 (Piloto)

* **Turno 1 (Análisis Inicial):** Clonó el repositorio base y ejecutó la zona de pruebas unitarias _JUnit 5_ para asegurar la red de seguridad donde nos salieron los Tests en verde. Realizó un analisis completo del codigo: variables (`m`, `tC`, `dV`), números incrustados y código espagueti con excesivos `if-else` en donde alguno le falta un corchete.

* **Turno 3 (Extracción de Constantes):** Seleccionó todos los valores numéricos del negocio (`0.25`, `0.15`, `0.05`, `1`, `2`) y los extrajo de forma segura utilizando el IDE a constantes de clase `private static final` escritas en MAYÚSCULAS.

* **Turno 6 (Cierre de Versión y Push):** Llevó a cabo la auditoría técnica final del método refactorizado, validó que las pruebas unitarias continuaran en verde y terminó el repositorio para su entrega definitiva en GitHub.


###  Santiago González — Turnos 2, 4 y 5 (Copiloto)

* **Turno 2 (Renombrado Semántico):** Utilizó de manera correcta la herramienta automática `Refactor -> Rename` (_Ctrl + R_) del IDE NetBeans para renombrar los identificadores por variables con alta carga semántica de negocio: `cT` por `calcularTotal`, `m` por `importeBase`, `tC` por `tipoCliente` y `dV` por `esSocioVip`.

* **Turno 4 (Optimización de Estructura):** Eliminó la integridad del código deshaciéndose de todos los bloques `else` del sistema. Aplicó cláusulas de guarda invirtiendo así el flujo lógico para "aplanar" el código verticalmente.

* **Turno 5 (Documentación Avanzada):** Redactó y añadió la estructura de documentación estándar JavaDoc en la cabecera del método para detallar el propósito de la función, el uso de las cláusulas de guarda, los parámetros de entrada (`@param`) y la salida esperada (`@return`).

---

### Problemas Generales

Al principio nos hemos confundido con las libreias y no encontrabamos el _JUnit 5_, entonces hemos entrado en la documentación de git de Willman y lo hemos podido hacer bien. 
Por otro lado, no nos ha hecho falta agentes de IA gracias a la documentación, siguiendola paso a paso lo hemos podido hacer correctamente.
Por último, por no leer al principio la documentación nos frustramos en algunas situaciones, pero hemos mantenido la calma y lo hemos podidio solucionar. 
En general hemos aprendido mucho con este entorno de Desarrollo ya que hemos visto como se importa las librerías de _JUnit 5_.

---

## Resultado final
| Criterio | Qué hemos entregado |
|---|---|
| Complejidad | Cero bloques `else`, flujo completamente vertical con cláusulas de guarda |
| Uso del IDE | Variables semánticas en camelCase y constantes en SNAKE_CASE, sin números mágicos |
| Documentación | JavaDoc completo con `@param` y `@return` |
| Control de versiones | 6 commits en total semánticos con prefijos `chore:`, `refactor:` y `docs:` |




