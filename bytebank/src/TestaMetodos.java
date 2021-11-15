public class TestaMetodos {

    public static void main(String[] args) {
        Conta contaVinicius = new Conta();
        contaVinicius.saldo = 100;
        contaVinicius.deposita(50);
        System.out.println("Conta 'Vinicius' saldo atual: " + contaVinicius.saldo);

        boolean conseguiuRestirar = contaVinicius.saca(20);
        System.out.println("Conta 'Vinicius' saldo atualizado: " + contaVinicius.saldo);
        System.out.println(conseguiuRestirar);

        Conta contaPaula = new Conta();
        contaPaula.deposita(1000);

        System.out.println("Conta 'Paula' saldo atual: " + contaPaula.saldo);

        if(contaPaula.transfere(100, contaVinicius)){
            System.out.println("Transferencia consluída.");
        } else {
            System.out.println("Falha de transferencia");
        }

        System.out.println("Conta 'Vinicius' saldo atualizado: " + contaVinicius.saldo);
        System.out.println("Conta 'Paula' saldo atualizado: " + contaPaula.saldo);

    }
}
