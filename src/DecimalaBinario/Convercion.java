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
                        digito = aux % 10;//le asigno a digito el ultimo numero 
                        if (digito != 1 && digito !=0) //controlo si es distinito de 0 y 1
                            {
                               esbinario = false;
                                System.out.println("Ingresa solo un numero Binario Compuesto por ' 0 y 1' ");
                                System.out.println("");
                            }
                        aux = aux /10;//quitamos el ultimo numero 
                    }
                    
                  } while (!esbinario);//controlo que sea un numero binario
                    exp = 0;
                    decimal = 0;
                    while (numero !=0)// controlo que no sea un numero 0
                        {                    
                            digito = numero % 10;//separa el ultimo numero 
                            //suma los numeros elevados a la potencia de 2
                            decimal= decimal + digito * (int)Math.pow(2, exp);
                             exp++;//cada vez que pasa suma el exp + 1
                             numero = numero/10;//quito el ultimo numero 
                        }
                System.out.println("El Numero decimal es: " + decimal);
    }
}


