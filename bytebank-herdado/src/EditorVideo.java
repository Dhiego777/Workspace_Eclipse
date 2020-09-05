//Gerente é um Funcionario, Gerente herda da class Funcionario 
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando EditorVideo ");
		return 150;  //super - esta na classe acima dessa 
	}
	

}
