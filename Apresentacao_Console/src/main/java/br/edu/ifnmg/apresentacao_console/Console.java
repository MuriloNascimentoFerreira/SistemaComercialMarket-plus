/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao_console;

import br.edu.ifnmg.auxiliares.CargoFuncionario;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;
import br.edu.ifnmg.enums.FuncionarioSituacao;
import br.edu.ifnmg.enums.Segmento;
import br.edu.ifnmg.enums.TipoDocumento;
import br.edu.ifnmg.enums.TipoPessoa;
import br.edu.ifnmg.logicaAplicacao.Fornecedor;
import br.edu.ifnmg.logicaAplicacao.Produto;
import br.edu.ifnmg.logicaAplicacao.FornecedorRepositorio;
import br.edu.ifnmg.logicaAplicacao.Funcionario;
import br.edu.ifnmg.logicaAplicacao.FuncionarioRepositorio;
import br.edu.ifnmg.logicaAplicacao.Pessoa;
import br.edu.ifnmg.logicaAplicacao.PessoaRepositorio;
import br.edu.ifnmg.auxiliares.Telefone;
import br.edu.ifnmg.enums.LocalizacaoProduto;
import br.edu.ifnmg.enums.UnidadeMedida;
import br.edu.ifnmg.enums.UsuarioTipo;
import br.edu.ifnmg.logicaAplicacao.Cliente;
import br.edu.ifnmg.logicaAplicacao.ClienteRepositorio;
import br.edu.ifnmg.auxiliares.Estoque;
import br.edu.ifnmg.auxiliares.Lote;
import br.edu.ifnmg.logicaAplicacao.ProdutoRepositorio;
import br.edu.ifnmg.logicaAplicacao.Usuario;
import br.edu.ifnmg.logicaAplicacao.UsuarioRepositorio;
import Util.Util;
import br.edu.ifnmg.auxiliares.ItemVenda;
import br.edu.ifnmg.enums.TransacaoStatus;
import br.edu.ifnmg.enums.TransacaoTipo;
import br.edu.ifnmg.logicaAplicacao.TransacaoFinanceira;
import br.edu.ifnmg.logicaAplicacao.TransacaoFinanceiraRepositorio;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class Console {
    static PessoaRepositorio repositorioPessoa = RepositorioFactory.getPessoaRepositorio();
    static UsuarioRepositorio repositorioUsuario = RepositorioFactory.getUsuarioRepositorio();
    static FornecedorRepositorio repositorioFornecedor = RepositorioFactory.getFornecedorRepositorio();
    static ClienteRepositorio repositorioCliente = RepositorioFactory.getClienteRepositorio();
    static ProdutoRepositorio repositorioProduto = RepositorioFactory.getProdutoRepositorio();
    static FuncionarioRepositorio repositorioFuncionario = RepositorioFactory.getFuncionarioRepositorio();
    static TransacaoFinanceiraRepositorio repositorioTransacaoFinanceira = RepositorioFactory.getTransacaoFinanceiraRepositorio();
    
    public static void main(String[] args){
        try{
            popularBD();
            usuariosAleatorios();
            fornecedoresAleatorios();
            produtosFixos();
            transacaoFinanceira();
            System.out.println("Banco de dados populado com SUCESSO!!");
        }catch(Exception ex){
            System.out.println("FALHA ao popular o banco de dados!!");
            System.out.println(ex);
        }
        

        queries();
    }
    
    public static void queries(){
        
        
        System.out.println("-- Buscar produtos em que a quantidade mínima para atacado == 5 --");
        for(Produto produto : repositorioProduto.Buscar(new Produto(
                null, 
                null, 
                5, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null
        )
        )){
            System.out.println("    "+produto.getNome());
        }
        
        System.out.println("-- Buscar usuarios em que o email == admin & UserType == Administrador --");
        for(Usuario usuario : repositorioUsuario.Buscar(new Usuario(
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null,
                null,
                null,
                "admin",
                null,
                UsuarioTipo.Administrador
        ))){
            System.out.println("    "+usuario.getNome());
        }
        
        System.out.println("-- Buscar pessoa em que nome == 'Sebastião Codeiro' & NDocumento == '123456'--");
        for(Pessoa pessoa : repositorioPessoa.Buscar(new Pessoa(
                "Sebastião Codeiro", 
                null, 
                null, 
                null, 
                null, 
                null, 
                "123456"))){
            System.out.println("    "+pessoa.getNome());
        }
        
        System.out.println("-- Buscar fornecedor em que nome == 'Enrico Santos' --");
        for(Fornecedor fornecedor : repositorioFornecedor.Buscar(new Fornecedor(
                "Enrico Santos", 
                null, 
                null, 
                null, 
                null, 
                null, 
                null,
                null
        ))){
            System.out.println("    "+fornecedor.getNome());
        }
        
    }
     
    public static boolean popularBD(){
        List telefones = new ArrayList<Telefone>();
        telefones.add(new Telefone("3899991111"));
        telefones.add(new Telefone("3896291131"));

        Pessoa pessoa = new Pessoa(
            "Sebastião Codeiro",
            "Januária, Minas Gerais. Avenida Deodoro da Fonseca N° 111",
            telefones,
            Calendar.getInstance(),
            TipoPessoa.Fisica,
            TipoDocumento.CertidaoNascimento,
            "123456"
        );        
        
        CargoFuncionario cargo1 = new CargoFuncionario("Faxineiro", "Limpar todo o estabelecimento", new BigDecimal("0.00"), new BigDecimal("1000.00"));
        CargoFuncionario cargo2 = new CargoFuncionario("Caixa", "Realizar vendas", new BigDecimal("0.00"), new BigDecimal("1600.00"));
        CargoFuncionario cargo3 = new CargoFuncionario("Administrador", "Administrar", new BigDecimal("0.00"), new BigDecimal("2200.00"));
        CargoFuncionario cargo4 = new CargoFuncionario("Segurança", "Controle do fluxo de pessoas", new BigDecimal("0.00"), new BigDecimal("1200.00"));
        
        Funcionario funcionario = new Funcionario(
            "Antônio Gomes",
            "Lontra, Minas Gerais. Avenida Água viva N° 145",
            null,
            Calendar.getInstance(),
            TipoPessoa.Fisica,
            TipoDocumento.CNH,
            "8123427854",
            FuncionarioSituacao.Ativo,
            cargo1
        );
        
        Fornecedor fornecedor = new Fornecedor(
            "João Geraldo",
            "Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12",
            null,
            Calendar.getInstance(),
            TipoPessoa.Juridica,
            TipoDocumento.CNPJ,
            "564673",
            Segmento.Enlatados
        );
        
        Usuario usuarioAdmin = new Usuario(
            "AdminUser",
            "Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12",
            null,
            Calendar.getInstance(),
            TipoPessoa.Fisica,
            TipoDocumento.CNH,
            "564612173",
            FuncionarioSituacao.Ativo,
            cargo2,    
            "admin",
            "123",
            UsuarioTipo.Administrador
        );
 
        Usuario usuarioCaixa = new Usuario(
            "CaixaUser",
            "Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12",
            null,
            Calendar.getInstance(),
            TipoPessoa.Fisica,
            TipoDocumento.CNH,
            "564612173",
            FuncionarioSituacao.Ativo,
            cargo3,    
            "caixa",
            "123",
            UsuarioTipo.Caixa
        );
        
        Usuario usuarioGerente = new Usuario(
            "GerenteUser",
            "Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12",
            null,
            Calendar.getInstance(),
            TipoPessoa.Fisica,
            TipoDocumento.CNH,
            "564612173",
            FuncionarioSituacao.Ativo,
            cargo4,    
            "gerente",
            "123",
            UsuarioTipo.Gerente
        );
        
        Usuario usuarioBalconista = new Usuario(
            "BalconistaUser",
            "Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12",
            null,
            Calendar.getInstance(),
            TipoPessoa.Fisica,
            TipoDocumento.CNH,
            "564612173",
            FuncionarioSituacao.Ativo,
            cargo4,    
            "balconista",
            "123",
            UsuarioTipo.Balconista
        );
        
        Cliente cliente1 = new Cliente("zeroberto", 
                "1234",
                "Ze Roberto", 
                "Avenida Floriano Peixoto,12, centro, apartamento 04", 
                null,
                Calendar.getInstance(), 
                TipoPessoa.Fisica, 
                TipoDocumento.CertidaoNascimento,
                "333333"
        );
        
        Cliente cliente2 = new Cliente("mila", 
                "1234", 
                "Kamila", 
                "Avenida costa silva,14, centro, apartamento 07",
                null,
                Calendar.getInstance(),
                TipoPessoa.Fisica, 
                TipoDocumento.CertidaoNascimento, 
                "333333"
        );
        
        return repositorioPessoa.Salvar(pessoa) &&
               repositorioFuncionario.Salvar(funcionario) &&
               repositorioUsuario.Salvar(usuarioAdmin) &&
               repositorioUsuario.Salvar(usuarioCaixa) &&
               repositorioUsuario.Salvar(usuarioGerente) &&
               repositorioUsuario.Salvar(usuarioBalconista) &&
               repositorioCliente.Salvar(cliente1) &&
               repositorioCliente.Salvar(cliente2);
     }
    
    public static void fornecedoresAleatorios(){
        CargoFuncionario cargo1 = new CargoFuncionario("Faxineiro", "Limpar todo o estabelecimento", new BigDecimal("0.00"), new BigDecimal("1000.00"));
        CargoFuncionario cargo2 = new CargoFuncionario("Caixa", "Realizar vendas", new BigDecimal("1.00"), new BigDecimal("1600.00"));
        CargoFuncionario cargo3 = new CargoFuncionario("Administrador", "Administrar", new BigDecimal("5.00"), new BigDecimal("2200.00"));
        CargoFuncionario cargo4 = new CargoFuncionario("Segurança", "Controle do fluxo de pessoas", new BigDecimal("0.00"), new BigDecimal("1200.00"));
        
        
        Object[] nomes = {"Marina Dias", "Ana Julia Santos", "Lucas da Luz", "Leandro Costa", "Maria Sophia Campos", "Evelyn Lopes", "Enrico Santos", "Marina Pinto", "Marcela Fernandes", "Gustavo Barbosa", "Ana Laura Castro", "Ana Carolina Silveira", "Maria Luiza Barros", "Gustavo Rocha", "Luiz Felipe Moura", "Thiago Castro", "Pietro da Paz", "Yago da Costa", "Pietro da Mota", "Gabriel da Mata", "João Miguel Peixoto", "Breno da Luz", "André Peixoto", "Yuri Fogaça", "Sabrina Moreira", "Bárbara Dias", "Vitor Gabriel Barbosa", "Ana Castro", "Emilly Barbosa", "Vitória Silveira", "Vitor Gomes", "Bruno Moreira", "Ana Lívia Farias", "Benício Pires", "Lara Castro", "Sabrina Moraes", "Fernanda Porto", "Pietra Viana", "Luiz Fernando Ribeiro", "Maitê Pinto", "Sophie Almeida", "Stephany da Cunha", "Raul da Rocha", "Maria Vitória Viana", "Gustavo Henrique Nogueira", "Theo Cavalcanti", "Enzo Rodrigues", "Guilherme Rocha", "Davi Lucca Rodrigues", "Bruno da Mata"};
        Object[] c = {cargo1, cargo2, cargo3, cargo4};
        List cargos = Arrays.asList(c);
        Object[] enderecos = {"Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12", "Lontra, Minas Gerais. Avenida Água viva N° 145", "Januária, Minas Gerais. Avenida Deodoro da Fonseca N° 111"};
        
        for(int i=0; i<50; i++){
            Telefone telefone01 = new Telefone("(38) 9 9991-8711");
            Telefone telefone02 = new Telefone("(38) 9 9629-1131");

            List telefones = new ArrayList<Telefone>();
            telefones.add(telefone01);
            telefones.add(telefone02);
            Fornecedor fornecedor = new Fornecedor(
            nomes[i].toString(),
            enderecos[(int) (Math.random()*3)].toString(),
            telefones,
            Calendar.getInstance(),
            TipoPessoa.Juridica,
            TipoDocumento.CNPJ,
            (int) (Math.random()*4)+"1.334.543/"+(int) (Math.random()*4)+"355-0"+(int) (Math.random()*4),
            (Segmento) Segmento.values()[((int) (Math.random()*Segmento.values().length))]
        );
            repositorioFornecedor.Salvar(fornecedor);
        }
    }
    public static void usuariosAleatorios(){
        CargoFuncionario cargo1 = new CargoFuncionario("Faxineiro", "Limpar todo o estabelecimento", new BigDecimal("0.00"), new BigDecimal("1000.00"));
        CargoFuncionario cargo2 = new CargoFuncionario("Caixa", "Realizar vendas", new BigDecimal("1.00"), new BigDecimal("1600.00"));
        CargoFuncionario cargo3 = new CargoFuncionario("Administrador", "Administrar", new BigDecimal("5.00"), new BigDecimal("2200.00"));
        CargoFuncionario cargo4 = new CargoFuncionario("Segurança", "Controle do fluxo de pessoas", new BigDecimal("0.00"), new BigDecimal("1200.00"));
        
        
        Object[] nomes = {"Marina Dias", "Ana Julia Santos", "Lucas da Luz", "Leandro Costa", 
            "Maria Sophia Campos", "Evelyn Lopes", "Enrico Santos", "Marina Pinto", 
            "Marcela Fernandes", "Gustavo Barbosa", "Ana Laura Castro", "Ana Carolina Silveira",
            "Maria Luiza Barros", "Gustavo Rocha", "Luiz Felipe Moura", "Thiago Castro",
            "Pietro da Paz", "Yago da Costa", "Pietro da Mota", "Gabriel da Mata", 
            "João Miguel Peixoto", "Breno da Luz", "André Peixoto", "Yuri Fogaça", 
            "Sabrina Moreira", "Bárbara Dias", "Vitor Gabriel Barbosa", "Ana Castro", 
            "Emilly Barbosa", "Vitória Silveira", "Vitor Gomes", "Bruno Moreira", 
            "Ana Lívia Farias", "Benício Pires", "Lara Castro", "Sabrina Moraes", 
            "Fernanda Porto", "Pietra Viana", "Luiz Fernando Ribeiro", "Maitê Pinto",
            "Sophie Almeida", "Stephany da Cunha", "Raul da Rocha", "Maria Vitória Viana",
            "Gustavo Henrique Nogueira", "Theo Cavalcanti", "Enzo Rodrigues", "Guilherme Rocha",
            "Davi Lucca Rodrigues", "Bruno da Mata"};
        
        Object[] c = {cargo1, cargo2, cargo3, cargo4};
        List cargos = Arrays.asList(c);
        Object[] enderecos = {"Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12",
            "Lontra, Minas Gerais. Avenida Água viva N° 145",
            "Januária, Minas Gerais. Avenida Deodoro da Fonseca N° 111"};
        
        for(int i=0; i<50; i++){
            Telefone telefone01 = new Telefone("3899991111");        
            Telefone telefone02 = new Telefone("3896291131");

            List telefones = new ArrayList<Telefone>();
            telefones.add(telefone01);
            telefones.add(telefone02);
            Usuario usuario = new Usuario(
                    nomes[i].toString(), 
                    enderecos[(int) (Math.random()*3)].toString(), 
                    telefones,
                    Calendar.getInstance(),
                    TipoPessoa.Fisica,
                    TipoDocumento.CertidaoNascimento,
                    "1578095689", 
                    FuncionarioSituacao.Ativo,
                    (CargoFuncionario)  cargos.get((int) (Math.random()*4)), 
                    (CargoFuncionario) cargos.get((int) (Math.random()*4)) + 
                            String.valueOf((int) (Math.random()*3000000)) + 
                            "@marketplus.com",
                    "123",
                    UsuarioTipo.values()[(int) (Math.random()*4)]);
            repositorioUsuario.Salvar(usuario);
        }
    }
    
    public static void produtosFixos(){
            Estoque estoque = new Estoque(
                    LocalizacaoProduto.SETOR01, 
                    50
            );
            
            List lotes = new ArrayList();
            Lote lote = new Lote("BR110", 5, 2, Util.getCalendarDateFromString("02/06/2021"), Util.getCalendarDateFromString("02/05/2020"), estoque);
            Lote lote1 = new Lote("BR140", 3, 1, Util.getCalendarDateFromString("22/02/2020"), Util.getCalendarDateFromString("02/05/2019"), estoque);
            Lote lote11 = new Lote("BR14012", 31, 0, Util.getCalendarDateFromString("22/02/2022"), Util.getCalendarDateFromString("22/02/2020"), estoque);
            lotes.add(lote);
            lotes.add(lote1);
            lotes.add(lote11);
            
            estoque.setLotes(lotes);

            Produto produto = new Produto("Sandália Havaianas 44 Polegadas", 
                "Feita com borracha de pneu de trator, acompanhada de um kit prego para pequenos reparos", 
                10, 
                UnidadeMedida.Fardo, 
                UnidadeMedida.Unidade, 
                new BigDecimal("32.00"), 
                new BigDecimal("30.00"), 
                new BigDecimal("25.00"), 
                estoque
            );
            
            repositorioProduto.Salvar(produto);
            
            Estoque estoque2 = new Estoque(
                    LocalizacaoProduto.SETOR02, 
                    25
            );
            
            List lotes2 = new ArrayList();
            Lote lote2 = new Lote("BR130", 15, 4, Util.getCalendarDateFromString("22/08/2020"), Util.getCalendarDateFromString("12/12/2019"), estoque2);
            Lote lote22 = new Lote("BR1330", 3, 0, Util.getCalendarDateFromString("20/06/2024"), Util.getCalendarDateFromString("22/12/2020"), estoque2);
            lotes2.add(lote2);
            lotes2.add(lote22);
            
            estoque2.setLotes(lotes2);

            Produto produto2 = new Produto("Tigela azul marinho 700ml", 
                "Ideal para saladas ou uso como prato de pedreiro", 
                5, 
                UnidadeMedida.Fardo, 
                UnidadeMedida.Unidade, 
                new BigDecimal("22.00"), 
                new BigDecimal("20.00"), 
                new BigDecimal("15.00"), 
                estoque2
            );
            
            repositorioProduto.Salvar(produto2);
    }

    public static void transacaoFinanceira(){
        Produto p1 = new Produto("Produto 1", "@#4343", 2, UnidadeMedida.Unidade, UnidadeMedida.Unidade, BigDecimal.TEN, BigDecimal.TEN, BigDecimal.TEN, new Estoque(LocalizacaoProduto.SETOR01, 0));
        
        Usuario user = new Usuario(
            "TransacaoCaixa",
            "Itacarambi, Minas Gerais. Avenida Floriano Peixoto N° 12",
            null,
            Calendar.getInstance(),
            TipoPessoa.Fisica,
            TipoDocumento.CNH,
            "5646112173",
            FuncionarioSituacao.Ativo,
            new CargoFuncionario(),    
            "transacaoCaixa",
            "123",
            UsuarioTipo.Caixa
        );
        
        TransacaoFinanceira transacaoFinanceira = new TransacaoFinanceira(TransacaoTipo.Compra, TransacaoStatus.Criada, user, Calendar.getInstance());
        ItemVenda itemVenda = new ItemVenda(BigDecimal.TEN,p1.getValorVarejo());
        itemVenda.setProduto(p1);
        itemVenda.setTransacaoFinanceira(transacaoFinanceira);
        
        Produto p2 = new Produto("Produto 2", "@#4343", 2, UnidadeMedida.Unidade, UnidadeMedida.Unidade, BigDecimal.valueOf(43), BigDecimal.valueOf(12), BigDecimal.valueOf(23), new Estoque(LocalizacaoProduto.SETOR01, 0));
        ItemVenda itemVenda2 = new ItemVenda(BigDecimal.valueOf(15),p2.getValorVarejo());
        itemVenda2.setProduto(p2);
        itemVenda2.setTransacaoFinanceira(transacaoFinanceira);
        
        transacaoFinanceira.getItens().add(itemVenda);
        transacaoFinanceira.getItens().add(itemVenda2);
        
        System.out.println("------TRANSAÇÃO FINANCEIRA-------");
        for(int i=0; i<transacaoFinanceira.getItens().size(); i++){
            System.out.println("PRODUTO "+(i+1)+": "+
                    transacaoFinanceira.getItens().get(i).getQuantidade()+"X"+
                    transacaoFinanceira.getItens().get(i).getProduto().getValorVarejo()+"="+
                    transacaoFinanceira.getItens().get(i).getSubTotal()
            );
            System.out.println("-------------");
        }
        
        System.out.println("Valor da transação: R$"+ transacaoFinanceira.getValorTotal());
        
        System.out.println("Usuário: "+ transacaoFinanceira.getUsuario().getNome());
        System.out.println("--------------------------");
        repositorioTransacaoFinanceira.Salvar(transacaoFinanceira);
    }
}
