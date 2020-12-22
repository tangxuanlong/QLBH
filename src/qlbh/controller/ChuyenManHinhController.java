
package qlbh.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import qlbh.beans.DanhMucBeans;
import qlbh.view.BaoCaoJPanel;
import qlbh.view.HeThongJPanel;
import qlbh.view.LapPhieuJPanel;
import qlbh.view.MainFrm;
import qlbh.view.NhanVienJPanel;
import qlbh.view.ThongKeJPannel;
import qlbh.view.TraCuuJPanel;
import qlbh.view.TroGiupJPanel;
import qlbh.view.HangHoaJPanel;
import qlbh.view.HoaDonJPanel;
import qlbh.view.KhachHangJPanel;

/**
 *
 * @author Steven
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBeans> listItem = null;
    
    

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "HeThong";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new HeThongJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvents(List<DanhMucBeans> listItem){
        this.listItem = listItem;
        for(DanhMucBeans item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(root, item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(JPanel node, String kind, JPanel jpnItem, JLabel jlbItem) {
            this.node = node;
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        
        }

      
        
         
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "HeThong":
                    node = new HeThongJPanel();
                    break;
                case "NhanVien":
                    node = new NhanVienJPanel();
                    break;
                case "ThongKe":
                    node = new ThongKeJPannel();
                    break;
                case "HangHoa":
                    node = new HangHoaJPanel();
                    break;
                case "HoaDon":
                    node = new HoaDonJPannel();
                    break;
                case "KhachHang":
                    node = new KhachHangJPannel();
                    break;
                case "BaoCao":
                    node = new BaoCaoJPanel();
                    break;
                case "TraCuu":
                    node = new TraCuuJPanel();
                    break;
                case "Help":
                    node = new TroGiupJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override   
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            MainFrm main = new MainFrm();
            if(!kindSelected.equalsIgnoreCase(kind)){
                
                jpnItem.setBackground(new Color(76,178,80));
                jlbItem.setBackground(new Color(76,178,80));
            }
        }
        
    }
    
    private void setChangeBackground(String kind) {
        for(DanhMucBeans item : listItem) {
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(96,100,191));
                item.getJlb().setBackground(new Color(96,100,191));
                System.out.println("press success");
            } 
            else {
                item.getJpn().setBackground(new Color(76,175,80));
                item.getJlb().setBackground(new Color(76,175,80));
                }
        }
    
    }
}
