package SendEmail;

import java.sql.Connection;


public class main {
	public static void main(String[]args) {
		
		ConnexionClass objectCon = new ConnexionClass();
		Connection con=objectCon.Conn();
		//---
		EventClass ObjectEventClass = new EventClass();
		int id = ObjectEventClass.EventList(con);
		//-----
		GetData ObjectGetData = new GetData();
		ObjectGetData.GetDataMethode(con , id);
	}
}