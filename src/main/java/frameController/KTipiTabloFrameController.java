package frameController;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import controller.TableListController;
import model.KdvTipi;
import view.StokKartiListesiView;

public class KTipiTabloFrameController {
	
	private TableListController tableListController;
	private StokKartiListesiView stokKartiListesiView;
	
	public KTipiTabloFrameController(StokKartiListesiView view) {
		this.tableListController = new TableListController();
		this.stokKartiListesiView = view;
		initController();
	}
	
	public void openKdvTipiTable() {
		DefaultTableModel model1 = (DefaultTableModel) stokKartiListesiView.getTblKdvTipi().getModel();
		model1.setRowCount(0);
		try {
			List<KdvTipi> kdvTipi = tableListController.getKdvTipi();
			for(KdvTipi kdvTip : kdvTipi) {
				Object[] row = {
					kdvTip.getId(),
					kdvTip.getKodu(),
					kdvTip.getAdi(),
					kdvTip.getOrani()
				};
				model1.addRow(row);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void initController() {
		openKdvTipiTable();
	}

}
