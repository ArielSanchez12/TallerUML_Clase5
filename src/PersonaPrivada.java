public class PersonaPrivada {
    private String nombre;
    private int edad;
    private double altura;

    public PersonaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre; //Asignamos los valores con el constructor y no con setters y getters
        this.edad = edad;
        this.altura = altura;
    }


    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
    }

    public void esMayorDeEdad(){
        if(edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " no es mayor de edad");
        }
    }
}
