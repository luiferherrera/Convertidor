
package unidades;


public class Volumen {
   double out;
    
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Barril":            this.barril(cbout, in);       break;                  
            case "Metro Cubico":      this.m3(cbout, in);           break;               
            case "Centimetro Cubico": this.cm3(cbout, in);          break;
            case "Litro":             this.litro(cbout, in);        break;
            case "Mililitro":         this.ml(cbout, in);           break;          
        } 
        return out;   
    }
    
    public void barril(String cbout, double in){
        switch (cbout){
            case "Barril":            this.barril_barril(in);       break;
            case "Metro Cubico":      this.barril_m3(in);           break;
            case "Centimetro Cubico": this.barril_cm3(in);          break;
            case "Litro":             this.barril_litro(in);        break;
            case "Mililitro":         this.barril_ml(in);           break;
        }

    }
    
    public void m3(String cbout, double in){
        switch (cbout){
            case "Barril":            this.m3_barril(in);           break;
            case "Metro Cubico":      this.m3_m3(in);               break;
            case "Centimetro Cubico": this.m3_cm3(in);              break;
            case "Litro":             this.m3_litro(in);            break;
            case "Mililitro":         this.m3_ml(in);               break;
        }
    }
    
    public void cm3(String cbout, double in){
        switch (cbout){
            case "Barril":            this.cm3_barril(in);          break;
            case "Metro Cubico":      this.cm3_m2(in);              break;
            case "Centimetro Cubico": this.cm3_cm3(in);             break;
            case "Litro":             this.cm3_litro(in);           break;
            case "Mililitro":         this.cm3_ml(in);              break;
        }
    }
    
    public void litro(String cbout, double in){
        switch (cbout){
            case "Barril":            this.litro_barril(in);        break;
            case "Metro Cubico":      this.litro_m3(in);            break;
            case "Centimetro Cubico": this.litro_cm3(in);           break;
            case "Litro":             this.litro_litro(in);         break;
            case "Mililitro":         this.litro_ml(in);            break;
        }
    }
    
    public void ml(String cbout, double in){
        switch (cbout){
            case "Barril":            this.ml_barril(in);           break;
            case "Metro Cubico":      this.ml_m3(in);               break;
            case "Centimetro Cubico": this.ml_cm3(in);              break;
            case "Litro":             this.ml_litro(in);            break;
            case "Mililitro":         this.ml_ml(in);               break;
        }
    }
    
    
    
    public void barril_barril(double in){
        out = in;
    }
    
    public void  barril_m3(double in){
        out = in /6.28981;
    }
    
    public void  barril_cm3(double in){
        out = in * 158987.3;
    }
    
    public void  barril_litro(double in){
        out = in * 158.9873;
    }
    
    public void  barril_ml(double in){
        out = in * 158987.3;
    }

    public void  m3_barril(double in){
        out = in * 6.28981;
    }

    public void  m3_m3(double in){
        out = in;
    }

    public void  m3_cm3(double in){
        out = in * 1e6;
    }

    public void  m3_litro(double in){
        out = in * 1000;
    }

    public void  m3_ml(double in){
        out = in * 1e6;
    }

    public void  cm3_barril(double in){
        out = in / 158987.3;
    }

    public void  cm3_m2(double in){
        out = in / 1e6;
    }
    
    public void  cm3_cm3(double in){
        out = in;
    }
    
    public void  cm3_litro(double in){
        out = in / 1000;
    }
    
    public void  cm3_ml(double in){
        out = in *1;
    }

    public void  litro_barril(double in){
        out = in / 158.9873;
    }

    public void  litro_m3(double in){
        out = in / 1000;
    }
    
    public void  litro_cm3(double in){
        out = in * 1000;
    }
    
    public void  litro_litro(double in){
        out = in;
    }
    
    public void  litro_ml(double in){
        out = in *1000;
    }
    
    public void  ml_barril(double in){
        out = in / 158987.3;
    }
    
    public void  ml_m3(double in){
        out = in / 1e6;
    }
    
    public void  ml_cm3(double in){
        out = in * 1;
    }
    
    public void  ml_litro(double in){
        out = in /1000;
    }
    
    public void  ml_ml(double in){
        out = in;
    }
}
