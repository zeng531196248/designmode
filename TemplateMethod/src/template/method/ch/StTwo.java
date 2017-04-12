package template.method.ch;

import template.method.AbstractDisPlay;
/**
 * 第二个小伙伴
 * @author zengrong
 *
 */
public class StTwo extends AbstractDisPlay {
	private String str;
	
	public StTwo(String str) {
		this.str = str;
	}

	@Override
	public void open() {
		System.out.println("打开了日语网站");
	}

	@Override
	public void look() {
		System.out.println("网站提供了"+str);
	}

	@Override
	public void close() {
		System.out.println("看了一会网站被关闭了。。。");
	}

}
