// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.classification._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.classification._03._Classification4Soap_GetNodesXml;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _Classification4Soap_GetNodesXml
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String[] nodeUris;
    protected boolean childNodes;

    public _Classification4Soap_GetNodesXml()
    {
        super();
    }

    public _Classification4Soap_GetNodesXml(
        final String[] nodeUris,
        final boolean childNodes)
    {
        // TODO : Call super() instead of setting all fields directly?
        setNodeUris(nodeUris);
        setChildNodes(childNodes);
    }

    public String[] getNodeUris()
    {
        return this.nodeUris;
    }

    public void setNodeUris(String[] value)
    {
        this.nodeUris = value;
    }

    public boolean isChildNodes()
    {
        return this.childNodes;
    }

    public void setChildNodes(boolean value)
    {
        this.childNodes = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.nodeUris != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("nodeUris");

            for (int iterator0 = 0; iterator0 < this.nodeUris.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.nodeUris[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "childNodes",
            this.childNodes);

        writer.writeEndElement();
    }
}