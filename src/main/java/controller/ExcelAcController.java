package controller;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAcController {
	
	private void dosyaAc(String ac) {
		try {
			File dosya = new File(ac);
			Desktop.getDesktop().open(dosya);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void exceldeAc(JTable tblStokKarti) {
		try {
			JFileChooser jFileChooser = new JFileChooser();
			jFileChooser.showSaveDialog(tblStokKarti);
			File saveFile = jFileChooser.getSelectedFile();
			
			if(saveFile != null) {
				saveFile = new File(saveFile.toString() + ".xlsx");
				Workbook wb = new XSSFWorkbook();
				Sheet sheet = wb.createSheet("Sheet - 1");
				Row rowCol = sheet.createRow(0);
				for(int i = 0 ; i < tblStokKarti.getColumnCount(); i++) {
					Cell cell = rowCol.createCell(i);
					cell.setCellValue(tblStokKarti.getColumnName(i));
				}
				for(int j = 0 ; j < tblStokKarti.getRowCount(); j++) {
					Row row = sheet.createRow(j + 1);
					for(int k = 0 ; k < tblStokKarti.getColumnCount(); k++) {
						Cell cell = row.createCell(k);
						if(tblStokKarti.getValueAt(j, k) != null) {
							cell.setCellValue(tblStokKarti.getValueAt(j, k).toString());
						}
					}
				}
				FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
				wb.write(out);
				wb.close();
				out.close();
				dosyaAc(saveFile.toString());
			}else {
				JOptionPane.showMessageDialog(null, "Dosya açılamadı",null,JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
