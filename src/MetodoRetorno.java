public class MetodoRetorno {

    public static void main(String[] args) {

        int resultado = sumarDosNumeros(100, 400);
        System.out.println("el resultado de la suma es: " + resultado);
        int notaPromedio = promedio(5,4,3);
        System.out.println("el resultado de la promedio es: " + notaPromedio);


    }

    public static int sumarDosNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int promedio(int nota1, int nota2 , int nota3) {
        int notapromedio = (nota1 + nota2 + nota3) / 3;
        return notapromedio;
    }
}

