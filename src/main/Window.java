/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
class Window extends JFrame implements ActionListener {

    private final String BUTTON_PANEL = "JPanel with JButtons";
    private final String TEXT_PANEL = "JPanel with JTextField";
    private JPanel cards;
    private JComboBox cbox;

    Window() {
        super("Sistema de Controle de Vendas");
        // Cria o primeiro painel com três botões
        JPanel p1 = new JPanel();
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        // Cria o segundo painel com o campo de texto
        JPanel p2 = new JPanel();
        p2.add(new JTextField("TextField", 20));
        // Inicializa o container e seta o layout
        cards = new JPanel();
        cards.setLayout(new CardLayout());
        //Adiciona os painéis e associa um nome(string) a eles
        cards.add(BUTTON_PANEL, p1);
        cards.add(TEXT_PANEL, p2);
        //Cria um combobox para selecionar os cartões
        cbox = new JComboBox();
        cbox.addItem(BUTTON_PANEL);
        cbox.addItem(TEXT_PANEL);
        cbox.addActionListener(this);
        //Adiciona o combo em um painel
        JPanel panel = new JPanel();
        panel.add(cbox);
        //Adiciona o painel de seleção e o painel com os cartões
        setLayout(new BorderLayout());
        add(panel, BorderLayout.PAGE_START);
        add(cards, BorderLayout.CENTER);
        setVisible(true);
    }

    // Implementa o listener do combobox
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cbox) {
            // Obtém o nome selecionado e mostra o cartão
            String option = (String) cbox.getSelectedItem();
            CardLayout layout = (CardLayout) cards.getLayout();
            layout.show(cards, option);
        }
    }

}

