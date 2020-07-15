
package org.apache.xmlext.org.w3c.dom.svg;

import org.apache.xmlext.org.w3c.dom.DOMException;

public interface SVGScriptElement extends 
               SVGElement,
               SVGURIReference,
               SVGExternalResourcesRequired {
  public String getType( );
  public void      setType( String type )
                       throws DOMException;
}