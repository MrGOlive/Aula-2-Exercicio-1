package com.example.aula2exercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    // Setando pontos de função
    @FXML
    private TextField idNome;
    @FXML
    private ComboBox<String> idSetor;
    @FXML
    private ComboBox<String> idCategoria;
    @FXML
    private TextField idDescricao;
    @FXML
    private ComboBox<String> idPrioridade;
    @FXML
    private TextArea idResultado;

    private int numeroChamado = 0;

    @FXML
    private void initialize(){
        idSetor.getItems().addAll("Administrativo", "Manutenção", "Compras", "TI");
        idCategoria.getItems().addAll("Software", "Hardware", "Periféricos");
        idPrioridade.getItems().addAll("Alta", "Média", "Baixa");

    }

    @FXML
    public void AbrirChamado(){
        String nome = idNome.getText();
        String setor = idSetor.getValue();
        String categoria = idCategoria.getValue();
        String descricao = idDescricao.getText();
        String prioridade = idPrioridade.getValue();

        if (nome == null || nome.isBlank() || setor == null || categoria == null || descricao == null || descricao.isBlank() || prioridade == null){
            idResultado.setText("Todos os campos são obrigatórios.");
            throw new IllegalArgumentException("Todos os campos são obrigatórios.");
        }

        numeroChamado++;

        String informacoesChamado = """
                Nome do solicitante: %s
                Setor: %s
                Categoria: %s
                Descrição: %s
                Prioridade: %s
                Número do chamado: %03d
                """.formatted(nome, setor, categoria, descricao, prioridade, numeroChamado);

        idResultado.setText(informacoesChamado);

    }

}