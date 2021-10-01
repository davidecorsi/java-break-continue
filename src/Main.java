
public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		int sum = 0;
		for(int i = 1; i < 10; i++)
		{
			if(i%2 == 0)
			{
				continue; // il blocco viene interrotto e salta all'iterazione successiva
			}
			sum++;
		}
		System.out.println(sum);
	}
}
