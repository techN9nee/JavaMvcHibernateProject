package frameController;

import javax.swing.JInternalFrame;

import view.AnaSayfaView;
import view.KdvTipiView;
import view.StokKartiListesiView;
import view.StokKartiView;
import view.StokTipiView;

public class ASayfaFrameController {

	private AnaSayfaView anaSayfaView;
	
	public ASayfaFrameController(AnaSayfaView view){
		this.anaSayfaView = view;
		initController();
	}
	private void openStokTipi() {
		
		boolean isOpen = false ;
		
		for(JInternalFrame frame : anaSayfaView.getDesktopPane().getAllFrames()) {
			if ( frame instanceof StokTipiView) {
				isOpen = true ;
				frame.toFront();
				break;
			}
		}
		if(!isOpen) {
			StokTipiView stokTipiView = new StokTipiView();
			STipiSaveFrameController saveFrameController = new STipiSaveFrameController(stokTipiView);
			anaSayfaView.getDesktopPane().add(stokTipiView).setVisible(true);
		}

	}
	
	private void openKdvTipi() {
		boolean isOpen = false ;
		for(JInternalFrame frame : anaSayfaView.getDesktopPane().getAllFrames()) {
			if(frame instanceof KdvTipiView) {
				isOpen = true;
				frame.toFront();
				break;
			}
		}
		if(!isOpen) {
			KdvTipiView kdvTipiView = new KdvTipiView();
			KTipiSaveFrameController kTipiSaveFrameController = new KTipiSaveFrameController(kdvTipiView);
			anaSayfaView.getDesktopPane().add(kdvTipiView).setVisible(true);
		}
	}
	private void openStokKarti() {
		boolean isOpen = false ;
		for(JInternalFrame frame : anaSayfaView.getDesktopPane().getAllFrames()) {
			if(frame instanceof StokKartiView) {
				isOpen = true ;
				frame.toFront();
				break;
			}
		}
		if(!isOpen) {
			StokKartiView stokKartiView = new StokKartiView();
			SKartiSaveFrameController saveFrameController = new SKartiSaveFrameController(stokKartiView);
			anaSayfaView.getDesktopPane().add(stokKartiView).setVisible(true);
		}
	}
	
	private void openStokKartiListesi() {
		boolean isOpen = false ;
		for(JInternalFrame frame : anaSayfaView.getDesktopPane().getAllFrames()) {
			if(frame instanceof StokKartiListesiView) {
				isOpen = true;
				frame.toFront();
				break;
			}
		}
		if(!isOpen) {
			StokKartiListesiView stokKartiListesiView = new StokKartiListesiView();
			STipiTabloFrameController sTipiTabloFrameController = new STipiTabloFrameController(stokKartiListesiView);
			KTipiTabloFrameController kTipiTabloFrameController = new KTipiTabloFrameController(stokKartiListesiView);
			SKartiTabloFrameController sKartiTabloFrameController = new SKartiTabloFrameController(stokKartiListesiView);
			STipiDeleteFrameController sTipiDeleteFrameController = new STipiDeleteFrameController(stokKartiListesiView);
			KTipiDeleteFrameController kTipiDeleteFrameController = new KTipiDeleteFrameController(stokKartiListesiView);
			SKartiDeleteFrameController  sKartiDeleteFrameController = new SKartiDeleteFrameController(stokKartiListesiView);
			YenileButtonFrameController yenileButtonFrameController = new YenileButtonFrameController(stokKartiListesiView);
			PdfAcFrameController pdfAcFrameController = new PdfAcFrameController(stokKartiListesiView);
			ExceldeAcFrameController exceldeAcFrameController = new ExceldeAcFrameController(stokKartiListesiView);
			anaSayfaView.getDesktopPane().add(stokKartiListesiView).setVisible(true);
		}
	}
	
	private void initController() {
		anaSayfaView.getStokTipi().addActionListener(e -> openStokTipi());
		anaSayfaView.getKdvTipi().addActionListener(e -> openKdvTipi());
		anaSayfaView.getStokKarti().addActionListener(e -> openStokKarti());
		anaSayfaView.getStokKartiListesi().addActionListener(e -> openStokKartiListesi());
	}
}
