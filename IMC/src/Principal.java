
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente p1 = new Paciente( 70.0, 1.80 );
		Paciente p2 = new Paciente( 80.0, 1.60 );
		Paciente p3 = new Paciente( 38.2, 1.58 );
		
		System.out.println(p1.diagnostico());
		System.out.println(p2.diagnostico());
		System.out.println(p3.diagnostico());
		

	}
}
