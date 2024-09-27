package frameController;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import controller.TableListController;
import model.StokTipi;
import view.StokKartiListesiView;

public class STipiTabloFrameController {

	private TableListController tableListController ;
	private StokKartiListesiView stokKartiListesiView;
	
	public STipiTabloFrameController(StokKartiListesiView view) {
		this.tableListController = new TableListController();
		this.stokKartiListesiView = view;
		initController();
	}
	
	public void openStokTipiTable() {
		DefaultTableModel model1 = (DefaultTableModel) stokKartiListesiView.getTblStokTipi().getModel();
		model1.setRowCount(0);
		try {
			List<StokTipi> stokTipi = tableListController.getStokTipi();
			for(StokTipi stokTip : stokTipi) {
				Object[] row = {
					stokTip.getId(),
					stokTip.getKodu(),
					stokTip.getAdi(),
					stokTip.getAciklama(),
				};
				model1.addRow(row);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void initController() {
		openStokTipiTable();
	}
}
