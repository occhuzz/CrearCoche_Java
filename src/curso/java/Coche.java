package curso.java;

public class Coche
{
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;
    
    public Coche()
    {
        ruedas = 4;
        largo = 400;
        ancho = 100;
        motor = 1600;
        peso_plataforma = 500;
    }
    
    public String dime_datos_generales()    //Getter
    {
        return "La plataforma del vehiculo tiene "+ ruedas +" ruedas. Mide "+largo/100+" metros con un ancho de "+ancho/100+
                " metros y un peso de plataforma de "+peso_plataforma+" kilos.";
    }
    
    public void establece_color(String color_coche) //Setter
    {
        color = color_coche;
    }
    
    public String dime_color()
    {
        return "El color del coche es "+ color;
    }
    
    public void configura_asientos(String asientos_cuero)   //Setter Asientos
    {
        if(asientos_cuero.equalsIgnoreCase("si"))
        {
            this.asientos_cuero = true;
        }
        else
        {
            this.asientos_cuero = false;
        }
    }
    
    public String dime_asientos()   //Getter Asientos
    {
        if(asientos_cuero)
        {
            return "El coche tiene asientos de Cuero";
        }
        else
        {
            return "El coche NO tiene asientos de Cuero";
        }
    }
    
    public void configura_climatizador(String climatizador) //Setter Climatizador
    {
        if (climatizador.equalsIgnoreCase("si"))
        {
            this.climatizador=true;
        }
        else
        {
            this.climatizador=false;
        }
    }
    
    public String dime_climatizador()   //Getter Climatizador
    {
        if(climatizador)
        {
            return "El coche incorpora Climatizador";
        }
        else
        {
            return "El coche lleva Aire acondicionado";
        }
    }
    
    public String dime_peso_coche()
    {
        int peso_carroceria = 500;
        
        peso_total = peso_plataforma + peso_carroceria;
        
        if(asientos_cuero)
        {
            peso_total = peso_total + 50;
        }
        
        if(climatizador)
        {
            peso_total = peso_total + 20;
        }
        
        return "El peso del coche es " + peso_total;
    }
    
    public int dime_precio_coche()   //Getter
    {
        int precio_final = 10000;
        
        if(asientos_cuero)
        {
            precio_final += 2000;
        }
        
        if(climatizador)
        {
            precio_final += 1500;
        }
        
        return precio_final;
    }
    
}