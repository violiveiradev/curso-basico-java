
// Gerente é um Funcionario, Gerente herda de Funcionario
public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    public Gerente() {

    }
    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return 0.5 + super.getSalario();
    }

    
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }



}
