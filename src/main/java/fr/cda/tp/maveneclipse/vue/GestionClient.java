package fr.cda.tp.maveneclipse.vue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import fr.cda.tp.maveneclipse.DAO.Client;
import fr.cda.tp.maveneclipse.controller.Controle;
@SuppressWarnings("serial")

public class GestionClient extends JFrame {
	
	Controle ctrl = new Controle();
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField IdCode , NomCode, PrenomCode,AdresseCode, IdCodeAfficher;
	private JLabel Label1 , LabelId, LabelNom, LabelPrenom, LabelAdresse;
	private JLabel Label2;
	private JButton AjouterButton , AfficherButton ;

 	public GestionClient() {
		
 		setVisible(true);
		setTitle("Caisse");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		Label1 = new JLabel("Ajouter Client ");
		Label1.setForeground(Color.BLUE);
		Label1.setFont(new Font("Tahoma", Font.BOLD, 12));
		Label1.setBounds(100,26, 184, 14);
		contentPane.add(Label1);
				
	/*	LabelId = new JLabel("Id : ");
		LabelId.setForeground(Color.BLUE);
		LabelId.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelId.setBounds(100,56, 184, 14);
		contentPane.add(LabelId);
		
		IdCode = new JTextField();
		IdCode.setBounds(300,56, 116, 20);
		contentPane.add(IdCode);
		IdCode.setColumns(10);
		*/
		
		LabelNom = new JLabel("Nom : ");
		LabelNom.setForeground(Color.BLUE);
		LabelNom.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelNom.setBounds(100,86, 184, 14);
		contentPane.add(LabelNom);
		
		NomCode = new JTextField();
		NomCode.setBounds(300,86, 116, 20);
		contentPane.add(NomCode);
		NomCode.setColumns(10);
		
		LabelPrenom = new JLabel("Prenom : ");
		LabelPrenom.setForeground(Color.BLUE);
		LabelPrenom.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelPrenom.setBounds(100,116, 184, 14);
		contentPane.add(LabelPrenom);		
		
		PrenomCode = new JTextField();
		PrenomCode.setBounds(300,116, 116, 20);
		contentPane.add(PrenomCode);
		PrenomCode.setColumns(10);
			
		LabelAdresse = new JLabel("Adresse : ");
		LabelAdresse.setForeground(Color.BLUE);
		LabelAdresse.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelAdresse.setBounds(100,136, 184, 14);
		contentPane.add(LabelAdresse);
		
		AdresseCode = new JTextField();
		AdresseCode.setBounds(300,136, 116, 20);
		contentPane.add(AdresseCode);
		AdresseCode.setColumns(10);
		
		AjouterButton = new JButton("Ajouter");
		AfficherButton = new JButton("Afficher");
		
		AjouterButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		AjouterButton.setBounds(300,166, 90, 23);
		contentPane.add(AjouterButton);
		
		AfficherButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		AfficherButton.setBounds(450,210, 90, 23);
		contentPane.add(AfficherButton);
		
		Label2 = new JLabel("Veuillez saisir l'id : ");
		Label2.setForeground(Color.BLUE);
		Label2.setFont(new Font("Tahoma", Font.BOLD, 12));
		Label2.setBounds(160,212, 184, 14);
		contentPane.add(Label2);
			
		IdCodeAfficher = new JTextField();
		IdCodeAfficher.setBounds(300,210, 116, 20);
		contentPane.add(IdCodeAfficher);
		IdCodeAfficher.setColumns(10);
		

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0,290, 646, 56);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		
		AfficherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id= Integer.parseInt(IdCodeAfficher.getText());
				Client c = ctrl.recupererClient(id);
				DefaultTableModel dt = new DefaultTableModel();
				
				dt.addColumn("IdClient");
				dt.addColumn("Nom");
				dt.addColumn("Prenom");
				dt.addColumn("Adresse");
				
				Object []tableau={c.getId(),c.getNom(),c.getPrenom(), c.getAdresse()};
				dt.addRow(tableau);
				table.setModel(dt);
			}
		});
		
		AjouterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
			 	String nom = NomCode.getText();
				String prenom = PrenomCode.getText();
				String adresse = AdresseCode.getText();
				
				ctrl.creerClient(nom,prenom,adresse);
			}
		});
		
		
	}

}

