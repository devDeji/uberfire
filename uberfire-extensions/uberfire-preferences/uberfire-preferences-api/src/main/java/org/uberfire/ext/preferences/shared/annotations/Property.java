/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.preferences.shared.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.uberfire.ext.preferences.shared.PropertyFormType;

/**
 * Annotation used to mark preference beans properties.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Property {

    /**
     * Defines the type of field to be used in the default form. The default is TEXT.
     * You should only specify this if you are using the default form for preferences
     * edition, otherwise it will have no effect.
     * @return The property type to be used.
     */
    PropertyFormType formType() default PropertyFormType.TEXT;

    /**
     * Defines whether or not this property should be inherited by sub types. Defaults to false.
     * @return The property inheritance strategy.
     */
    boolean inherited() default false;

    /**
     * Defines a bundle key that will be used to internationalize the property's label wherever
     * its necessary. It's expected that the TranslationService will have access to the key
     * translation.
     * @return The property bundle key.
     */
    String bundleKey() default "";
}
