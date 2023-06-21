package Classes;

class Carro extends Veiculo {
    private int numeroAcentos;
    private boolean possuiReboque;

    public Carro(String modelo, String placa, Cor cor, Pessoa proprietario, int numeroAcentos, boolean possuiReboque) {
        super(modelo, placa, cor, proprietario);
        this.numeroAcentos = numeroAcentos;
        this.possuiReboque = possuiReboque;
    }

    public int getNumeroAcentos() {
        return numeroAcentos;
    }

    public boolean possuiReboque() {
        return possuiReboque;
    }
}
