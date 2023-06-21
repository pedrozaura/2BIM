package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VeiculosPorMarca {
    private Map<Marca, List<Veiculo>> veiculosPorMarca;

    public VeiculosPorMarca() {
        veiculosPorMarca = new HashMap<>();
    }

    public void addVeiculoMarca(Marca marca, Veiculo veiculo) {
        veiculosPorMarca.computeIfAbsent(marca, k -> new ArrayList<>()).add(veiculo);
    }

    public List<Veiculo> filtro(String filtro) {
        List<Veiculo> filtrados = new ArrayList<>();
        for (List<Veiculo> veiculos : veiculosPorMarca.values()) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getNome().toUpperCase().contains(filtro.toUpperCase())) {
                    filtrados.add(veiculo);
                }
            }
        }
        return filtrados;
    }
    public static void main(String[] args) {
        VeiculosPorMarca veiculosPorMarca = new VeiculosPorMarca();

        // Cadastrar veículos para diferentes marcas
        veiculosPorMarca.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("Gol GTI 2000"));
        veiculosPorMarca.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("Gol GTS 1800"));
        veiculosPorMarca.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("GOLF SAPÃO"));
        veiculosPorMarca.addVeiculoMarca(Marca.FORD, new Veiculo("Fiesta"));
        veiculosPorMarca.addVeiculoMarca(Marca.FORD, new Veiculo("Focus"));
        veiculosPorMarca.addVeiculoMarca(Marca.FORD, new Veiculo("Ranger"));
        veiculosPorMarca.addVeiculoMarca(Marca.GM, new Veiculo("Cruze"));
        veiculosPorMarca.addVeiculoMarca(Marca.GM, new Veiculo("Onix"));
        veiculosPorMarca.addVeiculoMarca(Marca.GM, new Veiculo("S10"));
        veiculosPorMarca.addVeiculoMarca(Marca.RENAULT, new Veiculo("Clio"));
        veiculosPorMarca.addVeiculoMarca(Marca.RENAULT, new Veiculo("Sandero"));
        veiculosPorMarca.addVeiculoMarca(Marca.RENAULT, new Veiculo("Duster"));

        // Exemplo de filtro
        List<Veiculo> veiculosFiltrados = veiculosPorMarca.filtro("gol");
        System.out.println("Veículos filtrados:");
        for (Veiculo veiculo : veiculosFiltrados) {
            System.out.println(veiculo.getNome());
        }
    }
}
