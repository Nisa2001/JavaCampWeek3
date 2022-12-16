package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {//bunu yazınca newler constractur
		this.logger=logger;
	}
	
	public void add() {
		System.out.println("müşteri eklendi");
		this.logger.log("log mesajı");
	}

}
