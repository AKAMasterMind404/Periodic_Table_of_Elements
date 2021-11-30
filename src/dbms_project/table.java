/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.table.DefaultTableModel;

import java.io.Serializable;
import java.util.Objects;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;

//public void InitiateTable() //To empty the table that displays search results
//{
//    tbl = (DefaultTableModel)searchTB.getModel();
//    for(int i = tbl.getRowCount()-1;i>=0;i--)
//        {
//    tbl.removeRow(i); //Keeps removing the last row until table is emptied
//        }
//}
public class table extends javax.swing.JFrame {

String sym, Scategory, Scondition, Squery, Sorder, Sordercategory;
ResultSet rs, rs0,rs1,rs2,rs3,rs4;
Statement stmt, stmt0,stmt1,stmt2,stmt3,stmt4;
//DefaultTableModel tbl;
// URL:
// jdbc:mysql://localhost:3306/periodic_table?zeroDateTimeBehavior=CONVERT_TO_NULL

public String getSearch()//To generate a query from data selected in Search tab
{
    String t1 = (String) selection1.getSelectedItem();
    String t2 = (String) selection2.getSelectedItem();
    String operator = (String) comparision.getSelectedItem();
    String literal = value.getText();
    String orderby = (String) theOrder.getSelectedItem(); 
    
    String tb1 = "", tb2 = ""; 
    
    switch(t1){
        case "ATOMIC NUMBER":
            tb1 = " main_table ";
            break;
        case "SYMBOL":
            tb1 = " group_block ";
            break;
        case "NAME":
            tb1 = " main_table ";
            break;
        case "MELTING POINT":
            tb1 = " standard_state ";
            break;
        case "BOILING POINT":
            tb1 = " standard_state ";
            break;
        case "DENSITY":
            tb1 = " bonding_type ";
            break;
    }
    
    switch(t2){
        case "ATOMIC NUMBER":
            tb2 = " main_table ";
            break;
        case "SYMBOL":
            tb2 = " group_block ";
            break;
        case "NAME":
            tb2 = " main_table ";
            break;
        case "MELTING POINT":
            tb2 = " standard_state ";
            break;
        case "BOILING POINT":
            tb2 = " standard_state ";
            break;
        case "DENSITY":
            tb2 = " bonding_type ";
            break;
    }
    
    String op = " "+operator+" ";
    String order=" "+ orderby.charAt(0)=="D"?"DESC":" "+" ";
    int integerValue = Integer.parseInt(literal);
    
    String query = "SELECT * FROM main_table;";
    
    return query;
//    return "SELECT * from main_table where " + Scategory + " " + Scondition +
//            " '" + Squery + "' ORDER BY " + Sordercategory + " " + Sorder + ";";
}

    public table() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Container = new javax.swing.JPanel();
        atomic_number = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        mass = new javax.swing.JLabel();
        radius = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        Mo = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        No = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        h = new javax.swing.JButton();
        li = new javax.swing.JButton();
        be = new javax.swing.JButton();
        mg = new javax.swing.JButton();
        na = new javax.swing.JButton();
        k = new javax.swing.JButton();
        ca = new javax.swing.JButton();
        sr = new javax.swing.JButton();
        rb = new javax.swing.JButton();
        cs = new javax.swing.JButton();
        ba = new javax.swing.JButton();
        sc = new javax.swing.JButton();
        y = new javax.swing.JButton();
        ti = new javax.swing.JButton();
        zr = new javax.swing.JButton();
        hf = new javax.swing.JButton();
        lu = new javax.swing.JButton();
        fr = new javax.swing.JButton();
        ra = new javax.swing.JButton();
        lr = new javax.swing.JButton();
        rf = new javax.swing.JButton();
        db = new javax.swing.JButton();
        ta = new javax.swing.JButton();
        nb = new javax.swing.JButton();
        v = new javax.swing.JButton();
        cr = new javax.swing.JButton();
        mo = new javax.swing.JButton();
        w = new javax.swing.JButton();
        sg = new javax.swing.JButton();
        bh = new javax.swing.JButton();
        re = new javax.swing.JButton();
        tc = new javax.swing.JButton();
        mn = new javax.swing.JButton();
        fe = new javax.swing.JButton();
        ru = new javax.swing.JButton();
        os = new javax.swing.JButton();
        hs = new javax.swing.JButton();
        mt = new javax.swing.JButton();
        ir = new javax.swing.JButton();
        rh = new javax.swing.JButton();
        co = new javax.swing.JButton();
        ni = new javax.swing.JButton();
        cu = new javax.swing.JButton();
        ag = new javax.swing.JButton();
        pd = new javax.swing.JButton();
        pt = new javax.swing.JButton();
        au = new javax.swing.JButton();
        rg = new javax.swing.JButton();
        ds = new javax.swing.JButton();
        zn = new javax.swing.JButton();
        cd = new javax.swing.JButton();
        hg = new javax.swing.JButton();
        cn = new javax.swing.JButton();
        nh = new javax.swing.JButton();
        tl = new javax.swing.JButton();
        in = new javax.swing.JButton();
        ga = new javax.swing.JButton();
        fl = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        lv = new javax.swing.JButton();
        ts = new javax.swing.JButton();
        og = new javax.swing.JButton();
        rn = new javax.swing.JButton();
        at = new javax.swing.JButton();
        po = new javax.swing.JButton();
        bi = new javax.swing.JButton();
        pb = new javax.swing.JButton();
        sn = new javax.swing.JButton();
        sb = new javax.swing.JButton();
        te = new javax.swing.JButton();
        i = new javax.swing.JButton();
        xe = new javax.swing.JButton();
        kr = new javax.swing.JButton();
        br = new javax.swing.JButton();
        se = new javax.swing.JButton();
        as = new javax.swing.JButton();
        ge = new javax.swing.JButton();
        si = new javax.swing.JButton();
        p = new javax.swing.JButton();
        s = new javax.swing.JButton();
        cl = new javax.swing.JButton();
        ar = new javax.swing.JButton();
        ne = new javax.swing.JButton();
        f = new javax.swing.JButton();
        o = new javax.swing.JButton();
        n = new javax.swing.JButton();
        c = new javax.swing.JButton();
        he = new javax.swing.JButton();
        b = new javax.swing.JButton();
        al = new javax.swing.JButton();
        la = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        th = new javax.swing.JButton();
        pa = new javax.swing.JButton();
        u = new javax.swing.JButton();
        np = new javax.swing.JButton();
        pu = new javax.swing.JButton();
        am = new javax.swing.JButton();
        cm = new javax.swing.JButton();
        bk = new javax.swing.JButton();
        tb = new javax.swing.JButton();
        gd = new javax.swing.JButton();
        eu = new javax.swing.JButton();
        sm = new javax.swing.JButton();
        pm = new javax.swing.JButton();
        nd = new javax.swing.JButton();
        pr = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        cf = new javax.swing.JButton();
        dy = new javax.swing.JButton();
        ho = new javax.swing.JButton();
        es = new javax.swing.JButton();
        er = new javax.swing.JButton();
        fm = new javax.swing.JButton();
        no = new javax.swing.JButton();
        md = new javax.swing.JButton();
        tm = new javax.swing.JButton();
        yb = new javax.swing.JButton();
        slider = new javax.swing.JSlider();
        jLabel49 = new javax.swing.JLabel();
        sliderText = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        selection1 = new javax.swing.JComboBox<>();
        theOrder = new javax.swing.JComboBox<>();
        comparision = new javax.swing.JComboBox<>();
        selection2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane1ComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(null);

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(null);

        atomic_number.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        atomic_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atomic_number.setText("<SELECT>");
        Container.add(atomic_number);
        atomic_number.setBounds(200, 30, 140, 22);

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("<SELECT>");
        Container.add(name);
        name.setBounds(200, 70, 140, 22);

        mass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mass.setText("<SELECT>");
        Container.add(mass);
        mass.setBounds(200, 110, 140, 22);

        radius.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radius.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radius.setText("<SELECT>");
        Container.add(radius);
        radius.setBounds(200, 150, 140, 22);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setText("ATOMIC MASS:");
        Container.add(jLabel58);
        jLabel58.setBounds(20, 110, 150, 22);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel65.setText("NAME:");
        Container.add(jLabel65);
        jLabel65.setBounds(20, 70, 80, 22);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setAlignmentX(3.0F);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Container.add(jSeparator1);
        jSeparator1.setBounds(190, 0, 10, 220);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setText("ATOMIC NUMBER:");
        Container.add(jLabel63);
        jLabel63.setBounds(20, 30, 170, 22);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel67.setText("ATOMIC RADIUS:");
        Container.add(jLabel67);
        jLabel67.setBounds(20, 150, 170, 22);

        jPanel2.add(Container);
        Container.setBounds(650, 20, 350, 220);

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Be");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(140, 110, 80, 80);

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("H");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(60, 30, 80, 80);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Na");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(60, 190, 80, 80);

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("K");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(60, 270, 80, 80);

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Rb");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(60, 350, 80, 80);

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cs");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(60, 430, 80, 80);

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Fr");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(60, 510, 80, 80);

        jButton9.setBackground(new java.awt.Color(255, 153, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Mg");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(140, 190, 80, 80);

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Ca");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(140, 270, 80, 80);

        jButton11.setBackground(new java.awt.Color(255, 153, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Sr");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(140, 350, 80, 80);

        jButton12.setBackground(new java.awt.Color(255, 153, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Ra");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(140, 510, 80, 80);

        jButton13.setBackground(new java.awt.Color(255, 204, 102));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Sc");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(220, 270, 80, 80);

        jButton14.setBackground(new java.awt.Color(255, 204, 102));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Y");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(220, 350, 80, 80);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(204, 204, 204));
        jButton15.setText("Lu");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(220, 430, 80, 80);

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(204, 204, 204));
        jButton16.setText("Lr");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);
        jButton16.setBounds(220, 510, 80, 80);

        jButton17.setBackground(new java.awt.Color(255, 204, 102));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Ti");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);
        jButton17.setBounds(300, 270, 80, 80);

        jButton18.setBackground(new java.awt.Color(255, 204, 102));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("V");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);
        jButton18.setBounds(380, 270, 80, 80);

        jButton19.setBackground(new java.awt.Color(255, 204, 102));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Cr");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);
        jButton19.setBounds(460, 270, 80, 80);

        jButton20.setBackground(new java.awt.Color(255, 204, 102));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Mo");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);
        jButton20.setBounds(460, 350, 80, 80);

        jButton21.setBackground(new java.awt.Color(255, 204, 102));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Nb");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(380, 350, 80, 80);

        jButton22.setBackground(new java.awt.Color(255, 204, 102));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Zr");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);
        jButton22.setBounds(300, 350, 80, 80);

        jButton23.setBackground(new java.awt.Color(255, 204, 102));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Hf");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);
        jButton23.setBounds(300, 430, 80, 80);

        jButton24.setBackground(new java.awt.Color(255, 204, 102));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Ta");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);
        jButton24.setBounds(380, 430, 80, 80);

        jButton25.setBackground(new java.awt.Color(255, 204, 102));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("W");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);
        jButton25.setBounds(460, 430, 80, 80);

        jButton26.setBackground(new java.awt.Color(255, 204, 102));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Sg");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);
        jButton26.setBounds(460, 510, 80, 80);

        jButton27.setBackground(new java.awt.Color(255, 204, 102));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Db");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);
        jButton27.setBounds(380, 510, 80, 80);

        jButton28.setBackground(new java.awt.Color(255, 204, 102));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Rf");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28);
        jButton28.setBounds(300, 510, 80, 80);

        jButton29.setBackground(new java.awt.Color(255, 204, 102));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Mn");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29);
        jButton29.setBounds(540, 270, 80, 80);

        jButton30.setBackground(new java.awt.Color(255, 204, 102));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Fe");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30);
        jButton30.setBounds(620, 270, 80, 80);

        jButton31.setBackground(new java.awt.Color(255, 204, 102));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Co");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31);
        jButton31.setBounds(700, 270, 80, 80);

        jButton32.setBackground(new java.awt.Color(255, 204, 102));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Ni");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32);
        jButton32.setBounds(780, 270, 80, 80);

        jButton33.setBackground(new java.awt.Color(255, 204, 102));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Cu");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33);
        jButton33.setBounds(860, 270, 80, 80);

        jButton34.setBackground(new java.awt.Color(255, 204, 102));
        jButton34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Zn");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton34);
        jButton34.setBounds(940, 270, 80, 80);

        jButton35.setBackground(new java.awt.Color(255, 204, 102));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Cd");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35);
        jButton35.setBounds(940, 350, 80, 80);

        jButton36.setBackground(new java.awt.Color(255, 204, 102));
        jButton36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("Ag");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton36);
        jButton36.setBounds(860, 350, 80, 80);

        jButton37.setBackground(new java.awt.Color(255, 204, 102));
        jButton37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setText("Pd");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton37);
        jButton37.setBounds(780, 350, 80, 80);

