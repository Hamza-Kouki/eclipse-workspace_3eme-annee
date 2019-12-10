package tp_s;
public class main {
	public static void main(String[] args) {
		
		String  host="smtp.gmail.com",
				from= "hamzakouki33@gmail.com",
				login= "hamzakouki33@gmail.com",
				pwd= "mouheblerrasoull",
				to= "pamajo7785@email1.pro";

		SendEmail object = new SendEmail();
		object.sendMsgMethod(host, from, login, pwd, to);
		object.usage();
 
		/*ReceiverEmail objectR = new ReceiverEmail();
		objectR .receiveEmail(host,"pop3",login,pwd);*/
	}
}
