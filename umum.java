import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DropMode;

public class umum extends JFrame {

	private JPanel Painel;
	private JTextField Senhavar;
	private JTextField Loginvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					umum frame = new umum();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public umum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 345);
		Painel = new JPanel();
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		String Lcerto=Loginvar.getText();
		String Scerto=Senhavar.getText();	
				
			if (Lcerto.contentEquals("admin") && Scerto.contentEquals("swordfish")){
				
				JOptionPane.showMessageDialog(Painel,"Login feito com sucesso" );
				}
				
			else {
				JOptionPane.showMessageDialog(Painel, "tem coisa errada ai");
			}
			
			}
		});
		
		Loginvar = new JTextField();
		Loginvar.setToolTipText("Lcerto");
		Loginvar.setColumns(10);
		
		Senhavar = new JTextField();
		Senhavar.setDropMode(DropMode.INSERT);
		Senhavar.setToolTipText("");
		Senhavar.setColumns(10);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setEditable(false);
		txtpnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnLogin.setText("Login: ");
		
		JTextPane txtpnSenha = new JTextPane();
		txtpnSenha.setEditable(false);
		txtpnSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSenha.setText("Senha: ");
		GroupLayout gl_Painel = new GroupLayout(Painel);
		gl_Painel.setHorizontalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Painel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Painel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Painel.createSequentialGroup()
							.addComponent(txtpnLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(Loginvar, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
						.addGroup(gl_Painel.createSequentialGroup()
							.addComponent(txtpnSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Senhavar, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_Painel.createSequentialGroup()
					.addGap(131)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_Painel.setVerticalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Painel.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_Painel.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtpnLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Loginvar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_Painel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Painel.createSequentialGroup()
							.addComponent(Senhavar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(94)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtpnSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		Painel.setLayout(gl_Painel);
	}
}
