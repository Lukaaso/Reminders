


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Reminder {
    
    public void insertDeleteReminder(char operation, Integer id, String text) throws SQLException{
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        // i = insert operation
        if(operation == 'i' ){
            
            try {
           ps = con.prepareStatement("INSERT INTO reminder_fff(content) VALUES (?)");
           ps.setString(1, text);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"New reminder added!");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(Reminder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // d = delete operation
        if(operation == 'd' ){
            
            try {
           ps = con.prepareStatement("DELETE FROM `reminder_fff` WHERE `id` = ?");
           ps.setInt(1, id);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Reminder was deleted!");
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(Reminder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        public void fillTable(JTable table, String valueToSearch){
            Connection con = MyConnection.getConnection();
            PreparedStatement ps;
            
           
        try {
            ps = con.prepareStatement("SELECT * FROM `reminder_fff` WHERE CONCAT(`content`)LIKE ? ");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            Object[] row1;
            
            while(rs.next()){
            row1=new Object[2];
            row1[0] = rs.getInt(1);
            row1[1] = rs.getString(2);
            model.addRow(row1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Reminder.class.getName()).log(Level.SEVERE, null, ex);
        }
        }  

    //void insertDeletePripomieka(char c, int WIDTH, SystemColor text) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    }

