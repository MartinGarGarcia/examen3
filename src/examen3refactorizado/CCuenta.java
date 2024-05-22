package examen3refactorizado;

public class CCuenta {
    // Propiedades de la Clase Cuenta
    public double dSaldo;
    public String nombre;

    public static void main(String[] args) {

        CCuenta miCuenta = new CCuenta();

        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(-100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(0);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(3000);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(3001);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
      
    }

    /* Metodo para ingresar cantidades en la cuenta. Modifica el saldo. */
    public int ingresar(double cantidad) {
        int iCodErr;
        /* Inicialmente el código no evaluaba correctamente la expresión porque la estaba negando !() por lo tanto
        quité la negación y puse para que de error si es menor o igual a 0 
        o si es superiro a 3000 */
        if (cantidad <= 0 || cantidad > 3000) {
            System.out.println("No se puede ingresar una cantidad negativa, de 0 euros o superior a 3000€ (sin ser notificada con formulario)");
            iCodErr = 1;
        } else if (cantidad == 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }

        return iCodErr;
    }
    /*Comentario añadido para hacer el primero commit*/
    /*
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa o de 0"); 
        } else if (dSaldo < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
}
