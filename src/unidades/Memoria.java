
package unidades;

public class Memoria {
    double out;
    
    
    public double convertir(String cbin,String cbout, double in){
       switch (cbin){
            case "Bit":      this.bit(cbout, in);           break;                  
            case "Kilobit":  this.kilobit(cbout, in);       break;               
            case "Megabit":  this.megabit(cbout, in);       break;
            case "Gigabit":  this.gigabit(cbout, in);       break;
            case "Terabit":  this.terabit(cbout, in);       break;
            case "Byte":     this.bite(cbout, in);          break;          
            case "Kilobyte": this.kilobyte(cbout, in);      break;            
            case "Megabyte": this.megabyte(cbout, in);      break;
            case "Gigabyte": this.gigabyte(cbout, in);      break;
            case "Terabyte": this.terabyte(cbout, in);      break;
        }
        return out;   
    }
    
    public void bit(String cbout, double in){
        switch (cbout){
            case "Bit":      this.bit_bit(in);              break;
            case "Kilobit":  this.bit_kilobit(in);          break;
            case "Megabit":  this.bit_megabit(in);          break;
            case "Gigabit":  this.bit_gigabit(in);          break;
            case "Terabit":  this.bit_terabit(in);          break;
            case "Byte":     this.bit_byte(in);             break;
            case "Kilobyte": this.bit_kilobyte(in);         break;
            case "Megabyte": this.bit_megabyte(in);         break;
            case "Gigabyte": this.bit_gigabyte(in);         break;
            case "Terabyte": this.bit_terabyte(in);         break;
            
        }
    }
    
    public void kilobit(String cbout, double in){
        switch (cbout){
            case "Bit":      this.kilobit_bit(in);          break;
            case "Kilobit":  this.kilobit_kilibit(in);      break;
            case "Megabit":  this.kilobit_megabit(in);      break;
            case "Gigabit":  this.kilobit_gigabit(in);      break;
            case "Terabit":  this.kilobit_terabit(in);      break;
            case "Byte":     this.kilobit_byte(in);         break;
            case "Kilobyte": this.kilobit_kilobyte(in);     break;
            case "Megabyte": this.kilobit_megabyte(in);     break;
            case "Gigabyte": this.kilobit_gigabyte(in);     break;
            case "Terabyte": this.kilobit_terabyte(in);     break;
        }
    }
    
    public void megabit(String cbout, double in){
        switch (cbout){
            case "Bit":      this.megabit_bit(in);          break;
            case "Kilobit":  this.megabit_kilobit(in);      break;
            case "Megabit":  this.megabit_megabit(in);      break;
            case "Gigabit":  this.megabit_gigabit(in);      break;
            case "Terabit":  this.megabit_terabit(in);      break;
            case "Byte":     this.megabit_byte(in);         break;
            case "Kilobyte": this.megabit_kilobyte(in);     break;
            case "Megabyte": this.megabit_megabyte(in);     break;
            case "Gigabyte": this.megabit_gigabyte(in);     break;
            case "Terabyte": this.megabit_terabyte(in);     break;
            
        }
    }
    
    public void gigabit(String cbout, double in){
        switch (cbout){
            case "Bit":      this.gigabit_bit(in);          break;
            case "Kilobit":  this.gigabit_kilobit(in);      break;
            case "Megabit":  this.gigabit_megbit(in);       break;
            case "Gigabit":  this.gigabit_gigabit(in);      break;
            case "Terabit":  this.gigabit_terabit(in);      break;
            case "Byte":     this.gigabit_byte(in);         break;
            case "Kilobyte": this.gigabit_kilobyte(in);     break;
            case "Megabyte": this.gigabit_megabyte(in);     break;
            case "Gigabyte": this.gigabit_gigabyte(in);     break;
            case "Terabyte": this.gigabit_terabyte(in);     break;
        }
    }
    
