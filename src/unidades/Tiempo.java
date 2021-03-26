
package unidades;

public class Tiempo {
    double out;     
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Nanosegundo":  this.nanosegundo(cbout, in);             break;                  
            case "Microsegundo": this.microsegundo(cbout, in);            break;               
            case "Milisegundo":  this.milisegundo(cbout, in);             break;
            case "Segundo":      this.segundo(cbout, in);                 break;
            case "Minuto":       this.minuto(cbout, in);                  break;
            case "Hora":         this.hora(cbout, in);                    break;          
            case "Dia":          this.dia(cbout, in);                     break;            
            case "Semana":       this.semana(cbout, in);                  break;
            case "Mes":          this.mes(cbout, in);                     break;
            case "Año":          this.año(cbout, in);                     break;
        }
        return out;   
    }
    
    public void nanosegundo(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.nanosegundo_nanosegundo(in);        break;
            case "Microsegundo": this.nanosegundo_microsegundo(in);       break;
            case "Milisegundo":  this.nanosegundo_milisegundo(in);        break;
            case "Segundo":      this.nanosegundo_segundo(in);            break;
            case "Minuto":       this.nanosegundo_minuto(in);             break;
            case "Hora":         this.nanosegundo_hora(in);               break;
            case "Dia":          this.nanosegundo_dia(in);                break;
            case "Semana":       this.nanosegundo_semana(in);             break;
            case "Mes":          this.nanosegundo_mes(in);                break;
            case "Año":          this.nanosegundo_año(in);                break;
            
        }
    }
    
    public void microsegundo(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.microsegundo_nanosegundo(in);       break;
            case "Microsegundo": this.microsegundo_microsegundo(in);      break;
            case "Milisegundo":  this.microsegundo_milisegundo(in);       break;
            case "Segundo":      this.microsegundo_segundo(in);           break;
            case "Minuto":       this.microsegundo_minuto(in);            break;
            case "Hora":         this.microsegundo_hora(in);              break;
            case "Dia":          this.microsegundo_dia(in);               break;
            case "Semana":       this.microsegundo_semana(in);            break;
            case "Mes":          this.microsegundo_mes(in);               break;
            case "Año":          this.microsegundo_año(in);               break;
        }
    }
    
    public void milisegundo(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.milisegundo_nanosegundo(in);        break;
            case "Microsegundo": this.milisegundo_microsegundo(in);       break;
            case "Milisegundo":  this.milisegundo_milisegundo(in);        break;
            case "Segundo":      this.milisegundo_segundo(in);            break;
            case "Minuto":       this.milisegundo_minuto(in);             break;
            case "Hora":         this.milisegundo_hora(in);               break;
            case "Dia":          this.milisegundo_dia(in);                break;
            case "Semana":       this.milisegundo_semana(in);             break;
            case "Mes":          this.milisegundo_mes(in);                break;
            case "Año":          this.milisegundo_año(in);                break;
            
        }
    }
    
    public void segundo(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.segundo_nanosegundo(in);            break;
            case "Microsegundo": this.segundo_microsegundo(in);           break;
            case "Milisegundo":  this.segundo_milisegundo(in);            break;
            case "Segundo":      this.segundo_segundo(in);                break;
            case "Minuto":       this.segundo_minuto(in);                 break;
            case "Hora":         this.segundo_hora(in);                   break;
            case "Dia":          this.segundo_dia(in);                    break;
            case "Semana":       this.segundo_semana(in);                 break;
            case "Mes":          this.segundo_mes(in);                    break;
            case "Año":          this.segundo_año(in);                    break;
        }
    }
    
    public void minuto(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.minuto_nanosegundo(in);             break;
            case "Microsegundo": this.minuto_microsegundo(in);            break;
            case "Milisegundo":  this.minuto_milisegundo(in);             break;
            case "Segundo":      this.minuto_segundo(in);                 break;
            case "Minuto":       this.minuto_minuto(in);                  break;
            case "Hora":         this.minuto_hora(in);                    break;
            case "Dia":          this.minuto_dia(in);                     break;
            case "Semana":       this.minuto_semana(in);                  break;
            case "Mes":          this.minuto_mes(in);                     break;
            case "Año":          this.minuto_año(in);                     break;
        }
    }
    
    public void hora(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.hora_nanosegundo(in);               break;
            case "Microsegundo": this.hora_microsegundo(in);              break;
            case "Milisegundo":  this.hora_milisegundo(in);               break;
            case "Segundo":      this.hora_segundo(in);                   break;
            case "Minuto":       this.hora_minuto(in);                    break;
            case "Hora":         this.hora_hora(in);                      break;
            case "Dia":          this.hora_dia(in);                       break;
            case "Semana":       this.hora_semana(in);                    break;
            case "Mes":          this.hora_mes(in);                       break;
            case "Año":          this.hora_año(in);                       break;
        }
    }
    
    public void dia(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.dia_nanosegundo(in);                break;
            case "Microsegundo": this.dia_microsegundo(in);               break;
            case "Milisegundo":  this.dia_milisegundo(in);                break;
            case "Segundo":      this.dia_segundo(in);                    break;
            case "Minuto":       this.dia_minuto(in);                     break;
            case "Hora":         this.dia_hora(in);                       break;
            case "Dia":          this.dia_dia(in);                        break;
            case "Semana":       this.dia_semana(in);                     break;
            case "Mes":          this.dia_mes(in);                        break;
            case "Año":          this.dia_año(in);                        break;
        }
    }
    
    public void semana(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.semana_nanosegundo(in);             break;
            case "Microsegundo": this.semana_microsegundo(in);            break;
            case "Milisegundo":  this.semana_milisegundo(in);             break;
            case "Segundo":      this.semana_segundo(in);                 break;
            case "Minuto":       this.semana_minuto(in);                  break;
            case "Hora":         this.semana_hora(in);                    break;
            case "Dia":          this.semana_dia(in);                     break;
            case "Semana":       this.semana_semana(in);                  break;
            case "Mes":          this.semana_mes(in);                     break;
            case "Año":          this.semana_año(in);                     break;
        }
    }
    
    public void mes(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.mes_nanosegundo(in);                break;
            case "Microsegundo": this.mes_microsegundo(in);               break;
            case "Milisegundo":  this.mes_milisegundo(in);                break;
            case "Segundo":      this.mes_segundo(in);                    break;
            case "Minuto":       this.mes_minuto(in);                     break;
            case "Hora":         this.mes_hora(in);                       break;
            case "Dia":          this.mes_dia(in);                        break;
            case "Semana":       this.mes_semana(in);                     break;
            case "Mes":          this.mes_mes(in);                        break;
            case "Año":          this.mes_año(in);                        break;
        }
    }
        
    public void año(String cbout, double in){
        switch (cbout){
            case "Nanosegundo":  this.año_nanosegundo(in);                break;
            case "Microsegundo": this.año_microsegundo(in);               break;
            case "Milisegundo":  this.año_milisegundo(in);                break;
            case "Segundo":      this.año_segundo(in);                    break;
            case "Minuto":       this.año_minuto(in);                     break;
            case "Hora":         this.año_hora(in);                       break;
            case "Dia":          this.año_dia(in);                        break;
            case "Semana":       this.año_semana(in);                     break;
            case "Mes":          this.año_mes(in);                        break;
            case "Año":          this.año_año(in);                        break;
        }
    }
    
    public void nanosegundo_nanosegundo(double in){
        out = in;
    }
    
    public void  nanosegundo_microsegundo(double in){
        out = in / 1000;
    }
    
    public void  nanosegundo_milisegundo(double in){
        out = in / 1e6;
    }
    
    public void  nanosegundo_segundo(double in){
        out = in / 1e9;
    }
    
    public void  nanosegundo_minuto(double in){
        out = in / 6e10;
    }
    
    public void  nanosegundo_hora(double in){
        out = in / 3.6e12;
    }

    public void  nanosegundo_dia(double in){
        out = in / 8.64e13;
    }

    public void  nanosegundo_semana(double in){
        out = in /6.048e14;
    }
    
    public void  nanosegundo_mes(double in){
        out = in / 2.628e15;
    }

    public void  nanosegundo_año(double in){
        out = in /3.154e16;
    }

    public void  microsegundo_nanosegundo(double in){
        out = in *1000;
    }

    public void  microsegundo_microsegundo(double in){
        out = in;
    }

    public void  microsegundo_milisegundo(double in){
        out = in / 1000;
    }

    public void  microsegundo_segundo(double in){
        out = in / 1e6;
    }

    public void  microsegundo_minuto(double in){
        out = in / 6e7;
    }

    public void  microsegundo_hora(double in){
        out = in / 3.6e9;
    }

    public void  microsegundo_dia(double in){
        out = in /8.64e10;
    }

    public void  microsegundo_semana(double in){
        out = in / 6.048e11;
    }
    
    public void  microsegundo_mes(double in){
        out = in / 2.628e12;
    }

    public void  microsegundo_año(double in){
        out = in /3.154e13;
    }

    public void  milisegundo_nanosegundo(double in){
        out = in * 1e6;
    }

    public void  milisegundo_microsegundo(double in){
        out = in * 1000;
    }
    
    public void  milisegundo_milisegundo(double in){
        out = in;
    }
    
    public void  milisegundo_segundo(double in){
        out = in / 1000;
    }
    
    public void  milisegundo_minuto(double in){
        out = in / 60000;
    }
    
    public void  milisegundo_hora(double in){
        out = in / 3.6e6;
    }
    
    public void  milisegundo_dia(double in){
        out = in / 8.64e7;
    }

    public void  milisegundo_semana(double in){
        out = in / 6.048e8;
    }
    
    public void  milisegundo_mes(double in){
        out = in / 2.628e9;
    }

    public void  milisegundo_año(double in){
        out = in / 3.154e10;
    }

    public void  segundo_nanosegundo(double in){
        out = in * 1e9;
    }

    public void  segundo_microsegundo(double in){
        out = in * 1e6;
    }
    
    public void  segundo_milisegundo(double in){
        out = in * 1000;
    }
    
    public void  segundo_segundo(double in){
        out = in;
    }
    
    public void  segundo_minuto(double in){
        out = in / 60;
    }
    
    public void  segundo_hora(double in){
        out = in / 3600;
    }
    
    public void  segundo_dia(double in){
        out = in /86400;
    }
    
    public void  segundo_semana(double in){
        out = in /604800;
    }
    
    public void  segundo_mes(double in){
        out = in /2.628e6;
    }
    
    public void  segundo_año(double in){
        out = in /3.154e7;
    }
    
    public void  minuto_nanosegundo(double in){
        out = in * 6e10;
    }
    
    public void  minuto_microsegundo(double in){
        out = in * 6e7;
    }
    
    public void  minuto_milisegundo(double in){
        out = in * 60000;
    }
    
    public void  minuto_segundo(double in){
        out = in * 60;
    }
    
    public void  minuto_minuto(double in){
        out = in;
    }
    
    public void  minuto_hora(double in){
        out = in /60;
    }
    
    public void  minuto_dia(double in){
        out = in /1440;
    }
    
    public void  minuto_semana(double in){
        out = in / 10080;
    }
    
    public void  minuto_mes(double in){
        out = in / 43800;
    }
    
    public void  minuto_año(double in){
        out = in / 525600;
    }
    
    public void  hora_nanosegundo(double in){
        out = in *3.6e12;
    }
    
    public void  hora_microsegundo(double in){
        out = in * 3.6e9;
    }
    
    public void  hora_milisegundo(double in){
        out = in *3.6e6;
    }
    
    public void  hora_segundo(double in){
        out = in *3600;
    }
    
    public void  hora_minuto(double in){
        out = in *60;
    }
    
    public void  hora_hora(double in){
        out = in;
    }
    
    public void  hora_dia(double in){
        out = in /24;
    }
    
    public void  hora_semana(double in){
        out = in /168;
    }
    
    public void  hora_mes(double in){
        out = in /730;
    }
    
    public void  hora_año(double in){
        out = in /8760;
    }
    
    public void  dia_nanosegundo(double in){
        out = in *8.64e13;
    }
    
    public void  dia_microsegundo(double in){
        out = in * 8.64e10;
    }
    
    public void  dia_milisegundo(double in){
        out = in *8.64e7;
    }
    
    public void  dia_segundo(double in){
        out = in *86400;
    }
    
    public void  dia_minuto(double in){
        out = in * 1440;
    }
    
    public void  dia_hora(double in){
        out = in *24;
    }
    
    public void  dia_dia(double in){
        out = in;
    }
    
    public void  dia_semana(double in){
        out = in /7;
    }
    
    public void  dia_mes(double in){
        out = in/30.417;
    }
    
    public void  dia_año(double in){
        out = in /365;
    }
    
    public void  semana_nanosegundo(double in){
        out = in *6.048e14;
    }
    
    public void  semana_microsegundo(double in){
        out = in *6.048e11;
    }
    
    public void  semana_milisegundo(double in){
        out = in * 6.048e8;
    }
    
    public void  semana_segundo(double in){
        out = in * 604800;
    }
    
    public void  semana_minuto(double in){
        out = in * 10080;
    }
    
    public void  semana_hora(double in){
        out = in *168;
    }
    
    public void  semana_dia(double in){
        out = in *7;
    }
    
    public void  semana_semana(double in){
        out = in;
    }
    
    public void  semana_mes(double in){
        out = in / 4.345;
    }
    
    public void  semana_año(double in){
        out = in/52.143;
    }
    
    public void  mes_nanosegundo(double in){
        out = in *2.628e15;
    }
    
    public void  mes_microsegundo(double in){
        out = in * 2.628e12;
    }
    
    public void  mes_milisegundo(double in){
        out = in * 2.628e9;
    }
    
    public void  mes_segundo(double in){
        out = in *2.628e6;
    }
    
    public void  mes_minuto(double in){
        out = in * 43800;
    }
    
    public void  mes_hora(double in){
        out = in *730.001;
    }
    
    public void  mes_dia(double in){
        out = in *30.417;
    }
    
    public void  mes_semana(double in){
        out = in*4.34524;
    }
    
    public void  mes_mes(double in){
        out = in;
    }
    
    public void  mes_año(double in){
        out = in/12;
    }
    
    public void  año_nanosegundo(double in){
        out = in *3.154e16;
    }
    
    public void  año_microsegundo(double in){
        out = in *3.154e13;
    }
    
    public void  año_milisegundo(double in){
        out = in * 3.154e10;
    }
    
    public void  año_segundo(double in){
        out = in *3.154e7;
    }
    
    public void  año_minuto(double in){
        out = in *525600;
    }
    
    public void  año_hora(double in){
        out = in *8760;
    }
    
    public void  año_dia(double in){
        out = in *365;
    }
    
    public void  año_semana(double in){
        out = in*52.1429;
    }
    
    public void  año_mes(double in){
        out = in *12;
    }
    
    public void  año_año(double in){
        out = in;
    }
}
