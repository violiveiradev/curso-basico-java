public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(2546, 1337);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(2547, 1348);
        Conta conta3 = new Conta(2548, 1395);

        System.out.println(Conta.getTotal());
    }
}