    public void terabit(String cbout, double in){
        switch (cbout){
            case "Bit":      this.terabit_bit(in);          break;
            case "Kilobit":  this.terabit_kilobit(in);      break;
            case "Megabit":  this.terabit_megabit(in);      break;
            case "Gigabit":  this.terabit_gigabit(in);      break;
            case "Terabit":  this.terabit_terabit(in);      break;
            case "Byte":     this.terabit_byte(in);         break;
            case "Kilobyte": this.terabit_kilobyte(in);     break;
            case "Megabyte": this.terabit_megabyte(in);     break;
            case "Gigabyte": this.terabit_gigabyte(in);     break;
            case "Terabyte": this.terabit_terabyte(in);     break;
        }
    }
    
    public void bite(String cbout, double in){
        switch (cbout){
            case "Bit":      this.byte_bit(in);             break;
            case "Kilobit":  this.byte_kilobit(in);         break;
            case "Megabit":  this.byte_megabit(in);         break;
            case "Gigabit":  this.byte_gigabit(in);         break;
            case "Terabit":  this.byte_terabit(in);         break;
            case "Byte":     this.byte_byte(in);            break;
            case "Kilobyte": this.byte_kilobyte(in);        break;
            case "Megabyte": this.byte_megabyte(in);        break;
            case "Gigabyte": this.byte_gigabyte(in);        break;
            case "Terabyte": this.byte_terabyte(in);        break;
        }
    }
    
    public void kilobyte(String cbout, double in){
        switch (cbout){
            case "Bit":      this.kilobyte_bit(in);         break;
            case "Kilobit":  this.kilobyte_kilobit(in);     break;
            case "Megabit":  this.kilobyte_megabit(in);     break;
            case "Gigabit":  this.kilobyte_gigabit(in);     break;
            case "Terabit":  this.kilobyte_terabit(in);     break;
            case "Byte":     this.kilobyte_byte(in);        break;
            case "Kilobyte": this.kilobyte_kilobyte(in);    break;
            case "Megabyte": this.kilobyte_megabyte(in);    break;
            case "Gigabyte": this.kilobyte_gigabyte(in);    break;
            case "Terabyte": this.kilobyte_terabyte(in);    break;
        }
    }
    
    public void megabyte(String cbout, double in){
        switch (cbout){
            case "Bit":      this.megabyte_bit(in);         break;
            case "Kilobit":  this.megabyte_kilobit(in);     break;
            case "Megabit":  this.megabyte_megabit(in);     break;
            case "Gigabit":  this.megabyte_gigabit(in);     break;
            case "Terabit":  this.megabyte_terabit(in);     break;
            case "Byte":     this.megabyte_byte(in);        break;
            case "Kilobyte": this.megabyte_kilobyte(in);    break;
            case "Megabyte": this.megabyte_megabyte(in);    break;
            case "Gigabyte": this.megabyte_gigabyte(in);    break;
            case "Terabyte": this.megabyte_terabyte(in);    break;
        }
    }
    
    public void gigabyte(String cbout, double in){
        switch (cbout){
            case "Bit":      this.gigabyte_bit(in);         break;
            case "Kilobit":  this.gigabyte_kilobit(in);     break;
            case "Megabit":  this.gigabyte_megabit(in);     break;
            case "Gigabit":  this.gigabyte_gigabit(in);     break;
            case "Terabit":  this.gigabyte_terabit(in);     break;
            case "Byte":     this.gigabyte_byte(in);        break;
            case "Kilobyte": this.gigabyte_kilobyte(in);    break;
            case "Megabyte": this.gigabyte_megabyte(in);    break;
            case "Gigabyte": this.gigabyte_gigabyte(in);    break;
            case "Terabyte": this.gigabyte_terabyte(in);    break;
        }
    }
        
    public void terabyte(String cbout, double in){
        switch (cbout){
            case "Bit":      this.terabyte_bit(in);         break;
            case "Kilobit":  this.terabyte_kilobit(in);     break;
            case "Megabit":  this.terabyte_megabit(in);     break;
            case "Gigabit":  this.terabyte_gigabit(in);     break;
            case "Terabit":  this.terabyte_terabit(in);     break;
            case "Byte":     this.terabyte_byte(in);        break;
            case "Kilobyte": this.terabyte_kilobyte(in);    break;
            case "Megabyte": this.terabyte_megabyte(in);    break;
            case "Gigabyte": this.terabyte_gigabyte(in);    break;
            case "Terabyte": this.terabyte_terabyte(in);    break;
        }
    }
    
