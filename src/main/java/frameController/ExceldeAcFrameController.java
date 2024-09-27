package frameController;

import controller.ExcelAcController;
import view.StokKartiListesiView;

public class ExceldeAcFrameController {

	private ExcelAcController excelAcController;
	private StokKartiListesiView stokKartiListesiView;
	
	public ExceldeAcFrameController(StokKartiListesiView view) {
		this.excelAcController = new ExcelAcController();
		this.stokKartiListesiView = view;
		initController();
	}
	private void openExceldeAc() {
		excelAcController.exceldeAc(stokKartiListesiView.getTblStokKarti());
	}
	private void initController() {
		stokKartiListesiView.getBtnExceldeAc().addActionListener(e -> openExceldeAc());
	}
	
}
