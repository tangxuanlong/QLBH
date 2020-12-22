/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import qlbh.model.HangHoa;
import qlbh.model.HoaDon;
import qlbh.model.KhachHang;
import qlbh.model.NhanVien;

/**
 *
 * @author Steven
 */
public class ClassTableModel {
    public DefaultTableModel setDefaultTableModel(List<NhanVien> listItem, String[] listColumn){
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                  return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int num  = listItem.size();
        Object[] obj;
        NhanVien nv = null;
        if(num > 0){
            for(int i = 0; i < num; i++){
                nv = listItem.get(i);
                obj = new Object[columns];
                obj[0] = nv.getMaNV();
                obj[1] = (i+1);
                obj[2] = nv.getTenNV();
                obj[3] = nv.getGioiTinh() == true ? "Nam" : "Nữ";
                obj[5] = nv.getDiaChi();
                obj[6] = nv.getSDT();
                obj[7] = nv.getTinhTrang();
                obj[4] = nv.getNgaySinh();
                dtm.addRow(obj);
            }
        }
        return dtm;
    }

    public DefaultTableModel setDefaultTableModel(List<KhachHang> listItem, String[] listColumn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DefaultTableModel setDefaultTableModel(List<HangHoa> listItem, String[] listColumn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DefaultTableModel setDefaultTableModel(List<HoaDon> listItem, String[] listColumn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
