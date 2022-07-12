public class Main {

    public static void main(String[] args) {

        System.out.println("\nExercício 1");
        System.out.println("Primeira operação da calculadora");
        Calculadora.soma(2.5, 8.0);
        System.out.println("Segunda operação da calculadora");
        Calculadora.sub(9, 2);
        System.out.println("Terceira operação da calculadora");
        Calculadora.div(3.8, 6.7);
        System.out.println("Quarta operação da calculadora");
        Calculadora.mult(9, 4.1);

        System.out.println("\nExercício 2");
        DiaTardeNoite.marcoDoDia(5);
        DiaTardeNoite.marcoDoDia(13);
        DiaTardeNoite.marcoDoDia(19);
        DiaTardeNoite.marcoDoDia(1200);

        System.out.println("\nExercício 3");
        Emprestimo.valorDoJuros(2, 1000);
        Emprestimo.valorDoJuros(3, 1000);
        Emprestimo.valorDoJuros(4, 1000);
        Emprestimo.valorDoJuros(5, 1000);
        Emprestimo.valorDoJuros(8, 1000);
    }


}

//public static void nomedometodo(tipo e vari-double num1-){tipo resultado = num1 + num2}
//System.out.println("") p printar
//Classe.nomedometodo(parametros) p chamar na main