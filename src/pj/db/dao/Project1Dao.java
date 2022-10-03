package pj.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pj.db.model.Bus;
import pj.db.model.Passengers;
import pj.db.model.ShowTicket;
import pj.db.util.DataBaseConnect;


public class Project1Dao {
	static Connection con = DataBaseConnect.connect();
	
	// To insert records
	public boolean insertRecords(String email, Long phone, String name, String gender, int age, int psg, String doj,int busno ) {
		String sql = "insert into passengers values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,email);
			ps.setLong(2,phone);
			ps.setString(3,name);
			ps.setString(4,gender);
			ps.setInt(5,age);
			ps.setInt(6, psg);
			ps.setString(7, doj);
			ps.setInt(8, busno);
			int i = ps.executeUpdate();
			if(i>0)
				return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
		
	
	
	// search busses
	public Bus searchBuses(String source, String destination) {
		Bus b = null;
		try {
			PreparedStatement ps = con.prepareStatement
					("select * from bus where source = ? and destination = ?");
			ps.setString(1, source);
			ps.setString(2, destination);
			ResultSet rs = ps.executeQuery();
			b = new Bus();
			rs.next();
			b.setBusNo(rs.getInt("BusNo"));
			b.setSource(rs.getString("source"));
			b.setDestination(rs.getString("destination"));
			b.setBusName(rs.getString("BusName"));
			b.setTime(rs.getString("BusTime"));
			b.setBushrs(rs.getString("BusHrs"));
			b.setFare(rs.getInt("Fare"));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

    // display ticket
	public static Passengers searchByPhone(Long phone) {
		 Passengers p = null;
		try {
			PreparedStatement ps = con.prepareStatement
					("select passengers.BusNo,passengers.name,passengers.phone,passengers.DateOfJourney,passengers.passenger,"
						+" bus.source,bus.destination,bus.BusName,bus.BusTime,bus.BusHrs,bus.Fare"
						+" from bus right join passengers on bus.BusNo = passengers.BusNo"
						+" where phone = ?");
			ps.setLong(1, phone);
			ResultSet rs = ps.executeQuery();
			p = new Passengers();
			rs.next();
			p.setBusNo(rs.getInt("BusNo"));
			p.setName(rs.getString("name"));
			p.setPhone(rs.getLong("phone"));
			p.setDoj(rs.getString("DateOfJourney"));
			p.setPsg(rs.getInt("passenger"));
			p.setSource(rs.getString("source"));
			p.setDestination(rs.getString("destination"));
			p.setBusName(rs.getString("BusName"));
			p.setBusTime(rs.getString("BusTime"));
			p.setBusHrs(rs.getString("BusHrs"));
			p.setFare(rs.getInt("fare"));
			
		}
		catch (Exception e) {	
			e.printStackTrace();
		}
		
		return p;
		
	}

	// delete ticket
	public boolean deletebyPhone(Long phone) {
		String sql = "delete from passengers where phone = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1,phone);
			int i = ps.executeUpdate();
			if (i>0)
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


}

//select passengers.BusNo,passengers.name,passengers.DateOfJourney,passengers.passenger,
//-> bus.source,bus.destination,bus.BusName,bus.BusTime,bus.BusHrs,bus.Fare
//-> from bus right join passengers on
//-> bus.BusNo = passengers.BusNo;

