package dados;

public class Main {

	public static void main(String[] args) {
				
		PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Vinicius Leite");
        pessoaFisica.setCpf("123.456.789-00");
        pessoaFisica.setRg("12.432.678");
        pessoaFisica.setTelefone("(99) 93399-4488");
        pessoaFisica.setEndereco("Wendelino, 115, Ilha da Figueira Jaragua do Sul");
        pessoaFisica.setBanco("Santander");
        pessoaFisica.setAgencia("1234");
        pessoaFisica.setTipoAssociado("Vip");
         
        System.out.println("Pessoa Física: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Telefone: " + pessoaFisica.getTelefone());
        System.out.println("Banco: " + pessoaFisica.getBanco());
 
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa Parceira");
        pessoaJuridica.setCnpj(1234567);
        pessoaJuridica.setTelefone("(31) 92328-9122");
        pessoaJuridica.setEndereco("Av. Principal, 456, Centro, Jaragua do Sul");
 
        
        System.out.println("\nPessoa Jurídica: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Telefone: " + pessoaJuridica.getTelefone());
 
        
        Associado associado = new Associado();
        associado.setNome("Valdeci Novak");
        associado.setCpf("987.115.381-90");
        associado.setRg("98.765.432");
        associado.setTelefone("(47) 9844-7157");
        associado.setEndereco("Ernersto Reinke, 127, Amizade, Guaramirim");
        associado.setId(1001);
        associado.setSenha("senha321");
 
        
        System.out.println("\nAssociado: " + associado.getNome());
        System.out.println("ID: " + associado.getId());
        System.out.println("Telefone: " + associado.getTelefone());
 
        
        Mensalidade mensalidade = new Mensalidade();
        mensalidade.setValorMensalidade(150.75f);
        mensalidade.setDataVencimento("15/09/2024");
 
        
        System.out.println("\nMensalidade:");
        System.out.println("Valor: " + mensalidade.getValorMensalidade());
        System.out.println("Vencimento: " + mensalidade.getDataVencimento());
 
       
        ControleDeEntrada controleDeEntrada = new ControleDeEntrada();
        controleDeEntrada.setDataEntrada("14/09/2024 08:00");
        controleDeEntrada.setDataSaida("14/09/2024 18:00");
 
        
        System.out.println("\nControle de Entrada:");
        System.out.println("Data de Entrada: " + controleDeEntrada.getDataEntrada());
        System.out.println("Data de Saída: " + controleDeEntrada.getDataSaida());
 
        
        ContaFinanceira contaFinanceira = new ContaFinanceira();
        contaFinanceira.setSaldo(2000.50f);
 
       
        System.out.println("\nConta Financeira:");
        System.out.println("Saldo: R$ " + contaFinanceira.getSaldo());
 
     
        Vendas venda = new Vendas();
        venda.setId(101);
        venda.setTotal(300.00f);
 
      
        System.out.println("\nVenda:");
        System.out.println("ID da Venda: " + venda.getId());
        System.out.println("Total da Venda: R$ " + venda.getTotal());
 
       
        ControleDeEstoque controleDeEstoque = new ControleDeEstoque();
        controleDeEstoque.setIdproduto(5001);
 
        System.out.println("\nControle de Estoque:");
        System.out.println("ID do Produto: " + controleDeEstoque.getIdproduto());
    }
		
		
	}