    public void bit_bit(double in){
        out = in;
    }
    
    public void  bit_kilobit(double in){
        out = in / 1000;
    }
    
    public void  bit_megabit(double in){
        out = in / 1e6;
    }
    
    public void  bit_gigabit(double in){
        out = in / 1e9;
    }
    
    public void  bit_terabit(double in){
        out = in / 1e12;
    }
    
    public void  bit_byte(double in){
        out = in / 8;
    }

    public void  bit_kilobyte(double in){
        out = in /8000;
    }

    public void  bit_megabyte(double in){
        out = in /8e6;
    }
    
    public void  bit_gigabyte(double in){
        out = in / 8e9;
    }

    public void  bit_terabyte(double in){
        out = in /8e12;
    }

    public void  kilobit_bit(double in){
        out = in *1000;
    }

    public void  kilobit_kilibit(double in){
        out = in;
    }

    public void  kilobit_megabit(double in){
        out = in / 1000;
    }

    public void  kilobit_gigabit(double in){
        out = in / 1e6;
    }

    public void  kilobit_terabit(double in){
        out = in / 1e9;
    }

    public void  kilobit_byte(double in){
        out = in * 125;
    }

    public void  kilobit_kilobyte(double in){
        out = in /8;
    }

    public void  kilobit_megabyte(double in){
        out = in / 8000;
    }
    
    public void  kilobit_gigabyte(double in){
        out = in / 8e6;
    }

    public void  kilobit_terabyte(double in){
        out = in /8e9;
    }

    public void  megabit_bit(double in){
        out = in * 1e6;
    }

    public void  megabit_kilobit(double in){
        out = in * 1000;
    }
    
    public void  megabit_megabit(double in){
        out = in;
    }
    
    public void  megabit_gigabit(double in){
        out = in / 1000;
    }
    
    public void  megabit_terabit(double in){
        out = in / 1e6;
    }
    
    public void  megabit_byte(double in){
        out = in * 125000;
    }
    
    public void  megabit_kilobyte(double in){
        out = in * 125;
    }

    public void  megabit_megabyte(double in){
        out = in / 8;
    }
    
    public void  megabit_gigabyte(double in){
        out = in / 8000;
    }

    public void  megabit_terabyte(double in){
        out = in / 8e6;
    }

    public void  gigabit_bit(double in){
        out = in * 1e9;
    }

    public void  gigabit_kilobit(double in){
        out = in * 1e6;
    }
    
    public void  gigabit_megbit(double in){
        out = in * 1000;
    }
    
    public void  gigabit_gigabit(double in){
        out = in;
    }
    
    public void  gigabit_terabit(double in){
        out = in / 1000;
    }
    
    public void  gigabit_byte(double in){
        out = in * 1.25e8;
    }
    
    public void  gigabit_kilobyte(double in){
        out = in * 125000;
    }
    
    public void  gigabit_megabyte(double in){
        out = in * 125;
    }
    
    public void  gigabit_gigabyte(double in){
        out = in /8;
    }
    
    public void  gigabit_terabyte(double in){
        out = in /8000;
    }
    
    public void  terabit_bit(double in){
        out = in * 1e12;
    }
    
    public void  terabit_kilobit(double in){
        out = in * 1e9;
    }
    
    public void  terabit_megabit(double in){
        out = in * 1e6;
    }
    
    public void  terabit_gigabit(double in){
        out = in * 1000;
    }
    
    public void  terabit_terabit(double in){
        out = in;
    }
    
    public void  terabit_byte(double in){
        out = in * 1.25e11;
    }
    
    public void  terabit_kilobyte(double in){
        out = in * 1.25e8;
    }
    
    public void  terabit_megabyte(double in){
        out = in * 125000;
    }
    
    public void  terabit_gigabyte(double in){
        out = in * 125;
    }
    
