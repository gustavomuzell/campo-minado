package br.com.cod3r.cm.model;

@FunctionalInterface
public interface CampoObservador {

    public void eventoOcorreu(Campo campo, CampoEvento evento);
}
