package examen3refactorizado;

public class CCuenta {

    /**
     * @return the dSaldo
     */
    public double getdSaldo() {
        return dSaldo;
    }

    /**
     * @param dSaldo the dSaldo to set
     */
    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Propiedades de la Clase Cuenta
    /**
     * Los atributos de esta clase son el saldo y el nombre
     * @author Martin Garcia
     * @since 22/05/2024
     */
    private double dSaldo;
    private String nombre;

    public static void main(String[] args) {

        CCuenta cuenta1 = new CCuenta();
        operativa_cuenta(cuenta1, 100);

       
      
    }
    /**
     * 
     * @param cuenta es la cuenta sobre la que se realiza la operativa
     * @param cantidad es la cantidad a ingresar o retirar
     * @author Martin Garcia
     * @since 22/05/2024
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        System.out.println("Saldo Incial: " + cuenta.getdSaldo() + " euros");
        
        cuenta.ingresar(-100);
        System.out.println("Saldo tras ingreso: " + cuenta.getdSaldo() + " euros");
        cuenta.ingresar(0);
        System.out.println("Saldo tras ingreso: " + cuenta.getdSaldo() + " euros");
        cuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + cuenta.getdSaldo() + " euros");
        cuenta.ingresar(3000);
        System.out.println("Saldo tras ingreso: " + cuenta.getdSaldo() + " euros");
        cuenta.ingresar(3001);
        System.out.println("Saldo tras ingreso: " + cuenta.getdSaldo() + " euros");
        cuenta.ingresar(cantidad);
        System.out.println("Saldo tras ingreso: " + cuenta.getdSaldo() + " euros");
        cuenta.retirar(cantidad);
        System.out.println("Saldo tras retirada: " + cuenta.getdSaldo() + " euros");

    }

    /* Metodo para ingresar cantidades en la cuenta. Modifica el saldo. */
    /**
     * 
     * @param cantidad es la cantidad que se ingresa
     * @return retorna el código de error
     * @author Martin Garcia
     * @since 22/05/2024
     */
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
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        } else {
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        }

        return iCodErr;
    }
    /*Comentario añadido para hacer el primer commit*/
     /*Comentario añadido para hacer el segundo commit*/

    /*
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    /**
     * 
     * @param cantidad es la cantidad a retirar
     * @author Martin Garcia
     * @since 22/05/2024
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa o de 0"); 
        } else if (getdSaldo() < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            setdSaldo(getdSaldo() - cantidad);
            System.out.println("Le quedan " + getdSaldo() + " en cuenta");
        }
    }
}
