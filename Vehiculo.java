public class Vehiculo {


    private double combustible_actual = 0;
    private String nombre_vehiculo;
    private double capacidad = 0;
    private String tipo_combustible;

    public Vehiculo(String nombre_vehiculo, double capacidad, String tipo_combustible ){
        this.nombre_vehiculo = nombre_vehiculo;
        this.capacidad  = capacidad ;
        this.tipo_combustible = tipo_combustible;
        
    }

    public void cargar_combustible(double litros){

        
        if(litros + combustible_actual>capacidad){
            System.out.println("exceso de litros sobre la capacidad del vehículo");
        }else{
            combustible_actual+=litros;
            System.out.println("se han cargado "+litros+" litros de "+tipo_combustible );
        }

    }

    public void desplazarse(double kilometros){

        if(kilometros>combustible_actual){
            System.out.println("cantidad inválida, combustible insuficiente");
        }else{
            combustible_actual-=kilometros;
            System.out.println("su vehiculo se ha desplazado "+kilometros+" kilometros");
        }
        
    }

    public String getNombre(){
        return nombre_vehiculo;
    }

    public double getCombustible(){
        return combustible_actual;
    }

    public double getCapacidad(){
        return capacidad;
    }

    public String getTipoCombustible(){
        return tipo_combustible;
    }

    
    
}
