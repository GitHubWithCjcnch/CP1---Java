package br.com.fiap.PortoInfo.view;

/* 
 * Integrantes do projeto:
 * RM 552392 - CAIO VITOR URBANO NEVES
 * RM 552235 - EMILE DE MOURA MAIA
 * RM 552238 - GUILHERME PEREIRA DE OLIVEIRA
 * RM 94787 - CARLOS EDUARDO GUEDES ALCOFORADO
 * RM 552332 - JULIA ANDRADE DIAS
 */


import java.util.Scanner;
import br.com.fiap.PortoInfo.model.Caminhao;
import br.com.fiap.PortoInfo.model.Cliente;
import br.com.fiap.PortoInfo.model.Guincho;
import br.com.fiap.PortoInfo.model.Motorista;
import br.com.fiap.PortoInfo.model.Pagamento;
import br.com.fiap.PortoInfo.model.Pedido;
import br.com.fiap.PortoInfo.model.Usuario;
import br.com.fiap.PortoInfo.model.Veiculo;

public class main {
	public static void main(String[] args) {
		Scanner objInput = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Pagamento pagamento = new Pagamento();
		Pedido pedido = new Pedido();
		Usuario usuario = new Usuario();
		Guincho guincho = new Guincho();
		Caminhao caminhao = new Caminhao();
		Veiculo veiculo = new Veiculo();
		Motorista motorista = new Motorista();
		
		System.out.println("                    BEM VINDO                    ");
		System.out.println("_________________________________________________");
		System.out.println("Escolha as opções digitando entre 1 a 5:");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Cadastrar Guincho");
		System.out.println("3 - Cadastrar Caminhão que vai pegar o veículo do cliente");
		System.out.println("4 - Cadastrar Motorista");
		System.out.println("5 - Cadastrar veículo pesado do cliente");
		System.out.println("6 - Listar motoristas, guinchos e caminhões disponíveis");
		System.out.println("7 - Listar informações de cliente");
		System.out.println("_________________________________________________");
		
		int optionUser = objInput.nextInt();
		
		if (optionUser == 1) {
			System.out.println("Preciso que liste algumas informações do cliente. Primeiro o CPF:");
			cliente.setCpf(Integer.valueOf(objInput.nextInt()));
			objInput.nextLine(); // Problema com o nextInt - não consome, quebra de linha digitada pelo usuário. Por isso foi feito isso
			System.out.println("Nome: ");
			cliente.setNome(objInput.nextLine());
			System.out.println("Email: ");
			cliente.setEmail(objInput.nextLine());
			System.out.println("Endereco com complemento e numeração: ");
			cliente.setEndereco(objInput.nextLine());
			System.out.println("E por último, telefone: ");
			cliente.setTelefone(objInput.nextLine());
			System.out.println("_________________________________________________");
			System.out.println("Pronto! o seguinte cliente foi criado no sistema:");
			System.out.println(cliente.showInfoClient(cliente.getCpf(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone()));
		} else if(optionUser == 2) {
			System.out.println("Preciso que liste algumas informações acerca do guincho. Primeiro o seu tipo, segue as opções disponíveis:" + System.lineSeparator() +
								"- Caminhão de corrente e gancho" + System.lineSeparator() +
								"- Caminhão guincho de plataforma" + System.lineSeparator() +
								"- Caminhão com elevador de rodas" + System.lineSeparator() +
								"- Caminhão guincho pesado lança" + System.lineSeparator() +
								"- Caminhão com reboque integrado" + System.lineSeparator() +
								"- Guincho de veículos mais pesado da categoria: Axor 3340" + System.lineSeparator());
			guincho.setTipo(objInput.nextLine());
			System.out.println("Peso:");
			guincho.setPeso(objInput.nextFloat());
			System.out.println("Tipo de corda, segue as opções:" + System.lineSeparator() +
					"- Aço" + System.lineSeparator() +
					"- Sintético" + System.lineSeparator());
			guincho.setTipoCorda(objInput.nextLine());
			guincho.setDisponibilidade(false);
			
			System.out.println("Pronto! Guincho cadastrado com sucesso!");
		} else if(optionUser == 3) {
			System.out.println("Preciso que liste algumas informações do caminhão. Primeiro o peso:");
			caminhao.setPeso(objInput.nextFloat());
			System.out.println("Modelo: ");
			caminhao.setModelo(objInput.nextLine());
			caminhao.setDisponibilidade(false);
			System.out.println("Pronto! Caminhão cadastrado com sucesso!");
		} else if(optionUser == 4) {
			System.out.println("Preciso que liste algumas informações do motorista. Primeiro o nome:");
			motorista.setNome(objInput.nextLine());
			System.out.println("Telefone: ");
			motorista.setTelefone(objInput.nextLine());
			motorista.setDisponibilidade(false);
			System.out.println("Pronto! Motorista do caminhão cadastrado com sucesso!");
		} else if(optionUser == 5) {
			System.out.println("Preciso que liste algumas informações do veículo do cliente. Primeiro o peso:");
			veiculo.setPeso(objInput.nextFloat());
			
			System.out.println("Comprimento: ");
			veiculo.setComprimento(objInput.nextFloat());
			
			System.out.println("Altura: ");
			veiculo.setAltura(objInput.nextFloat());
			
			System.out.println("Placa: ");
			veiculo.setPlaca(objInput.nextLine());
			
			System.out.println("Modelo: ");
			veiculo.setModelo(objInput.nextLine());
			
			System.out.println("Possui chassi alongado?");
			veiculo.setChassiAlongado(objInput.nextBoolean());
			
			System.out.println("Quantos eixos o seu carro possui?");
			veiculo.setQtdEixos(Integer.valueOf(objInput.nextInt()));
			objInput.nextLine();
			
			System.out.println("E o tipo da carroceria, segue algumas opções:" + System.lineSeparator() +
					"- grade baixa" + System.lineSeparator() +
					"- grade alta" + System.lineSeparator() +
					"- prancha" + System.lineSeparator() +
					"- caçamba" + System.lineSeparator() +
					"- baú" + System.lineSeparator() +
					"- baú frigorífico" + System.lineSeparator() +
					"- porta container" + System.lineSeparator());
			veiculo.setTipoCarroceria(objInput.nextLine());
			System.out.println("Pronto! Veículo do cliente cadastrado com sucesso!");
		} else if(optionUser == 6) {
			optionUser = 0;
			System.out.println("Digite um número de 1 a 3 para Escolher qual deseja ver a disponibilidade: ");
			System.out.println("1 - Guincho");
			System.out.println("2 - Caminhão");
			System.out.println("3 - Motorista");
			optionUser = objInput.nextInt();
			
			if (optionUser == 1) {
				System.out.println("ID: " + guincho.getId() + " - Disponível:" + guincho.isDisponibilidade());
			} else if (optionUser == 2) {
				System.out.println("ID: " + caminhao.getId() + " - Disponível:" + caminhao.isDisponibilidade());
			} else if (optionUser == 3) {
				System.out.println("ID: " + motorista.getId() + " - Disponível:" + motorista.isDisponibilidade());
				if (motorista.isDisponibilidade()) {
					System.out.println("Segue contato para chamá-lo(a): " + motorista.getTelefone());
				}
			} else {
				System.out.println("VALOR INVÁLIDO. Digite um valor entre 1 e 3");
			}
		} else if(optionUser == 7) {
			System.out.println(cliente.showInfoClient(cliente.getCpf(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone()));
		} else {
			System.out.println("VALOR INVÁLIDO. Digite um valor entre 1 e 5");
		}
		objInput.close();
	}
}
