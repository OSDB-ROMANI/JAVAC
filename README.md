# JAVAC
Come compilare e avviare file da console

Strutta:
  - Prova "package principale che contine il main (nome Prova.java)"
  -- classi "package secondarei che contiene le classi importate nel main (nome Persona.java)"
  - build "contiene i file .class"

Importate:
 - Prova.java - contiene il mail
    - specificare il package Prova;
    - importare la classe Persona specificando tutto il percorso: Prova.classi.Persona;
 - classi\Persona.java 
    - classe utilizzata nel main
    - specificare il package totale --> package Prova.Classi;

Per compilare:
  - Aprire una shell (cmd in windows)
  - Posizionarsi sulla directory con contiene Prova
  - digitare il comando javac -d build Prova\Prova.java
  
  Eseguire il codice:
  - posizionarsi nella cartella build
  - eseguire il comendo java 
          \build>java Prova.Prova
