package com.mycompany.prueba_flotacamion;

import java.util.Objects;

public class Camion {

    private String matricula;
    private boolean revisionPasada, depositoCompleto;
    private int kmRecorridos;

    public Camion(String matricula, boolean revisionPasada, boolean depositoCompleto, int kmRecorridos) {
        this.matricula = matricula;
        this.revisionPasada = revisionPasada;
        this.depositoCompleto = depositoCompleto;
        this.kmRecorridos = kmRecorridos;
    }

    public void llenaDeposito() {
        depositoCompleto = true;
    }

    public void realizaRuta() throws RevisionPendienteException, DepositoIncompletoException {

        if (!revisionPasada) {
            throw new RevisionPendienteException("Para realizar ruta necesita pasar la revision");
        }
        if (!depositoCompleto) {
            throw new DepositoIncompletoException("Para realizar ruta necesita llenar el deposito");
        }
        kmRecorridos += 500;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Camion{" + "matricula=" + matricula + ", revisionPasada=" + revisionPasada + ", depositoCompleto=" + depositoCompleto + ", kmRecorridos=" + kmRecorridos + '}';
    }

}
