import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Peticao p1 = new Peticao();
		int op;
		
		do {
			System.out.println("----------> || -----------> || -----------> || -----------> || ---------> || ----------> || ----------> || -----------> || -----------> || -----------> || ---------> || ---------->\n");
			System.out.println("Bem vindo, e muito obrigado por testar um programa meu.");
			System.out.println("Espero que goste, se quiser acrescentar em algo me contate.\ninstagram: Vitorepf\n");
			System.out.println("Por favor, prencha os campos como deverá estar na petição \n");
			System.out.println("Por favor, Digite o endereço residencial \n");
			String x = sc.nextLine();
			p1.setEnderecoR(x);

			System.out.println("Por favor, Digite o nome do procurador \n");
			String a = sc.nextLine();
			p1.setProcurador(a);
			
			System.out.println("Por favor, Digite a nacionalidade \n");
			String b = sc.nextLine();
			p1.setNacionalidade(b);
			
			System.out.println("Por favor, Digite o Estado civil \n");
			String c = sc.nextLine();
			p1.setEstadoCivil(c);
			
			System.out.println("Por favor, Digite o Cpf \n");
			String d = sc.nextLine();
			p1.setCpf(d);
			
			System.out.println("Por favor, Digite o Rg \n");
			Long e = sc.nextLong();
			p1.setRg(e);
			
			System.out.println("Por favor, Digite o Endereço \n");
			String f = sc.nextLine();
			p1.setEndereco(f);
			
			System.out.println("Por favor, Digite o Cep \n");
			Long g = sc.nextLong();
			p1.setCep(g);
			
			System.out.println("------------------------------------------------------------------------------ \n\n                              Petição \n \n  EXELENTÍSSIMO, SENHOR DOUTOR JUIZ DE DIREITO DA 1 VARA DA FAMÍLIA E SUCESSÕES DO FORUM CENTRAL DE GOIÂNIA - GOIAS \n \n \n \n \n \n \n ");
			System.out.println(p1.getProcurador()+", " + p1.getNacionalidade()+ ", " + p1.getEstadoCivil() + ", portador da celula de indentidade RG n: "+ p1.getRg()+ " - SSP-GO , inscrito no CPF sobre o número: "+p1.getCpf()+", residente no "+p1.getEnderecoR()+"...");
			
			op=sc.nextInt();
			
		}while(op != 4);
	}
}
