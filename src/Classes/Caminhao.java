package Classes;

class Caminhao extends Veiculo {
    private boolean suportaReboque;

    public Caminhao(String modelo, String placa, Cor cor, Pessoa proprietario, boolean suportaReboque) {
        super(modelo, placa, cor, proprietario);
        this.suportaReboque = suportaReboque;
    }

    public boolean suportaReboque() {
        return suportaReboque;
    }
}