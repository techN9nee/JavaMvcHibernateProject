package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import frameController.ASayfaFrameController;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnaSayfaView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mnStokTipi;
	private JMenuItem mnKdvTipi ;
	private JMenuItem mnStokKarti ;
	private JMenuItem mnStokKartiListesi ;
	private JDesktopPane desktopPane ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaSayfaView frame = new AnaSayfaView();
					ASayfaFrameController aSayfaFrameController = new ASayfaFrameController(frame);
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
	public AnaSayfaView() {
		setResizable(false);
		setTitle("Ana Sayfa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 10, 1860, 80);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("Stok Menü");
		mnMenu.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnMenu);
		
		mnStokTipi = new JMenuItem("Stok Tipi");
		mnStokTipi.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		mnMenu.add(mnStokTipi);
		
		mnKdvTipi = new JMenuItem("Kdv Tipi");
		mnKdvTipi.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		mnMenu.add(mnKdvTipi);
		
		JSeparator separator = new JSeparator();
		mnMenu.add(separator);
		
		mnStokKarti = new JMenuItem("Stok Kartı");
		mnStokKarti.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		mnMenu.add(mnStokKarti);
		
		JSeparator separator_1 = new JSeparator();
		mnMenu.add(separator_1);
		
		mnStokKartiListesi = new JMenuItem("Stok Kartı Listesi");
		mnStokKartiListesi.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		mnMenu.add(mnStokKartiListesi);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 110, 1860, 730);
		contentPane.add(desktopPane);
	}
	
	public JMenuItem getStokTipi() {
		return mnStokTipi;
	}
	public JMenuItem getKdvTipi() {
		return mnKdvTipi;
	}
	public JMenuItem getStokKarti() {
		return mnStokKarti;
	}
	public JMenuItem getStokKartiListesi() {
		return mnStokKartiListesi;
	}
	public JDesktopPane getDesktopPane() {
		return desktopPane;
	}
}
