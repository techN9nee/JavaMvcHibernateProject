package frameController;

import controller.PdfAcController;
import view.StokKartiListesiView;

public class PdfAcFrameController {

	private PdfAcController pdfAcController;
	private StokKartiListesiView stokKartiListesiView;
	
	public PdfAcFrameController(StokKartiListesiView view) {
		this.pdfAcController = new PdfAcController();
		this.stokKartiListesiView = view ;
		initController();
	}
	private void openPdfAc() {
		stokKartiListesiView.getBtnPdfAc().addActionListener(e -> pdfAcController.jasperConnector());
	}
	private void initController() {
		openPdfAc();
	}
}
