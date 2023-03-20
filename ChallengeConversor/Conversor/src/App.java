import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Object[] opcion = {"Convertir Divisas", "Convertir Temperatura", "Salir"};
        int elije = JOptionPane.showOptionDialog(null, "¿Qué valor desea convertir?", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
        opcion, opcion[0]);

        if (elije == 2){
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if(elije == 0){
            DecimalFormat formatearDivisas = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while(continuarPrograma){
                String [] opciones = {"De Pesos a Dolares", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen",
                "De Pesos a Won Coreano", "De Dolar a Peso", "De Euro a Peso", "De Libras a Peso", "De Yen a Peso", "De Won Coreano a Peso"};
                String  cambio = (String) JOptionPane.showInputDialog(null,"Elije a la moneda que deseas convertir tu dinero: ", "Conversor de moneda", JOptionPane.QUESTION_MESSAGE,
                null, opciones,opciones[0]);
                String input = JOptionPane.showInputDialog(null, "Ingrese cantidad que desea convertir: ");
                double pesos = 0.00;
                try{
                    pesos = Double.parseDouble(input);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }

                if(cambio.equals("De Pesos a Dolares")){
                    double dolares = pesos / 18.74;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(dolares) + "Dolares");
                } else if(cambio.equals("De Pesos a Euros")){
                    double euro = pesos / 19.89;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(euro) + "Euros");
                } else if(cambio.equals("De Pesos a Libras")){
                    double libras = pesos / 22.70;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(libras) + "Libras");
                } else if(cambio.equals("De Pesos a Yen")){
                    double yen = pesos / 0.14;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(yen) + "Yen");
                } else if(cambio.equals("De Pesos a Won Coreano")){
                    double won = pesos / 0.014;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(won) + "Won");
                }else if(cambio.equals("De Dolar a Peso")){
                    double dolares = 18.74 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(dolares) + "Pesos");
                }else if(cambio.equals("De Euro a Peso")){
                    double euro = 19.89 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(euro) + "Pesos");
                }else if(cambio.equals("De Libras a Peso")){
                    double libras = 22.70 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(libras) + "Pesos");
                }else if(cambio.equals("De Yen a Peso")){
                    double yen = 0.14 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(yen) + "Pesos");
                }else if(cambio.equals("De Won Coreano a Peso")){
                    double won = 0.014 * pesos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + formatearDivisas.format(won) + "Pesos");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando el programa", "Confirmar",
                JOptionPane.YES_NO_CANCEL_OPTION);
                    if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                        continuarPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                
            }
        }
        if(elije == 1){
            boolean seguirPrograma = true;
            while(seguirPrograma){
                String[] opciones = {"Celsius a fahrenheit", "Fahrentheit a celsious"};
                int tempe = JOptionPane.showOptionDialog(null, "Elija una opcion: ", "Conversor de temperatura", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                double valor = 0.0;
                try{
                    valor = Double.parseDouble(valorNominal);
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }
                double resultado = 0;
                if(tempe == 0){
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null, "Grados celsius son: " + resultado + "Grados fahrenheit");
                } else if(tempe == 1){
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, "Grados fahrenheit son: " + resultado + "Grados celcius");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "Desea seguir usando el programa", "", JOptionPane.YES_NO_OPTION);
                if(continuar == JOptionPane.NO_OPTION){
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}
