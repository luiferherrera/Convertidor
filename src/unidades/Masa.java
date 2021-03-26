
package unidades;

public class Masa {
    double out;
    
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Tonelada":  this.tonelada(cbout, in);      break;                  
            case "Kilogramo": this.kilogramo(cbout, in);     break;               
            case "Gramo":     this.gramo(cbout, in);         break;
            case "Miligramo": this.miligramo(cbout, in);     break;
            case "Libra":     this.libra(cbout, in);         break;
            case "Onza":      this.onza(cbout, in);          break;          
        } 
        return out;   
    }
    
    public void tonelada(String cbout, double in){
        switch (cbout){
            case "Tonelada":  this.tonelada_tonelada(in);    break;
            case "Kilogramo": this.tonelada_kilogramo(in);   break;
            case "Gramo":     this.tonelada_gramo(in);       break;
            case "Miligramo": this.tonelada_miligramo(in);   break;
            case "Libra":     this.tonelada_libra(in);       break;
            case "Onza":      this.tonelada_onza(in);        break;
        }

    }
    
    public void kilogramo(String cbout, double in){
        switch (cbout){
            case "Tonelada":  this.kilogramo_tonelada(in);   break;
            case "Kilogramo": this.kilogramo_kilogramo(in);  break;
            case "Gramo":     this.kilogramo_gramo(in);      break;
            case "Miligramo": this.kilogramo_miligramo(in);  break;
            case "Libra":     this.kilogramo_libra(in);      break;
            case "Onza":      this.kilogramo_onza(in);       break;
        }
    }
    
    public void gramo(String cbout, double in){
        switch (cbout){
            case "Tonelada":  this.gramo_tonelada(in);       break;
            case "Kilogramo": this.gramo_kilogramo(in);      break;
            case "Gramo":     this.gramo_gramo(in);          break;
            case "Miligramo": this.gramo_miligramo(in);      break;
            case "Libra":     this.gramo_libra(in);          break;
            case "Onza":      this.gramo_onza(in);           break;
        }
    }
    
    public void miligramo(String cbout, double in){
        switch (cbout){
            case "Tonelada":  this.miligramo_tonelada(in);   break;
            case "Kilogramo": this.miligramo_kilogramo(in);  break;
            case "Gramo":     this.miligramo_gramo(in);      break;
            case "Miligramo": this.miligramo_miligramo(in);  break;
            case "Libra":     this.miligramo_libra(in);      break;
            case "Onza":      this.miligramo_onza(in);       break;
        }
    }
    
    public void libra(String cbout, double in){
        switch (cbout){
            case "Tonelada":  this.libra_tonelada(in);       break;
            case "Kilogramo": this.libra_kilogramo(in);      break;
            case "Gramo":     this.libra_gramo(in);          break;
            case "Miligramo": this.libra_miligramo(in);      break;
            case "Libra":     this.libra_libra(in);          break;
            case "Onza":      this.libra_onza(in);           break;
        }
    }
    
    public void onza(String cbout, double in){
        switch (cbout){
            case "Tonelada":  this.onza_tonelada(in);        break;
            case "Kilogramo": this.onza_kilogramo(in);       break;
            case "Gramo":     this.onza_gramo(in);           break;
            case "Miligramo": this.onza_miligramo(in);       break;
            case "Libra":     this.onza_libra(in);           break;
            case "Onza":      this.onza_onza(in);            break;
        }
    }
    
    
    public void tonelada_tonelada(double in){
        out = in;
    }
    
    public void  tonelada_kilogramo(double in){
        out = in * 1000;
    }
    
    public void  tonelada_gramo(double in){
        out = in * 1000000;
    }
    
    public void  tonelada_miligramo(double in){
        out = in * 1000000000;
    }
    
    public void  tonelada_libra(double in){
        out = in * 2204.623;
    }
    
    public void  tonelada_onza(double in){
        out = in * 35273.962;
    }

    public void  kilogramo_tonelada(double in){
        out = in / 1000;
    }

    public void  kilogramo_kilogramo(double in){
        out = in;
    }

    public void  kilogramo_gramo(double in){
        out = in * 1000;
    }

    public void  kilogramo_miligramo(double in){
        out = in * 1000000;
    }

    public void  kilogramo_libra(double in){
        out = in * 2.20462;
    }

    public void  kilogramo_onza(double in){
        out = in * 35.274;
    }

    public void  gramo_tonelada(double in){
        out = in / 1000000;
    }

    public void  gramo_kilogramo(double in){
        out = in / 1000;
    }
    
    public void  gramo_gramo(double in){
        out = in;
    }
    
    public void  gramo_miligramo(double in){
        out = in * 1000;
    }
    
    public void  gramo_libra(double in){
        out = in / 453.592;
    }
    
    public void  gramo_onza(double in){
        out = in / 28.3495;
    }

    public void  miligramo_tonelada(double in){
        out = in / 1000000000;
    }

    public void  miligramo_kilogramo(double in){
        out = in / 1000000;
    }
    
    public void  miligramo_gramo(double in){
        out = in / 1000;
    }
    
    public void  miligramo_miligramo(double in){
        out = in;
    }
    
    public void  miligramo_libra(double in){
        out = in / 453592;
    }
    
    public void  miligramo_onza(double in){
        out = in / 28350;
    }
    
    public void  libra_tonelada(double in){
        out = in / 2204.62;
    }
    
    public void  libra_kilogramo(double in){
        out = in / 2.20462;
    }
    
    public void  libra_gramo(double in){
        out = in * 453.592;
    }
    
    public void  libra_miligramo(double in){
        out = in * 453592;
    }
    
    public void  libra_libra(double in){
        out = in;
    }
    
    public void  libra_onza(double in){
        out = in * 16;
    }
    
    public void  onza_tonelada(double in){
        out = in / 35273.36861;
    }
    
    public void  onza_kilogramo(double in){
        out = in / 35.274;
    }
    
    public void  onza_gramo(double in){
        out = in * 28.3495;
    }
    
    public void  onza_miligramo(double in){
        out = in * 28349.5;
    }
    
    public void  onza_libra(double in){
        out = in / 16;
    }
    
    public void  onza_onza(double in){
        out = in;
    }
}
