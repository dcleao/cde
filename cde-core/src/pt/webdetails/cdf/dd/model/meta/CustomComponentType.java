/*!
 * Copyright 2002 - 2017 Webdetails, a Pentaho company. All rights reserved.
 *
 * This software was developed by Webdetails and is provided under the terms
 * of the Mozilla Public License, Version 2.0, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 */

package pt.webdetails.cdf.dd.model.meta;

import pt.webdetails.cdf.dd.model.core.validation.ValidationException;

public final class CustomComponentType extends GenericComponentType {
  private CustomComponentType( Builder builder, IPropertyTypeSource propSource ) throws ValidationException {
    super( builder, propSource );
  }

  /**
   * Class to create and modify ComponentType instances.
   */
  public static final class Builder extends GenericComponentType.Builder {
    @Override
    public CustomComponentType build( IPropertyTypeSource propSource ) throws ValidationException {
      if ( propSource == null ) {
        throw new IllegalArgumentException( "propSource" );
      }

      return new CustomComponentType( this, propSource );
    }
  }
}
