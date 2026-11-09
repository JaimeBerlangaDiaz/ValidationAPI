package berlanga_diaz.validationapi;

/**
 *  API para validar varios datos introducidos por el usuario en el programa.
 * @author Jaime Berlanga Diaz
 */
public class ValidationAPI {

    /**
     * Comprueba que el texto no sea nulo ni esté en blanco.
     */
    public static boolean esCampoRequeridoValido(String texto){
        return texto != null && !texto.trim().isEmpty();
    }
    
    /**
     * Comprueba que el nombre empiece obligatoriamente por una letra mayúscula.
     */
    
    public static boolean empiezaPorMayuscula(String nombre){
        if (!esCampoRequeridoValido(nombre)){
            return false;
        }
        char primeraLetra = nombre.trim().charAt(0);
        return Character.isUpperCase(primeraLetra);
    }
    
    /**
     * Valida un formato básico de DNI (8 números y 1 letra) o NIE.
     */
    public static boolean esDniValido(String dni){
        if (!esCampoRequeridoValido(dni)){
            return false;
        }
        return dni.trim().matches("^[0-9]{8}[A-Za-z]$");
    }
    
    /**
     * Válida que el teléfono tenga 9 dígitos númericos.
     */
    public static boolean esTelefonoValido(String telefono){
        if (!esCampoRequeridoValido(telefono)){
            return false;
        }
        return telefono.trim().matches("^[0-9]{9}$");
    }
}

