package Classes;
public class Main {
    public static void main(String[] args) {
        // Criando algumas pessoas
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");
        Pessoa pessoa3 = new Pessoa("Pedro");

        // Criando alguns veículos
        Veiculo caminhao = new Caminhao("Scania", "ABC1234", Cor.AZUL, pessoa1, true);
        Veiculo carro1 = new Carro("Fiat", "DEF5678", Cor.VERMELHO, pessoa2, 5, false);
        Veiculo carro2 = new Carro("Volkswagen", "GHI9012", Cor.BRANCO, pessoa2, 5, true);
        Veiculo moto = new Moto("Honda", "JKL3456", Cor.AMARELO, pessoa3, 2, false);

        // Criando a garagem
        Garagem garagem = new Garagem();
        
        // Adicionando os veículos à garagem
        garagem.adicionarVeiculo(caminhao);
        garagem.adicionarVeiculo(carro1);
        garagem.adicionarVeiculo(carro2);
        garagem.adicionarVeiculo(moto);
        
        // Listando os veículos por tipo
        garagem.listarVeiculosPorTipo();
    }
}