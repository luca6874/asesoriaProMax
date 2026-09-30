import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        Terrestre wasa = new Terrestre("carro", 10);

        Aereo goku = new Aereo("lanchaGTA", 117);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(wasa);
        vehiculos.add(goku);

        int seleccionar_opcion = 0;

        while (seleccionar_opcion!=3) {
            
        
            
            System.out.println("---------------------------------------------------");//temporal
            System.out.println("Seleccione opción(presionando el numero crrespondiente): ");
            System.out.println("1 seleccionar vehículo");
            System.out.println("2 agregar vehículo");
            System.out.println("3 Salir");
            seleccionar_opcion = sc.nextInt();
            System.out.println("---------------------------------------------------");//temporal
            
            
            if(seleccionar_opcion == 1){

                for(int i =0; i< vehiculos.size(); i++){
                    System.out.println((i+1)+"."+vehiculos.get(i).getNombre());
                }

                int elegir_vehiculo = sc.nextInt();
                Vehiculo vehiculoSeleccionado = vehiculos.get(elegir_vehiculo - 1);
                System.out.println("Seleccionaste: " + vehiculoSeleccionado.getNombre());
            

                int eleccion = 0;

                while (eleccion!=4) {

                    System.out.println("---------------------------------------------------");//temporal
                    System.out.println("seleccione el numero para elegir opcion: ");
                    System.out.println("1 cargar combustible");
                    System.out.println("2 desplazar vehiculo");
                    System.out.println("3 ver información");
                    System.out.println("4 Volver al menú principal");
                    System.out.println("---------------------------------------------------"); //temporal
                
                    eleccion = sc.nextInt();
            
                
                    switch (eleccion) {
                        case 1:
                            System.out.println("ingrese cantidad a cargar: ");
                            double cantidad = sc.nextDouble();
                            vehiculoSeleccionado.cargar_combustible(cantidad);
                            break;
                        case 2:
                            System.out.println("cuantos km desea desplazarse?: ");
                            double distancia = sc.nextDouble();
                            vehiculoSeleccionado.desplazarse(distancia);
                            break;
                        case 3:
                            System.out.println("capacidad del vehiculo: "+vehiculoSeleccionado.getCapacidad());
                            System.out.println("tipo de combustible del vehiculo: "+vehiculoSeleccionado.getTipoCombustible());
                            System.out.println("Nombre del vehiculo: "+vehiculoSeleccionado.getNombre());
                            System.out.println("combustile: "+vehiculoSeleccionado.getCombustible()+ " litros");
                            break;
                        default:
                            break;
            
                    }   
                }
            }else if(seleccionar_opcion == 2){

                System.out.println("---------------------------------------------------");//temporal
                System.out.println("seleccione el numero para elegir vehiculo a agregar: ");
                System.out.println("1 Terrestre");
                System.out.println("2 Maritimo");
                System.out.println("3 Aereo");
                System.out.println("---------------------------------------------------"); //temporal
                int vehiculoAgregado = sc.nextInt();
                switch (vehiculoAgregado) {
                    case 1:
                        //3System
                        System.out.println("ingrese nombre del vehiculo");
                        String nombreTerrestre = sc.next();
                        System.out.println("ingrese la capacidad del vehículo: ");
                        double capacidadTerrestre = sc.nextDouble();
                        Terrestre sas = new Terrestre(nombreTerrestre, capacidadTerrestre);
                        vehiculos.add(sas);
                        break;
                    case 2:
                        System.out.println("ingrese nombre del vehiculo");
                        String nombreMaritimo = sc.next();
                        System.out.println("ingrese la capacidad del vehículo: ");
                        double capacidadMaritimo = sc.nextDouble();
                        Maritimo we = new Maritimo(nombreMaritimo, capacidadMaritimo); 
                        vehiculos.add(we);
                        break;
                    case 3:
                        System.out.println("ingrese nombre del vehiculo");
                        String nombreAereo = sc.next();
                        System.out.println("ingrese la capacidad del vehículo: ");
                        double capacidadAereo = sc.nextDouble();
                        Aereo wa = new Aereo(nombreAereo, capacidadAereo);
                        vehiculos.add(wa);
                        break;
                    default:
                        break;
                }

            }   
        }

        VentanaPrincipal waos = new VentanaPrincipal();
        waos.setVisible(true);
    }   
}