        jButton38.setBackground(new java.awt.Color(255, 204, 102));
        jButton38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("Rh");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton38);
        jButton38.setBounds(700, 350, 80, 80);

        jButton39.setBackground(new java.awt.Color(255, 204, 102));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Ru");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton39);
        jButton39.setBounds(620, 350, 80, 80);

        jButton40.setBackground(new java.awt.Color(255, 204, 102));
        jButton40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("Tc");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton40);
        jButton40.setBounds(540, 350, 80, 80);

        jButton41.setBackground(new java.awt.Color(255, 204, 102));
        jButton41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("Re");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton41);
        jButton41.setBounds(540, 430, 80, 80);

        jButton42.setBackground(new java.awt.Color(255, 204, 102));
        jButton42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("Bh");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton42);
        jButton42.setBounds(540, 510, 80, 80);

        jButton43.setBackground(new java.awt.Color(255, 204, 102));
        jButton43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setText("Hs");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton43);
        jButton43.setBounds(620, 510, 80, 80);

        jButton44.setBackground(new java.awt.Color(255, 204, 102));
        jButton44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("Os");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton44);
        jButton44.setBounds(620, 430, 80, 80);

        jButton45.setBackground(new java.awt.Color(255, 204, 102));
        jButton45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setText("Ir");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton45);
        jButton45.setBounds(700, 430, 80, 80);

        jButton46.setBackground(new java.awt.Color(255, 204, 102));
        jButton46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton46.setForeground(new java.awt.Color(255, 255, 255));
        jButton46.setText("Mt");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton46);
        jButton46.setBounds(700, 510, 80, 80);

        jButton47.setBackground(new java.awt.Color(255, 204, 102));
        jButton47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setText("Pt");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton47);
        jButton47.setBounds(780, 430, 80, 80);

        jButton48.setBackground(new java.awt.Color(255, 204, 102));
        jButton48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setText("Ds");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton48);
        jButton48.setBounds(780, 510, 80, 80);

        jButton49.setBackground(new java.awt.Color(255, 204, 102));
        jButton49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setText("Rg");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton49);
        jButton49.setBounds(860, 510, 80, 80);

        jButton50.setBackground(new java.awt.Color(255, 204, 102));
        jButton50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setText("Au");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton50);
        jButton50.setBounds(860, 430, 80, 80);

        jButton51.setBackground(new java.awt.Color(255, 204, 102));
        jButton51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setText("Hg");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton51);
        jButton51.setBounds(940, 430, 80, 80);

        jButton52.setBackground(new java.awt.Color(255, 204, 102));
        jButton52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setText("Cn");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton52);
        jButton52.setBounds(940, 510, 80, 80);

        jButton57.setBackground(new java.awt.Color(153, 153, 255));
        jButton57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton57.setForeground(new java.awt.Color(255, 255, 255));
        jButton57.setText("He");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton57);
        jButton57.setBounds(1420, 30, 80, 80);

        jButton58.setBackground(new java.awt.Color(153, 153, 255));
        jButton58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton58.setForeground(new java.awt.Color(255, 255, 255));
        jButton58.setText("Ar");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton58);
        jButton58.setBounds(1420, 190, 80, 80);

        jButton59.setBackground(new java.awt.Color(51, 51, 255));
        jButton59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton59.setForeground(new java.awt.Color(255, 255, 255));
        jButton59.setText("Cl");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton59);
        jButton59.setBounds(1340, 190, 80, 80);

        jButton60.setBackground(new java.awt.Color(51, 51, 255));
        jButton60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton60.setForeground(new java.awt.Color(255, 255, 255));
        jButton60.setText("F");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton60);
        jButton60.setBounds(1340, 110, 80, 80);

        jButton61.setBackground(new java.awt.Color(0, 255, 204));
        jButton61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton61.setForeground(new java.awt.Color(255, 255, 255));
        jButton61.setText("O");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton61);
        jButton61.setBounds(1260, 110, 80, 80);

        jButton62.setBackground(new java.awt.Color(0, 255, 204));
        jButton62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton62.setForeground(new java.awt.Color(255, 255, 255));
        jButton62.setText("S");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton62);
        jButton62.setBounds(1260, 190, 80, 80);

        jButton63.setBackground(new java.awt.Color(0, 255, 204));
        jButton63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setText("N");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton63);
        jButton63.setBounds(1180, 110, 80, 80);

        jButton64.setBackground(new java.awt.Color(0, 255, 204));
        jButton64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setText("P");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton64);
        jButton64.setBounds(1180, 190, 80, 80);

        jButton65.setBackground(new java.awt.Color(153, 255, 204));
        jButton65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton65.setForeground(new java.awt.Color(255, 255, 255));
        jButton65.setText("Si");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton65);
        jButton65.setBounds(1100, 190, 80, 80);

        jButton66.setBackground(new java.awt.Color(0, 255, 204));
        jButton66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton66.setForeground(new java.awt.Color(255, 255, 255));
        jButton66.setText("C");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton66);
        jButton66.setBounds(1100, 110, 80, 80);

        jButton67.setBackground(new java.awt.Color(153, 255, 204));
        jButton67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton67.setForeground(new java.awt.Color(255, 255, 255));
        jButton67.setText("B");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton67);
        jButton67.setBounds(1020, 110, 80, 80);

        jButton68.setBackground(new java.awt.Color(0, 153, 51));
        jButton68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton68.setForeground(new java.awt.Color(255, 255, 255));
        jButton68.setText("Al");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton68);
        jButton68.setBounds(1020, 190, 80, 80);

        jButton69.setBackground(new java.awt.Color(153, 153, 255));
        jButton69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton69.setForeground(new java.awt.Color(255, 255, 255));
        jButton69.setText("Ne");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton69);
        jButton69.setBounds(1420, 110, 80, 80);

        jButton70.setBackground(new java.awt.Color(255, 153, 0));
        jButton70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton70.setForeground(new java.awt.Color(255, 255, 255));
        jButton70.setText("Ba");
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton70);
        jButton70.setBounds(140, 430, 80, 80);

        jButton71.setBackground(new java.awt.Color(255, 51, 51));
        jButton71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton71.setForeground(new java.awt.Color(255, 255, 255));
        jButton71.setText("Li");
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton71);
        jButton71.setBounds(60, 110, 80, 80);

        jButton72.setBackground(new java.awt.Color(0, 153, 51));
        jButton72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton72.setForeground(new java.awt.Color(255, 255, 255));
        jButton72.setText("Ga");
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton72);
        jButton72.setBounds(1020, 270, 80, 80);

        jButton73.setBackground(new java.awt.Color(153, 255, 204));
        jButton73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton73.setForeground(new java.awt.Color(255, 255, 255));
        jButton73.setText("Ge");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton73);
        jButton73.setBounds(1100, 270, 80, 80);

        jButton74.setBackground(new java.awt.Color(153, 255, 204));
        jButton74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton74.setForeground(new java.awt.Color(255, 255, 255));
        jButton74.setText("As");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton74);
        jButton74.setBounds(1180, 270, 80, 80);

        jButton75.setBackground(new java.awt.Color(0, 255, 204));
        jButton75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton75.setForeground(new java.awt.Color(255, 255, 255));
        jButton75.setText("Se");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton75);
        jButton75.setBounds(1260, 270, 80, 80);

        jButton76.setBackground(new java.awt.Color(51, 51, 255));
        jButton76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton76.setForeground(new java.awt.Color(255, 255, 255));
        jButton76.setText("Br");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton76);
        jButton76.setBounds(1340, 270, 80, 80);

        jButton77.setBackground(new java.awt.Color(153, 153, 255));
        jButton77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton77.setForeground(new java.awt.Color(255, 255, 255));
        jButton77.setText("Kr");
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton77);
        jButton77.setBounds(1420, 270, 80, 80);

        jButton78.setBackground(new java.awt.Color(0, 153, 51));
        jButton78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton78.setForeground(new java.awt.Color(255, 255, 255));
        jButton78.setText("Sn");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton78);
        jButton78.setBounds(1100, 350, 80, 80);

        jButton79.setBackground(new java.awt.Color(153, 153, 255));
        jButton79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton79.setForeground(new java.awt.Color(255, 255, 255));
        jButton79.setText("Xe");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton79);
        jButton79.setBounds(1420, 350, 80, 80);

        jButton80.setBackground(new java.awt.Color(51, 51, 255));
        jButton80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton80.setForeground(new java.awt.Color(255, 255, 255));
        jButton80.setText("I");
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton80);
        jButton80.setBounds(1340, 350, 80, 80);

        jButton81.setBackground(new java.awt.Color(0, 153, 51));
        jButton81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton81.setForeground(new java.awt.Color(255, 255, 255));
        jButton81.setText("In");
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton81);
        jButton81.setBounds(1020, 350, 80, 80);

        jButton82.setBackground(new java.awt.Color(153, 255, 204));
        jButton82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton82.setForeground(new java.awt.Color(255, 255, 255));
        jButton82.setText("Te");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton82);
        jButton82.setBounds(1260, 350, 80, 80);

        jButton83.setBackground(new java.awt.Color(153, 255, 204));
        jButton83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton83.setForeground(new java.awt.Color(255, 255, 255));
        jButton83.setText("Sb");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton83);
        jButton83.setBounds(1180, 350, 80, 80);

        jButton84.setBackground(new java.awt.Color(0, 153, 51));
        jButton84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton84.setForeground(new java.awt.Color(255, 255, 255));
        jButton84.setText("Pb");
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton84);
        jButton84.setBounds(1100, 430, 80, 80);

        jButton85.setBackground(new java.awt.Color(153, 153, 255));
        jButton85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton85.setForeground(new java.awt.Color(255, 255, 255));
        jButton85.setText("Rn");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton85);
        jButton85.setBounds(1420, 430, 80, 80);

        jButton86.setBackground(new java.awt.Color(51, 51, 255));
        jButton86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton86.setForeground(new java.awt.Color(255, 255, 255));
        jButton86.setText("At");
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton86);
        jButton86.setBounds(1340, 430, 80, 80);

        jButton87.setBackground(new java.awt.Color(0, 153, 51));
        jButton87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton87.setForeground(new java.awt.Color(255, 255, 255));
        jButton87.setText("Tl");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton87);
        jButton87.setBounds(1020, 430, 80, 80);

        jButton88.setBackground(new java.awt.Color(153, 255, 204));
        jButton88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton88.setForeground(new java.awt.Color(255, 255, 255));
        jButton88.setText("Po");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton88);
        jButton88.setBounds(1260, 430, 80, 80);

        jButton89.setBackground(new java.awt.Color(0, 153, 51));
        jButton89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton89.setForeground(new java.awt.Color(255, 255, 255));
        jButton89.setText("Bi");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton89);
        jButton89.setBounds(1180, 430, 80, 80);

        jButton90.setBackground(new java.awt.Color(0, 153, 51));
        jButton90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton90.setForeground(new java.awt.Color(255, 255, 255));
        jButton90.setText("Fl");
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton90);
        jButton90.setBounds(1100, 510, 80, 80);

        jButton91.setBackground(new java.awt.Color(153, 153, 255));
        jButton91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton91.setForeground(new java.awt.Color(255, 255, 255));
        jButton91.setText("Og");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton91);
        jButton91.setBounds(1420, 510, 80, 80);

        jButton92.setBackground(new java.awt.Color(51, 51, 255));
        jButton92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton92.setForeground(new java.awt.Color(255, 255, 255));
        jButton92.setText("Tn");
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton92);
        jButton92.setBounds(1340, 510, 80, 80);

        jButton93.setBackground(new java.awt.Color(0, 153, 51));
        jButton93.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton93.setForeground(new java.awt.Color(255, 255, 255));
        jButton93.setText("Nh");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton93);
        jButton93.setBounds(1020, 510, 80, 80);

        jButton94.setBackground(new java.awt.Color(0, 153, 51));
        jButton94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton94.setForeground(new java.awt.Color(255, 255, 255));
        jButton94.setText("Lv");
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton94);
        jButton94.setBounds(1260, 510, 80, 80);

        Mo.setBackground(new java.awt.Color(0, 153, 51));
        Mo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mo.setForeground(new java.awt.Color(255, 255, 255));
        Mo.setText("Uup");
        Mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoActionPerformed(evt);
            }
        });
        jPanel2.add(Mo);
        Mo.setBounds(1180, 510, 80, 80);

        jButton53.setBackground(new java.awt.Color(204, 204, 0));
        jButton53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setText("La");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton53);
        jButton53.setBounds(220, 600, 80, 80);

        jButton54.setBackground(new java.awt.Color(204, 204, 0));
        jButton54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setText("Ce");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton54);
        jButton54.setBounds(300, 600, 80, 80);

        jButton55.setBackground(new java.awt.Color(204, 204, 0));
        jButton55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jButton55.setText("Pr");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton55);
        jButton55.setBounds(380, 600, 80, 80);

        jButton56.setBackground(new java.awt.Color(204, 204, 0));
        jButton56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton56.setForeground(new java.awt.Color(255, 255, 255));
        jButton56.setText("Nd");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton56);
        jButton56.setBounds(460, 600, 80, 80);

        jButton96.setBackground(new java.awt.Color(204, 204, 0));
        jButton96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton96.setForeground(new java.awt.Color(255, 255, 255));
        jButton96.setText("Pm");
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton96);
        jButton96.setBounds(540, 600, 80, 80);

        jButton97.setBackground(new java.awt.Color(204, 204, 0));
        jButton97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton97.setForeground(new java.awt.Color(255, 255, 255));
        jButton97.setText("Sm");
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton97);
        jButton97.setBounds(620, 600, 80, 80);

        jButton98.setBackground(new java.awt.Color(204, 204, 0));
        jButton98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton98.setForeground(new java.awt.Color(255, 255, 255));
        jButton98.setText("Eu");
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton98);
        jButton98.setBounds(700, 600, 80, 80);

        jButton99.setBackground(new java.awt.Color(204, 204, 0));
        jButton99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton99.setForeground(new java.awt.Color(255, 255, 255));
        jButton99.setText("Gb");
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton99);
        jButton99.setBounds(780, 600, 80, 80);

        jButton100.setBackground(new java.awt.Color(204, 204, 0));
        jButton100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton100.setForeground(new java.awt.Color(255, 255, 255));
        jButton100.setText("Tb");
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton100);
        jButton100.setBounds(860, 600, 80, 80);

        jButton101.setBackground(new java.awt.Color(204, 204, 0));
        jButton101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton101.setForeground(new java.awt.Color(255, 255, 255));
        jButton101.setText("Dy");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton101);
        jButton101.setBounds(940, 600, 80, 80);

        jButton102.setBackground(new java.awt.Color(204, 204, 0));
        jButton102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton102.setForeground(new java.awt.Color(255, 255, 255));
        jButton102.setText("Ho");
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton102);
        jButton102.setBounds(1020, 600, 80, 80);

        jButton103.setBackground(new java.awt.Color(204, 204, 0));
        jButton103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton103.setForeground(new java.awt.Color(255, 255, 255));
        jButton103.setText("Er");
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton103);
        jButton103.setBounds(1100, 600, 80, 80);

        jButton104.setBackground(new java.awt.Color(204, 204, 0));
        jButton104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton104.setForeground(new java.awt.Color(255, 255, 255));
        jButton104.setText("Tm");
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton104);
        jButton104.setBounds(1180, 600, 80, 80);

        jButton105.setBackground(new java.awt.Color(204, 204, 0));
        jButton105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton105.setForeground(new java.awt.Color(255, 255, 255));
        jButton105.setText("Yb");
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton105);
        jButton105.setBounds(1260, 600, 80, 80);

        jButton107.setBackground(new java.awt.Color(102, 102, 0));
        jButton107.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton107.setForeground(new java.awt.Color(255, 255, 255));
        jButton107.setText("Ac");
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton107);
        jButton107.setBounds(220, 680, 80, 80);

        jButton108.setBackground(new java.awt.Color(102, 102, 0));
        jButton108.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton108.setForeground(new java.awt.Color(255, 255, 255));
        jButton108.setText("Th");
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton108);
        jButton108.setBounds(300, 680, 80, 80);

        jButton109.setBackground(new java.awt.Color(102, 102, 0));
        jButton109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton109.setForeground(new java.awt.Color(255, 255, 255));
        jButton109.setText("Pa");
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton109);
        jButton109.setBounds(380, 680, 80, 80);

        jButton110.setBackground(new java.awt.Color(102, 102, 0));
        jButton110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton110.setForeground(new java.awt.Color(255, 255, 255));
        jButton110.setText("U");
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton110);
        jButton110.setBounds(460, 680, 80, 80);

        jButton111.setBackground(new java.awt.Color(102, 102, 0));
        jButton111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton111.setForeground(new java.awt.Color(255, 255, 255));
        jButton111.setText("Np");
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton111);
        jButton111.setBounds(540, 680, 80, 80);

        jButton112.setBackground(new java.awt.Color(102, 102, 0));
        jButton112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton112.setForeground(new java.awt.Color(255, 255, 255));
        jButton112.setText("Pu");
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton112);
        jButton112.setBounds(620, 680, 80, 80);

        jButton113.setBackground(new java.awt.Color(102, 102, 0));
        jButton113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton113.setForeground(new java.awt.Color(255, 255, 255));
        jButton113.setText("Am");
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton113);
        jButton113.setBounds(700, 680, 80, 80);

        jButton114.setBackground(new java.awt.Color(102, 102, 0));
        jButton114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton114.setForeground(new java.awt.Color(255, 255, 255));
        jButton114.setText("Cm");
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton114);
        jButton114.setBounds(780, 680, 80, 80);

        jButton115.setBackground(new java.awt.Color(102, 102, 0));
        jButton115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton115.setForeground(new java.awt.Color(255, 255, 255));
        jButton115.setText("Bk");
        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton115);
        jButton115.setBounds(860, 680, 80, 80);

        jButton116.setBackground(new java.awt.Color(102, 102, 0));
        jButton116.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton116.setForeground(new java.awt.Color(255, 255, 255));
        jButton116.setText("Cf");
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton116);
        jButton116.setBounds(940, 680, 80, 80);

        jButton117.setBackground(new java.awt.Color(102, 102, 0));
        jButton117.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton117.setForeground(new java.awt.Color(255, 255, 255));
        jButton117.setText("Es");
        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton117);
        jButton117.setBounds(1020, 680, 80, 80);

        jButton118.setBackground(new java.awt.Color(102, 102, 0));
        jButton118.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton118.setForeground(new java.awt.Color(255, 255, 255));
        jButton118.setText("Fm");
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton118);
        jButton118.setBounds(1100, 680, 80, 80);

        jButton119.setBackground(new java.awt.Color(102, 102, 0));
        jButton119.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton119.setForeground(new java.awt.Color(255, 255, 255));
        jButton119.setText("Md");
        jButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton119ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton119);
        jButton119.setBounds(1180, 680, 80, 80);

        No.setBackground(new java.awt.Color(102, 102, 0));
        No.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        No.setForeground(new java.awt.Color(255, 255, 255));
        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel2.add(No);
        No.setBounds(1260, 680, 80, 80);

        jPanel4.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alkali Metals");

        jLabel3.setBackground(new java.awt.Color(0, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Non-Metals");

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Halogen");

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alkali Earth Metals");

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Noble Gases");

        jLabel11.setBackground(new java.awt.Color(255, 204, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 102));
        jLabel11.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Transition Metals");

        jLabel13.setBackground(new java.awt.Color(204, 204, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 0));
        jLabel13.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Lanthanides");

        jLabel15.setBackground(new java.awt.Color(0, 153, 51));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 51));
        jLabel15.setOpaque(true);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Basic Metals");

        jLabel17.setBackground(new java.awt.Color(102, 102, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 0));
        jLabel17.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Actinides");

        jLabel19.setBackground(new java.awt.Color(153, 255, 204));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 255, 204));
        jLabel19.setOpaque(true);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Metalloids");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addGap(82, 82, 82))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(5, 5, 5)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(230, 20, 410, 210);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("1");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(80, 10, 40, 17);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("2");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(160, 90, 40, 17);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("3");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(240, 250, 40, 17);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("4");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(320, 250, 40, 17);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("5");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(400, 250, 40, 17);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("6");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(480, 250, 40, 17);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("7");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(560, 250, 30, 17);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("8");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(640, 250, 50, 17);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("9");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(730, 250, 30, 17);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("10");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(800, 250, 40, 17);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("11");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(880, 250, 40, 17);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("12");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(960, 250, 40, 17);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("18");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(1440, 10, 40, 17);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("13");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(1040, 90, 40, 17);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("14");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(1130, 90, 40, 17);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("15");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(1210, 90, 40, 17);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("16");
        jPanel2.add(jLabel37);
        jLabel37.setBounds(1280, 90, 40, 17);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("17");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(1360, 90, 40, 17);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("VII");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(20, 540, 30, 17);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("I");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(20, 70, 30, 17);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("II");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(20, 150, 30, 17);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("III");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(20, 230, 30, 17);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("IV");
        jPanel2.add(jLabel43);
        jLabel43.setBounds(20, 310, 30, 17);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("V");
        jPanel2.add(jLabel44);
        jLabel44.setBounds(20, 390, 30, 17);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("VI");
        jPanel2.add(jLabel45);
        jLabel45.setBounds(20, 470, 30, 17);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Actinides");
        jPanel2.add(jLabel46);
        jLabel46.setBounds(110, 710, 80, 17);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Lanthanides");
        jPanel2.add(jLabel47);
        jLabel47.setBounds(90, 640, 100, 17);

        jTabbedPane1.addTab("PERIODIC ELEMENTS", jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setMaximumSize(new java.awt.Dimension(150, 95));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 95));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("SOLID");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel61)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(310, 135, 150, 100);

        jPanel8.setBackground(new java.awt.Color(51, 51, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(150, 95));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 95));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("LIQUID");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel60)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(510, 135, 150, 100);

        jPanel10.setBackground(new java.awt.Color(153, 255, 153));
        jPanel10.setMaximumSize(new java.awt.Dimension(150, 95));
        jPanel10.setMinimumSize(new java.awt.Dimension(150, 95));
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 95));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("GAS");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel62)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10);
        jPanel10.setBounds(710, 135, 160, 100);

        h.setBackground(new java.awt.Color(0, 255, 204));
        h.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        h.setForeground(new java.awt.Color(255, 255, 255));
        h.setText("H");
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        jPanel1.add(h);
        h.setBounds(55, 41, 80, 80);

        li.setBackground(new java.awt.Color(255, 51, 51));
        li.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        li.setForeground(new java.awt.Color(255, 255, 255));
        li.setText("Li");
        jPanel1.add(li);
        li.setBounds(55, 121, 80, 80);

        be.setBackground(new java.awt.Color(255, 153, 0));
        be.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        be.setForeground(new java.awt.Color(255, 255, 255));
        be.setText("Be");
        be.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beActionPerformed(evt);
            }
        });
        jPanel1.add(be);
        be.setBounds(135, 121, 80, 80);

        mg.setBackground(new java.awt.Color(255, 153, 0));
        mg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mg.setForeground(new java.awt.Color(255, 255, 255));
        mg.setText("Mg");
        jPanel1.add(mg);
        mg.setBounds(135, 201, 80, 80);

        na.setBackground(new java.awt.Color(255, 51, 51));
        na.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        na.setForeground(new java.awt.Color(255, 255, 255));
        na.setText("Na");
        na.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naActionPerformed(evt);
            }
        });
        jPanel1.add(na);
        na.setBounds(55, 201, 80, 80);

        k.setBackground(new java.awt.Color(255, 51, 51));
        k.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        k.setForeground(new java.awt.Color(255, 255, 255));
        k.setText("K");
        jPanel1.add(k);
        k.setBounds(55, 281, 80, 80);

        ca.setBackground(new java.awt.Color(255, 153, 0));
        ca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ca.setForeground(new java.awt.Color(255, 255, 255));
        ca.setText("Ca");
        jPanel1.add(ca);
        ca.setBounds(135, 281, 80, 80);

        sr.setBackground(new java.awt.Color(255, 153, 0));
        sr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sr.setForeground(new java.awt.Color(255, 255, 255));
        sr.setText("Sr");
        jPanel1.add(sr);
        sr.setBounds(135, 361, 80, 80);

        rb.setBackground(new java.awt.Color(255, 51, 51));
        rb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb.setForeground(new java.awt.Color(255, 255, 255));
        rb.setText("Rb");
        jPanel1.add(rb);
        rb.setBounds(55, 361, 80, 80);

        cs.setBackground(new java.awt.Color(255, 51, 51));
        cs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cs.setForeground(new java.awt.Color(255, 255, 255));
        cs.setText("Cs");
        jPanel1.add(cs);
        cs.setBounds(55, 441, 80, 80);

        ba.setBackground(new java.awt.Color(255, 153, 0));
        ba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ba.setForeground(new java.awt.Color(255, 255, 255));
        ba.setText("Ba");
        jPanel1.add(ba);
        ba.setBounds(135, 441, 80, 80);

        sc.setBackground(new java.awt.Color(255, 204, 102));
        sc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sc.setForeground(new java.awt.Color(255, 255, 255));
        sc.setText("Sc");
        jPanel1.add(sc);
        sc.setBounds(215, 281, 80, 80);

        y.setBackground(new java.awt.Color(255, 204, 102));
        y.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        y.setForeground(new java.awt.Color(255, 255, 255));
        y.setText("Y");
        jPanel1.add(y);
        y.setBounds(215, 361, 80, 80);

        ti.setBackground(new java.awt.Color(255, 204, 102));
        ti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ti.setForeground(new java.awt.Color(255, 255, 255));
        ti.setText("Ti");
        jPanel1.add(ti);
        ti.setBounds(295, 281, 80, 80);

        zr.setBackground(new java.awt.Color(255, 204, 102));
        zr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zr.setForeground(new java.awt.Color(255, 255, 255));
        zr.setText("Zr");
        jPanel1.add(zr);
        zr.setBounds(295, 361, 80, 80);

        hf.setBackground(new java.awt.Color(255, 204, 102));
        hf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hf.setForeground(new java.awt.Color(255, 255, 255));
        hf.setText("Hf");
        jPanel1.add(hf);
        hf.setBounds(295, 441, 80, 80);

        lu.setBackground(new java.awt.Color(255, 255, 255));
        lu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lu.setForeground(new java.awt.Color(204, 204, 204));
        lu.setText("Lu");
        lu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luActionPerformed(evt);
            }
        });
        jPanel1.add(lu);
        lu.setBounds(215, 441, 80, 80);

        fr.setBackground(new java.awt.Color(255, 51, 51));
        fr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fr.setForeground(new java.awt.Color(255, 255, 255));
        fr.setText("Fr");
        jPanel1.add(fr);
        fr.setBounds(55, 521, 80, 80);

        ra.setBackground(new java.awt.Color(255, 153, 0));
        ra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ra.setForeground(new java.awt.Color(255, 255, 255));
        ra.setText("Ra");
        jPanel1.add(ra);
        ra.setBounds(135, 521, 80, 80);

        lr.setBackground(new java.awt.Color(255, 255, 255));
        lr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lr.setForeground(new java.awt.Color(204, 204, 204));
        lr.setText("Lr");
        lr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lrActionPerformed(evt);
            }
        });
        jPanel1.add(lr);
        lr.setBounds(215, 521, 80, 80);

        rf.setBackground(new java.awt.Color(255, 204, 102));
        rf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rf.setForeground(new java.awt.Color(255, 255, 255));
        rf.setText("Rf");
        jPanel1.add(rf);
        rf.setBounds(295, 521, 80, 80);

        db.setBackground(new java.awt.Color(255, 204, 102));
        db.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        db.setForeground(new java.awt.Color(255, 255, 255));
        db.setText("Db");
        jPanel1.add(db);
        db.setBounds(375, 521, 80, 80);

        ta.setBackground(new java.awt.Color(255, 204, 102));
        ta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ta.setForeground(new java.awt.Color(255, 255, 255));
        ta.setText("Ta");
        jPanel1.add(ta);
        ta.setBounds(375, 441, 80, 80);

        nb.setBackground(new java.awt.Color(255, 204, 102));
        nb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nb.setForeground(new java.awt.Color(255, 255, 255));
        nb.setText("Nb");
        jPanel1.add(nb);
        nb.setBounds(375, 361, 80, 80);

        v.setBackground(new java.awt.Color(255, 204, 102));
        v.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        v.setForeground(new java.awt.Color(255, 255, 255));
        v.setText("V");
        jPanel1.add(v);
        v.setBounds(375, 281, 80, 80);

        cr.setBackground(new java.awt.Color(255, 204, 102));
        cr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cr.setForeground(new java.awt.Color(255, 255, 255));
        cr.setText("Cr");
        jPanel1.add(cr);
        cr.setBounds(455, 281, 80, 80);

        mo.setBackground(new java.awt.Color(255, 204, 102));
        mo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mo.setForeground(new java.awt.Color(255, 255, 255));
        mo.setText("Mo");
        jPanel1.add(mo);
        mo.setBounds(455, 361, 80, 80);

        w.setBackground(new java.awt.Color(255, 204, 102));
        w.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        w.setForeground(new java.awt.Color(255, 255, 255));
        w.setText("W");
        jPanel1.add(w);
        w.setBounds(455, 441, 80, 80);

        sg.setBackground(new java.awt.Color(255, 204, 102));
        sg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sg.setForeground(new java.awt.Color(255, 255, 255));
        sg.setText("Sg");
        jPanel1.add(sg);
        sg.setBounds(455, 521, 80, 80);

        bh.setBackground(new java.awt.Color(255, 204, 102));
        bh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bh.setForeground(new java.awt.Color(255, 255, 255));
        bh.setText("Bh");
        jPanel1.add(bh);
        bh.setBounds(535, 521, 80, 80);

        re.setBackground(new java.awt.Color(255, 204, 102));
        re.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        re.setForeground(new java.awt.Color(255, 255, 255));
        re.setText("Re");
        jPanel1.add(re);
        re.setBounds(535, 441, 80, 80);

        tc.setBackground(new java.awt.Color(255, 204, 102));
        tc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tc.setForeground(new java.awt.Color(255, 255, 255));
        tc.setText("Tc");
        jPanel1.add(tc);
        tc.setBounds(535, 361, 80, 80);

        mn.setBackground(new java.awt.Color(255, 204, 102));
        mn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mn.setForeground(new java.awt.Color(255, 255, 255));
        mn.setText("Mn");
        jPanel1.add(mn);
        mn.setBounds(535, 281, 80, 80);

        fe.setBackground(new java.awt.Color(255, 204, 102));
        fe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fe.setForeground(new java.awt.Color(255, 255, 255));
        fe.setText("Fe");
        jPanel1.add(fe);
        fe.setBounds(615, 281, 80, 80);

        ru.setBackground(new java.awt.Color(255, 204, 102));
        ru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ru.setForeground(new java.awt.Color(255, 255, 255));
        ru.setText("Ru");
        jPanel1.add(ru);
        ru.setBounds(615, 361, 80, 80);

        os.setBackground(new java.awt.Color(255, 204, 102));
        os.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        os.setForeground(new java.awt.Color(255, 255, 255));
        os.setText("Os");
        jPanel1.add(os);
        os.setBounds(615, 441, 80, 80);

        hs.setBackground(new java.awt.Color(255, 204, 102));
        hs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hs.setForeground(new java.awt.Color(255, 255, 255));
        hs.setText("Hs");
        jPanel1.add(hs);
        hs.setBounds(615, 521, 80, 80);

        mt.setBackground(new java.awt.Color(255, 204, 102));
        mt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mt.setForeground(new java.awt.Color(255, 255, 255));
        mt.setText("Mt");
        jPanel1.add(mt);
        mt.setBounds(695, 521, 80, 80);

        ir.setBackground(new java.awt.Color(255, 204, 102));
        ir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ir.setForeground(new java.awt.Color(255, 255, 255));
        ir.setText("Ir");
        jPanel1.add(ir);
        ir.setBounds(695, 441, 80, 80);

        rh.setBackground(new java.awt.Color(255, 204, 102));
        rh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rh.setForeground(new java.awt.Color(255, 255, 255));
        rh.setText("Rh");
        jPanel1.add(rh);
        rh.setBounds(695, 361, 80, 80);

        co.setBackground(new java.awt.Color(255, 204, 102));
        co.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        co.setForeground(new java.awt.Color(255, 255, 255));
        co.setText("Co");
        jPanel1.add(co);
        co.setBounds(695, 281, 80, 80);

        ni.setBackground(new java.awt.Color(255, 204, 102));
        ni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ni.setForeground(new java.awt.Color(255, 255, 255));
        ni.setText("Ni");
        jPanel1.add(ni);
        ni.setBounds(775, 281, 80, 80);

        cu.setBackground(new java.awt.Color(255, 204, 102));
        cu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cu.setForeground(new java.awt.Color(255, 255, 255));
        cu.setText("Cu");
        jPanel1.add(cu);
        cu.setBounds(855, 281, 80, 80);

        ag.setBackground(new java.awt.Color(255, 204, 102));
        ag.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ag.setForeground(new java.awt.Color(255, 255, 255));
        ag.setText("Ag");
        jPanel1.add(ag);
        ag.setBounds(855, 361, 80, 80);

        pd.setBackground(new java.awt.Color(255, 204, 102));
        pd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pd.setForeground(new java.awt.Color(255, 255, 255));
        pd.setText("Pd");
        jPanel1.add(pd);
        pd.setBounds(775, 361, 80, 80);

        pt.setBackground(new java.awt.Color(255, 204, 102));
        pt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pt.setForeground(new java.awt.Color(255, 255, 255));
        pt.setText("Pt");
        jPanel1.add(pt);
        pt.setBounds(775, 441, 80, 80);

        au.setBackground(new java.awt.Color(255, 204, 102));
        au.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        au.setForeground(new java.awt.Color(255, 255, 255));
        au.setText("Au");
        jPanel1.add(au);
        au.setBounds(855, 441, 80, 80);

        rg.setBackground(new java.awt.Color(255, 204, 102));
        rg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rg.setForeground(new java.awt.Color(255, 255, 255));
        rg.setText("Rg");
        jPanel1.add(rg);
        rg.setBounds(855, 521, 80, 80);

        ds.setBackground(new java.awt.Color(255, 204, 102));
        ds.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ds.setForeground(new java.awt.Color(255, 255, 255));
        ds.setText("Ds");
        jPanel1.add(ds);
        ds.setBounds(775, 521, 80, 80);

        zn.setBackground(new java.awt.Color(255, 204, 102));
        zn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zn.setForeground(new java.awt.Color(255, 255, 255));
        zn.setText("Zn");
        jPanel1.add(zn);
        zn.setBounds(935, 281, 80, 80);

        cd.setBackground(new java.awt.Color(255, 204, 102));
        cd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cd.setForeground(new java.awt.Color(255, 255, 255));
        cd.setText("Cd");
        jPanel1.add(cd);
        cd.setBounds(935, 361, 80, 80);

        hg.setBackground(new java.awt.Color(255, 204, 102));
        hg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hg.setForeground(new java.awt.Color(255, 255, 255));
        hg.setText("Hg");
        jPanel1.add(hg);
        hg.setBounds(935, 441, 80, 80);

        cn.setBackground(new java.awt.Color(255, 204, 102));
        cn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cn.setForeground(new java.awt.Color(255, 255, 255));
        cn.setText("Cn");
        jPanel1.add(cn);
        cn.setBounds(935, 521, 80, 80);

        nh.setBackground(new java.awt.Color(0, 153, 51));
        nh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nh.setForeground(new java.awt.Color(255, 255, 255));
        nh.setText("Nh");
        jPanel1.add(nh);
        nh.setBounds(1015, 521, 80, 80);

        tl.setBackground(new java.awt.Color(0, 153, 51));
        tl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tl.setForeground(new java.awt.Color(255, 255, 255));
        tl.setText("Tl");
        jPanel1.add(tl);
        tl.setBounds(1010, 440, 90, 80);

        in.setBackground(new java.awt.Color(0, 153, 51));
        in.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        in.setForeground(new java.awt.Color(255, 255, 255));
        in.setText("In");
        jPanel1.add(in);
        in.setBounds(1015, 361, 80, 80);

        ga.setBackground(new java.awt.Color(0, 153, 51));
        ga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ga.setForeground(new java.awt.Color(255, 255, 255));
        ga.setText("Ga");
        jPanel1.add(ga);
        ga.setBounds(1015, 281, 80, 80);

        fl.setBackground(new java.awt.Color(0, 153, 51));
        fl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fl.setForeground(new java.awt.Color(255, 255, 255));
        fl.setText("Fl");
        jPanel1.add(fl);
        fl.setBounds(1095, 521, 80, 80);

        mc.setBackground(new java.awt.Color(0, 153, 51));
        mc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mc.setForeground(new java.awt.Color(255, 255, 255));
        mc.setText("Mc");
        jPanel1.add(mc);
        mc.setBounds(1175, 521, 80, 80);

        lv.setBackground(new java.awt.Color(0, 153, 51));
        lv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lv.setForeground(new java.awt.Color(255, 255, 255));
        lv.setText("Lv");
        lv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvActionPerformed(evt);
            }
        });
        jPanel1.add(lv);
        lv.setBounds(1255, 521, 80, 80);

        ts.setBackground(new java.awt.Color(51, 51, 255));
        ts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ts.setForeground(new java.awt.Color(255, 255, 255));
        ts.setText("Ts");
        jPanel1.add(ts);
        ts.setBounds(1335, 521, 80, 80);

        og.setBackground(new java.awt.Color(153, 153, 255));
        og.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        og.setForeground(new java.awt.Color(255, 255, 255));
        og.setText("Og");
        jPanel1.add(og);
        og.setBounds(1415, 521, 80, 80);

        rn.setBackground(new java.awt.Color(153, 153, 255));
        rn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rn.setForeground(new java.awt.Color(255, 255, 255));
        rn.setText("Rn");
        jPanel1.add(rn);
        rn.setBounds(1415, 441, 80, 80);

        at.setBackground(new java.awt.Color(51, 51, 255));
        at.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        at.setForeground(new java.awt.Color(255, 255, 255));
        at.setText("At");
        jPanel1.add(at);
        at.setBounds(1335, 441, 80, 80);

        po.setBackground(new java.awt.Color(153, 255, 204));
        po.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        po.setForeground(new java.awt.Color(255, 255, 255));
        po.setText("Po");
        jPanel1.add(po);
        po.setBounds(1255, 441, 80, 80);

        bi.setBackground(new java.awt.Color(0, 153, 51));
        bi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bi.setForeground(new java.awt.Color(255, 255, 255));
        bi.setText("Bi");
        jPanel1.add(bi);
        bi.setBounds(1175, 441, 80, 80);

        pb.setBackground(new java.awt.Color(0, 153, 51));
        pb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pb.setForeground(new java.awt.Color(255, 255, 255));
        pb.setText("Pb");
        jPanel1.add(pb);
        pb.setBounds(1095, 441, 80, 80);

        sn.setBackground(new java.awt.Color(0, 153, 51));
        sn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sn.setForeground(new java.awt.Color(255, 255, 255));
        sn.setText("Sn");
        jPanel1.add(sn);
        sn.setBounds(1095, 361, 80, 80);

        sb.setBackground(new java.awt.Color(153, 255, 204));
        sb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sb.setForeground(new java.awt.Color(255, 255, 255));
        sb.setText("Sb");
        jPanel1.add(sb);
        sb.setBounds(1175, 361, 80, 80);

        te.setBackground(new java.awt.Color(153, 255, 204));
        te.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        te.setForeground(new java.awt.Color(255, 255, 255));
        te.setText("Te");
        jPanel1.add(te);
        te.setBounds(1255, 361, 80, 80);

        i.setBackground(new java.awt.Color(51, 51, 255));
        i.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        i.setForeground(new java.awt.Color(255, 255, 255));
        i.setText("I");
        jPanel1.add(i);
        i.setBounds(1335, 361, 80, 80);

        xe.setBackground(new java.awt.Color(153, 153, 255));
        xe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xe.setForeground(new java.awt.Color(255, 255, 255));
        xe.setText("Xe");
        jPanel1.add(xe);
        xe.setBounds(1415, 361, 80, 80);

        kr.setBackground(new java.awt.Color(153, 153, 255));
        kr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kr.setForeground(new java.awt.Color(255, 255, 255));
        kr.setText("Kr");
        jPanel1.add(kr);
        kr.setBounds(1415, 281, 80, 80);

        br.setBackground(new java.awt.Color(51, 51, 255));
        br.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        br.setForeground(new java.awt.Color(255, 255, 255));
        br.setText("Br");
        jPanel1.add(br);
        br.setBounds(1335, 281, 80, 80);

        se.setBackground(new java.awt.Color(0, 255, 204));
        se.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        se.setForeground(new java.awt.Color(255, 255, 255));
        se.setText("Se");
        jPanel1.add(se);
        se.setBounds(1255, 281, 80, 80);

        as.setBackground(new java.awt.Color(153, 255, 204));
        as.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        as.setForeground(new java.awt.Color(255, 255, 255));
        as.setText("As");
        jPanel1.add(as);
        as.setBounds(1175, 281, 80, 80);

        ge.setBackground(new java.awt.Color(153, 255, 204));
        ge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ge.setForeground(new java.awt.Color(255, 255, 255));
        ge.setText("Ge");
        jPanel1.add(ge);
        ge.setBounds(1095, 281, 80, 80);

        si.setBackground(new java.awt.Color(153, 255, 204));
        si.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        si.setForeground(new java.awt.Color(255, 255, 255));
        si.setText("Si");
        jPanel1.add(si);
        si.setBounds(1095, 201, 80, 80);

        p.setBackground(new java.awt.Color(0, 255, 204));
        p.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("P");
        jPanel1.add(p);
        p.setBounds(1175, 201, 80, 80);

        s.setBackground(new java.awt.Color(0, 255, 204));
        s.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setText("S");
        jPanel1.add(s);
        s.setBounds(1255, 201, 80, 80);

        cl.setBackground(new java.awt.Color(51, 51, 255));
        cl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cl.setForeground(new java.awt.Color(255, 255, 255));
        cl.setText("Cl");
        jPanel1.add(cl);
        cl.setBounds(1335, 201, 80, 80);

        ar.setBackground(new java.awt.Color(153, 153, 255));
        ar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ar.setForeground(new java.awt.Color(255, 255, 255));
        ar.setText("Ar");
        jPanel1.add(ar);
        ar.setBounds(1415, 201, 80, 80);

        ne.setBackground(new java.awt.Color(153, 153, 255));
        ne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ne.setForeground(new java.awt.Color(255, 255, 255));
        ne.setText("Ne");
        jPanel1.add(ne);
        ne.setBounds(1415, 121, 80, 80);

        f.setBackground(new java.awt.Color(51, 51, 255));
        f.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setText("F");
        jPanel1.add(f);
        f.setBounds(1335, 121, 80, 80);

        o.setBackground(new java.awt.Color(0, 255, 204));
        o.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        o.setForeground(new java.awt.Color(255, 255, 255));
        o.setText("O");
        jPanel1.add(o);
        o.setBounds(1255, 121, 80, 80);

        n.setBackground(new java.awt.Color(0, 255, 204));
        n.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 255));
        n.setText("N");
        jPanel1.add(n);
        n.setBounds(1175, 121, 80, 80);

        c.setBackground(new java.awt.Color(0, 255, 204));
        c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("C");
        jPanel1.add(c);
        c.setBounds(1095, 121, 80, 80);

        he.setBackground(new java.awt.Color(153, 153, 255));
        he.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        he.setForeground(new java.awt.Color(255, 255, 255));
        he.setText("He");
        jPanel1.add(he);
        he.setBounds(1415, 41, 80, 80);

        b.setBackground(new java.awt.Color(153, 255, 204));
        b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setText("B");
        jPanel1.add(b);
        b.setBounds(1015, 121, 80, 80);

        al.setBackground(new java.awt.Color(0, 153, 51));
        al.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        al.setForeground(new java.awt.Color(255, 255, 255));
        al.setText("Al");
        jPanel1.add(al);
        al.setBounds(1015, 201, 80, 80);

        la.setBackground(new java.awt.Color(204, 204, 0));
        la.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        la.setForeground(new java.awt.Color(255, 255, 255));
        la.setText("La");
        la.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laActionPerformed(evt);
            }
        });
        jPanel1.add(la);
        la.setBounds(215, 611, 80, 80);

        ac.setBackground(new java.awt.Color(102, 102, 0));
        ac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ac.setForeground(new java.awt.Color(255, 255, 255));
        ac.setText("Ac");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        jPanel1.add(ac);
        ac.setBounds(215, 691, 80, 80);

        th.setBackground(new java.awt.Color(102, 102, 0));
        th.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        th.setForeground(new java.awt.Color(255, 255, 255));
        th.setText("Th");
        th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thActionPerformed(evt);
            }
        });
        jPanel1.add(th);
        th.setBounds(295, 691, 80, 80);

        pa.setBackground(new java.awt.Color(102, 102, 0));
        pa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pa.setForeground(new java.awt.Color(255, 255, 255));
        pa.setText("Pa");
        pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paActionPerformed(evt);
            }
        });
        jPanel1.add(pa);
        pa.setBounds(375, 691, 80, 80);

        u.setBackground(new java.awt.Color(102, 102, 0));
        u.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u.setForeground(new java.awt.Color(255, 255, 255));
        u.setText("U");
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        jPanel1.add(u);
        u.setBounds(455, 691, 80, 80);

        np.setBackground(new java.awt.Color(102, 102, 0));
        np.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        np.setForeground(new java.awt.Color(255, 255, 255));
        np.setText("Np");
        np.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npActionPerformed(evt);
            }
        });
        jPanel1.add(np);
        np.setBounds(535, 691, 80, 80);

        pu.setBackground(new java.awt.Color(102, 102, 0));
        pu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pu.setForeground(new java.awt.Color(255, 255, 255));
        pu.setText("Pu");
        pu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puActionPerformed(evt);
            }
        });
        jPanel1.add(pu);
        pu.setBounds(615, 691, 80, 80);

        am.setBackground(new java.awt.Color(102, 102, 0));
        am.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        am.setForeground(new java.awt.Color(255, 255, 255));
        am.setText("Am");
        am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amActionPerformed(evt);
            }
        });
        jPanel1.add(am);
        am.setBounds(695, 691, 80, 80);

        cm.setBackground(new java.awt.Color(102, 102, 0));
        cm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cm.setForeground(new java.awt.Color(255, 255, 255));
        cm.setText("Cm");
        cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmActionPerformed(evt);
            }
        });
        jPanel1.add(cm);
        cm.setBounds(775, 691, 80, 80);

        bk.setBackground(new java.awt.Color(102, 102, 0));
        bk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bk.setForeground(new java.awt.Color(255, 255, 255));
        bk.setText("Bk");
        bk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkActionPerformed(evt);
            }
        });
        jPanel1.add(bk);
        bk.setBounds(855, 691, 80, 80);

        tb.setBackground(new java.awt.Color(204, 204, 0));
        tb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tb.setForeground(new java.awt.Color(255, 255, 255));
        tb.setText("Tb");
        jPanel1.add(tb);
        tb.setBounds(855, 611, 80, 80);

        gd.setBackground(new java.awt.Color(204, 204, 0));
        gd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gd.setForeground(new java.awt.Color(255, 255, 255));
        gd.setText("Gd");
        jPanel1.add(gd);
        gd.setBounds(775, 611, 80, 80);

        eu.setBackground(new java.awt.Color(204, 204, 0));
        eu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eu.setForeground(new java.awt.Color(255, 255, 255));
        eu.setText("Eu");
        jPanel1.add(eu);
        eu.setBounds(695, 611, 80, 80);

        sm.setBackground(new java.awt.Color(204, 204, 0));
        sm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sm.setForeground(new java.awt.Color(255, 255, 255));
        sm.setText("Sm");
        jPanel1.add(sm);
        sm.setBounds(615, 611, 80, 80);

        pm.setBackground(new java.awt.Color(204, 204, 0));
        pm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pm.setForeground(new java.awt.Color(255, 255, 255));
        pm.setText("Pm");
        jPanel1.add(pm);
        pm.setBounds(535, 611, 80, 80);

        nd.setBackground(new java.awt.Color(204, 204, 0));
        nd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nd.setForeground(new java.awt.Color(255, 255, 255));
        nd.setText("Nd");
        jPanel1.add(nd);
        nd.setBounds(455, 611, 80, 80);

        pr.setBackground(new java.awt.Color(204, 204, 0));
        pr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pr.setForeground(new java.awt.Color(255, 255, 255));
        pr.setText("Pr");
        jPanel1.add(pr);
        pr.setBounds(375, 611, 80, 80);

        ce.setBackground(new java.awt.Color(204, 204, 0));
        ce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ce.setForeground(new java.awt.Color(255, 255, 255));
        ce.setText("Ce");
        jPanel1.add(ce);
        ce.setBounds(295, 611, 80, 80);

        cf.setBackground(new java.awt.Color(102, 102, 0));
        cf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cf.setForeground(new java.awt.Color(255, 255, 255));
        cf.setText("Cf");
        cf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfActionPerformed(evt);
            }
        });
        jPanel1.add(cf);
        cf.setBounds(935, 691, 80, 80);

        dy.setBackground(new java.awt.Color(204, 204, 0));
        dy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dy.setForeground(new java.awt.Color(255, 255, 255));
        dy.setText("Dy");
        jPanel1.add(dy);
        dy.setBounds(935, 611, 80, 80);

        ho.setBackground(new java.awt.Color(204, 204, 0));
        ho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ho.setForeground(new java.awt.Color(255, 255, 255));
        ho.setText("Ho");
        jPanel1.add(ho);
        ho.setBounds(1015, 611, 80, 80);

        es.setBackground(new java.awt.Color(102, 102, 0));
        es.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        es.setForeground(new java.awt.Color(255, 255, 255));
        es.setText("Es");
        es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esActionPerformed(evt);
            }
        });
        jPanel1.add(es);
        es.setBounds(1015, 691, 80, 80);

        er.setBackground(new java.awt.Color(204, 204, 0));
        er.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        er.setForeground(new java.awt.Color(255, 255, 255));
        er.setText("Er");
        jPanel1.add(er);
        er.setBounds(1095, 611, 80, 80);

        fm.setBackground(new java.awt.Color(102, 102, 0));
        fm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fm.setForeground(new java.awt.Color(255, 255, 255));
        fm.setText("Fm");
        fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmActionPerformed(evt);
            }
        });
        jPanel1.add(fm);
        fm.setBounds(1095, 691, 80, 80);

        no.setBackground(new java.awt.Color(102, 102, 0));
        no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no);
        no.setBounds(1255, 691, 80, 80);

        md.setBackground(new java.awt.Color(102, 102, 0));
        md.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        md.setForeground(new java.awt.Color(255, 255, 255));
        md.setText("Md");
        md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdActionPerformed(evt);
            }
        });
        jPanel1.add(md);
        md.setBounds(1175, 691, 80, 80);

        tm.setBackground(new java.awt.Color(204, 204, 0));
        tm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tm.setForeground(new java.awt.Color(255, 255, 255));
        tm.setText("Tm");
        jPanel1.add(tm);
        tm.setBounds(1175, 611, 80, 80);

        yb.setBackground(new java.awt.Color(204, 204, 0));
        yb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yb.setForeground(new java.awt.Color(255, 255, 255));
        yb.setText("Yb");
        jPanel1.add(yb);
        yb.setBounds(1255, 611, 80, 80);

        slider.setMaximum(6000);
        slider.setValue(0);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });
        jPanel1.add(slider);
        slider.setBounds(170, 30, 1200, 22);

        jLabel49.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("6000");
        jPanel1.add(jLabel49);
        jLabel49.setBounds(1240, 50, 90, 40);

        sliderText.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        sliderText.setForeground(new java.awt.Color(255, 255, 255));
        sliderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sliderText.setText("3000");
        jPanel1.add(sliderText);
        sliderText.setBounds(650, 60, 170, 50);

        jLabel51.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("K");
        jPanel1.add(jLabel51);
        jLabel51.setBounds(1340, 50, 30, 40);

        jLabel52.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("0");
        jPanel1.add(jLabel52);
        jLabel52.setBounds(170, 50, 30, 40);

        jLabel53.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("K");
        jPanel1.add(jLabel53);
        jLabel53.setBounds(200, 50, 30, 40);

        jLabel54.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("K");
        jPanel1.add(jLabel54);
        jLabel54.setBounds(830, 60, 40, 50);

        jTabbedPane1.addTab("PHYSICAL STATE", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("🔍");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setText("SPECIFY THE CONSTRAINTS:");

        value.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        selection1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selection1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATOMIC NUMBER", "SYMBOL", "NAME", "MELTING POINT", "BOILING POINT", "DENSITY" }));
        selection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection1ActionPerformed(evt);
            }
        });

        theOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        theOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASCENDING", "DESCENDING" }));
        theOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theOrderActionPerformed(evt);
            }
        });

        comparision.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comparision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", ">", "<", ">=", "<=" }));

        selection2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selection2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATOMIC NUMBER", "SYMBOL", "NAME", "MELTING POINT", "BOILING POINT", "DENSITY" }));
        selection2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addComponent(selection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(comparision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(theOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(selection2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(selection1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(theOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comparision, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selection2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(677, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FILTER ELEMENTS", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    displayInfo(11,"Sodium","22.989","154");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void naActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naActionPerformed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String t1 = (String) selection1.getSelectedItem();
    String t2 = (String) selection2.getSelectedItem();
    String operator = (String) comparision.getSelectedItem();
    String literal = value.getText();
    String orderby = (String) theOrder.getSelectedItem();
   
    sym = evt.getActionCommand(); //All buttons have a common event handler - ElementPressed
//    ESym.setText(sym); //Sets the symbol on JDialog
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/periodic_table","root","1234");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * from data where Symbol = '" + sym + "';");
            rs.first();
            System.out.println(
                    rs.getString(1)
            );
            con.close();
            stmt.close();
            rs.close();
        }

    catch(Exception E)
        {
            System.out.println(E.toString());
        }
        sym = "";// To clear the symbol for next elements clicked

    }//GEN-LAST:event_jButton1ActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        showSliderValue(slider, sliderText);
        int num = Integer.parseInt(sliderText.getText());
        
        element(h,num,14,20);
        element(he,num,0,4);
        element(li,num,454,1615);
        element(be,num,1560,2743);
        element(b,num,2348,4273);
        element(c,num,3823,4300);
        element(n,num,63,77);
        element(o,num,55,90);
        element(f,num,54,85);
        element(ne,num,25,27);
        element(na,num,371,1156);
        element(mg,num,923,1363);
        element(al,num,933,2792);
        element(si,num,1687,3173);
        element(p,num,317,554);
        element(s,num,388,718);
        element(cl,num,172,239);
        element(ar,num,84,87);
        element(k,num,337,1032);
        element(ca,num,1115,1757);
        element(sc,num,1814,3103);
        element(ti,num,1941,3560);
        element(v,num,2183,3680);
        element(cr,num,2180,2944);
        element(mn,num,1519,2334);
        element(fe,num,1811,3134);
        element(co,num,1768,3200);
        element(ni,num,1728,3186);
        element(cu,num,1358,3200);
        element(zn,num,693,1180);
        element(ga,num,303,2477);
        element(ge,num,1211,3093);
        element(as,num,1090,887);
        element(se,num,494,958);
        element(br,num,266,332);
        element(kr,num,116,120);
        element(rb,num,312,961);
        element(sr,num,1050,1655);
        element(y,num,1799,3618);
        element(zr,num,2128,4682);
        element(nb,num,2750,5017);
        element(mo,num,2896,4912);
        element(tc,num,2430,4538);
        element(ru,num,2607,4423);
        element(rh,num,2237,3968);
        element(pd,num,1828,3236);
        element(ag,num,1235,2435);
        element(cd,num,594,1040);
        element(in,num,430,2345);
        element(sn,num,505,2875);
        element(sb,num,904,1860);
        element(te,num,723,1261);
        element(i,num,387,457);
        element(xe,num,161,165);
        element(cs,num,302,944);
        element(ba,num,1000,2143);
        element(la,num,1193,3737);
        element(ce,num,1071,3633);
        element(pr,num,1204,3563);
        element(nd,num,1294,3373);
        element(pm,num,1373,3273);
        element(sm,num,1345,2076);
        element(eu,num,1095,1800);
        element(gd,num,1586,3523);
        element(tb,num,1629,3503);
        element(dy,num,1685,2840);
        element(ho,num,1747,2973);
        element(er,num,1770,3141);
        element(tm,num,1818,2223);
        element(yb,num,1092,1469);
        element(lu,num,1936,3675);
        element(hf,num,2506,4876);
        element(ta,num,3290,5731);
        element(w,num,3695,5828);
        element(re,num,3459,5869);
        element(os,num,3306,5285);
        element(ir,num,2739,4701);
        element(pt,num,2041,4098);
        element(au,num,1337,3129);
        element(hg,num,234,630);
        element(tl,num,577,1746);
        element(pb,num,601,2022);
        element(bi,num,544,1837);
        element(po,num,527,1235);
        element(at,num,575,0);
        element(rn,num,202,211);
        element(fr,num,0,0);
        element(ra,num,973,2010);
        element(ac,num,1323,3473);
        element(th,num,2023,5093);
        element(pa,num,1845,4273);
        element(u,num,1408,4200);
        element(np,num,917,4273);
        element(pu,num,913,3503);
        element(am,num,1449,2284);
        element(cm,num,1618,3383);
        element(bk,num,1323,0);
        element(cf,num,1173,0);
        element(es,num,1133,0);
        element(fm,num,1800,0);
        element(md,num,1100,0);
        element(no,num,1100,0);
        element(lr,num,1900,0);
        element(rf,num,0,0);
        element(db,num,0,0);
        element(sg,num,0,0);
        element(bh,num,0,0);
        element(hs,num,0,0);
        element(mt,num,0,0);
        element(ds,num,0,0);
        element(rg,num,0,0);
        element(cn,num,0,0);
        element(nh,num,0,0);
        element(fl,num,0,0);
        element(mc,num,0,0);
        element(lv,num,0,0);
        element(ts,num,0,0);
        element(og,num,0,0);
    }//GEN-LAST:event_sliderStateChanged

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
    int n = 1;
    
    int meltingPoint = 14;
    
    int boilingPoint = 20;
    
    
    }//GEN-LAST:event_hActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int at_number = 1;
    String _name = "Hydrogen";
    String atMass = "1";
    String atRadius = "37";
    
    displayInfo(at_number,_name,atMass,atRadius);
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentShown
    }//GEN-LAST:event_jTabbedPane1ComponentShown

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
    displayInfo(3,"Lithium","6.941","134");// TODO add your handling code here:
    }//GEN-LAST:event_jButton71ActionPerformed

    private void lvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvActionPerformed

    private void theOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_theOrderActionPerformed

    private void selection1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selection1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selection1ActionPerformed

    private void selection2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selection2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selection2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    displayInfo(4,"Beryllium","9.012","90");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void beActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    displayInfo(12,"Magnesium","24.305","130");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
     displayInfo(2,"Helium","4.002","32");
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
     displayInfo(5,"Boron","10.811","82");
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
    displayInfo(6,"Carbon","12.010","77");    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
    displayInfo(7,"Nitrogen","14.006","75");
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
    displayInfo(8,"Oxygen","15.999","73");    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
    displayInfo(9,"Fluorine","18.998","71");
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
    displayInfo(10,"Neon","20.179","69");
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
    displayInfo(13,"Aluminum","26.981","118");
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
    displayInfo(14,"Silicon","28.085","111");
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
     displayInfo(15,"Phosphorus","30.973","106");
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
    displayInfo(16,"Sulfur","32.065","102");
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
    displayInfo(17,"Chlorine","35.453","99");
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
    displayInfo(18,"Argon","39.948","97");
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    displayInfo(19,"Potassium","39.098","196");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
displayInfo(20,"Calcium","40.078","174");    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
displayInfo(21,"Scandium","44.955","144");    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
displayInfo(22,"Titanium","47.867","136");    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
displayInfo(23,"Vanadium","50.941","125");    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
displayInfo(24,"Chromium","51.996","127");    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
displayInfo(25,"Manganese","54.938","139");    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
displayInfo(26,"Iron","55.845","125");    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
displayInfo(27,"Cobalt","58.933","126");    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
displayInfo(28,"Nickel","58.693","121");    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
displayInfo(29,"Copper","63.546","138");
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
displayInfo(30,"Zinc","65.38","131");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
displayInfo(31,"Gallium","69.723","126");    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
displayInfo(32,"Germanium","72.64","122");
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
     displayInfo(33,"Arsenic","74.921","119");
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
    displayInfo(34,"Selenium","78.96","116");
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
    displayInfo(35,"Bromine","79.904","114");
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
    displayInfo(36,"Krypton","83.798","110");
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
displayInfo(37,"Rubidium","85.467","211");    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     displayInfo(38,"Strontium","87.62","192");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
   displayInfo(39,"Yttrium","88.905","162");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
    displayInfo(40,"Zirconium","91.224","148");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    displayInfo(41,"Niobium","92.906","137");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    displayInfo(42,"Molybdenum","95.96","145");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
    displayInfo(43,"Technetium","98","156");
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
    displayInfo(44,"Ruthenium","101.07","126");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
    displayInfo(45,"Rhodium","102.905","135");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
    displayInfo(46,"Palladium","106.42","131");
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
    displayInfo(47,"Silver","107.868","153");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
    displayInfo(48,"Cadmium","112.411","148");
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
    displayInfo(49,"Indium","114.818","144");
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
    displayInfo(50,"Tin","118.710","141");
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
    displayInfo(51,"Antimony","121.760","138");
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
    displayInfo(52,"Tellurium","127.60","135");
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
    displayInfo(53,"Iodine","126.904","133");
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
    displayInfo(54,"Xenon","131.293","130");
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    displayInfo(55,"Cesium","132.905","225");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
    displayInfo(56,"Barium","137.327","198");
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    displayInfo(71,"Lutetium","174.966","160");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
displayInfo(72,"Hafnium","178.49","150");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    displayInfo(73,"Tantalum","180.947","138");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
    displayInfo(74,"Tungsten","183.84","146");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
    displayInfo(75,"Rhenium","186.207","159");
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
    displayInfo(76,"Osmium","190.23","128");
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
    displayInfo(77,"Iridium","192.217","137");
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
    displayInfo(78,"Platinum","195.084","128");
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
    displayInfo(79,"Gold","196.966","144");
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
    displayInfo(80,"Mercury","200.59","149");
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
    displayInfo(81,"Thallium","204.383","148");
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
    displayInfo(82,"Lead","207.2","147");
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
    displayInfo(83,"Bismuth","208.980","146");
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
    displayInfo(84,"Polonium","209","Unknown");
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
    displayInfo(85,"Astatine","210","Unknown");    
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
    displayInfo(86,"Radon","222","145");
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    displayInfo(87,"Francium","223","Unknown");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    displayInfo(88,"Radium","226","Unknown");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    displayInfo(103, "Lawrencium", "262", "Unknown");    
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
    displayInfo(104,"Rutherfordium","267","Unknown");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
    displayInfo(105,"Dubnium","268","Unknown");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
    displayInfo(106,"Seaborgium","271","Unknown");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
    displayInfo(107,"Bohrium","272","Unknown");
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
    displayInfo(108,"Hassium","270","Unknown");
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
    displayInfo(109,"Meitnerium","276","Unknown");
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
    displayInfo(110,"Darmstadtium","281","Unknown");
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
    displayInfo(111,"Roentgenium","280","Unknown");
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
    displayInfo(112,"Copernicium","285","Unknown");
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
    displayInfo(113,"Nihonium","284","Unknown");
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
    displayInfo(114,"Flerovium","289","Unknown");
    }//GEN-LAST:event_jButton90ActionPerformed

    private void MoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoActionPerformed
    displayInfo(115,"Moscovium","288","Unknown");
    }//GEN-LAST:event_MoActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
    displayInfo(116,"Livermorium","293","Unknown");
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
    displayInfo(117,"Tennessine","294","Unknown");
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
    displayInfo(118,"Oganesson","294","Unknown");
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
    displayInfo(57,"Lanthanum","138.905","169");
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
    displayInfo(89,"Actinium","227","Unknown");
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
    displayInfo(58,"Cerium","140.116","Unknown");
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
    displayInfo(59,"Praseodymium","140.907","Unknown");
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
    displayInfo(60,"Neodymium","144.242","Unknown");
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
    displayInfo(61,"Promethium","145","Unknown");
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
    displayInfo(62,"Samarium","150.36","Unknown");
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
    displayInfo(63,"Europium","151.964","Unknown");
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
    displayInfo(64,"Gadolinium","157.25","Unknown");
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
    displayInfo(65,"Terbium","158.925","Unknown");
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
    displayInfo(66,"Dysprosium","162.500","Unknown");
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
    displayInfo(67,"Holmium","164.930","Unknown");
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
    displayInfo(68,"Erbium","167.259","Unknown");
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
    displayInfo(69,"Thulium","168.934","Unknown");
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
    displayInfo(70,"Ytterbium","173.054","Unknown");
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
    displayInfo(90,"Thorium","232.038","Unknown");
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
    displayInfo(91,"Protactinium","231.035","Unknown");
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
    displayInfo(92,"Uranium","238.028","Unknown");
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
    displayInfo(93,"Neptunium","237","Unknown");
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
    displayInfo(94,"Plutonium","244","Unknown");
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
    displayInfo(95,"Americium","243","Unknown");
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
    displayInfo(96,"Curium","247","Unknown");
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
    displayInfo(97,"Berkelium","247","Unknown");
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
    displayInfo(98,"Californium","251","Unknown");
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
    displayInfo(99,"Einsteinium","252","Unknown");
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
    displayInfo(100,"Fermium","257","Unknown");
    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton119ActionPerformed
    displayInfo(101,"Mendelevium","258","Unknown");
    }//GEN-LAST:event_jButton119ActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
    
    }//GEN-LAST:event_NoActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
    displayInfo(102,"Nobelium","259","Unknown");
    }//GEN-LAST:event_noActionPerformed

    private void mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdActionPerformed
   displayInfo(101,"Mendelevium","258","Unknown");
    }//GEN-LAST:event_mdActionPerformed

    private void fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmActionPerformed
    displayInfo(100,"Fermium","257","Unknown");
    }//GEN-LAST:event_fmActionPerformed

    private void esActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esActionPerformed
    displayInfo(99,"Einsteinium","252","Unknown");
    }//GEN-LAST:event_esActionPerformed

    private void cfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfActionPerformed
    displayInfo(98,"Californium","251","Unknown");
    }//GEN-LAST:event_cfActionPerformed

    private void bkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkActionPerformed
    displayInfo(97,"Berkelium","247","Unknown");
    }//GEN-LAST:event_bkActionPerformed

    private void cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmActionPerformed
    displayInfo(96,"Curium","247","Unknown");
    }//GEN-LAST:event_cmActionPerformed

    private void amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amActionPerformed
    displayInfo(95,"Americium","243","Unknown");
    }//GEN-LAST:event_amActionPerformed

    private void puActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puActionPerformed
    displayInfo(94,"Plutonium","244","Unknown");
    }//GEN-LAST:event_puActionPerformed

    private void npActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npActionPerformed
    displayInfo(93,"Neptunium","237","Unknown");
    }//GEN-LAST:event_npActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
    displayInfo(92,"Uranium","238.028","Unknown");
    }//GEN-LAST:event_uActionPerformed

    private void paActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paActionPerformed
    displayInfo(91,"Protactinium","231.035","Unknown");
    }//GEN-LAST:event_paActionPerformed

    private void thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thActionPerformed
    displayInfo(90,"Thorium","232.038","Unknown");
    }//GEN-LAST:event_thActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
    displayInfo(89,"Actinium","227","Unknown");
    }//GEN-LAST:event_acActionPerformed

    private void laActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laActionPerformed
    displayInfo(57,"Lanthanum","138.905","169");
    }//GEN-LAST:event_laActionPerformed

    private void lrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lrActionPerformed
    displayInfo(103,"Lawrencium","262","Unknown");
    }//GEN-LAST:event_lrActionPerformed

    private void luActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luActionPerformed
    
    }//GEN-LAST:event_luActionPerformed

    /**
     * @param args the command line arguments
     */
    public void displayInfo(int n, String _name, String at_mass, String at_radius){
        atomic_number.setText(Integer.toString(n));
        name.setText(_name);
        mass.setText(at_mass);
        radius.setText(at_radius);
    }
    public void element(JButton button,int temp, int s,int l){
    // RED = SOLID
        Color solid = new Color(255,102,102);
        
        Color liquid = new Color(51,51,255);

        Color gas = new Color(153,255,153);

//        Color none = new Color(153,153,153);
        
        // HYDROGEN
        if(temp>=0 &&temp<=s){
           button.setBackground(solid);        // TODO add your handling code here:            
        }
        
        if(temp>=s+1 && temp<=l){     // MELTING
           button.setBackground(liquid);        // TODO add your handling code here:
        }
        
        else if(temp>l+1){
            button.setBackground(gas);
        }
    }
    
    private void showSliderValue(JSlider slider, JLabel label){
        // Here just set label's text and getValue from slider
        label.setText(""+slider.getValue());
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton Mo;
    private javax.swing.JButton No;
    private javax.swing.JButton ac;
    private javax.swing.JButton ag;
    private javax.swing.JButton al;
    private javax.swing.JButton am;
    private javax.swing.JButton ar;
    private javax.swing.JButton as;
    private javax.swing.JButton at;
    private javax.swing.JLabel atomic_number;
    private javax.swing.JButton au;
    private javax.swing.JButton b;
    private javax.swing.JButton ba;
    private javax.swing.JButton be;
    private javax.swing.JButton bh;
    private javax.swing.JButton bi;
    private javax.swing.JButton bk;
    private javax.swing.JButton br;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton c;
    private javax.swing.JButton ca;
    private javax.swing.JButton cd;
    private javax.swing.JButton ce;
    private javax.swing.JButton cf;
    private javax.swing.JButton cl;
    private javax.swing.JButton cm;
    private javax.swing.JButton cn;
    private javax.swing.JButton co;
    private javax.swing.JComboBox<String> comparision;
    private javax.swing.JButton cr;
    private javax.swing.JButton cs;
    private javax.swing.JButton cu;
    private javax.swing.JButton db;
    private javax.swing.JButton ds;
    private javax.swing.JButton dy;
    private javax.swing.JButton er;
    private javax.swing.JButton es;
    private javax.swing.JButton eu;
    private javax.swing.JButton f;
    private javax.swing.JButton fe;
    private javax.swing.JButton fl;
    private javax.swing.JButton fm;
    private javax.swing.JButton fr;
    private javax.swing.JButton ga;
    private javax.swing.JButton gd;
    private javax.swing.JButton ge;
    private javax.swing.JButton h;
    private javax.swing.JButton he;
    private javax.swing.JButton hf;
    private javax.swing.JButton hg;
    private javax.swing.JButton ho;
    private javax.swing.JButton hs;
    private javax.swing.JButton i;
    private javax.swing.JButton in;
    private javax.swing.JButton ir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton k;
    private javax.swing.JButton kr;
    private javax.swing.JButton la;
    private javax.swing.JButton li;
    private javax.swing.JButton lr;
    private javax.swing.JButton lu;
    private javax.swing.JButton lv;
    private javax.swing.JLabel mass;
    private javax.swing.JButton mc;
    private javax.swing.JButton md;
    private javax.swing.JButton mg;
    private javax.swing.JButton mn;
    private javax.swing.JButton mo;
    private javax.swing.JButton mt;
    private javax.swing.JButton n;
    private javax.swing.JButton na;
    private javax.swing.JLabel name;
    private javax.swing.JButton nb;
    private javax.swing.JButton nd;
    private javax.swing.JButton ne;
    private javax.swing.JButton nh;
    private javax.swing.JButton ni;
    private javax.swing.JButton no;
    private javax.swing.JButton np;
    private javax.swing.JButton o;
    private javax.swing.JButton og;
    private javax.swing.JButton os;
    private javax.swing.JButton p;
    private javax.swing.JButton pa;
    private javax.swing.JButton pb;
    private javax.swing.JButton pd;
    private javax.swing.JButton pm;
    private javax.swing.JButton po;
    private javax.swing.JButton pr;
    private javax.swing.JButton pt;
    private javax.swing.JButton pu;
    private javax.swing.JButton ra;
    private javax.swing.JLabel radius;
    private javax.swing.JButton rb;
    private javax.swing.JButton re;
    private javax.swing.JButton rf;
    private javax.swing.JButton rg;
    private javax.swing.JButton rh;
    private javax.swing.JButton rn;
    private javax.swing.JButton ru;
    private javax.swing.JButton s;
    private javax.swing.JButton sb;
    private javax.swing.JButton sc;
    private javax.swing.JButton se;
    private javax.swing.JComboBox<String> selection1;
    private javax.swing.JComboBox<String> selection2;
    private javax.swing.JButton sg;
    private javax.swing.JButton si;
    private javax.swing.JSlider slider;
    private javax.swing.JLabel sliderText;
    private javax.swing.JButton sm;
    private javax.swing.JButton sn;
    private javax.swing.JButton sr;
    private javax.swing.JButton ta;
    private javax.swing.JButton tb;
    private javax.swing.JButton tc;
    private javax.swing.JButton te;
    private javax.swing.JButton th;
    private javax.swing.JComboBox<String> theOrder;
    private javax.swing.JButton ti;
    private javax.swing.JButton tl;
    private javax.swing.JButton tm;
    private javax.swing.JButton ts;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JTextField value;
    private javax.swing.JButton w;
    private javax.swing.JButton xe;
    private javax.swing.JButton y;
    private javax.swing.JButton yb;
    private javax.swing.JButton zn;
    private javax.swing.JButton zr;
    // End of variables declaration//GEN-END:variables
}
