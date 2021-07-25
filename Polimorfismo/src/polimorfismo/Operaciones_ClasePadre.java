package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos() {
        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();

    }

    public abstract void Operaciones();

    public void MostrarResultado() {
        System.out.println(resultado);

    }

}
