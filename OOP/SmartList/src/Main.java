public class Main {
    public static void main(String[] args) {
        //Cria uma lista que poderá conter no máximo 10 números
        SmartList smartList = new SmartList(10);
        smartList.add(5); //Adiciona o número 5 ao final da lista
        smartList.add(10.3); //Adiciona o número 10.3 ao final da lista
        //Imprime 2, já que é a quantidade de números já inseridos
        System.out.println(smartList.length());
        //Imprimindo os elementos da lista
        for (int i = 0; i < smartList.length(); i++) {
            System.out.println(smartList.getAt(i));
        }
        //Imprime “índice inválido”
        System.out.println(smartList.getAt(2));
        //Adiciona -10 ao final da lista
        smartList.add(-10);
        //Imprime -10
        System.out.println(smartList.getAt(2));
        smartList.setAt(1, 1000); //Troca o valor 10.3, no índice 1, por 1000
        smartList.clean(); //Remove todos os elementos da lista
    }
}
