package DecimalaBinario;
import java.util.Scanner;

public class ConvertirNumDecaBin 

{
    
    public static void main(String[] args) 
        {
            Convercion conversion = new Convercion(); 
            int opcion = 0;
            Scanner sc = new Scanner(System.in);
            
            while (opcion != 3)
            {
                System.out.println("Ingrese que dese hacer ");
                System.out.println("1- para convertir de Binario a decimal ");
                System.out.println("2- para convertir de decimal a binario ");
                System.out.println("3- para salir ...");
                opcion = sc.nextInt();

                switch (opcion)
                {
                    case 1: 
                         conversion.Convertir();
                    break;

                    case 2: 
                        conversion.convertir2();
                        break;
                    case 3:
                        System.out.println("salir");
                        break;

                }       
            }
        }
}
    
