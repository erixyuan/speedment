/**
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.codegen.model;

import com.speedment.common.codegen.internal.model.JavadocTagImpl;
import com.speedment.common.codegen.model.trait.HasCall;
import com.speedment.common.codegen.model.trait.HasCopy;
import com.speedment.common.codegen.model.trait.HasImports;
import com.speedment.common.codegen.model.trait.HasName;

import java.util.Optional;

/**
 * A model that represents a specific tag in a {@link Javadoc} block.
 *
 * @see Javadoc
 *
 * @author Emil Forslund
 * @since  2.0
 */
public interface JavadocTag
extends HasCopy<JavadocTag>,
        HasName<JavadocTag>,
        HasImports<JavadocTag>,
        HasCall<JavadocTag> {

    /**
     * Sets the value of this javadoc tag. In the following examples, the value
     * is the "foo" part:
     * <pre>
     *     &#64;param foo bar
     *     &#64;return foo
     * </pre>
     *
     * @param value the new value
     * @return a reference to this model
     */
    JavadocTag setValue(String value);

    /**
     * Returns the value of this javadoc tag. In the following examples, the
     * value is the "foo" part:
     * <pre>
     *     &#64;param foo bar
     *     &#64;return foo
     * </pre>
     *
     * @return the value part of the tag or <code>empty</code> if none exists
     */
    Optional<String> getValue();

    /**
     * Sets the text of this javadoc tag. In the following examples, the text is
     * the "bar" part:
     * <pre>
     *     &#64;param foo bar
     *     &#64;return foo
     * </pre>
     *
     * @param text the new text
     * @return a reference to this model
     */
    JavadocTag setText(String text);

    /**
     * Returns the text of this javadoc tag. In the following examples, the text
     * is the "bar" part:
     * <pre>
     *     &#64;param foo bar
     *     &#64;return foo
     * </pre>
     *
     * @return the text part of the tag or <code>empty</code> if none exists
     */
    Optional<String> getText();

    /**
     * Creates a new instance implementing this interface by using the default
     * implementation.
     *
     * @param name the name
     * @return the new instance
     */
    static JavadocTag of(String name) {
        return new JavadocTagImpl(name);
    }

    /**
     * Creates a new instance implementing this interface by using the default
     * implementation.
     *
     * @param name the name
     * @param text the text
     * @return the new instance
     */
    static JavadocTag of(String name, String text) {
        return of(name).setText(text);
    }

    /**
     * Creates a new instance implementing this interface by using the default
     * implementation.
     *
     * @param name the name
     * @param value the value
     * @param text the text
     * @return the new instance
     */
    static JavadocTag of(String name, String value, String text) {
        return of(name).setValue(value).setText(text);
    }
}