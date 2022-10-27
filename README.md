# UniSur
**José Antonio Aviña Méndez**

## Seminario de Sistermas Computacionales

### Actividad 3

La aplicación se puede compilar como:

+ Una aplicación convencional de Java; a través de la Clase Test.java
+ Un Agente para lo cual se requiere descargar la plataforma de Jade

**Observación:** no se utilizó ninguna **IDE** (e.g. eclipse, neetneans, ...). Bajo esta inteligencia el ambiente de desarrollo consistió en:

+ macOS Monterey
+ Bash terminal
+ Editor vim
+ Java JDK
+ Jade

### ¿Cómo compilar la aplicación java desde la terminal?

$ javac Test.java 

### ¿Cómo lanzar/ejecutar la aplicación java desde la terminal?

$ java Test 

### ¿Cómo compilar el agente desde la terminal?

$ javac -cp ~/DEVx/jade/lib/jade.jar:. GSLRAgent.java  

### ¿Cómo lanzar/ejecutar el agente desde la terminal?

$ java -cp ~/DEVx/jade/lib/jade.jar:. jade.Boot -gui slrAgent:GSLRAgent
