
package unidades;

public class Temperatura {
    double out;
    
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Grados Celsius (ºC)":   this.celsius(cbout, in);        break;                  
            case "Gados Fahrenheit (ºF)": this.fahrenheit(cbout, in);     break;               
            case "Kelvin (K)":            this.kelvin(cbout, in);         break;       
        } 
        return out;   
    }
    
    public void celsius(String cbout, double in){
        switch (cbout){
            case "Grados Celsius (ºC)":   this.celsius_celsius(in);       break;
            case "Gados Fahrenheit (ºF)": this.celsius_fahrenheit(in);    break;
            case "Kelvin (K)":            this.celsius_kelvin(in);        break;
        }

    }
    
    public void fahrenheit(String cbout, double in){
        switch (cbout){
            case "Grados Celsius (ºC)":   this.fahrenheit_celsius(in);    break;
            case "Gados Fahrenheit (ºF)": this.fahrenheit_fahrenheit(in); break;
            case "Kelvin (K)":            this.fahrenheit_kelvin(in);     break;
        }
    }
    
    public void kelvin(String cbout, double in){
        switch (cbout){
            case "Grados Celsius (ºC)":   this.kelvin_celsius(in);        break;
            case "Gados Fahrenheit (ºF)": this.kelvin_fahrenheit(in);     break;
            case "Kelvin (K)":            this.kelvin_kelvin(in);         break;
        }
    }
    
    
    public void celsius_celsius(double in){
        out = in;
    }
    
    public void  celsius_fahrenheit(double in){
        out = (in * 9/5) + 32;
        System.out.print(out);
    }
    
    public void  celsius_kelvin(double in){
        out = in + 273.15;
    }

    public void  fahrenheit_celsius(double in){
        out = (in - 32) * 5/9;
    }

    public void  fahrenheit_fahrenheit(double in){
        out = in;
    }

    public void  fahrenheit_kelvin(double in){
        out = (in - 32)* 5/9 + 273.15;
    }

    public void  kelvin_celsius(double in){
        out = in - 273.15;
    }

    public void  kelvin_fahrenheit(double in){
        out = (in - 273.15) * 9/5 + 32;
    }
    
    public void  kelvin_kelvin(double in){
        out = in;
    }

}
