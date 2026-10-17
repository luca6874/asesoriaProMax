public class ConcurrenteMain{


    static int saldo = 1000;

    public static synchronized void retirar(int cantidad){

        if (cantidad > saldo) {
            System.out.println("cantidad inválida");
        }else{
            saldo-=cantidad;
            System.out.println("retiro realizado");
        }

    }
   
    public static void main(String[] args)  throws InterruptedException {

       
        Thread hilo1 = new Thread(() -> retirar(700));
        Thread hilo2 = new Thread(() -> retirar(700));

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("saldo final: " + saldo);

    }
}