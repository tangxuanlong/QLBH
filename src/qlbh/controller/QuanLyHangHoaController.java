/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import qlbh.model.HangHoa;
import qlbh.services.HangHoaServices;
import qlbh.services.HangHoaServicesImp;
import qlbh.utility.ClassTableModel;
import qlbh.view.HangHoaFrm;

/**
 *
 * @author Admin
 */
public class QuanLyHangHoaController {
    private JPanel jpnView;
    private JButton jbtnAdd;
    private JTextField jtfSearch;

    private HangHoaServices hangHoaServices = null;
    
    private ClassTableModel classTableModel = null;

    private final String[] listColumn = {"STT", "Mã Hàng",  "Tên Hàng Hoá", "Ngày Sản Xuát", "Hạn Sử Dụng","Loại Hàng",
         "Xuất Sứ", "Giá Bán", "Giá Nhập","Đơn Vị","Số Lượng","Trạng Thái"};

    private TableRowSorter<TableModel> row = null;

    public QuanLyHangHoaController(JPanel jpnView, JButton jbtnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.jbtnAdd = jbtnAdd;
        this.jtfSearch = jtfSearch;
        
        this.hangHoaServices = new HangHoaServicesImp();
          
        this.classTableModel = new ClassTableModel();
    }

    public void setDateToTable() {
        List<HangHoa> listItem = hangHoaServices.getList();
        DefaultTableModel model = classTableModel.setDefaultTableModel(listItem, listColumn);
        JTable table = new JTable(model);
        row = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(row);
        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    row.setRowFilter(null);
                } else {
                    row.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    row.setRowFilter(null);
                } else {
                    row.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        table.getTableHeader().setFont(new Font("San Serif", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1300, 400));

        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();

        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);

        table.getColumnModel().getColumn(1).setMinWidth(80);
        table.getColumnModel().getColumn(1).setMaxWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    System.out.println(selectedRowIndex);

                    HangHoa hh = new HangHoa();
                    hh.setMaHH((int)model.getValueAt(selectedRowIndex, 1));
                    hh.setTenHang(model.getValueAt(selectedRowIndex, 2).toString());
                    hh.setNgaySX((java.sql.Date) model.getValueAt(selectedRowIndex, 3));
                    hh.setHanSuDung((java.sql.Date) model.getValueAt(selectedRowIndex, 4));
                    hh.setLoaiHang(model.getValueAt(selectedRowIndex, 5) != null
                            ? model.getValueAt(selectedRowIndex, 5).toString() : "");
                    hh.setXuatSu(null != model.getValueAt(selectedRowIndex, 6)
                            ? model.getValueAt(selectedRowIndex, 6).toString() : "");
                    hh.setGiaBan((Double)model.getValueAt(selectedRowIndex, 7));
                    hh.setGiaNhap((Double)model.getValueAt(selectedRowIndex, 8));
                    hh.setDonVi(model.getValueAt(selectedRowIndex, 9).toString());
                    hh.setSoLuong((int)model.getValueAt(selectedRowIndex, 10));
                    hh.setTrangThai(model.getValueAt(selectedRowIndex, 11).toString());

                    HangHoaFrm frm = new HangHoaFrm(hh);  
                    frm.setTitle("Thông tin hàng hoá");
                    frm.setResizable(false);
                    frm.setLocationRelativeTo(null);
                    frm.setVisible(true);
                }
            }

        });

    }

    public void setEvents() {
        jbtnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HangHoaFrm frm = new HangHoaFrm(new HangHoa()); // Tương tụ
                frm.setVisible(true);
                frm.setTitle("Thông Tin Hàng Hoá");
                frm.setLocationRelativeTo(null);
                frm.setResizable(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jbtnAdd.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbtnAdd.setBackground(new Color(100, 221, 23));
            }

        });               
        
    }
}
