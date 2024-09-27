package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class StokTipiView extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtKodu;
	private JTextField txtAdi;
	private JTextArea txtAciklama ;
	private JButton btnEkle ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StokTipiView frame = new StokTipiView();
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
	public StokTipiView() {
		setClosable(true);
		setIconifiable(true);
		setTitle("Stok Tipi Ekle");
		setBounds(0, 0, 350, 350);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 320, 300);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblKodu = new JLabel("Kodu");
		lblKodu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKodu.setBounds(10, 10, 70, 20);
		panel.add(lblKodu);
		
		txtKodu = new JTextField();
		txtKodu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKodu.setBounds(10, 40, 300, 25);
		panel.add(txtKodu);
		txtKodu.setColumns(10);
		
		JLabel lblAdi = new JLabel("Adı");
		lblAdi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdi.setBounds(10, 75, 70, 20);
		panel.add(lblAdi);
		
		txtAdi = new JTextField();
		txtAdi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAdi.setColumns(10);
		txtAdi.setBounds(10, 105, 300, 25);
		panel.add(txtAdi);
		
		JLabel lblAciklama = new JLabel("Açıklama");
		lblAciklama.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAciklama.setBounds(10, 140, 100, 20);
		panel.add(lblAciklama);
		
		txtAciklama = new JTextArea();
		txtAciklama.setLineWrap(true);
		txtAciklama.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtAciklama.setBounds(10, 170, 300, 90);
		panel.add(txtAciklama);
		
		btnEkle = new JButton("Stok Tipi Ekle");
		btnEkle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEkle.setBounds(0, 270, 320, 25);
		panel.add(btnEkle);

	}
	public JTextField getKodu() {
		return txtKodu;
	}
	public JTextField getAdi() {
		return txtAdi;
	}
	public JTextArea getAciklama() {
		return txtAciklama;
	}
	public JButton getEkleButton() {
		return btnEkle;
	}
}
