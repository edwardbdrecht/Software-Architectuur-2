/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soepmachine;

import soepmachine.AbstractFactory.ChickensoupFactory;
import soepmachine.AbstractFactory.TomatosoupFactory;

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
