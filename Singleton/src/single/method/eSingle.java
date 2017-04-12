package single.method;
/**
 * 饿汉
 * @author zengrong
 *
 */
public class eSingle {
	/**
	 * 在这个类被加载时，静态变量single会被初始化，
	 * 此时类的私有构造子会被调用。这时候，单例类的唯一实例就被创建出来了。
	 */
	private static eSingle single =new eSingle();
	/**
	 * 私有化构造函数
	 */
	private eSingle(){}
	/**
	 * 对外界唯一的公开生成实例的方法
	 * @return
	 */
	public eSingle getInESingle() {
		return single;
		
	}
	
	
	
	
}
