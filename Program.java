public class Program {

    public static void main(String[] args) throws ExceptionSerie {

        Serie serie1 = new Serie("Oldisseia Coreana");
        Serie serie2 = new Serie("Lost");
        Serie serie3 = new Serie("Breaking Bad");
        Serie serie4 = new Serie("Amanha");


        ProxySerie prox1 = new ProxySerie();
        prox1.setQtdViews(5);
        System.out.println(prox1.getSerie(serie4));
        System.out.println(prox1.getQtdViews());


    }

}
