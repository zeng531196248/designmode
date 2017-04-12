package template.method.app;

import template.method.AbstractDisPlay;
import template.method.ch.StOne;
import template.method.ch.StTwo;

public class App {

	public static void main(String[] args) {
		AbstractDisPlay sAbstractDisPlay= new StOne(1);
		AbstractDisPlay stTwo = new StTwo("小视频");
		sAbstractDisPlay.show();
		stTwo.show();
	}
}
