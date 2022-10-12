package com.infinite.Inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StockDAO {
	Connection connection;
	PreparedStatement pst;
	public Stock searchAccount(int accountNo) throws ClassNotFoundException, SQLException{
		connection= ConnectionHelper.getConnection();
		String cmd = "select * from Stock where Stockid=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, stockid);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if(rs.next()){
			stock = new Stock();
			stock.setStockid(rs.getString("stockId"));
			stock.setItemName(rs.getString("itemName"));
			stock.setPrice(rs.getDouble("price"));
			stock.setQualityAvail(rs.getInt("qualityAvail"));
			
		}
		return stock;
		
	}
	
	
	
	
	
}
