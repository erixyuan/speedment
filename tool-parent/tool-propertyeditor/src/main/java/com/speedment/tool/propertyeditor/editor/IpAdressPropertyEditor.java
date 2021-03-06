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
package com.speedment.tool.propertyeditor.editor;

import com.speedment.tool.config.DbmsProperty;
import com.speedment.tool.propertyeditor.PropertyEditor;
import com.speedment.tool.propertyeditor.item.DefaultTextFieldItem;
import javafx.beans.property.SimpleStringProperty;

import java.util.stream.Stream;

/**
 *
 * @param <T>  the document type
 * 
 * @author  Simon Jonasson
 * @since   3.0.0
 */
public class IpAdressPropertyEditor<T extends DbmsProperty> implements PropertyEditor<T> {

    @Override
    public Stream<Item> fieldsFor(T document) {
        return Stream.of(new DefaultTextFieldItem(
            "IP Adress", 
            new SimpleStringProperty("127.0.0.1"), 
            document.ipAddressProperty(), 
            "The IP Address of the database host."
        ));
    }
}