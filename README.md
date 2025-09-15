# Exercicis de Programació en Java

Aquest repositori conté exercicis pràctics per treballar **excepcions, classes, herència, interfícies i mètodes estàtics** en Java.

---

## 📌 Nivell 1

### 🔹 Exercici 1 – Productes i Vendes

Crea les següents classes:

- **Classe `Producte`**
  - Atributs: `nom`, `preu`

- **Classe `Venda`**
  - Atributs: col·lecció de `Producte`, `preuTotal`
  - Mètode `calcularTotal()`:
    - Si la col·lecció està buida → llença `VendaBuidaException` i mostra:
      ```
      Per fer una venda primer has d’afegir productes
      ```
    - Si hi ha productes → recorre la col·lecció i guarda la suma dels preus a `preuTotal`.

- **Classe `VendaBuidaException`**
  - Filla de `Exception`
  - Constructor rep el missatge:
    ```
    Per fer una venda primer has d’afegir productes
    ```
  - Quan capturem l’excepció, mostrem el missatge amb `getMessage()`.

- Escriu codi per **generar i capturar** una excepció de tipus `IndexOutOfBoundsException`.

---

### 🔹 Exercici 2 – Instruments Musicals

Hi ha tres tipus d’instruments:

- **Vent**
- **Corda**
- **Percussió**

Crea una classe abstracta `Instrument` amb:

- Atributs: `nom`, `preu`
- Mètode abstracte: `tocar()`

Implementació del mètode `tocar()` en les subclasses:

- Vent → mostra:  
