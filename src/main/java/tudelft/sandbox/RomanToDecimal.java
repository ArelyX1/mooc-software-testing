package tudelft.sandbox;
import java.util.Map;

public class RomanToDecimal {
    private static final Map<Character, Integer> VALUES = Map.of(
        'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
    );

    public int convert(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        // Validación técnica mediante Regex (Regla de oro de los números romanos)
        if (!s.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            throw new IllegalArgumentException("Formato romano inválido o fuera de rango (1-3999)");
        }

        int total = 0;
        int prevValue = 0;

        // Procesamiento de derecha a izquierda (Algoritmo O(n))
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = VALUES.get(s.charAt(i));
            
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}
