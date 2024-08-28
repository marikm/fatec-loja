package edu.fatec.oo.swing;

import edu.fatec.oo.pessoa.PessoaService;

class InputText {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}

public class Button {
    public void onClick(OnClickEvent event) {
        System.out.println("vou executar o codigo do onClickEvent");
        event.clicked();
        System.out.println("terminado de executar o codigo do onClickEvent");
    }
}

interface OnClickEvent {
    void clicked();
}

class UIClient {

    // usuario vai digitar o texto

    public static void main(String[] args) {
        final InputText cpfInputText = new InputText();
        final InputText nomeInputText = new InputText();
        final Button buttonSalvar = new Button();

        // usuario digitou em algum momento
        cpfInputText.setText("123");
        nomeInputText.setText("mike");


        // 1 forma: com classe concreta SalvarPessoaOnClickEvent
        final OnClickEvent salvarPessoaOnClickEvent = new SalvarPessoaOnClickEvent(
                cpfInputText.getText(),
                nomeInputText.getText()
        );
        buttonSalvar.onClick(salvarPessoaOnClickEvent);


        // 2 forma: com classe anomina e variavel intermediaria
        final OnClickEvent salvarPessoaOnClickEvent2 = new OnClickEvent() {
            @Override
            public void clicked() {
                PessoaService pessoaService = new PessoaService();
                pessoaService.salvarPessoa(
                        cpfInputText.getText(),
                        nomeInputText.getText());
            }
        };
        buttonSalvar.onClick(salvarPessoaOnClickEvent);


        // 3 forma: com classe anomina e sem variavel intermediaria
        buttonSalvar.onClick(new OnClickEvent() {
            @Override
            public void clicked() {
                PessoaService pessoaService = new PessoaService();
                pessoaService.salvarPessoa(cpfInputText.getText(), nomeInputText.getText());
            }
        });


        // 4 forma: com classe anomina substituida por lambda
        buttonSalvar.onClick(() -> {
            PessoaService pessoaService = new PessoaService();
            pessoaService.salvarPessoa(cpfInputText.getText(), nomeInputText.getText());
        });

    }

}


class SalvarPessoaOnClickEvent implements OnClickEvent {
    private final String cpf;
    private final String nome;

    SalvarPessoaOnClickEvent(final String cpf, final String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public void clicked() {
        System.out.println("vou salvar minha pessoa agora");
        PessoaService pessoaService = new PessoaService();
        pessoaService.salvarPessoa(this.cpf, this.nome);
    }
}

