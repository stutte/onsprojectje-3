package database;

import databag.Lid;
import database.connect.ConnectionManager;
import exception.DBException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LidDB implements InterfaceLidDB {

    @Override
    public void toevoegenLid(Lid lid) throws DBException {
        if (lid != null) {

            // connectie tot stand brengen (en automatisch sluiten)
            try (Connection conn = ConnectionManager.getConnection();) {
                // preparedStatement opstellen (en automatisch sluiten)
                try (PreparedStatement stmt = conn.prepareStatement(
                        "insert into lid(rijksregisternummer"
                        + " , voornaam"
                        + " , naam"
                        + " , geslacht"
                        + " , telnr"
                        + " , emailadres"
                        + " , start_lidmaatschap"
                        + " ) values(?,?,?,?,?,?,?)");) {
                    stmt.setString(1, lid.getRijksregisternummer());
                    stmt.setString(2, lid.getVoornaam());
                    stmt.setString(3, lid.getNaam());
                    stmt.setString(4, lid.getGeslacht().name()); //Geslacht =/= string
                    stmt.setString(5, lid.getTelnr());
                    stmt.setString(6, lid.getEmailadres());
                    stmt.setDate(7, java.sql.Date.valueOf(lid.getStart_lidmaatschap())); //Date =/= string
                    stmt.execute();
                    
                } catch (SQLException sqlEx) {
                    throw new DBException("SQL-exception in toevoegenKlant "
                            + "- statement" + sqlEx);
                }
            } catch (SQLException sqlEx) {
                throw new DBException("SQL-exception in toevoegenKlant "
                        + "- connection" + sqlEx);
            }
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public void wijzigenLid(Lid lid)  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void uitschrijvenLid(String rr)  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lid zoekLid(String rijksregisternummer)  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Lid> zoekAlleLeden()  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
}
