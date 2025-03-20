package com.zeroes.sigupa.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "acolhimento")
public class Acolhimento {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(unique = true, nullable = false)
    private long cns;

    @Column(unique = true, nullable = false)
    private long cpf;

    @Column(name = "data_nascimento", nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private double peso;

    @Column(name = "pressao_arterial", nullable = false)
    private double pressaoArterial;

    @Column(nullable = false)
    private double pulso;

    @Column(columnDefinition = "TEXT")
    private String obs;

    @Column(nullable = false, length = 50)
    private String situacao;

    @Column(nullable = false)
    private double temperatura;

    @Column(nullable = false)
    private int glicemia;

    @Column(name = "sat_oxigenio", nullable = false)
    private int satOxigenio;

    @Column(name = "freq_cardiaca", nullable = false)
    private int freqCardiaca;

    @Column(name = "freq_respiratoria", nullable = false)
    private int freqRespiratoria;

    // Construtor padrão
    public Acolhimento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCns() {
        return cns;
    }

    public void setCns(long cns) {
        this.cns = cns;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getPulso() {
        return pulso;
    }

    public void setPulso(double pulso) {
        this.pulso = pulso;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(int glicemia) {
        this.glicemia = glicemia;
    }

    public int getSatOxigenio() {
        return satOxigenio;
    }

    public void setSatOxigenio(int satOxigenio) {
        this.satOxigenio = satOxigenio;
    }

    public int getFreqCardiaca() {
        return freqCardiaca;
    }

    public void setFreqCardiaca(int freqCardiaca) {
        this.freqCardiaca = freqCardiaca;
    }

    public int getFreqRespiratoria() {
        return freqRespiratoria;
    }

    public void setFreqRespiratoria(int freqRespiratoria) {
        this.freqRespiratoria = freqRespiratoria;
    }

    @Override
    public String toString() {
        return "Acolhimento [id=" + id + ", nome=" + nome + ", cns=" + cns + ", cpf=" + cpf + ", dataNascimento="
                + dataNascimento + ", peso=" + peso + ", pressaoArterial=" + pressaoArterial + ", pulso=" + pulso
                + ", obs=" + obs + ", situacao=" + situacao + ", temperatura=" + temperatura + ", glicemia=" + glicemia
                + ", satOxigenio=" + satOxigenio + ", freqCardiaca=" + freqCardiaca + ", freqRespiratoria="
                + freqRespiratoria + "]";
    }    
}
