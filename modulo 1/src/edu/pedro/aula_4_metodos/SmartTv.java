package edu.pedro.aula_4_metodos;

public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        System.out.println("Volume aumentado: " + volume);
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Volume diminuido: " + volume);
        volume--;
    }

    public void ligar(){
        ligado=true;
    }
    public void desligar(){
        ligado=false;
    }
}
