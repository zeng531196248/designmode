package single.method;
/**
 * 改造懒汉模式变成线程安全
 * @author zengrong
 *
 */
public class lSingleSafety {
	/**
	 * 用volatile修饰的变量，
	 * 线程在每次使用变量的时候，
	 * 都会读取变量修改后的最的值。
	 * volatile很容易被误用，用来进行原子性操作。
	 */
	private volatile static lSingleSafety singleSafety=null;
	
	
	private lSingleSafety(){}
	/**
	 * 采用的是双重加锁进行效率和安全
	 * @return
	 */
	public static lSingleSafety getLSingleSafety() {
		
		if(singleSafety==null){
			synchronized (lSingleSafety.class) {
			     if(singleSafety == null){
			    	 singleSafety= new lSingleSafety();
			     }
			}
		}
		return singleSafety;
	}
	
}
