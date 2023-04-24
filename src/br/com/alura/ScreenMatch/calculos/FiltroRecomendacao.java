package br.com.alura.ScreenMatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao()>=4){
            System.out.println("está entre os preferidos");
        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("muito bem avalidado");
        }else{
            System.out.println("coloque na lista para mais tarde");
        }
    }
}
