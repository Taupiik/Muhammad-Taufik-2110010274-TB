/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class JasperFileManager {
     public static JasperPrint fillReport(String reportPath, HashMap<String, Object> parameters, Connection connection) throws SQLException, JRException {
        return JasperFillManager.fillReport(reportPath, parameters, connection);
    }

    public static void viewReport(JasperPrint print) {
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
    }
}
