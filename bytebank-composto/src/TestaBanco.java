public class TestaBanco {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "111.111.111-11";
        paulo.profissao = "Programador";

        Conta contaPaulo = new Conta();
        contaPaulo.deposita(200);

        contaPaulo.titular = paulo;
        System.out.println(contaPaulo.titular.nome);


        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente();

        contaDaMarcela.titular.nome = "Marcela";

        System.out.println(contaDaMarcela.titular.nome);
    }
}
