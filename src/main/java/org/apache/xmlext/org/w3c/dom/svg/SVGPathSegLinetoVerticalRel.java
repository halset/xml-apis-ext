
package org.apache.xmlext.org.w3c.dom.svg;

import org.apache.xmlext.org.w3c.dom.DOMException;

public interface SVGPathSegLinetoVerticalRel extends 
               SVGPathSeg {
  public float   getY( );
  public void      setY( float y )
                       throws DOMException;
}
