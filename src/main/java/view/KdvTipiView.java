package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class KdvTipiView extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtKodu;
	private JTextField txtAdi;
	private JTextField txtOrani;
	private JButton btnKdvTipiEkle ;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KdvTipiView frame = new KdvTipiView();
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
	public KdvTipiView() {
		setClosable(true);
		setIconifiable(true);
		setTitle("Kdv Tipi Ekle");
		setBounds(0, 352, 350, 350);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 10, 320, 300);
		getContentPane().add(panel);
		
		JLabel lblKodu = new JLabel("Kodu");
		lblKodu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKodu.setBounds(10, 10, 70, 20);
		panel.add(lblKodu);
		
		txtKodu = new JTextField();
		txtKodu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKodu.setColumns(10);
		txtKodu.setBounds(10, 40, 300, 25);
		panel.add(txtKodu);
		
		JLabel lblAdi = new JLabel("Adı");
		lblAdi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdi.setBounds(10, 75, 70, 20);
		panel.add(lblAdi);
		
		txtAdi = new JTextField();
		txtAdi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAdi.setColumns(10);
		txtAdi.setBounds(10, 105, 300, 25);
		panel.add(txtAdi);
		
		JLabel lblOrani = new JLabel("Oranı");
		lblOrani.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOrani.setBounds(10, 140, 100, 20);
		panel.add(lblOrani);
		
		btnKdvTipiEkle = new JButton("Kdv Tipi Ekle");
		btnKdvTipiEkle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKdvTipiEkle.setBounds(0, 270, 320, 25);
		panel.add(btnKdvTipiEkle);
		
		txtOrani = new JTextField();
		txtOrani.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtOrani.setColumns(10);
		txtOrani.setBounds(10, 170, 300, 25);
		panel.add(txtOrani);

	}

	public JTextField getKodu() {
		return txtKodu;
	}
	public JTextField getAdi() {
		return txtAdi;
	}
	public JTextField getOrani() {
		return txtOrani;
	}
	public JButton getBtnEkle() {
		return btnKdvTipiEkle;
	}
}
