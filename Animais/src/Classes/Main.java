package Classes;

public class Main {
    public static void main(String[] args) {
        ListagemAnimais listagem = new ListagemAnimais();

        // Adicionando animais
        listagem.adicionarAnimal(new Animal("Leão", Categoria.MAMIFERO));
        listagem.adicionarAnimal(new Animal("Águia", Categoria.AVE));
        listagem.adicionarAnimal(new Animal("Cobra", Categoria.REPTIL));
        listagem.adicionarAnimal(new Animal("Tubarão", Categoria.PEIXE));
        listagem.adicionarAnimal(new Animal("Aranha", Categoria.INVERTEBRADO));

        // Listando todos os animais
        System.out.println("Todos os animais:");
        listagem.listarAnimais();

        // Listando animais por categoria
        System.out.println("\nAnimais da categoria MAMIFERO:");
        listagem.listarAnimaisPorCategoria(Categoria.MAMIFERO);
    }
}
