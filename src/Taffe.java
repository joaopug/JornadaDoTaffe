public class Taffe {

    //andar
    //falar
    //limpar casa
    //cantar uma musica
    // mandar mensagem bravo
    // dizer oi
    //mudar idioma

    public int numeracao;

    public String versao;

    public int posicaoAtual = 0;

    public String dizerOi() {
        return "Oi pessoal ";
    }

    public void falar(String oqueFalar) {
        System.out.println(oqueFalar);
    }

    public void andar(int quantidadePassos, boolean paraFrente) {

        for (int i = 1; i <= quantidadePassos; i++) {
            if (paraFrente == true) {
                System.out.println("Passo para frente " + i);
            } else {
                System.out.println("Passo para trás " + i);
            }
        }

        if (paraFrente == true) {
            posicaoAtual += quantidadePassos;
        } else {
            posicaoAtual -= quantidadePassos;
        }

    }

    public void retornarPosicao() {
        System.out.println("Posição: " + posicaoAtual);
    }
}
