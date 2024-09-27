package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StokKartiView extends JInternalFrame {


	private static final long serialVersionUID = 1L;

	private JComboBox cmbStokKodu;
	private JComboBox cmbKdvKodu;
	private JComboBox cmbStokAdi;
	private JComboBox cmbKdvAdi;
	private JComboBox cmbOrani;
	private JButton btnStokKartiEkle;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StokKartiView frame = new StokKartiView();
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
	public StokKartiView() {
		setTitle("Stok Kartı Ekle");
		setClosable(true);
		setIconifiable(true);
		setBounds(352, 0, 350, 702);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 10, 320, 653);
		getContentPane().add(panel);

		JLabel lblStokKodu = new JLabel("Stok Kodu");
		lblStokKodu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStokKodu.setBounds(10, 61, 200, 30);
		panel.add(lblStokKodu);

		cmbStokKodu = new JComboBox();
		cmbStokKodu.setBounds(10, 101, 300, 30);
		panel.add(cmbStokKodu);

		JLabel lblKdvKodu = new JLabel("Kdv Kodu");
		lblKdvKodu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKdvKodu.setBounds(10, 141, 200, 30);
		panel.add(lblKdvKodu);

		cmbKdvKodu = new JComboBox();
		cmbKdvKodu.setBounds(10, 181, 300, 30);
		panel.add(cmbKdvKodu);

		JLabel lblStokAdi = new JLabel("Stok Adı");
		lblStokAdi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStokAdi.setBounds(10, 221, 200, 30);
		panel.add(lblStokAdi);

		cmbStokAdi = new JComboBox();
		cmbStokAdi.setBounds(10, 261, 300, 30);
		panel.add(cmbStokAdi);

		JLabel lblKdvKAdi = new JLabel("Kdv Adı");
		lblKdvKAdi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKdvKAdi.setBounds(10, 301, 200, 30);
		panel.add(lblKdvKAdi);

		cmbKdvAdi = new JComboBox();
		cmbKdvAdi.setBounds(10, 341, 300, 30);
		panel.add(cmbKdvAdi);

		JLabel lblOrani = new JLabel("Oranı");
		lblOrani.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOrani.setBounds(10, 381, 70, 30);
		panel.add(lblOrani);

		cmbOrani = new JComboBox();
		cmbOrani.setBounds(10, 421, 300, 30);
		panel.add(cmbOrani);

		btnStokKartiEkle = new JButton("Stok Kartı Ekle");
		btnStokKartiEkle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnStokKartiEkle.setBounds(0, 623, 320, 25);
		panel.add(btnStokKartiEkle);

	}
	
	public JComboBox getCmbStokKodu() {
		return cmbStokKodu;
	}
	public JComboBox getCmbKdvKodu() {
		return cmbKdvKodu;
	}
	public JComboBox getCmbStokAdi() {
		return cmbStokAdi;
	}
	public JComboBox getCmbKdvAdi() {
		return cmbKdvAdi;
	}
	public JComboBox getCmbOrani() {
		return cmbOrani;
	}
	public JButton getBtnStokKartiEkle() {
		return btnStokKartiEkle;
	}
}
