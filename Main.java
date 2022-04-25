public class Main {
    public static void main(String[] args) {
        Festa festa1 = new Festa("Isabela Müller", "2749283492", 9);
        festa1.verificaIdade();
        festa1.exibeDados();

        Festa festa2 = new Festa("Carolina Alves", "3748234", 25);
        festa2.verificaIdade();
        festa2.exibeDados();
    }
}
