//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.incluidoNoPlano = true;
        meuFilme.avaliacao = 9.2;
        meuFilme.totalDeAvaliacoes = 100;
        meuFilme.duracaoEmMinutos = 175;
        System.out.println("Nome: " + meuFilme.nome);
        System.out.println("Ano de lançamento: " + meuFilme.anoDeLancamento);
        System.out.println("Incluído no plano: " + meuFilme.incluidoNoPlano);
        System.out.println("Avaliação: " + meuFilme.avaliacao);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + meuFilme.duracaoEmMinutos);


    }
}