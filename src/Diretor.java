
public class Diretor extends Funcionario{

	@Override
	double calculeAumento(double salario) {
		salario = salario * 1.2;
		return salario;
	}

}
