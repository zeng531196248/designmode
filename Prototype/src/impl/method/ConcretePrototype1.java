package impl.method;

import inter.method.Prototype;

public class ConcretePrototype1 implements Prototype {
	/**
	 * 接口类对象使用了object，所有在复写时候，类型就随便都是可以的
	 */
	  public Prototype clone(){
	        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
	        Prototype prototype = new ConcretePrototype1();
	        return prototype;
	    }
}
