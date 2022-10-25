import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EstoquePraticando {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Responda 's' ou 'n'. ");

            System.out.println("Seu estoque de Tubo Soro gel de 5ml está muito abaixo do padão? ");
            String resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo K3EDTA 4ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo Transporte 4ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo Heparina 4ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo 2KEDTA 5ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo Ácido Bórico 4ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo Fluoreto de Sódio 2ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo Heparina Trace(Ametal) 5ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo Trace s/Aditivo 6ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("Seu estoque de Tubo 2KEDTA 5ml está muito abaixo do padão? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());
        }

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String resp = contador.next();
            if(resp.contains("s")) {
                count++;
            }
        }

        switch (count) {
            case 1:
                System.out.println("Estou vendo que somente temos um insumo abaixo do padão, já irei repor!");
                break;
            case 2:
                System.out.println("Estou vendo que somente temos dois insumo abaixo do padão, já irei repor!");
                break;
            case 3:
                System.out.println("Estou vendo que somente temos três insumo abaixo do padão, já irei repor!");
                break;
            case 4:
                System.out.println("Estou vendo que somente temos quatro insumo abaixo do padão, já irei repor!");
                break;
            case 5:
                System.out.println("Estou vendo que somente temos cinto insumo abaixo do padão, já irei repor!");
                break;
            case 6:
                System.out.println("Estou vendo que somente temos seis insumo abaixo do padão, já irei repor!");
                break;
            case 7:
                System.out.println("Estou vendo que somente temos sete insumo abaixo do padão, já irei repor!");
                break;
            case 8:
                System.out.println("Estou vendo que somente temos oito insumo abaixo do padão, já irei repor!");
                break;
            case 9:
                System.out.println("Estou vendo que somente temos nove insumo abaixo do padão, já irei repor!");
                break;
            case 10:
                System.out.println("Estou vendo que somente temos seis insumo abaixo do padão, já irei repor!");
                break;
        
            default:System.out.println("Seu estoque está padrão, não irei precisar repor nada. Em caso de urgencia de outros insumos além desses, entrar em contato por e-mail: pablo123@outlook.com");
                
        }

    }
}
