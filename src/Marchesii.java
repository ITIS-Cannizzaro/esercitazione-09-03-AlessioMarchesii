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
	static void es1()
	{
		// creo l'array di double e lo riempo con valori decimali dal 0.1 al 10.9
		double[]v1=new double[4];
		for(int i=0;i<v1.length;i++)
		{
			v1[i]=(double) (Math.random()*11);
		}		
		//creo un secondo array,che sarà riempito grazie ai prodotti tra gli elementi del primo array
		double[]v2= new double[v1.length/2];
		//oltre ad aver creato un ciclo per permettre di passare da un elemento dell'array 1 all'altro,creo una variabile k,sempre dentro al ciclo, che mi farà passare dal elemento 0 dell'array 2 all'elemento 1 dell'array 2 grazie all'incrementazione 
		for(int i=0,k=0;i<v1.length;i+=2,k++)
		{
			//prodotto degli elementi dell'array 1 per trovare gli elementi dell'array 2
			v2[k]=v1[i]*v1[i+1];		
		}




		// creo due cicli per far stampare i valori di entrambi gli array
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
