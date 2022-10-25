package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map; 
import java.util.Set;
import java.util.TreeMap;

public class ExemplosMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumo");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 14.4);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        //substituindo o consumo do gol por 15,2 km/l

        carrosPopulares.putIfAbsent("gol", 15.2);
        System.out.println(carrosPopulares);

        //conferindo se o modelo tucson está na lista

        System.out.println(carrosPopulares.containsKey("tucson"));
        System.out.println(carrosPopulares.containsKey("uno"));

        //exibindo o consumo do uno

        System.out.println(carrosPopulares.get("uno"));

        //não tem como exibir o modelo pelo local

        //Exibindo os modelos 
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //exibindos somente os consumos dos carros.
        
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " + modeMaisEficiente + " - " + consumoMaisEficiente);

        //menor consumo

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente= entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);

            }
            
        }

        //exibindo a soma dos consumos

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma+= iterator.next();
        }
        System.out.println(soma);

        //media

        System.out.println(soma/carrosPopulares.size());

        // remover os que tem 15.6 de consumo
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) 
            iterator1.remove();
        }
        System.out.println(carrosPopulares);

        //imprimindo conforme foi ordenado

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 14.4);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares1);

        //ordenar pelo modelo

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        //apagar o dicionario de carros 

        carrosPopulares.clear();
        System.out.println(carrosPopulares.isEmpty()); //diz se está vazio
        System.out.println(carrosPopulares1.isEmpty());
    }
}
