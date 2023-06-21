package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Garagem {
    private List<Veiculo> veiculos;
    private Map<TipoVeiculo, List<Veiculo>> veiculosPorTipo;

    public Garagem() {
        veiculos = new ArrayList<>();
        veiculosPorTipo = new HashMap<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        TipoVeiculo tipoVeiculo = obterTipoVeiculo(veiculo);
        if (!veiculosPorTipo.containsKey(tipoVeiculo)) {
            veiculosPorTipo.put(tipoVeiculo, new ArrayList<>());
        }
        veiculosPorTipo.get(tipoVeiculo).add(veiculo);
    }

    private TipoVeiculo obterTipoVeiculo(Veiculo veiculo) {
        if (veiculo instanceof Carro) {
            return TipoVeiculo.CARRO;
        } else if (veiculo instanceof Caminhao) {
            return TipoVeiculo.CAMINHAO;
        } else if (veiculo instanceof Moto) {
            return TipoVeiculo.MOTO;
        }
        return null;
    }

    public void listarVeiculosPorTipo() {
        for (TipoVeiculo tipoVeiculo : veiculosPorTipo.keySet()) {
            System.out.println("Tipo de veículo: " + tipoVeiculo);
            List<Veiculo> veiculosDoTipo = veiculosPorTipo.get(tipoVeiculo);
            for (Veiculo veiculo : veiculosDoTipo) {
                System.out.println("Modelo: " + veiculo.getModelo() + ", Placa: " + veiculo.getPlaca() +
                        ", Cor: " + veiculo.getCor() + ", Proprietário: " + veiculo.getProprietario().getNome());
            }
            System.out.println();
        }
    }
}
