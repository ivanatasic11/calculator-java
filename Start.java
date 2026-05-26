public class Start {
public static void main(String[] args) {
Calculator calc = new Calculator();
System.out.println("Pokretanje digitrona...");
// Primer pokretanja izraza iz zadatka
System.out.println("Rezultat za 4+5: " + calc.Calculate("4+5"));
}

// Jedinični test po ugledu na lekciju 'Nivoi testiranja'
public void testCalculateSimpleExpression() {
Calculator calc = new Calculator();
double expected = 9.0;
double actual = calc.Calculate("4+5");

if (actual == expected) {
System.out.println("Unit Test PROŠAO: Rezultat je 9.0");
} else {
System.out.println("Unit Test PAO: Očekivano " + expected + ", ali dobijeno " + actual);
}
}
}
