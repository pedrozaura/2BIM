package Classes;

class Animal {
    private String nome;
    private Categoria categoria;

    public Animal(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
