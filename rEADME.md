# Izveštaj o statičkoj analizi koda

**Ukupan LOC (Lines of Code):** 67 linija koda 

## Zapažanja (Code Smell / Propusti):
* Calculator.java – linija 3 – Klasi 'Calculator' nedostaje modifikator pristupa (npr. 'public class Calculator') što je loša praksa za vidljivost klasa u Javi.
* Calculator.java – linija 29 – U metodi 'div' (deljenje) vrši se deljenje brojeva bez prethodne provere da li je delilac nula (b == 0), što može dovesti do prekida rada programa (ArithmeticException).
* Calculator.java – linije 5, 11, 17, 23, 29 – Nazivi parametara 'a' i 'b' u metodama su previše kratki i neinformativni. 
* Start.java – linija 3 – U 'main' metodi se instancira klasa Calculator, ali se rezultat operacija ispisuje direktno bez ikakve provere korisničkog unosa ili obrade potencijalnih grešaka.
