/*
 * Copyright (c) 2002-2017 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.internal.kernel.api;

import java.util.Map;

import org.neo4j.internal.kernel.api.exceptions.KernelException;

/**
 * Operations for creating and modifying explicit indexes.
 */
public interface ExplicitIndexWrite
{
    /**
     * Removes a given node from an explicit index
     *
     * @param indexName The name of the index from which the node is to be removed.
     * @param node The node id of the node to remove
     */
    void nodeRemoveFromExplicitIndex( String indexName, long node ) throws KernelException;

    /**
     * Creates an explicit index in a separate transaction if not yet available.
     * @param indexName The name of the index to create.
     * @param customConfig The configuration of the explicit index.
     */
    void nodeExplicitIndexCreateLazily( String indexName, Map<String, String> customConfig );
}
