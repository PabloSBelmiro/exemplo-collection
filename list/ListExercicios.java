import java.util.*;

public class ListExercicios {
    // Dada uma lista com 20 notas [8, 7, 9, 4, 8, 6, 2, 6, 7, 4, 6, 8, 6, 7, 1, 6, 7, 3, 2, 9]

    public static void main(String[] args) {
        System.out.println("Criando uma lista e adicionando as vintes notas: ");

        List<Double> notas = new ArrayList<Double>();
        

        notas.add(8.0);
        notas.add(7.0);
        notas.add(9.0);
        notas.add(4.0);
        notas.add(8.0);
        notas.add(6.0);
        notas.add(2.0);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(4.0);
        notas.add(6.0);
        notas.add(8.0);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(1.0);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(3.0);
        notas.add(2.0);
        notas.add(9.3);
        

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 9.0: " + notas.indexOf(9d));

        System.out.println("Adicione a lista a nota 7.8 na posição 7: ");
        notas.add(7, 7.8);
        System.out.println(notas);

        System.out.println("Substitua a nota 10 pela nota 6.9: ");
        notas.set(notas.indexOf(9d), 6.9);
        notas.set(notas.indexOf(8d), 6.3);
        notas.set(notas.indexOf(2.0), 3.3);
        notas.set(notas.indexOf(2.0), 3.3);
        System.out.println(notas);

        System.out.println("Confirando se algumas notas estão na lista: " + notas.contains(5.0) + ", " + notas.contains(9d) + ", " + notas.contains(6d));

        System.out.println("Exibindo a algumas nota: " + notas.get(2) + "\n" + notas.get(16) + "\n" + notas.get(19));

        System.out.println("Exibindo a menor nota: " + Collections.min(notas));
        notas.add(0.6);
        System.out.println("Modificando e exibindo a menor nota novamente: " + Collections.min(notas));
        System.out.println(notas);
        
        System.out.println("Exibindo a maior nota: " + Collections.max(notas));
        notas.add(notas.indexOf(4d), 10d);
        System.out.println("Modificando e exibindo a maior nota novamente:" + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println(notas);
        
        System.out.println("A média dessa turma é: " + soma/23);
        System.out.println("A média dessa turma é: " + (int)(soma/23));
        System.out.println("A média dessa turma é: " + (soma/notas.size()));

        System.out.println("Vamos remover algumas notas: ");
        notas.remove(7.8);
        notas.remove(3d);
        notas.remove(8d);
        notas.remove(0.6);
        System.out.println(notas);

        System.out.println("A media da turma é: " + (soma/notas.size()));
        System.out.println("A nota redonda dessa turma é: " + (int)(soma/notas.size()));

        System.out.println("Vamos remover todas as notas abaixo de 6: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next <= 6) { 
                iterator2.remove();
            }
        }
        System.out.println(notas);

        System.out.println(notas.isEmpty()); /*Verificar se a lista está vazia */ 

        
        List<Double> notas2 = new ArrayList<Double>();
        notas2.add(2.2);
        notas2.add(2.3);
        notas2.add(2.4);
        notas2.add(2.5);
        notas2.add(2.6);
    
        System.out.println(notas2);
        System.out.println(notas);

        notas2.addAll(notas);

        System.out.println(notas2);

        
        notas2.remove(7d);
        System.out.println(notas2);

        System.out.println("Mostra a primeira nota: " + notas2.get(0));

        
    }
}
