
public class PilotoAutomatico 
{
	public static void main(String[] args) 
	{
		
		int x =4 , y =3 , z =5 ;
		
		if ((y - x) > (z - y))
		{
			System.out.println("DIMINUIR");
		}
		
		else if ((y - x) < (z - y))
		{
			System.out.println("AUMENTAR");
		}
		
		else if ((y - x) == (z - y))
		{
			System.out.println("MANTER");
		}
	}
	
	
}
