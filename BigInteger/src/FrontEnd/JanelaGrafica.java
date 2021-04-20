package FrontEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import BackEnd.Fatorial;

public class JanelaGrafica extends JFrame implements ActionListener{
	
	private JPanel panel;
    private JLabel lblNumero;
    private JTextField txtNumero;
    private JLabel lblFatorial;
    private JTextArea txtFatorial;
    private JButton btnExibir;
    private JScrollPane scroll;
	
	public JanelaGrafica() {
		criaComponentes();
		
	}

	private void criaComponentes() {
		//intanciando layout
        panel = new JPanel();
        scroll = new JScrollPane();
        lblNumero = new JLabel("INFORME O NUMERO: ");
        txtNumero = new JTextField(20);
        lblFatorial = new JLabel("VALOR DO FATORIAL: ");
        txtFatorial = new JTextArea(10, 50);
        txtFatorial.setLineWrap(true);
        txtFatorial.setAutoscrolls(true);
        txtFatorial.setEditable(false);
        btnExibir = new JButton("CALCULAR");
        btnExibir.addActionListener(this);
        
        //adicionar os componentes graficos ao painel
        panel.add(lblNumero);
        panel.add(txtNumero);
        panel.add(lblFatorial);
        scroll.setViewportView(txtFatorial);
        panel.add(scroll);
        panel.add(btnExibir);
        
        //adicionar o painel na janela
        add(panel);
        
        //configurar a janela
        setTitle("--- Fatorial ---");
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnExibir){
        	
        	try {
        		Fatorial fatorial = new Fatorial();
    	    	fatorial.setNumero(Integer.parseInt(txtNumero.getText()));
    	    	txtFatorial.setText(fatorial.getFatorial().toString());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "VALOR INVALIDO, DIGITE UM VALOR VALIDO E POSITIVO");
			}
        }
    }
}
