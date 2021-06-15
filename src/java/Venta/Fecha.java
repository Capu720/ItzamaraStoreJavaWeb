/**
 *
 * @author Bambi&Fork
 */

package Venta;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    //Getters y Setters
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
    public void setDia(int dia){
        this.dia = dia;
    } 
    public void setMes(int mes){
        this.mes = mes;
    } 
    public void setAño(int año){
        this.año = año;
    } 
    

    public Fecha(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.año = a;
    }
    public Fecha(){
        this.hoy();
    }

    public Fecha obtenerFecha(){
        return this;
    }
    
    public void establecerFecha(int d, int m, int a){
        if(d>=1 && d<=31 && m>=1 && m<=12 && a>=1){
            this.dia = d;
            this.mes = m;
            this.año = a;
        }
        else{
            System.out.println("No existe esa fecha");
        }
    }

    public void hoy(){
        Calendar fecha = new GregorianCalendar(); 
        this.dia =  fecha.get(Calendar.DATE);
        this.mes =  fecha.get(Calendar.MONTH)+1; //Los meses empiezan en 0 
        this.año =  fecha.get(Calendar.YEAR);
    }

    
    public int diferenciaMeses(Fecha fecha){ //Se considera el objeto invocado como la fecha más antigua
        int meses=0, años=0;

        if(this.año!=fecha.año){
            años = fecha.año - this.año;
           if(años==1){ // Pueden ser solo meses de diferencia 
                if(fecha.mes<this.mes){ // No ha pasado un año
                    meses = (12 - this.mes) + fecha.mes; 
                    if(fecha.dia < this.dia){
                        meses--;
                    }
                }else{//Ya pasó al menos una año 
                    meses = 12 + (fecha.mes - this.mes); 
                    if(fecha.dia < this.dia){
                        meses--;
                    }
                }
           }else{ //Existe al menos un año de diferencia
             meses = años * 12;
             if(fecha.mes<this.mes){ 
                 meses -= 12;
                 meses = meses + (12 - this.mes) + fecha.mes;
                 if(this.dia < fecha.dia){
                    meses--;
                } 
             }
             else{ //Se conservan los años 
                meses = meses + (fecha.mes - this.mes);
                if(this.dia < fecha.dia){
                    meses--;
                } 
             }
           }
        }
        else{ // Es el mismo año y por lo tanto solo se realiza la diferencia de meses
          meses = fecha.mes - this.mes;
          if(fecha.dia < this.dia){
              meses--;
          }
        }
        return meses;
    }

    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.año;
    }
}
