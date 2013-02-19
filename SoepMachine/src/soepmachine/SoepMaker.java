/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soepmachine;

import soepmachine.AbstractFactory.Factory.ChickensoupFactory;
import soepmachine.AbstractFactory.Factory.TomatosoupFactory;

/**
 *
 * @author edwardroozeboom23
 */
public class SoepMaker {
	public SoepMaker()
	{
		//ChickensoupFactory chickensoup = new ChickensoupFactory();
		TomatosoupFactory tomatosoup = new TomatosoupFactory();
		tomatosoup.addAddition();
		tomatosoup.addLiquid();
		tomatosoup.addPowder();
	}
}
