// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.services.registration._03;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.registration._03._FrameworkRegistrationEntry;
import ms.tfs.services.registration._03._OutboundLinkType;
import ms.tfs.services.registration._03._RegistrationArtifactType;
import ms.tfs.services.registration._03._RegistrationDatabase;
import ms.tfs.services.registration._03._RegistrationEventType;
import ms.tfs.services.registration._03._RegistrationExtendedAttribute2;
import ms.tfs.services.registration._03._RegistrationServiceInterface;
import ms.tfs.services.registration._03._RegistrationSoap_GetRegistrationEntries;
import ms.tfs.services.registration._03._RegistrationSoap_GetRegistrationEntriesResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.String;

import java.net.URI;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/Registration/03}RegistrationSoapService
 */
public class _RegistrationSoapService
    extends SOAP11Service
    implements _RegistrationSoap
{
    private static final QName PORT_QNAME = new QName(
                "http://schemas.microsoft.com/TeamFoundation/2005/06/Services/Registration/03",
                "RegistrationSoapService");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/Services/v1.0/Registration.asmx";

    public _RegistrationSoapService(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _RegistrationSoapService(
        final HttpClient client,
        URI endpoint,
        QName port)
    {
        super(client, endpoint, port);
    }

    /**
     * @return the qualified name of the WSDL port this service implementation can be used with
     */
    public static QName getPortQName()
    {
        return _RegistrationSoapService.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _RegistrationSoapService.ENDPOINT_PATH;
    }

    public _FrameworkRegistrationEntry[] getRegistrationEntries(final String toolId)
        throws TransportException, SOAPFault
    {
        final _RegistrationSoap_GetRegistrationEntries requestData = new _RegistrationSoap_GetRegistrationEntries(toolId);

        final SOAPRequest request = createSOAPRequest(
                "GetRegistrationEntries",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "GetRegistrationEntries");
                    }
                });

        final _RegistrationSoap_GetRegistrationEntriesResponse responseData = new _RegistrationSoap_GetRegistrationEntriesResponse();

        executeSOAPRequest(
            request,
            "GetRegistrationEntriesResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getGetRegistrationEntriesResult();
    }
}