package single.method;
/**
 * 懒汉式(线程不安全)
 * @author zengrong
 *
 */
public class lSingle {

	private static lSingle single=null;
	
	private lSingle(){}
	
	/**
	 *类加载时候并不生成实例，当调用时候才去加载生成实例
	 * @return
	 */
	public static lSingle getLSingle() {
		return single==null ?new lSingle():single;
	}
}
