/**
 * Copyright (c) Codice Foundation
 * 
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 * 
 **/
package org.codice.ddf.commands.catalog;

import org.apache.felix.gogo.commands.Command;

import ddf.catalog.util.Describable;

@Command(scope = CatalogCommands.NAMESPACE, name = "describe", description = "Provides a basic description of the Catalog implementation.")
public class DescribeCommand extends CatalogCommands {

    @Override
    protected Object doExecute() throws Exception {
        Describable catalog = getCatalog();

        System.out.printf("%s=%s%n", "title", catalog.getTitle());
        System.out.printf("%s=%s%n", "description", catalog.getDescription());
        System.out.printf("%s=%s%n", "id", catalog.getId());
        System.out.printf("%s=%s%n", "version", catalog.getVersion());

        return null;
    }
}
