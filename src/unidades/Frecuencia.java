
package unidades;


public class Frecuencia {
    double out;
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Hercio":     this.hercio(cbout, in);               break;                  
            case "Kilohercio": this.kilohercio(cbout, in);           break;               
            case "Megahercio": this.megahercio(cbout, in);           break;
            case "Gigahercio": this.gigahercio(cbout, in);           break;          
        } 
        return out;   
    }
    
    public void hercio(String cbout, double in){
        switch (cbout){
            case "Hercio":     this.hercio_hercio(in);               break;
            case "Kilohercio": this.hercio_kilohercio(in);           break;
            case "Megahercio": this.hercio_megahercio(in);           break;
            case "Gigahercio": this.hercio_gigahercio(in);           break;
        }

    }
    
    public void kilohercio(String cbout, double in){
        switch (cbout){
            case "Hercio":     this.kilohercio_hercio(in);           break;
            case "Kilohercio": this.kilohercio_kilohercio(in);       break;
            case "Megahercio": this.kilhercio_megahercio(in);        break;
            case "Gigahercio": this.kilohercio_gigahercio(in);       break;
        }
    }
    
    public void megahercio(String cbout, double in){
        switch (cbout){
            case "Hercio":     this.megahercio_hercio(in);           break;
            case "Kilohercio": this.megahercio_kilohercio(in);       break;
            case "Megahercio": this.megahercio_megahercio(in);       break;
            case "Gigahercio": this.megahercio_gigahercio(in);       break;
        }
    }
    
    public void gigahercio(String cbout, double in){
        switch (cbout){
            case "Hercio":     this.gigahercio_hercio(in);           break;
            case "Kilohercio": this.gigahercio_kilohercio(in);       break;
            case "Megahercio": this.gigahercio_megahercio(in);       break;
            case "Gigahercio": this.gigahercio_gigahercio(in);       break;
        }
    }
    
    public void hercio_hercio(double in){
        out = in;
    }
    
    public void  hercio_kilohercio(double in){
        out = in / 1000;
    }
    
    public void  hercio_megahercio(double in){
        out = in / 1000000;
    }
    
    public void  hercio_gigahercio(double in){
        out = in / 1000000000;
    }

    public void  kilohercio_hercio(double in){
        out = in * 1000;
    }

    public void  kilohercio_kilohercio(double in){
        out = in;
    }

    public void  kilhercio_megahercio(double in){
        out = in / 1000;
    }

    public void  kilohercio_gigahercio(double in){
        out = in / 1000000;
    }

    public void  megahercio_hercio(double in){
        out = in * 1000000;
    }

    public void  megahercio_kilohercio(double in){
        out = in * 1000;
    }
    
    public void  megahercio_megahercio(double in){
        out = in;
    }
    
    public void  megahercio_gigahercio(double in){
        out = in / 1000;
    }
    

    public void  gigahercio_hercio(double in){
        out = in * 1000000000;
    }

    public void  gigahercio_kilohercio(double in){
        out = in * 1000000;
    }
    
    public void  gigahercio_megahercio(double in){
        out = in * 1000;
    }
    
    public void  gigahercio_gigahercio(double in){
        out = in;
    }
}
