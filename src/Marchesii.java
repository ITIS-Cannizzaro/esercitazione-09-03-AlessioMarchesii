import java.util.Scanner;
public class Marchesii
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				es1();				break;
			case 2:
				//Inserire metodo statico
				break;
			case 3:
				//Inserire metodo statico
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - prodotto per array successivo ");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	// creo l'array di double e lo riempo con valori decimali dal 0.1 al 10.9
	static void es1()
	{
		double[]v1=new double[4];
		for(int i=0;i<v1.length;i++)
		{
			v1[i]=(double) (Math.random()*11);
		}			
		double[]v2= new double[v1.length/2];
		for(int i=0,k=0;i<v1.length;i+=2,k++)
		{
			v2[k]=v1[i]*v1[i+1];		
		}




		// creo un ciclo per far stampare i valori dell'array
		for(int i=0;i<v1.length;i++)
		{
			System.out.println(v1[i]);
		}
		System.out.println("I prodotti dell'array precedente:");
		for(int i=0;i<v2.length;i++)
		{
			System.out.println(v2[i]);
		}



	}
}
