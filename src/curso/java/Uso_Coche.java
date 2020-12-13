package curso.java;

import javax.swing.*;

public class Uso_Coche
{
    
    public static void main(String[] args)
    {
        //Coche Renault = new Coche();
        //System.out.println(Renault.dime_largo());
        //System.out.println("Este coche tiene "+ Renault.ruedas + " ruedas.");
        
        Coche MiCoche = new Coche();
        System.out.println(MiCoche.dime_datos_generales());
        
        MiCoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
        System.out.println(MiCoche.dime_color());
        
        MiCoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero? -Si -No"));
        System.out.println(MiCoche.dime_asientos());
        
        MiCoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador? -Si -No"));
        System.out.println(MiCoche.dime_climatizador());
        
        System.out.println(MiCoche.dime_peso_coche());
        
        System.out.println("El precio final del coche es: " + MiCoche.dime_precio_coche());
    }
    
}
