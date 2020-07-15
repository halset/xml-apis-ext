
package org.apache.xmlext.org.w3c.dom.svg;

import org.apache.xmlext.org.w3c.dom.DOMException;

public interface SVGNumber {
  public float getValue( );
  public void           setValue( float value )
                       throws DOMException;
}
