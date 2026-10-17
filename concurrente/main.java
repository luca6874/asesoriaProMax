public class main{
    public static void main(String[] args) throws InterruptedException{

        Taquilla taquilla = new Taquilla();

        // Crear los dos hilos
        Thread hilo1 = new Thread(() -> {

            for(int i= 1; i<7; i++){

                if (taquilla.vender_boleto("Jo") == 0) {
                    break;
                }
                
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }
               
        }
        

        });

        
        Thread hilo2 = new Thread(() -> {

            for(int i= 1; i<7; i++){

                if(taquilla.vender_boleto("Goku") == 0) {
                    break;
                }
                
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }

              
            }
        
        });
        // Cada uno intenta vender 7 boletos

        // Iniciar ambos hilos
        hilo1.start();
        hilo2.start();

        // Esperar a que terminen
        hilo1.join();
        hilo2.join();

        // Mostrar boletos restantes

        System.out.println("Boletos restantes: "+taquilla.getboletos_disponibles());


    }
}