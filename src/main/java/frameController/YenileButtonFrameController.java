package frameController;

import view.StokKartiListesiView;

public class YenileButtonFrameController {

	private StokKartiListesiView stokKartiListesiView;
	private STipiTabloFrameController sTabloFrameController;
	private KTipiTabloFrameController kTipiTabloFrameController;
	private SKartiTabloFrameController sKartiTabloFrameController;
	
	public YenileButtonFrameController(StokKartiListesiView view) {
		this.stokKartiListesiView = view ;
		this.sTabloFrameController = new STipiTabloFrameController(view);
		this.kTipiTabloFrameController = new KTipiTabloFrameController(view);
		this.sKartiTabloFrameController = new SKartiTabloFrameController(view);
		initController();
	}
	
	private void initController() {
		stokKartiListesiView.getBtnYenile().addActionListener(e -> {
			sTabloFrameController.openStokTipiTable();
			kTipiTabloFrameController.openKdvTipiTable();
			sKartiTabloFrameController.openStokKartiTable();
		});
	}
}
