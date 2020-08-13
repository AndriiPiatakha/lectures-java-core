//import org.junit.Test;
//
//public class TestDemoIntegrationTest {
//	
//	@Test
//	public void test() {
//		BankService bs = new BankService();
//		bs.transferMoney(1, 2, 100, new TransferOption() {
//			private ImportantService is;
//			
//			@Override
//			public String someImportantMethod() {
//				int importantMethod = is.importantMethod();
//				if (importantMethod > 1) {
//					return "SAME VALUE";
//				} else {
//					return "SAME VALUE";
//				}
//			}
//		});
//		
//	}
//
//}
//
//class BankService {
//	
//	public void transferMoney(int from, int to, int amount, TransferOption transOpt) {
//		
//	}
//}
//
//interface TransferOption {
//	
//	String someImportantMethod();
//}
//
//interface ImportantService {
//	int importantMethod();
//}
