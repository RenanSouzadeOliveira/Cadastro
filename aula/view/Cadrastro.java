package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import model.PessoaFisica;

public class Cadrastro extends JFrame{

JLabel txtCaixa = new JLabel("Nome");
JTextField txtCN = new JTextField();
JLabel txtCaixae = new JLabel("Endereço");
JTextField txtCE = new JTextField();
JLabel txtCaixab = new JLabel("Bairro");
JTextField txtCB = new JTextField();
JLabel txtCaixacp = new JLabel("CEP");
JTextField txtCP = new JTextField();
JLabel txtCaixacid = new JLabel("Cidade");
JTextField txtCI = new JTextField();	
JLabel txtCaixaces = new JLabel("Estado");
JTextField txtES = new JTextField();
JLabel txtCaixatel = new JLabel("Telefone");
JTextField txtTE = new JTextField();
JLabel txtCaixacel = new JLabel("Celular");
JTextField txtCEL = new JTextField();
JLabel txtCaixarg = new JLabel("RG");
JTextField txtRG = new JTextField();
JLabel txtCaixacpf = new JLabel("CPF");
JTextField txtCPF = new JTextField();
private ButtonGroup group = new ButtonGroup();
private JComboBox comboestado = new JComboBox();

MaskFormatter formatTel = null;
MaskFormatter formatCep = null;
MaskFormatter formatRg = null;
MaskFormatter formatCpf = null;
MaskFormatter formatCel = null;

JLabel txtCaixasex = new JLabel("Sexo");
private JRadioButton[] sexo = new JRadioButton[2];

JButton btnsalv = new JButton("Salvar");
JButton btnimp = new JButton("Imprimir");
JButton btnlim = new JButton("Limpar");

	PessoaFisica pessoafisica = new PessoaFisica();
	
	public Cadrastro(){
		super("Cadastro");
		
		Container paine = this.getContentPane();
		
		paine.add(txtCaixa); // label
		txtCaixa.setBounds(20,20,245,40);
		
		paine.add(txtCN);// caixa
		txtCN.setBounds(80,30,140,20);
		
		paine.add(txtCaixae);// label
		txtCaixae.setBounds(20,60,245,40);
		
		paine.add(txtCE);// caixa
		txtCE.setBounds(80,70,140,20);
		
		paine.add(txtCaixab);// label
		txtCaixab.setBounds(20,100,245,40);
		
		paine.add(txtCB);// caixa
		txtCB.setBounds(80,110,140,20);
		
		paine.add(txtCaixacp);// label
		txtCaixacp.setBounds(20,140,245,40);
		try {
			formatCep = new MaskFormatter("#####-###");
			txtCP = new JFormattedTextField(formatCep);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(txtCP);// caixa
		txtCP.setBounds(80,150,140,20);
		
		paine.add(txtCaixaces);// label
		txtCaixaces.setBounds(20,180,245,40);
		
		paine.add(comboestado);// caixa
		comboestado.setBounds(80,190,140,20);
		
		comboestado.addItem("Acre");
		comboestado.addItem("Alagoas");
		comboestado.addItem("Amapá");
		comboestado.addItem("Amazonas");
		comboestado.addItem("Bahia");
		comboestado.addItem("Ceará");
		comboestado.addItem("Distrito Federal");
		comboestado.addItem("Espírito Santo");
		comboestado.addItem("Goiás");
		comboestado.addItem("Maranhão");
		comboestado.addItem("Mato Grosso");
		comboestado.addItem("Mato Grosso do Sul");
		comboestado.addItem("Minas Gerais");
		comboestado.addItem("Pará");
		comboestado.addItem("Paraíba");
		comboestado.addItem("Paraná");
		comboestado.addItem("Pernambuco");
		comboestado.addItem("Piauí");
		comboestado.addItem("Rio de Janeiro");
		comboestado.addItem("Rio Grande do Norte");
		comboestado.addItem("Rio Grande do Sul");
		comboestado.addItem("Rondônia");
		comboestado.addItem("Roraima");
		comboestado.addItem("Santa Catarina");
		comboestado.addItem("São Paulo");
		comboestado.addItem("Sergipe");
		comboestado.addItem("Tocantins");
		
		paine.add(txtCaixatel);// label
		txtCaixatel.setBounds(20,220,245,40);
		
		try {
			formatTel = new MaskFormatter("(##)#####-####");
			txtTE = new JFormattedTextField(formatTel);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(txtTE);// caixa
		txtTE.setBounds(80,230,140,20);
		
		paine.add(txtCaixacel);// label
		txtCaixacel.setBounds(20,250,245,40);
		
		try {
			formatCel = new MaskFormatter("(##)#####-####");
			txtCEL = new JFormattedTextField(formatCel);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(txtCEL);// caixa
		txtCEL.setBounds(80,260,140,20);
		
		sexo[0] = new JRadioButton("Masculino",false);
		sexo[1] = new JRadioButton("Feminino",false);
		
		paine.add(sexo[0]);
		sexo[0].setBounds(80,290,120,20);
		paine.add(sexo[1]);
		sexo[1].setBounds(200,290,120,20);
		
		group.add(sexo[0]);
		group.add(sexo[1]);
		
		paine.add(txtCaixasex);// label
		txtCaixasex.setBounds(20,280,245,40);
		
		
		
		paine.add(txtCaixarg);// label
		txtCaixarg.setBounds(20,310,245,40);
		
		try {
			formatRg = new MaskFormatter("##.###.###-A");
			txtRG = new JFormattedTextField(formatRg);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(txtRG);// caixa
		txtRG.setBounds(80,320,140,20);
		
		paine.add(txtCaixacpf);// label
		txtCaixacpf.setBounds(20,340,245,40);
		try {
			formatCpf = new MaskFormatter("###.###.###-##");
			txtCPF = new JFormattedTextField(formatCpf);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(txtCPF);// caixa
		txtCPF.setBounds(80,350,140,20);
		
		paine.add(btnsalv);
		btnsalv.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 pessoafisica.setNome(txtCaixa.getText());
				 pessoafisica.setEndereco(txtCE.getText());
				 pessoafisica.setBairro(txtCB.getText());
				 pessoafisica.setCep(txtCP.getText());
				 pessoafisica.setCidade(txtCI.getText());
				 pessoafisica.setCpf(txtTE.getText());
				 pessoafisica.setEndereco(txtCEL.getText());
				 pessoafisica.setRg(txtRG.getText());
				 pessoafisica.setCpf(txtCPF.getText());
				 
			 }
		 });
		
		btnsalv.setBounds(90,400,100,40);
		
		paine.add(btnimp);
		btnimp.setBounds(90,450,100,40);
		
		paine.add(btnlim);
		btnlim.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtCN.setText("");
				 txtCE.setText("");
				 txtCB.setText("");
				 txtCP.setText("");
				 txtCI.setText("");
				 txtES.setText("");
				 txtTE.setText("");
				 txtCEL.setText("");
				 txtRG.setText("");
				 txtCPF.setText("");
			 }
		 });
		btnlim.setBounds(90,500,100,40);
		
		
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]){
		Cadrastro cad = new Cadrastro();
	}
}
