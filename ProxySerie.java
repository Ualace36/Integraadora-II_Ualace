public class ProxySerie implements  ISeries{
    private int qtdViews;

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }

    @Override
    public String getSerie(Serie serie) throws ExceptionSerie{

        String link = serie.getSerie(serie);

        if (!"".equals(link)){
            if(this.qtdViews < 5){
                this.qtdViews++;
            } else {
                throw new ExceptionSerie("Você já atingiu o limite de 5 séries nesta semana!");
            }
        }
        return link;
    }
}
