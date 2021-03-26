package unidades;

public class Longitud {
    double out;
    
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Kilometro":  this.kilometro(cbout, in);       break;                  
            case "Metro":      this.metro(cbout, in);           break;               
            case "Centimetro": this.centimetro(cbout, in);      break;
            case "Milimetro":  this.milimetro(cbout, in);       break;
            case "Milla":      this.milla(cbout, in);           break;
            case "Yarda":      this.yarda(cbout, in);           break;          
            case "Pie":        this.pie(cbout, in);             break;            
            case "Pulgada":    this.pulgada(cbout, in);         break;
        }
        return out;   
    }
    
    public void kilometro(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.kilometro_kilometro(in);    break;
            case "Metro":      this.kilometro_metro(in);        break;
            case "Centimetro": this.kilometro_centimetro(in);   break;
            case "Milimetro":  this.kilometro_milimetro(in);    break;
            case "Milla":      this.kilometro_milla(in);        break;
            case "Yarda":      this.kilometro_yarda(in);        break;
            case "Pie":        this.kilometro_pie(in);          break;
            case "Pulgada":    this.kilometro_pulgada(in);      break;
        }
    }
    
    public void metro(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.metro_kilometro(in);        break;
            case "Metro":      this.metro_metro(in);            break;
            case "Centimetro": this.metro_centimetro(in);       break;
            case "Milimetro":  this.metro_milimetro(in);        break;
            case "Milla":      this.metro_milla(in);            break;
            case "Yarda":      this.metro_yarda(in);            break;
            case "Pie":        this.metro_pie(in);              break;
            case "Pulgada":    this.metro_pulgada(in);          break;
        }
    }
    
    public void centimetro(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.centimetro_kilometro(in);   break;
            case "Metro":      this.centimetro_metro(in);       break;
            case "Centimetro": this.centimetro_centrimetro(in); break;
            case "Milimetro":  this.centimetro_milimetro(in);   break;
            case "Milla":      this.centimetro_milla(in);       break;
            case "Yarda":      this.centimetro_yarda(in);       break;
            case "Pie":        this.centimetro_pie(in);         break;
            case "Pulgada":    this.centimetro_pulgada(in);     break;
        }
    }
    
    public void milimetro(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.milimetro_kilometro(in);    break;
            case "Metro":      this.milimetro_metro(in);        break;
            case "Centimetro": this.milimetro_centimetro(in);   break;
            case "Milimetro":  this.milimetro_milimetro(in);    break;
            case "Milla":      this.milimetro_milla(in);        break;
            case "Yarda":      this.milimetro_yarda(in);        break;
            case "Pie":        this.milimetro_pie(in);          break;
            case "Pulgada":    this.milimetro_pulgada(in);      break;
        }
    }
    
    public void milla(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.milla_kilometro(in);        break;
            case "Metro":      this.milla_metro(in);            break;
            case "Centimetro": this.milla_centrimetro(in);      break;
            case "Milimetro":  this.milla_milimetro(in);        break;
            case "Milla":      this.milla_milla(in);            break;
            case "Yarda":      this.milla_yarda(in);            break;
            case "Pie":        this.milla_pie(in);              break;
            case "Pulgada":    this.milla_pulgada(in);          break;
        }
    }
    
    public void yarda(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.yarda_kilometro(in);        break;
            case "Metro":      this.yarda_metro(in);            break;
            case "Centimetro": this.yarda_centietro(in);        break;
            case "Milimetro":  this.yarda_milimetro(in);        break;
            case "Milla":      this.yarda_milla(in);            break;
            case "Yarda":      this.yarda_yarda(in);            break;
            case "Pie":        this.yarda_pie(in);              break;
            case "Pulgada":    this.yarda_pulgada(in);          break;
        }
    }
    
    public void pie(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.pie_kilometro(in);          break;
            case "Metro":      this.pie_metro(in);              break;
            case "Centimetro": this.pie_centimetro(in);         break;
            case "Milimetro":  this.pie_milimetro(in);          break;
            case "Milla":      this.pie_milla(in);              break;
            case "Yarda":      this.pie_yarda(in);              break;
            case "Pie":        this.pie_pie(in);                break;
            case "Pulgada":    this.pie_pulgada(in);            break;
        }
    }
    
    public void pulgada(String cbout, double in){
        switch (cbout){
            case "Kilometro":  this.pulgada_kilometro(in);      break;
            case "Metro":      this.pulgada_metro(in);          break;
            case "Centimetro": this.pulgada_centimetro(in);     break;
            case "Milimetro":  this.pulgada_milimetro(in);      break;
            case "Milla":      this.pulgada_milla(in);          break;
            case "Yarda":      this.pulgada_yarda(in);          break;
            case "Pie":        this.pulgada_pie(in);            break;
            case "Pulgada":    this.pulgada_pulgada(in);        break;
        }
    }
    
    public void kilometro_kilometro(double in){
        out = in;
    }
    
    public void  kilometro_metro(double in){
        out = in * 1000;
    }
    
    public void  kilometro_centimetro(double in){
        out = in * 100000;
    }
    
    public void  kilometro_milimetro(double in){
        out = in * 1000000;
    }
    
    public void  kilometro_milla(double in){
        out = in / 1.60934;
    }
    
    public void  kilometro_yarda(double in){
        out = in * 1093.61;
    }

    public void  kilometro_pie(double in){
        out = in * 8280.84;
    }

    public void  kilometro_pulgada(double in){
        out = in * 39370.1;
    }

    public void  metro_kilometro(double in){
        out = in / 1000;
    }

    public void  metro_metro(double in){
        out = in;
    }

    public void  metro_centimetro(double in){
        out = in * 100;
    }

    public void  metro_milimetro(double in){
        out = in * 1000;
    }

    public void  metro_milla(double in){
        out = in / 1609.34;
    }

    public void  metro_yarda(double in){
        out = in * 1.09361;
    }

    public void  metro_pie(double in){
        out = in * 3.28084;
    }

    public void  metro_pulgada(double in){
        out = in *39.3701;
    }

    public void  centimetro_kilometro(double in){
        out = in / 100000;
    }

    public void  centimetro_metro(double in){
        out = in / 100;
    }
    
    public void  centimetro_centrimetro(double in){
        out = in;
    }
    
    public void  centimetro_milimetro(double in){
        out = in * 10;
    }
    
    public void  centimetro_milla(double in){
        out = in / 160934;
    }
    
    public void  centimetro_yarda(double in){
        out = in / 91.44;
    }
    
    public void  centimetro_pie(double in){
        out = in / 30.48;
    }

    public void  centimetro_pulgada(double in){
        out = in / 2.54;
    }

    public void  milimetro_kilometro(double in){
        out = in / 1000000;
    }

    public void  milimetro_metro(double in){
        out = in / 1000;
    }
    
    public void  milimetro_centimetro(double in){
        out = in / 10;
    }
    
    public void  milimetro_milimetro(double in){
        out = in;
    }
    
    public void  milimetro_milla(double in){
        out = in / 1609340;
    }
    
    public void  milimetro_yarda(double in){
        out = in / 914.4;
    }
    
    public void  milimetro_pie(double in){
        out = in / 304.8;
    }
    
    public void  milimetro_pulgada(double in){
        out = in / 25.4;
    }
    
    public void  milla_kilometro(double in){
        out = in * 1.60934;
    }
    
    public void  milla_metro(double in){
        out = in * 1609.34;
    }
    
    public void  milla_centrimetro(double in){
        out = in * 160934;
    }
    
    public void  milla_milimetro(double in){
        out = in * 1609340;
    }
    
    public void  milla_milla(double in){
        out = in;
    }
    
    public void  milla_yarda(double in){
        out = in * 1760;
    }
    
    public void  milla_pie(double in){
        out = in * 5280;
    }
    
    public void  milla_pulgada(double in){
        out = in * 63360;
    }
    
    public void  yarda_kilometro(double in){
        out = in / 1093.61;
    }
    
    public void  yarda_metro(double in){
        out = in / 1.09361;
    }
    
    public void  yarda_centietro(double in){
        out = in * 91.44;
    }
    
    public void  yarda_milimetro(double in){
        out = in * 914.4;
    }
    
    public void  yarda_milla(double in){
        out = in / 1760;
    }
    
    public void  yarda_yarda(double in){
        out = in;
    }
    
    public void  yarda_pie(double in){
        out = in * 3;
    }
    
    public void  yarda_pulgada(double in){
        out = in * 36;
    }
    
    public void  pie_kilometro(double in){
        out = in / 3280.84;
    }
    
    public void  pie_metro(double in){
        out = in / 3.28084;
    }
    
    public void  pie_centimetro(double in){
        out = in * 30.48;
    }
    
    public void  pie_milimetro(double in){
        out = in * 304.8;
    }
    
    public void  pie_milla(double in){
        out = in / 5280;
    }
    
    public void  pie_yarda(double in){
        out = in / 3;
    }
    
    public void  pie_pie(double in){
        out = in;
    }
    
    public void  pie_pulgada(double in){
        out = in * 12;
    }
    
    public void  pulgada_kilometro(double in){
        out = in / 39370.1;
    }
    
    public void  pulgada_metro(double in){
        out = in / 39.3701;
    }
    
    public void  pulgada_centimetro(double in){
        out = in * 2.54;
    }
    
    public void  pulgada_milimetro(double in){
        out = in *25.4;
    }
    
    public void  pulgada_milla(double in){
        out = in / 63360;
    }
    
    public void  pulgada_yarda(double in){
        out = in / 36;
    }
    
    public void  pulgada_pie(double in){
        out = in / 12;
    }
    
    public void  pulgada_pulgada(double in){
        out = in;
    }
}




