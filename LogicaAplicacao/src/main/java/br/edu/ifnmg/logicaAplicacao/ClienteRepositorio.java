

package br.edu.ifnmg.logicaAplicacao;

public interface ClienteRepositorio extends Repositorio<Cliente> {
    public Cliente Autenticar(String identificacaoCliente, String senha);
    public boolean Abrir(String identificacaoCliente);
}