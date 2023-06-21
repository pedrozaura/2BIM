package Classes;
class Veiculo {
    private String modelo;
    private String placa;
    private Cor cor;
    private Pessoa proprietario;

    public Veiculo(String modelo, String placa, Cor cor, Pessoa proprietario) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public Cor getCor() {
        return cor;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }
}