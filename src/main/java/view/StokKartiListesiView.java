package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class StokKartiListesiView extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable tblStokTipi;
	private JTable tblKdvTipi;
	private JTable tblStokKarti;
	private JButton btnStokTipiSil;
	private JButton btnKdvTipiSil;
	private JButton btnStokKartiSil;
	private JButton btnYenile;
	private JButton btnPdfAc;
	private JButton btnExceldeAc;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StokKartiListesiView frame = new StokKartiListesiView();
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
	public StokKartiListesiView() {
		setIconifiable(true);
		setClosable(true);
		setTitle("Stok Karti Listesi");
		setBounds(704, 0, 1150, 703);
		getContentPane().setLayout(null);

		JPanel ustPanel = new JPanel();
		ustPanel.setBounds(10, 10, 1120, 320);
		getContentPane().add(ustPanel);
		ustPanel.setLayout(null);

		JLabel lblStokTipi = new JLabel("Stok Tipi Tablosu");
		lblStokTipi.setForeground(Color.RED);
		lblStokTipi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStokTipi.setBounds(10, 10, 190, 32);
		ustPanel.add(lblStokTipi);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 540, 240);
		ustPanel.add(scrollPane);

		tblStokTipi = new JTable();
		tblStokTipi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tblStokTipi);
		tblStokTipi.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Kodu", "Ad\u0131", "A\u00E7\u0131klama" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblStokTipi.getColumnModel().getColumn(0).setResizable(false);
		tblStokTipi.getColumnModel().getColumn(0).setPreferredWidth(40);
		tblStokTipi.getColumnModel().getColumn(0).setMinWidth(40);
		tblStokTipi.getColumnModel().getColumn(0).setMaxWidth(40);
		tblStokTipi.getColumnModel().getColumn(1).setResizable(false);
		tblStokTipi.getColumnModel().getColumn(1).setPreferredWidth(150);
		tblStokTipi.getColumnModel().getColumn(1).setMinWidth(150);
		tblStokTipi.getColumnModel().getColumn(1).setMaxWidth(150);
		tblStokTipi.getColumnModel().getColumn(2).setResizable(false);
		tblStokTipi.getColumnModel().getColumn(2).setPreferredWidth(150);
		tblStokTipi.getColumnModel().getColumn(2).setMinWidth(150);
		tblStokTipi.getColumnModel().getColumn(2).setMaxWidth(150);
		tblStokTipi.getColumnModel().getColumn(3).setResizable(false);
		tblStokTipi.getColumnModel().getColumn(3).setPreferredWidth(200);
		tblStokTipi.getColumnModel().getColumn(3).setMinWidth(200);
		tblStokTipi.getColumnModel().getColumn(3).setMaxWidth(200);

		JLabel lblKdvTipi = new JLabel("Kdv Tipi Tablosu");
		lblKdvTipi.setForeground(Color.RED);
		lblKdvTipi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKdvTipi.setBounds(570, 10, 190, 32);
		ustPanel.add(lblKdvTipi);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(570, 52, 540, 240);
		ustPanel.add(scrollPane_1);

		tblKdvTipi = new JTable();
		tblKdvTipi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane_1.setViewportView(tblKdvTipi);
		tblKdvTipi.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Id", "Kodu", "Ad\u0131", "Oran\u0131" }) {
					boolean[] columnEditables = new boolean[] { false, false, false, false };

					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});

		btnStokTipiSil = new JButton("Stok Tipi Sil");
		btnStokTipiSil.setBounds(10, 294, 100, 21);
		ustPanel.add(btnStokTipiSil);

		btnKdvTipiSil = new JButton("Kdv Tipi Sil");
		btnKdvTipiSil.setBounds(570, 294, 100, 21);
		ustPanel.add(btnKdvTipiSil);

		btnYenile = new JButton("Tabloları Yenile");
		btnYenile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnYenile.setIcon(new ImageIcon(
				StokKartiListesiView.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnYenile.setBounds(980, 0, 140, 30);
		ustPanel.add(btnYenile);
		tblKdvTipi.getColumnModel().getColumn(0).setResizable(false);
		tblKdvTipi.getColumnModel().getColumn(0).setPreferredWidth(40);
		tblKdvTipi.getColumnModel().getColumn(0).setMinWidth(40);
		tblKdvTipi.getColumnModel().getColumn(0).setMaxWidth(40);
		tblKdvTipi.getColumnModel().getColumn(1).setResizable(false);
		tblKdvTipi.getColumnModel().getColumn(1).setPreferredWidth(180);
		tblKdvTipi.getColumnModel().getColumn(1).setMinWidth(180);
		tblKdvTipi.getColumnModel().getColumn(1).setMaxWidth(180);
		tblKdvTipi.getColumnModel().getColumn(2).setResizable(false);
		tblKdvTipi.getColumnModel().getColumn(2).setPreferredWidth(180);
		tblKdvTipi.getColumnModel().getColumn(2).setMinWidth(180);
		tblKdvTipi.getColumnModel().getColumn(2).setMaxWidth(180);
		tblKdvTipi.getColumnModel().getColumn(3).setResizable(false);
		tblKdvTipi.getColumnModel().getColumn(3).setPreferredWidth(140);
		tblKdvTipi.getColumnModel().getColumn(3).setMinWidth(140);
		tblKdvTipi.getColumnModel().getColumn(3).setMaxWidth(140);

		JPanel altPanel = new JPanel();
		altPanel.setBounds(10, 344, 1120, 320);
		getContentPane().add(altPanel);
		altPanel.setLayout(null);

		JLabel lblStokKartTablosu = new JLabel("Stok Kartı Tablosu");
		lblStokKartTablosu.setForeground(Color.RED);
		lblStokKartTablosu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStokKartTablosu.setBounds(10, 10, 190, 32);
		altPanel.add(lblStokKartTablosu);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 52, 700, 240);
		altPanel.add(scrollPane_2);

		tblStokKarti = new JTable();
		tblStokKarti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane_2.setViewportView(tblStokKarti);
		tblStokKarti.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Stok Kodu", "Kdv Kodu", "Stok Ad\u0131", "Kdv Ad\u0131", "Oran\u0131" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblStokKarti.getColumnModel().getColumn(0).setResizable(false);
		tblStokKarti.getColumnModel().getColumn(0).setPreferredWidth(40);
		tblStokKarti.getColumnModel().getColumn(0).setMinWidth(40);
		tblStokKarti.getColumnModel().getColumn(0).setMaxWidth(40);
		tblStokKarti.getColumnModel().getColumn(1).setResizable(false);
		tblStokKarti.getColumnModel().getColumn(2).setResizable(false);
		tblStokKarti.getColumnModel().getColumn(3).setResizable(false);
		tblStokKarti.getColumnModel().getColumn(4).setResizable(false);
		tblStokKarti.getColumnModel().getColumn(5).setResizable(false);
		tblStokKarti.getColumnModel().getColumn(5).setPreferredWidth(60);
		tblStokKarti.getColumnModel().getColumn(5).setMinWidth(60);
		tblStokKarti.getColumnModel().getColumn(5).setMaxWidth(60);

		btnStokKartiSil = new JButton("Stok Kartı Sil");
		btnStokKartiSil.setBounds(10, 294, 130, 21);
		altPanel.add(btnStokKartiSil);

		btnPdfAc = new JButton("Pdf Olarak Aç");
		btnPdfAc.setForeground(Color.DARK_GRAY);
		btnPdfAc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPdfAc.setBounds(719, 51, 391, 45);
		altPanel.add(btnPdfAc);

		btnExceldeAc = new JButton("Excel Dosyası Olarak Aç");
		btnExceldeAc.setForeground(Color.DARK_GRAY);
		btnExceldeAc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExceldeAc.setBounds(719, 106, 391, 45);
		altPanel.add(btnExceldeAc);

	}

	public JTable getTblStokTipi() {
		return tblStokTipi;
	}

	public JTable getTblKdvTipi() {
		return tblKdvTipi;
	}

	public JTable getTblStokKarti() {
		return tblStokKarti;
	}

	public JButton getBtnStokTipiSil() {
		return btnStokTipiSil;
	}

	public JButton getBtnKdvTipiSil() {
		return btnKdvTipiSil;
	}

	public JButton getBtnStokKartiSil() {
		return btnStokKartiSil;
	}

	public JButton getBtnPdfAc() {
		return btnPdfAc;
	}

	public JButton getBtnExceldeAc() {
		return btnExceldeAc;
	}

	public JButton getBtnYenile() {
		return btnYenile;
	}
}
