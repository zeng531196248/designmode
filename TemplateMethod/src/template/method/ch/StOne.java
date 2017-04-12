package template.method.ch;

import template.method.AbstractDisPlay;
/**
 * 继承抽象类，第一个小伙伴继承了，
 * @author zengrong
 *
 */
public class StOne extends AbstractDisPlay {

	private Integer num;
	
	public StOne(Integer num) {
		this.num = num;
	}

	@Override
	public void open() {
	System.out.println("快bo网");
		
	}

	@Override
	public void look() {
		System.out.println("苍老师日语教学第"+num+"部");
		num++;
		
	}

	@Override
	public void close() {
		System.out.println("他爸爸回来了，不学了，关闭了！");
		
	}

}
