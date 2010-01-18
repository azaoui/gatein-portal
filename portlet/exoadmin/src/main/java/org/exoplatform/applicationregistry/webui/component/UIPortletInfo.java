/**
 * Copyright (C) 2009 eXo Platform SAS.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.exoplatform.applicationregistry.webui.component;

import org.exoplatform.applicationregistry.webui.component.UIPortletManagement.PortletExtra;
import org.exoplatform.webui.application.replication.api.annotations.Serialized;
import org.exoplatform.webui.config.annotation.ComponentConfig;
import org.exoplatform.webui.core.UIComponent;

/**
 * Created by The eXo Platform SAS
 * Author : Pham Thanh Tung
 *          thanhtungty@gmail.com
 * Sep 11, 2008  
 */
@ComponentConfig(template = "app:/groovy/applicationregistry/webui/component/UIPortletInfo.gtmpl")
@Serialized
public class UIPortletInfo extends UIComponent
{

   private PortletExtra portlet_;

   public void setPortlet(PortletExtra portlet)
   {
      portlet_ = portlet;
   }

   public PortletExtra getPortlet()
   {
      return portlet_;
   }

}
