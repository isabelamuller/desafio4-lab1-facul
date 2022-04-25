import java.util.Scanner;

public class Festa {
    // variáveis de instância
    private String nomeCompleto;
    private String CPF;
    private int idade;
    private double valorPago;
    private String nomeSetor;
    private double troco;
    Scanner sc = new Scanner(System.in);

    // construtor
    public Festa(String nomeCompleto, String CPF, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.idade = idade;
    }

    // getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void verificaIdade() { // metodo p verificar se é de maior, qual setor quer, o valor pago e o troco
        if (getIdade() >= 18) { // se for de maior
            System.out.println("Olá " + getNomeCompleto() + "! Seja muito bem-vindo(a)!");
            System.out.println("Você deseja comprar ingresso para qual setor? Digite 1 para pista (50 reais), digite 2 para VIP (90 reais), digite 3 para camarote (150 reais) ou digite 4 para sair");
            int codigoSetor = sc.nextInt();
            switch (codigoSetor) { // ve o setor, seu preço, o valor pago através do scanner e o troco (caso haja)
                case 1:
                    this.nomeSetor = "Pista";
                    System.out.println("Esse ingresso custa 50 reais, insira o valor que irá pagar: ");
                    valorPago = sc.nextDouble();
                    if (valorPago == 50) {
                        System.out.println("-------------------");
                        System.out.println("\u001B[32mLiberado! Você acaba de adquirir um ingresso no setor \u001B[0m" + this.nomeSetor + "\u001B[32m! Aproveite o show!\u001B[0m");
                    } else if (valorPago > 50) {
                        this.troco = (valorPago - 50);
                        System.out.println("-------------------");
                        System.out.println("\u001B[32mLiberado! Você acaba de adquirir um ingresso no setor \u001B[0m" + this.nomeSetor + "\u001B[32m! E seu troco é de \u001B[0m" + this.troco + "\u001B[32m reais. Aproveite o show!\u001B[0m");
                    } else {
                        System.out.println("-------------------");
                        System.out.println("\u001B[31mValor inválido.\u001B[0m");
                    }
                    break;
                case 2:
                    this.nomeSetor = "VIP";
                    System.out.println("Esse ingresso custa 90 reais, insira o valor que irá pagar: ");
                    valorPago = sc.nextDouble();
                    if (valorPago == 90) {
                        System.out.println("-------------------");
                        System.out.println("\u001B[32mLiberado! Você acaba de adquirir um ingresso no setor \u001B[0m" + this.nomeSetor + "\u001B[32m! Aproveite o show!\u001B[0m");
                    } else if (valorPago > 90) {
                        this.troco = (valorPago - 90);
                        System.out.println("-------------------");
                        System.out.println("\u001B[32mLiberado! Você acaba de adquirir um ingresso no setor \u001B[0m" + this.nomeSetor + "\u001B[32m! E seu troco é de \u001B[0m" + this.troco + "\u001B[32m reais. Aproveite o show!\u001B[0m");
                    } else {
                        System.out.println("-------------------");
                        System.out.println("\u001B[31mValor inválido.\u001B[0m");
                    }
                    break;
                case 3:
                    this.nomeSetor = "Camarote";
                    System.out.println("Esse ingresso custa 150 reais, insira o valor que irá pagar: ");
                    valorPago = sc.nextDouble();
                    if (valorPago == 150) {
                        System.out.println("-------------------");
                        System.out.println("\u001B[32mLiberado! Você acaba de adquirir um ingresso no setor \u001B[0m" + this.nomeSetor + "\u001B[32m! Aproveite o show!\u001B[0m");
                    } else if (valorPago > 150) {
                        this.troco = (valorPago - 150);
                        System.out.println("-------------------");
                        System.out.println("\u001B[32mLiberado! Você acaba de adquirir um ingresso no setor \u001B[0m" + this.nomeSetor + "\u001B[32m! E seu troco é de \u001B[0m" + this.troco + "\u001B[32m reais. Aproveite o show!\u001B[0m");
                    } else {
                        System.out.println("-------------------");
                        System.out.println("\u001B[31mValor inválido.\u001B[0m");
                    }
                    break;
                case 4: // caso queira sair
                    System.out.println("-------------------");
                    System.out.println("\u001B[32mEsperamos ver você mais vezes!\u001B[0m");
                    break;
                default: // caso digite qlqr coisa alem de 1, 2, 3 e 4
                    System.out.println("-------------------");
                    System.out.println("\u001B[31mCódigo inválido\u001B[0m");
            }
        } else { // se for de menor de 18 anos
            System.out.println("\u001B[31mEntrada não autorizada para \u001B[0m" + getNomeCompleto() + "\u001B[31m Motivo: menor de 18 anos.\u001B[0m");
        }
    }

    public void exibeDados() {
        System.out.println("-------------------");
        System.out.println("DADOS DO CLIENTE");
        System.out.println("Nome: " + getNomeCompleto());
        System.out.println("CPF: " + getCPF());
        System.out.println("Idade: " + getIdade());
        System.out.println("Setor escolhido: " + this.nomeSetor);
        System.out.println("Valor pago: " + this.valorPago);
        System.out.println("Troco: " + this.troco);
        System.out.println("-------------------");
    }
}