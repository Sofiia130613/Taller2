import javax.swing.JOptionPane;

public class ejercicio2 {


//2. Conversor de Monedas:
//Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de dinero de una moneda a otra, por ejemplo,
// de dólares a euros o de pesos a dólares.

    
    public static final String LIBRAS = "libras";
    public static final String DOLARES = "dolares";
    public static final String YENES = "yenes";
    public static final String PESOS = "pesos";
    public static final String WONES = "wones";
    

    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null,"Menú" + "\n" + "Conversión de euros a: "+ "\n"+"1. Libras"+ "\n"+"2. Yenes"+ "\n"+"3. Dolares"+ "\n"+"4. Pesos"+ "\n"+ "5. Wones");
        double euros = introducirEuros();
        String moneda = introducirMoneda();
        double cambio = cambiarMoneda(moneda, euros);
        imprimir(cambio);
    }

    public static double introducirEuros() {
        double euros = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce una cantidad de euros: "));
        return euros;
    }
    
    public static String introducirMoneda() {
        String moneda = (JOptionPane.showInputDialog(null,"Introduce el tipo de moneda de manera escrita:  "));
        switch (moneda.toLowerCase()) {
            case LIBRAS:
            case DOLARES:
            case YENES:
            case PESOS:
            case WONES:
                moneda = moneda.toLowerCase();
                break;
            default:
                moneda = null;
                JOptionPane.showMessageDialog(null,"Error, las opciones válidas son: " + LIBRAS + ", " + DOLARES + ", " + YENES + ","+PESOS+ ","+WONES);
        }
        if (moneda == null) {
            moneda = introducirMoneda();
        }
        JOptionPane.showMessageDialog(null,"La moneda introducida es " + moneda);
        return moneda;
    }
    public static double cambiarMoneda(String moneda, double euros) {
        double cambio = 0.0;
        switch (moneda) {
            case LIBRAS:
                cambio = euros * 0.87;
                break;
            case DOLARES:
                cambio = euros * 1.11;
                break;
            case YENES:
                cambio = euros * 120.63;
                break;
            case PESOS:
                cambio = euros * 4.441;
                break;
            case WONES:
                cambio = euros * 1.448;
                break;
        }
        return cambio;
    }
    public static void imprimir(double cambio) {
        JOptionPane.showMessageDialog(null,"El resultado de la conversión es " + String.format("%.3f", cambio));
    }
}
