public class Taquilla {

    private int boletos_disponibles = 10;

    public synchronized int vender_boleto(String empleado){
        if (boletos_disponibles==0) {
            System.out.println("Boletos agotados");
            return 0;
        }else{
            boletos_disponibles-=1;
            System.out.println(empleado +" ha vendido un boleto");
            System.out.println("boletos restantes: "+boletos_disponibles);
        }
        return 1;
       
    }

    public int getboletos_disponibles(){
        return boletos_disponibles;
    }
    
}
