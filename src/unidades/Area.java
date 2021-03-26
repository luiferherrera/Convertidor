
package unidades;

public class Area {
    double out;
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Kilometro Cuadrado":  this.km2(cbout, in);            break;                  
            case "Metro Cuadrado":      this.m2(cbout, in);             break;               
            case "Centimetro Cuadrado": this.cm2(cbout, in);            break;
            case "Milla Cuadrada":      this.mi2(cbout, in);            break;
            case "Yarda Cuadrada":      this.yd2(cbout, in);            break;
            case "Pie Cuadrado":        this.ft2(cbout, in);            break;          
            case "Hectarea":            this.hectarea(cbout, in);       break;            
        }
        return out;   
    }
    
    public void km2(String cbout, double in){
        switch (cbout){
            case "Kilometro Cuadrado":  this.km2_km2(in);               break;
            case "Metro Cuadrado":      this.km2_m2(in);                break;
            case "Centimetro Cuadrado": this.km2_cm2(in);               break;
            case "Milla Cuadrada":      this.km2_mi2(in);               break;
            case "Yarda Cuadrada":      this.km2_yd2(in);               break;
            case "Pie Cuadrado":        this.km2_ft2(in);               break;
            case "Hectarea":            this.km2_hectarea(in);          break;
        }
    }
    
    public void m2(String cbout, double in){
        switch (cbout){
            case "Kilometro Cuadrado":  this.m2_km2(in);                break;
            case "Metro Cuadrado":      this.m2_m2(in);                 break;
            case "Centimetro Cuadrado": this.m2_cm2(in);                break;
            case "Milla Cuadrada":      this.m2_mi2(in);                break;
            case "Yarda Cuadrada":      this.m2_yd2(in);                break;
            case "Pie Cuadrado":        this.m2_ft2(in);                break;
            case "Hectarea":            this.m2_hectarea(in);           break;
        }
    }
    
    public void cm2(String cbout, double in){
        switch (cbout){
            case "Kilometro Cuadrado":  this.cm2_km2(in);               break;
            case "Metro Cuadrado":      this.cm2_m2(in);                break;
            case "Centimetro Cuadrado": this.cm2_cm2(in);               break;
            case "Milla Cuadrada":      this.cm2_mi2(in);               break;
            case "Yarda Cuadrada":      this.cm2_yd2(in);               break;
            case "Pie Cuadrado":        this.cm2_ft2(in);               break;
            case "Hectarea":            this.cm2_hectarea(in);          break;
        }
    }
    
    public void mi2(String cbout, double in){
        switch (cbout){
            case "Kilometro Cuadrado":  this.mi2_km2(in);               break;
            case "Metro Cuadrado":      this.mi2_m2(in);                break;
            case "Centimetro Cuadrado": this.mi2_cm2(in);               break;
            case "Milla Cuadrada":      this.mi2_mi2(in);               break;
            case "Yarda Cuadrada":      this.mi2_yd2(in);               break;
            case "Pie Cuadrado":        this.mi2_ft2(in);               break;
            case "Hectarea":            this.mi2_hectarea(in);          break;
        }
    }
    
    public void yd2(String cbout, double in){
        switch (cbout){
            case "Kilometro Cuadrado":  this.yd2_km2(in);               break;
            case "Metro Cuadrado":      this.yd2_m2(in);                break;
            case "Centimetro Cuadrado": this.yd2_cm2(in);               break;
            case "Milla Cuadrada":      this.yd2_mi2(in);               break;
            case "Yarda Cuadrada":      this.yd2_yd2(in);               break;
            case "Pie Cuadrado":        this.yd2_ft2(in);               break;
            case "Hectarea":            this.yd2_hectarea(in);          break;
        }
    }
    
    public void ft2(String cbout, double in){
        switch (cbout){
            case "Kilometro Cuadrado":  this.ft2_km2(in);               break;
            case "Metro Cuadrado":      this.ft2_m2(in);                break;
            case "Centimetro Cuadrado": this.ft2_cm2(in);               break;
            case "Milla Cuadrada":      this.ft2_mi2(in);               break;
            case "Yarda Cuadrada":      this.ft2_yd2(in);               break;
            case "Pie Cuadrado":        this.ft2_ft2(in);               break;
            case "Hectarea":            this.ft2_hectarea(in);          break;
        }
    }
    
    public void hectarea(String cbout, double in){
        switch (cbout){
            case "Kilometro Cuadrado":  this.hectarea_km2(in);          break;
            case "Metro Cuadrado":      this.hectarea_m2(in);           break;
            case "Centimetro Cuadrado": this.hectarea_cm2(in);          break;
            case "Milla Cuadrada":      this.hectarea_mi2(in);          break;
            case "Yarda Cuadrada":      this.hectarea_yd2(in);          break;
            case "Pie Cuadrado":        this.hectarea_ft2(in);          break;
            case "Hectarea":            this.hectarea_hectarea(in);     break;
        }
    }
    
    public void km2_km2(double in){
        out = in;
    }
    
    public void  km2_m2(double in){
        out = in * 1e6;
    }
    
    public void  km2_cm2(double in){
        out = in * 1e10;
    }
    
    public void  km2_mi2(double in){
        out = in /2.59;
    }
    
    public void  km2_yd2(double in){
        out = in * 1.196e6;
    }
    
    public void  km2_ft2(double in){
        out = in * 1.076e7;
    }

    public void  km2_hectarea(double in){
        out = in * 100;
    }

    public void  m2_km2(double in){
        out = in / 1e6;
    }

    public void  m2_m2(double in){
        out = in;
    }

    public void  m2_cm2(double in){
        out = in * 10000;
    }

    public void  m2_mi2(double in){
        out = in /2.59e6;
    }

    public void  m2_yd2(double in){
        out = in * 1.19599;
    }

    public void  m2_ft2(double in){
        out = in * 10.7639;
    }

    public void  m2_hectarea(double in){
        out = in /10000;
    }

    public void  cm2_km2(double in){
        out = in / 1e10;
    }

    public void  cm2_m2(double in){
        out = in / 10000;
    }
    
    public void  cm2_cm2(double in){
        out = in;
    }
    
    public void  cm2_mi2(double in){
        out = in /2.59e10;
    }
    
    public void  cm2_yd2(double in){
        out = in /8361.27;
    }
    
    public void  cm2_ft2(double in){
        out = in /929.0304;
    }
    
    public void  cm2_hectarea(double in){
        out = in * 1e8;
    }

    public void  mi2_km2(double in){
        out = in * 2.58999;
    }

    public void  mi2_m2(double in){
        out = in *2.59e6;
    }
    
    public void  mi2_cm2(double in){
        out = in *2.59e10;
    }
    
    public void  mi2_mi2(double in){
        out = in;
    }
    
    public void  mi2_yd2(double in){
        out = in * 3.098e6;
    }
    
    public void  mi2_ft2(double in){
        out = in * 2.788e7;
    }
    
    public void  mi2_hectarea(double in){
        out = in * 258.999;
    }
    
    public void  yd2_km2(double in){
        out = in / 1.196e6;
    }
    
    public void  yd2_m2(double in){
        out = in / 1.196;
    }
    
    public void  yd2_cm2(double in){
        out = in * 8361.27;
    }
    
    public void  yd2_mi2(double in){
        out = in / 3.098e6 ;
    }
    
    public void  yd2_yd2(double in){
        out = in;
    }
    
    public void  yd2_ft2(double in){
        out = in *9;
    }
    
    public void  yd2_hectarea(double in){
        out = in /11960;
    }
    
    public void  ft2_km2(double in){
        out = in / 1.076e7;
    }
    
    public void  ft2_m2(double in){
        out = in / 10.764;
    }
    
    public void  ft2_cm2(double in){
        out = in *929.03;
    }
    
    public void  ft2_mi2(double in){
        out = in / 2.788e7;
    }
    
    public void  ft2_yd2(double in){
        out = in /9;
    }
    
    public void  ft2_ft2(double in){
        out = in;
    }
    
    public void  ft2_hectarea(double in){
        out = in /107639;
    }
    
    public void  hectarea_km2(double in){
        out = in / 100;
    }
    
    public void  hectarea_m2(double in){
        out = in *10000;
    }
    
    public void  hectarea_cm2(double in){
        out = in *1e8;
    }
    
    public void  hectarea_mi2(double in){
        out = in / 259;
    }
    
    public void  hectarea_yd2(double in){
        out = in *11959.9;
    }
    
    public void  hectarea_ft2(double in){
        out = in * 107639;
    }
    
    public void  hectarea_hectarea(double in){
        out = in;
    }
}
