package factorial;

public class factorial
{
	public class Factorial implements Prueba {
		@Override
		public double calcularFactorial(double n) {
			if (n == 0) {
				return 1;
			} else {
				double resultado = n * calcularFactorial(n-1);
				return resultado;
			}
		}
	}
}
