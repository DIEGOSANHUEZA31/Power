public class main {
    public static void main(String[] args) {
        power lifter = new power("Diego Sanhueza", 21, 85, 80, 110, 140);

        System.out.println("Nombre: " + lifter.getNombre());
        System.out.println("Edad: " + lifter.getEdad());
        System.out.println("Peso: " + lifter.getPeso());
        System.out.println("Marca en press de banca: " + lifter.getMarcaPressBanca());
        System.out.println("Marca en sentadilla: " + lifter.getMarcaSentadilla());
        System.out.println("Marca en peso muerto: " + lifter.getMarcaPesoMuerto());
    }
}
