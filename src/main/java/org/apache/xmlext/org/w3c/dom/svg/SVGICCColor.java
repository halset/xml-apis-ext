
package org.apache.xmlext.org.w3c.dom.svg;

import org.apache.xmlext.org.w3c.dom.DOMException;
public interface SVGICCColor {
  public String      getColorProfile( );
  public void      setColorProfile( String colorProfile )
                       throws DOMException;
  public SVGNumberList getColors( );
}