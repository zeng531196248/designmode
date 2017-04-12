package single.method;
/**
 * 使用类级别的静态类部类来进行实例化
 * @author zengrong
 *
 */
public class StaticSingle {

	private StaticSingle(){}
	
	private static class SingleOnInside{
		/**
		 * 初始化静态
		 */
	private static StaticSingle single=new StaticSingle();
		
	}
	
	/**
	 * 安全问题由JVM来保证
	 * @return
	 */
	public static StaticSingle getStaticSingle() {
		
		return SingleOnInside.single;
	}
	
}
