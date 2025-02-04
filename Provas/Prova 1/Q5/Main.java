public class Main{
	public static void main(String args[]){
		Horario h1 = new Horario();
		Horario h2 = new Horario(24, 30, 26);

		System.out.println(h1.formata());
		System.out.println(h2.formata());
	
		System.out.println(h1.compara(h2));
	}
}