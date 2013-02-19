/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soepmachine.AbstractFactory;

import soepmachine.AbstractFactory.AbstractFactory;
import soepmachine.AbstractProducts.Addition.AbstractAddition;
import soepmachine.AbstractProducts.Liquid.AbstractLiquid;
import soepmachine.AbstractProducts.Powder.AbstractPowder;
import soepmachine.AbstractProducts.Addition.Meatballs;
import soepmachine.AbstractProducts.Liquid.Water;
import soepmachine.AbstractProducts.Powder.Tomato;

/**
 *
 * @author edwardroozeboom23
 */
public class TomatosoupFactory extends AbstractFactory{

	@Override
	public AbstractPowder addPowder() {
		return new Tomato();
	}

	@Override
	public AbstractLiquid addLiquid() {
		return new Water();
	}

	@Override
	public AbstractAddition addAddition() {
		return new Meatballs();
	}
	
}
