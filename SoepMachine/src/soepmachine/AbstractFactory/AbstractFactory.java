/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soepmachine.AbstractFactory;

import soepmachine.AbstractProducts.Powder.AbstractPowder;
import soepmachine.AbstractProducts.Liquid.AbstractLiquid;
import soepmachine.AbstractProducts.Addition.AbstractAddition;

/**
 *
 * @author edwardroozeboom23
 */
public abstract class AbstractFactory {
	public abstract AbstractPowder addPowder();
	public abstract AbstractLiquid addLiquid();
	public abstract AbstractAddition addAddition();
}
