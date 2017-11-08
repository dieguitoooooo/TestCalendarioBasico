/**
 * Esta es la clase de CalendarioBasico.
 */
public class CalendarioBasico
{
    // Campos o atributos de la clase.
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres anno;

    /**
     * Constructor de la clase calendario
     */
    public CalendarioBasico()
    {
        // Aqui le damos un valor inicial a los campos.
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        anno = new DisplayDosCaracteres(100);
    }

    /**
     * Esto es un método donde nos da una fecha predeterminada al invocarlo.
     */
    public String obtenerFecha()
    {
        return dia.getTextoDelDisplay() + mes.getTextoDelDisplay() + anno.getTextoDelDisplay();        
    }

    /**
     * Esto es un método donde podemos meter a mano la fecha de nuesto calendario.
     * Tal fecha debe ir comprendida entre los años 2000 al 2099.
     */    
    public void fijarFecha(int dd, int mm, int aaaa)
    {  
        dia.setValorAlmacenado(dd);
        mes.setValorAlmacenado(mm);
        anno.setValorAlmacenado(aaaa);
    }

    /**
     * Esto es un método que nos va a permitir avanzar dia a dia.
     * Después del 30 pasará al siguiente mes y en el mes 12, 
     * que es el último mes año pasará al siguiente año.
     */     
    public void avanzarFecha()
    {
        if(dia.getValorAlmacenado() == 30)
        {
            mes.incrementaValorAlmacenado();
            
            if(mes.getValorAlmacenado() == 1)
            {
                anno.incrementaValorAlmacenado();
            }
        }
        
        dia.incrementaValorAlmacenado();
    }    
}
