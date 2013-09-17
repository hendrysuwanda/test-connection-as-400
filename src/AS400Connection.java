/**
 * Copyright (c) 2012 Jatis Solutions. All Rights Reserved.
 * 
 * This software contains confidential and proprietary information of Jatis Solutions.
 * ("Confidential Information").
 * 
 * Such Confidential Information shall not be disclosed and it shall only be
 * used in accordance with the terms of the license agreement entered into with
 * Jatis Solutions; other than in accordance with the written permission of Jatis Solutions.
 * 
 * Created on: May 3, 2013
 *
 * Author           Date         Version Description
 * ---------------- ------------ ------- ---------------------------------
 * 
 *  
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author hendry.suwanda
 * 
 */
public class AS400Connection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #I-series ip or host name local_system=XXX.XXX.XXX.XXX
		// #I-series UserId, used for login and library list userId=XXXXXXX
		// #I-series Password password=XXXXXXX
		try {
			// User ID=PGMKARTOLO;Initial
			// Catalog=F608982F;Provider=IBMDA400.DataSource.1;
			// Persist Security Info=True;Default Collection=RBDATSIT6;
			String DRIVER = "com.ibm.as400.access.AS400JDBCDriver";
			String URL = "jdbc:as400://192.168.10.3";
			Connection conn = null; // Connect to iSeries
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, "IBEQXXXXX", "IBEQxxxxx");

			Statement stmt = conn.createStatement();

			conn.close();
			System.out.println("connection success");
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
