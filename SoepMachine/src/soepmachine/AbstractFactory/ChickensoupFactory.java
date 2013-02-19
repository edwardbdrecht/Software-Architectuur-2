/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soepmachine.AbstractFactory;

import soepmachine.AbstractFactory.AbstractFactory;
import soepmachine.AbstractProducts.Addition.AbstractAddition;
import soepmachine.AbstractProducts.Liquid.AbstractLiquid;
import soepmachine.AbstractProducts.Powder.AbstractPowder;
import soepmachine.AbstractProducts.Addition.Croutons;
import soepmachine.AbstractProducts.Liquid.Water;
import soepmachine.AbstractProducts.Powder.Chicken;

/**
 *
 * @author edwardroozeboom23
 */
public class ChickensoupFactory extends AbstractFactory{

	@Override
	public AbstractPowder addPowder() {
		return new Chicken();
	}

	@Override
	public AbstractLiquid addLiquid() {
		return new Water();
	}

	@Override
	public AbstractAddition addAddition() {
		return new Croutons();
	}
	
}
