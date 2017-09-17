package DecimalaBinario;
import java.math.MathContext;
import java.util.Scanner;
public class Convercion 
{
    public void Convertir()
    {
        int numero , aux , decimal ,digito;
        int exp;
        boolean esbinario;
        Scanner sc= new Scanner(System.in);    
                //controlar si es binario
                do {                         
                        System.out.println("Ingrese un Numero Binario");
                        numero = sc.nextInt();
                        esbinario= true ;
                        aux = numero;
                        while (aux !=0) 
                    {
                        digito = aux % 10;
                        if (digito != 1 && digito !=0) 
                            {
                               esbinario = false;    
                            }
                        aux = aux /10;
                    }
                    
                  } while (!esbinario);
                    exp = 0;
                    decimal = 0;
                    while (numero !=0) 
                        {                    
                            digito = numero % 10;
                            decimal= decimal + digito * (int)Math.pow(2, exp);
                             exp++;
                             numero = numero/10;
                        }
                System.out.println("El Numero decimal es: " + decimal);
    }
}


