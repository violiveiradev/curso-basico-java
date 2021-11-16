public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(4586, 789);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinicius Oliveira");
        conta.setTitular(vinicius);
        System.out.println(conta.getTitular().getNome());

    }
}
