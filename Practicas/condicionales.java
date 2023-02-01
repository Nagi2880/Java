public class condicionales{
    public static void main(String args[]){
        String[] materias = {"Fisica","Matematica","Quimica"};
        int[] notas = {8,5,3};
        int sumanotas= 0;
        for(int numero: notas){
            sumanotas += numero;
        }
        int resultado = sumanotas / notas.length;
        System.out.println("el promedio del alumno es:" + resultado);

        if(resultado == 6 && materias.length == notas.length) {
            System.out.println("el alumno exonero con un promedio de: " + resultado);
        }else{
            System.out.println("El alumno no exonero debido a que su nota es menor al minimo necesario");
        }
    }
    
}