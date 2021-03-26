
package unidades;


public class Presion {
    double out;
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Atmosfera":              this.atmosfera(cbout, in);     break;                  
            case "Bar":                    this.bar(cbout, in);           break;               
            case "psi":                    this.psi(cbout, in);           break;
            case "Milimetros de Mercurio": this.mmhg(cbout, in);          break;
            case "Hectopascal/Milibar":    this.hectopascal(cbout, in);   break;
            case "Kilopascal":             this.kilopascal(cbout, in);    break;          
            case "Pascal":                 this.pascal(cbout, in);        break;            
        }
        return out;   
    }
    
    public void atmosfera(String cbout, double in){
        switch (cbout){
            case "Atmosfera":              this.atmosfera_atmosfera(in);  break;
            case "Bar":                    this.atmosfera_bar(in);        break;
            case "psi":                    this.atmosfera_psi(in);        break;
            case "Milimetros de Mercurio": this.atmosfera_mmhg(in);       break;
            case "Hectopascal/Milibar":    this.atmosfera_hectopascal(in);break;
            case "Kilopascal":             this.atmosfera_kilopascal(in); break;
            case "Pascal":                 this.atmosfera_pascal(in);     break;
        }
    }
    
    public void bar(String cbout, double in){
        switch (cbout){
            case "Atmosfera":               this.bar_atmosfera(in);       break;
            case "Bar":                     this.bar_bar(in);             break;
            case "psi":                     this.bar_psi(in);             break;
            case "Milimetros de Mercurio":  this.bar_mmhg(in);            break;
            case "Hectopascal/Milibar":     this.bar_hectopascal(in);     break;
            case "Kilopascal":              this.bar_kilopascal(in);      break;
            case "Pascal":                  this.bar_pascal(in);          break;
        }
    }
    
    public void psi(String cbout, double in){
        switch (cbout){
            case "Atmosfera":              this.psi_atmosfera(in);        break;
            case "Bar":                    this.psi_bar(in);              break;
            case "psi":                    this.psi_psi(in);              break;
            case "Milimetros de Mercurio": this.psi_mmhg(in);             break;
            case "Hectopascal/Milibar":    this.psi_hectopascal(in);      break;
            case "Kilopascal":             this.psi_kilopascal(in);       break;
            case "Pascal":                 this.psi_pascal(in);           break;
        }
    }
    
    public void mmhg(String cbout, double in){
        switch (cbout){
            case "Atmosfera":              this.mmhg_atmosfera(in);       break;
            case "Bar":                    this.mmhg_bar(in);             break;
            case "psi":                    this.mmhg_psi(in);             break;
            case "Milimetros de Mercurio": this.mmhg_mmhg(in);            break;
            case "Hectopascal/Milibar":    this.mmhg_hectopascal(in);     break;
            case "Kilopascal":             this.mmhg_kilopascal(in);      break;
            case "Pascal":                 this.mmhg_pascal(in);          break;
        }
    }
    
    public void hectopascal(String cbout, double in){
        switch (cbout){
            case "Atmosfera":              this.hectopascal_atmosfera(in);   break;
            case "Bar":                    this.hectopascal_bar(in);         break;
            case "psi":                    this.hectopascal_psi(in);         break;
            case "Milimetros de Mercurio": this.hectopascal_mmhg(in);        break;
            case "Hectopascal/Milibar":    this.hectopascal_hectopascal(in); break;
            case "Kilopascal":             this.hectopascal_kilopascal(in);  break;
            case "Pascal":                 this.hectopascal_pascal(in);      break;
        }
    }
    
    public void kilopascal(String cbout, double in){
        switch (cbout){
            case "Atmosfera":              this.kilopascal_atmosfera(in);   break;
            case "Bar":                    this.kilopascal_bar(in);         break;
            case "psi":                    this.kilopascal_psi(in);         break;
            case "Milimetros de Mercurio": this.kilopascal_mmhg(in);        break;
            case "Hectopascal/Milibar":    this.kilopascal_hectopascal(in); break;
            case "Kilopascal":             this.kilopascal_kilopascal(in);  break;
            case "Pascal":                 this.kilopascal_pascal(in);      break;
        }
    }
    
    public void pascal(String cbout, double in){
        switch (cbout){
            case "Atmosfera":              this.pascal_atmosfera(in);     break;
            case "Bar":                    this.pascal_bar(in);           break;
            case "psi":                    this.pascal_psi(in);           break;
            case "Milimetros de Mercurio": this.pascal_mmhg(in);          break;
            case "Hectopascal/Milibar":    this.pascal_hectopascal(in);   break;
            case "Kilopascal":             this.pascal_kilopascal(in);    break;
            case "Pascal":                 this.pacal_pascal(in);         break;
        }
    }
    
    public void atmosfera_atmosfera(double in){
        out = in;
    }
    
    public void  atmosfera_bar(double in){
        out = in * 1.01325;
    }
    
    public void  atmosfera_psi(double in){
        out = in * 14.6959;
    }
    
    public void  atmosfera_mmhg(double in){
        out = in * 760;
    }
    
    public void  atmosfera_hectopascal(double in){
        out = in * 1013.249966;
    }
    
    public void  atmosfera_kilopascal(double in){
        out = in * 101.3249966;
    }

    public void  atmosfera_pascal(double in){
        out = in * 101325;
    }

    public void  bar_atmosfera(double in){
        out = in / 1.01325;
    }

    public void  bar_bar(double in){
        out = in;
    }

    public void  bar_psi(double in){
        out = in * 14.5038;
    }

    public void  bar_mmhg(double in){
        out = in * 750.062;
    }

    public void  bar_hectopascal(double in){
        out = in * 1000;
    }

    public void  bar_kilopascal(double in){
        out = in * 100;
    }

    public void  bar_pascal(double in){
        out = in * 100000;
    }

    public void  psi_atmosfera(double in){
        out = in / 14.6959;
    }

    public void  psi_bar(double in){
        out = in / 14.5038;
    }
    
    public void  psi_psi(double in){
        out = in;
    }
    
    public void  psi_mmhg(double in){
        out = in * 51.7149;
    }
    
    public void  psi_hectopascal(double in){
        out = in * 68.947591;
    }
    
    public void  psi_kilopascal(double in){
        out = in * 6.8947591;
    }
    
    public void  psi_pascal(double in){
        out = in * 6894.7591;
    }

    public void  mmhg_atmosfera(double in){
        out = in / 760;
    }

    public void  mmhg_bar(double in){
        out = in / 750.062;
    }
    
    public void  mmhg_psi(double in){
        out = in / 51.7146;
    }
    
    public void  mmhg_mmhg(double in){
        out = in;
    }
    
    public void  mmhg_hectopascal(double in){
        out = in * 1.33322;
    }
    
    public void  mmhg_kilopascal(double in){
        out = in / 7.50062;
    }
    
    public void  mmhg_pascal(double in){
        out = in * 133.322;
    }
    
    public void  hectopascal_atmosfera(double in){
        out = in / 1013.25;
    }
    
    public void  hectopascal_bar(double in){
        out = in / 1000;
    }
    
    public void  hectopascal_psi(double in){
        out = in / 68.9476;
    }
    
    public void  hectopascal_mmhg(double in){
        out = in / 1.33322;
    }
    
    public void  hectopascal_hectopascal(double in){
        out = in;
    }
    
    public void  hectopascal_kilopascal(double in){
        out = in / 10;
    }
    
    public void  hectopascal_pascal(double in){
        out = in * 100;
    }
    
    public void  kilopascal_atmosfera(double in){
        out = in / 101.325;
    }
    
    public void  kilopascal_bar(double in){
        out = in / 100;
    }
    
    public void  kilopascal_psi(double in){
        out = in / 6.89476;
    }
    
    public void  kilopascal_mmhg(double in){
        out = in * 7.50062;
    }
    
    public void  kilopascal_hectopascal(double in){
        out = in *10;
    }
    
    public void  kilopascal_kilopascal(double in){
        out = in;
    }
    
    public void  kilopascal_pascal(double in){
        out = in * 1000;
    }
    
    public void  pascal_atmosfera(double in){
        out = in / 101325;
    }
    
    public void  pascal_bar(double in){
        out = in / 100000;
    }
    
    public void  pascal_psi(double in){
        out = in / 6894.76;
    }
    
    public void  pascal_mmhg(double in){
        out = in / 133.322;
    }
    
    public void  pascal_hectopascal(double in){
        out = in / 100;
    }
    
    public void  pascal_kilopascal(double in){
        out = in / 1000;
    }
    
    public void  pacal_pascal(double in){
        out = in;
    }

}
