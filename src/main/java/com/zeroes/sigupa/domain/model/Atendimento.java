package com.zeroes.sigupa.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 50)
    private String situacao;

    @Column(length = 100)
    private String procedimento;

    @Column(columnDefinition = "TEXT")
    private String obsProcedimento;

    @Column(length = 50)
    private String statusProcedimento;

    private String horaProcedimentoAtribuido;
    private String horaProcedimentoRealizado;

    @Column(length = 255)
    private String prescricaoMedicamento;

    @Column(columnDefinition = "TEXT")
    private String obsPrescricaoMedicamento;

    @Column(length = 50)
    private String statusMedicamento;

    private String horaMedicamentoPrescrito;
    private String horaMedicamentoConcluido;

    @Column(length = 100)
    private String exame;

    @Column(columnDefinition = "TEXT")
    private String obsExame;

    @Column(length = 50)
    private String statusExame;

    private String horaExameAtribuido;
    private String horaExameConcluido;

    private int numDiasAtestado;

    @Column(length = 100)
    private String doencaAtestado;

    @Column(columnDefinition = "TEXT")
    private String obsAtestado;

    private int numSalaEncaminhamento;

    @Column(length = 100)
    private String nomeSalaEncaminhamento;

    @Column(length = 50)
    private String classificacao;

    @Column(length = 100)
    private String especialidade;

    @Column(length = 100)
    private String nomeMedico;

    @Column(length = 10)
    private String cid;

    @Column(unique = true, nullable = false)
    private long cpf;

    @Column(nullable = false)
    private long crm;

    private String horaEntrada;
    private String horaSaida;

    private int leito;

    // Construtor padrão
    public Atendimento() {
    }
}
