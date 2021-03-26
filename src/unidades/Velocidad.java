
package unidades;

public class Velocidad {
   double out;
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Kilometro x Hora":   this.kmh(cbout, in);  break;                  
            case "Metros x Segundos":  this.ms(cbout, in);   break;               
            case "Milla x Hora":       this.mh(cbout, in);   break;
            case "Pie x Segundo":      this.ps(cbout, in);   break;          
        } 
        return out;   
    }
    
    public void kmh(String cbout, double in){
        switch (cbout){
            case "Kilometro x Hora":   this.kmh_kmh(in);     break;
            case "Metros x Segundos":  this.kmh_ms(in);      break;
            case "Milla x Hora":       this.kmh_mh(in);      break;
            case "Pie x Segundo":      this.kmh_ps(in);      break;
        }

    }
    
    public void ms(String cbout, double in){
        switch (cbout){
            case "Kilometro x Hora":   this.ms_kmh(in);      break;
            case "Metros x Segundos":  this.ms_ms(in);       break;
            case "Milla x Hora":       this.ms_mh(in);       break;
            case "Pie x Segundo":      this.ms_ps(in);       break;
        }
    }
    
    public void mh(String cbout, double in){
        switch (cbout){
            case "Kilometro x Hora":   this.mh_kmh(in);      break;
            case "Metros x Segundos":  this.mh_ms(in);       break;
            case "Milla x Hora":       this.mh_mh(in);       break;
            case "Pie x Segundo":      this.mh_ps(in);       break;
        }
    }
    
    public void ps(String cbout, double in){
        switch (cbout){
            case "Kilometro x Hora":   this.ps_kmh(in);      break;
            case "Metros x Segundos":  this.ps_ms(in);       break;
            case "Milla x Hora":       this.ps_mh(in);       break;
            case "Pie x Segundo":      this.ps_ps(in);       break;
        }
    }
    
    public void kmh_kmh(double in){
        out = in;
    }
    
    public void  kmh_ms(double in){
        out = in / 3.6;
    }
    
    public void  kmh_mh(double in){
        out = in / 1.60934;
    }
    
    public void  kmh_ps(double in){
        out = in / 1.09728;
    }

    public void  ms_kmh(double in){
        out = in * 3.6;
    }

    public void  ms_ms(double in){
        out = in;
    }

    public void  ms_mh(double in){
        out = in * 2.23694;
    }

    public void  ms_ps(double in){
        out = in * 3.28084;
    }

    public void  mh_kmh(double in){
        out = in * 1.60934;
    }

    public void  mh_ms(double in){
        out = in / 2.23694;
    }
    
    public void  mh_mh(double in){
        out = in;
    }
    
    public void  mh_ps(double in){
        out = in * 1.46667;
    }
    

    public void  ps_kmh(double in){
        out = in * 1.09728;
    }

    public void  ps_ms(double in){
        out = in / 3.28084;
    }
    
    public void  ps_mh(double in){
        out = in / 1.46667;
    }
    
    public void  ps_ps(double in){
        out = in;
    }
    

}