    public void  terabit_terabyte(double in){
        out = in / 8;
    }
    
    public void  byte_bit(double in){
        out = in *8;
    }
    
    public void  byte_kilobit(double in){
        out = in / 125;
    }
    
    public void  byte_megabit(double in){
        out = in /125000;
    }
    
    public void  byte_gigabit(double in){
        out = in /1.25e8;
    }
    
    public void  byte_terabit(double in){
        out = in / 1.25e11;
    }
    
    public void  byte_byte(double in){
        out = in;
    }
    
    public void  byte_kilobyte(double in){
        out = in /1000;
    }
    
    public void  byte_megabyte(double in){
        out = in /1e6;
    }
    
    public void  byte_gigabyte(double in){
        out = in /1e9;
    }
    
    public void  byte_terabyte(double in){
        out = in /1e12;
    }
    
    public void  kilobyte_bit(double in){
        out = in *8000;
    }
    
    public void  kilobyte_kilobit(double in){
        out = in * 8;
    }
    
    public void  kilobyte_megabit(double in){
        out = in / 125;
    }
    
    public void  kilobyte_gigabit(double in){
        out = in / 125000;
    }
    
    public void  kilobyte_terabit(double in){
        out = in / 1.25e8;
    }
    
    public void  kilobyte_byte(double in){
        out = in *1000;
    }
    
    public void  kilobyte_kilobyte(double in){
        out = in;
    }
    
    public void  kilobyte_megabyte(double in){
        out = in /1000;
    }
    
    public void  kilobyte_gigabyte(double in){
        out = in/1e6;
    }
    
    public void  kilobyte_terabyte(double in){
        out = in /1e9;
    }
    
    public void  megabyte_bit(double in){
        out = in *8e6;
    }
    
    public void  megabyte_kilobit(double in){
        out = in *8000;
    }
    
    public void  megabyte_megabit(double in){
        out = in * 8;
    }
    
    public void  megabyte_gigabit(double in){
        out = in /125;
    }
    
    public void  megabyte_terabit(double in){
        out = in / 125000;
    }
    
    public void  megabyte_byte(double in){
        out = in *1e6;
    }
    
    public void  megabyte_kilobyte(double in){
        out = in *1000;
    }
    
    public void  megabyte_megabyte(double in){
        out = in;
    }
    
    public void  megabyte_gigabyte(double in){
        out = in / 1000;
    }
    
    public void  megabyte_terabyte(double in){
        out = in/1e6;
    }
    
    public void  gigabyte_bit(double in){
        out = in *8e9;
    }
    
    public void  gigabyte_kilobit(double in){
        out = in * 8e6;
    }
    
    public void  gigabyte_megabit(double in){
        out = in * 8000;
    }
    
    public void  gigabyte_gigabit(double in){
        out = in *8;
    }
    
    public void  gigabyte_terabit(double in){
        out = in / 125;
    }
    
    public void  gigabyte_byte(double in){
        out = in *1e9;
    }
    
    public void  gigabyte_kilobyte(double in){
        out = in *1e6;
    }
    
    public void  gigabyte_megabyte(double in){
        out = in*1000;
    }
    
    public void  gigabyte_gigabyte(double in){
        out = in;
    }
    
    public void  gigabyte_terabyte(double in){
        out = in/1000;
    }
    
    public void  terabyte_bit(double in){
        out = in *8e12;
    }
    
    public void  terabyte_kilobit(double in){
        out = in *8e9;
    }
    
    public void  terabyte_megabit(double in){
        out = in * 8e6;
    }
    
    public void  terabyte_gigabit(double in){
        out = in *8000;
    }
    
    public void  terabyte_terabit(double in){
        out = in *8;
    }
    
    public void  terabyte_byte(double in){
        out = in *1e12;
    }
    
    public void  terabyte_kilobyte(double in){
        out = in *1e9;
    }
    
    public void  terabyte_megabyte(double in){
        out = in*1e6;
    }
    
    public void  terabyte_gigabyte(double in){
        out = in *1000;
    }
    
    public void  terabyte_terabyte(double in){
        out = in;
    }
}
