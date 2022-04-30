
// Gerente é um Funcionario, Gerente herda de Funcionario
public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Gerente() {

    }
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

   public double getBonificacao() {
       System.out.println("Bonificacao do Gerente");
       return 0.5 + super.getSalario();
    }

}
