import java.util.*;

public class AtividadeTemperatura {
    
    public static void main(String[] args) {
        List<Double> clima = new ArrayList<Double>();
    
        clima.add(25.6);
        clima.add(28.2);
        clima.add(27.0);
        clima.add(30.8);
        clima.add(18.6);
        clima.add(20.4);

        System.out.println(clima);

        Iterator<Double> iterator = clima.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("A média dos seis primeiros meses do ano é: " + (Double)(soma/clima.size()));

        Iterator<Double> iterador2 = clima.iterator();
        while (iterador2.hasNext()) {
            Double next = iterador2.next();
            if (next < 25) {
                iterador2.remove();
                
            }
        }
        System.out.println(clima);

        System.out.println("Em Janeiro a temperatura foi de " + clima.get(0));
        System.out.println("Em Fevereiro a temperatura foi de " + clima.get(1));
        System.out.println("Em Março a temperatura foi de " + clima.get(2));
        System.out.println("Em Abril a temperatura foi de " + clima.get(3));
    }
}
