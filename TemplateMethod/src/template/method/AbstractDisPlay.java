package template.method;
/**
 * 模板模式：
 * 	具体处理方法需要子类自己去实现，流程定义在父类中，调用时候，调用父类中得方法时候
 * 出现的结果也会不一样！，这就是模板方法，
 * 相当于，一个相同的模板，你填充不同的东西后，出现就是不一样的！
 * @author zengrong
 *
 */
public abstract class AbstractDisPlay {
	/**
	 * 定义三个抽象方法
	 */
	public abstract void open();
	public abstract void look();
	public abstract void close();
	/**
	 * 定义一个模板:
	 * 这模板调用了三个抽象方法，但是具体干啥，谁都不知道！
	 */
	public final  void show() {
		open();
		for (int i = 0; i < 5; i++) {
			look();
		}
		close();
	}
	
}
