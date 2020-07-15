
package org.apache.xmlext.org.w3c.dom.svg;

import org.apache.xmlext.org.w3c.dom.DOMException;
import org.apache.xmlext.org.w3c.dom.events.EventTarget;
import org.apache.xmlext.org.w3c.dom.smil.ElementTimeControl;

public interface SVGAnimationElement extends 
               SVGElement,
               SVGTests,
               SVGExternalResourcesRequired,
               ElementTimeControl,
               EventTarget {
  public SVGElement getTargetElement( );

  public float getStartTime (  );
  public float getCurrentTime (  );
  public float getSimpleDuration (  )
                  throws DOMException;
}