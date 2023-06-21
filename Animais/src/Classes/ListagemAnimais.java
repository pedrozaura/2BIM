package Classes;

import java.util.ArrayList;
import java.util.List;

class ListagemAnimais {
    private List<Animal> animais;

    public ListagemAnimais() {
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + ", Categoria: " + animal.getCategoria());
        }
    }

    public void listarAnimaisPorCategoria(Categoria categoria) {
        for (Animal animal : animais) {
            if (animal.getCategoria() == categoria) {
                System.out.println("Nome: " + animal.getNome() + ", Categoria: " + animal.getCategoria());
            }
        }
    }
}
