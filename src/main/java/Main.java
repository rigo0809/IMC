import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  double altura = sc.nextDouble();
  double massa = sc.nextDouble();
  double imc = massa / (altura * altura);
System.out.printf("IMC = %.2f kg/m ", imc);
  if (16.9 >  imc){
System.out.println("Muito Abaixo do Peso");
}
  if(17 < imc && imc < 18.4) {
System.out.println("Abaixo do Peso");
}
  if (18.5 < imc && imc < 24.9){
System.out.println("Peso Normal");
  }
  if(25 < imc && imc < 29.9) {
System.out.println("Acima do Peso");
}
  if(30 < imc && imc < 34.9) {
  System.out.println("Obesidade Grau I");
}
  if ( 35 < imc && imc < 40 ){
  System.out.println("Obesidade Grau II");
}
  if(40 < imc) {
  System.out.println("Obesidade Grau III");
  }
  sc.close();
  }
}