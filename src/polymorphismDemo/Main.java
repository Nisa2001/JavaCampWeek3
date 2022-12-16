package polymorphismDemo;

public class Main {

	public static void main(String[] args) {

		
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new DataBaseLogger(),new FileLogger()};
		// yeni bir logger eklemek istersek direkt buraya yazabiliriz
		
		for(BaseLogger logger:loggers) {
			logger.log("Log mesajı");
		}
		
		
		CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
		
		customerManager.add();
	}

}
