public class Emprestimo {

    public static int duasParcelas(){
        return 2;
    }

    public static int tresParcelas(){
        return 3;
    }

    public static int quatroParcelas(){
        return 4;
    }

    public static int cincoParcelas(){
        return 5;
    }

    public static double jurosDuasParcelas(){
        return 0.1;
    }

    public static double jurosTresParcelas(){
        return 0.15;
    }

    public static double jurosQuatroParcelas(){
        return 0.20;
    }

    public static double jurosCincoParcelas(){
        return 0.25;
    }

    public static void valorDoJuros (int parcelas, double valor){
        if (parcelas == 2){
            double valorTotal = valor + (valor * jurosDuasParcelas());
            double valorPorParcela = valorTotal / duasParcelas();

            System.out.println("No valor de " +valor+ " se a compra for realizada em 2 vezes, tera um valor total de "
                    +valorTotal+ ", sendo cada parcela no valor de " +valorPorParcela);
        }

        else if (parcelas == 3){
            double valorTotal = valor + (valor * jurosTresParcelas());
            double valorPorParcela = valorTotal / tresParcelas();

            System.out.println("No valor de " +valor+ " se a compra for realizada em 3 vezes, tera um valor total de "
                    +valorTotal+ ", sendo cada parcela no valor de " +valorPorParcela);
        }

        else if (parcelas == 4){
            double valorTotal = valor + (valor * quatroParcelas());
            double valorPorParcela = valorTotal / jurosQuatroParcelas();

            System.out.println("No valor de " +valor+ " se a compra for realizada em 4 vezes, tera um valor total de "
                    +valorTotal+ ", sendo cada parcela no valor de " +valorPorParcela);
        }

        else if (parcelas == 5){
            double valorTotal = valor + (valor * cincoParcelas());
            double valorPorParcela = valorTotal / jurosCincoParcelas();

            System.out.println("No valor de " +valor+ " se a compra for realizada em 5 vezes, tera um valor total de "
                    +valorTotal+ ", sendo cada parcela no valor de " +valorPorParcela);
        }

        else{
            System.out.println("Não é possível parcelar em mais de 5 vezes");
        }
    }


}
