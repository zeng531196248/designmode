package adapter.model;
/**
 * 相当于小姐妹
 * @author zengrong
 *
 */
public class Banner {
	private String name;

	public Banner(String name) {
		super();
		this.name = name;
	}
	
	public void showwithParen() {
		System.out.println("--特殊可爱小武器---"+name+"-----");
	}
	
	public void showWithAster() {
		System.out.println("---200块真不贵-"+name+"----");
	}
}
