package br.com.logistica;

import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Codigo_Rasterio_Pacote,Cliente>rastreio = new TreeMap<>();

        Codigo_Rasterio_Pacote pacote1 = new Codigo_Rasterio_Pacote ("RO341");
        Cliente cliente1 = new Cliente("Ana Clara", "Fausto Lorenço, 788");

        Codigo_Rasterio_Pacote pacote2 = new Codigo_Rasterio_Pacote ("RO641");
        Cliente cliente2 = new Cliente("Luana", "FH, 88");

        Codigo_Rasterio_Pacote pacote3 = new Codigo_Rasterio_Pacote ("RO741");
        Cliente cliente3 = new Cliente("Tamires", "Menezes Berenquer, 488");

        Codigo_Rasterio_Pacote pacote4 = new Codigo_Rasterio_Pacote ("RO941");
        Cliente cliente4 = new Cliente("Victor", "Mauricio Fang, 1788");

        rastreio.put(pacote1,cliente1);
        rastreio.put(pacote2,cliente2);
        rastreio.put(pacote3,cliente3);
        rastreio.put(pacote4,cliente4);

        for(Map.Entry<Codigo_Rasterio_Pacote, Cliente> dadosRastreio : rastreio.entrySet())
        {System.out.println(dadosRastreio.getKey()+"  "+ dadosRastreio.getValue());    }



        //Busca por numero do pacote
        String buscaPacote = "RO641";
        Codigo_Rasterio_Pacote codigoBusca = new Codigo_Rasterio_Pacote(buscaPacote);
        Cliente clienteEncontrado = rastreio.get(codigoBusca);
        if(clienteEncontrado != null){
            System.out.println("Cliente encontrado: "+ clienteEncontrado + ", referente ao pacote: "+codigoBusca);
        }
        else {
            System.out.println("Pacote não encontrado");
        }
        // Busca por nome de cliente

        String nomeCliente = "Tamires";
        Codigo_Rasterio_Pacote pacoteEncotrado = null;
        for(Map.Entry<Codigo_Rasterio_Pacote, Cliente> dados : rastreio.entrySet()){
            Cliente clienteAtual = dados.getValue();

            if(clienteAtual.getNoma().equalsIgnoreCase(nomeCliente)){
                pacoteEncotrado = dados.getKey();
                break;
            }}
            if (pacoteEncotrado!=null){
                System.out.println("Cliente: " + nomeCliente +", referente ao pacote de codigo: "+ pacoteEncotrado);
            }
            else {
                System.out.println("Cliente não encontrado");
            }
        }


    }
