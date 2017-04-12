package impl.method;

import inter.method.Prototype;

/**
 * 客户端
 * @author zengrong
 *
 */
public class Client {

	/**
	 * 需要创建的原型
	 */
	
	private Prototype prototype;
	
	public Client( Prototype prototype){
		this.prototype=prototype;
	}
	/**
	 * 创建原型
	 */
	public void create () {
		Prototype cloneprototype = (Prototype) prototype.clone();
	}
}
