// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.ws._AccessControlEntryDetails;
import ms.ws._AccessControlListDetails;
import ms.ws._AceExtendedInformation;
import ms.ws._ActionDefinition;
import ms.ws._IdentityDescriptor;
import ms.ws._SecurityNamespaceDescription;
import ms.ws._SecurityWebServiceSoap_CreateSecurityNamespace;
import ms.ws._SecurityWebServiceSoap_CreateSecurityNamespaceResponse;
import ms.ws._SecurityWebServiceSoap_DeleteSecurityNamespace;
import ms.ws._SecurityWebServiceSoap_DeleteSecurityNamespaceResponse;
import ms.ws._SecurityWebServiceSoap_HasPermissionByDescriptorList;
import ms.ws._SecurityWebServiceSoap_HasPermissionByDescriptorListResponse;
import ms.ws._SecurityWebServiceSoap_HasPermissionByPermissionsList;
import ms.ws._SecurityWebServiceSoap_HasPermissionByPermissionsListResponse;
import ms.ws._SecurityWebServiceSoap_HasPermissionByTokenList;
import ms.ws._SecurityWebServiceSoap_HasPermissionByTokenListResponse;
import ms.ws._SecurityWebServiceSoap_HasWritePermission;
import ms.ws._SecurityWebServiceSoap_HasWritePermissionResponse;
import ms.ws._SecurityWebServiceSoap_QueryPermissions;
import ms.ws._SecurityWebServiceSoap_QueryPermissionsResponse;
import ms.ws._SecurityWebServiceSoap_QuerySecurityNamespaces;
import ms.ws._SecurityWebServiceSoap_QuerySecurityNamespacesResponse;
import ms.ws._SecurityWebServiceSoap_RemoveAccessControlEntries;
import ms.ws._SecurityWebServiceSoap_RemoveAccessControlEntriesResponse;
import ms.ws._SecurityWebServiceSoap_RemoveAccessControlList;
import ms.ws._SecurityWebServiceSoap_RemoveAccessControlListResponse;
import ms.ws._SecurityWebServiceSoap_RemovePermissions;
import ms.ws._SecurityWebServiceSoap_RemovePermissionsResponse;
import ms.ws._SecurityWebServiceSoap_SetAccessControlList;
import ms.ws._SecurityWebServiceSoap_SetAccessControlListResponse;
import ms.ws._SecurityWebServiceSoap_SetInheritFlag;
import ms.ws._SecurityWebServiceSoap_SetInheritFlagResponse;
import ms.ws._SecurityWebServiceSoap_SetPermissions;
import ms.ws._SecurityWebServiceSoap_SetPermissionsResponse;

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
 * {http://microsoft.com/webservices/}SecurityWebServiceSoap12Service
 */
public class _SecurityWebServiceSoap12Service
    extends SOAP12Service
    implements _SecurityWebServiceSoap
{
    private static final QName PORT_QNAME = new QName("http://microsoft.com/webservices/",
            "SecurityWebServiceSoap12Service");
    private static final String ENDPOINT_PATH = "/tfs/TeamFoundation/Administration/v3.0/SecurityService.asmx";

    public _SecurityWebServiceSoap12Service(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _SecurityWebServiceSoap12Service(
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
        return _SecurityWebServiceSoap12Service.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _SecurityWebServiceSoap12Service.ENDPOINT_PATH;
    }

    public void createSecurityNamespace(final _SecurityNamespaceDescription description)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_CreateSecurityNamespace requestData = new _SecurityWebServiceSoap_CreateSecurityNamespace(
                    description);

        final SOAPRequest request = createSOAPRequest(
                "CreateSecurityNamespace",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "CreateSecurityNamespace");
                    }
                });

        final _SecurityWebServiceSoap_CreateSecurityNamespaceResponse responseData = new _SecurityWebServiceSoap_CreateSecurityNamespaceResponse();

        executeSOAPRequest(
            request,
            "CreateSecurityNamespaceResponse",
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
    }

    public void deleteSecurityNamespace(final String namespaceId)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_DeleteSecurityNamespace requestData = new _SecurityWebServiceSoap_DeleteSecurityNamespace(
                    namespaceId);

        final SOAPRequest request = createSOAPRequest(
                "DeleteSecurityNamespace",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "DeleteSecurityNamespace");
                    }
                });

        final _SecurityWebServiceSoap_DeleteSecurityNamespaceResponse responseData = new _SecurityWebServiceSoap_DeleteSecurityNamespaceResponse();

        executeSOAPRequest(
            request,
            "DeleteSecurityNamespaceResponse",
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
    }

    public _SecurityNamespaceDescription[] querySecurityNamespaces(final String namespaceId)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_QuerySecurityNamespaces requestData = new _SecurityWebServiceSoap_QuerySecurityNamespaces(
                    namespaceId);

        final SOAPRequest request = createSOAPRequest(
                "QuerySecurityNamespaces",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QuerySecurityNamespaces");
                    }
                });

        final _SecurityWebServiceSoap_QuerySecurityNamespacesResponse responseData = new _SecurityWebServiceSoap_QuerySecurityNamespacesResponse();

        executeSOAPRequest(
            request,
            "QuerySecurityNamespacesResponse",
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

        return responseData.getQuerySecurityNamespacesResult();
    }

    public boolean removeAccessControlList(
        final String namespaceId,
        final String[] tokens,
        final boolean recurse)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_RemoveAccessControlList requestData = new _SecurityWebServiceSoap_RemoveAccessControlList(
                    namespaceId,
                    tokens,
                    recurse);

        final SOAPRequest request = createSOAPRequest(
                "RemoveAccessControlList",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveAccessControlList");
                    }
                });

        final _SecurityWebServiceSoap_RemoveAccessControlListResponse responseData = new _SecurityWebServiceSoap_RemoveAccessControlListResponse();

        executeSOAPRequest(
            request,
            "RemoveAccessControlListResponse",
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

        return responseData.isRemoveAccessControlListResult();
    }

    public boolean removeAccessControlEntries(
        final String namespaceId,
        final String token,
        final _IdentityDescriptor[] identities)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_RemoveAccessControlEntries requestData = new _SecurityWebServiceSoap_RemoveAccessControlEntries(
                    namespaceId,
                    token,
                    identities);

        final SOAPRequest request = createSOAPRequest(
                "RemoveAccessControlEntries",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveAccessControlEntries");
                    }
                });

        final _SecurityWebServiceSoap_RemoveAccessControlEntriesResponse responseData = new _SecurityWebServiceSoap_RemoveAccessControlEntriesResponse();

        executeSOAPRequest(
            request,
            "RemoveAccessControlEntriesResponse",
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

        return responseData.isRemoveAccessControlEntriesResult();
    }

    public _AccessControlEntryDetails[] setPermissions(
        final String namespaceId,
        final String token,
        final _AccessControlEntryDetails[] accessControlEntries,
        final boolean merge)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_SetPermissions requestData = new _SecurityWebServiceSoap_SetPermissions(namespaceId,
                token,
                accessControlEntries,
                merge);

        final SOAPRequest request = createSOAPRequest(
                "SetPermissions",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SetPermissions");
                    }
                });

        final _SecurityWebServiceSoap_SetPermissionsResponse responseData = new _SecurityWebServiceSoap_SetPermissionsResponse();

        executeSOAPRequest(
            request,
            "SetPermissionsResponse",
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

        return responseData.getSetPermissionsResult();
    }

    public void setAccessControlList(
        final String namespaceId,
        final _AccessControlListDetails[] accessControlLists)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_SetAccessControlList requestData = new _SecurityWebServiceSoap_SetAccessControlList(
                    namespaceId,
                    accessControlLists);

        final SOAPRequest request = createSOAPRequest(
                "SetAccessControlList",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SetAccessControlList");
                    }
                });

        final _SecurityWebServiceSoap_SetAccessControlListResponse responseData = new _SecurityWebServiceSoap_SetAccessControlListResponse();

        executeSOAPRequest(
            request,
            "SetAccessControlListResponse",
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
    }

    public _AccessControlListDetails[] queryPermissions(
        final String namespaceId,
        final String token,
        final _IdentityDescriptor[] identities,
        final boolean includeExtendedInfo,
        final boolean recurse)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_QueryPermissions requestData = new _SecurityWebServiceSoap_QueryPermissions(
                    namespaceId,
                    token,
                    identities,
                    includeExtendedInfo,
                    recurse);

        final SOAPRequest request = createSOAPRequest(
                "QueryPermissions",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryPermissions");
                    }
                });

        final _SecurityWebServiceSoap_QueryPermissionsResponse responseData = new _SecurityWebServiceSoap_QueryPermissionsResponse();

        executeSOAPRequest(
            request,
            "QueryPermissionsResponse",
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

        return responseData.getQueryPermissionsResult();
    }

    public void setInheritFlag(
        final String namespaceId,
        final String token,
        final boolean inherits)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_SetInheritFlag requestData = new _SecurityWebServiceSoap_SetInheritFlag(namespaceId,
                token,
                inherits);

        final SOAPRequest request = createSOAPRequest(
                "SetInheritFlag",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SetInheritFlag");
                    }
                });

        final _SecurityWebServiceSoap_SetInheritFlagResponse responseData = new _SecurityWebServiceSoap_SetInheritFlagResponse();

        executeSOAPRequest(
            request,
            "SetInheritFlagResponse",
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
    }

    public _AccessControlEntryDetails removePermissions(
        final String namespaceId,
        final String token,
        final _IdentityDescriptor descriptor,
        final int permissions)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_RemovePermissions requestData = new _SecurityWebServiceSoap_RemovePermissions(
                    namespaceId,
                    token,
                    descriptor,
                    permissions);

        final SOAPRequest request = createSOAPRequest(
                "RemovePermissions",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemovePermissions");
                    }
                });

        final _SecurityWebServiceSoap_RemovePermissionsResponse responseData = new _SecurityWebServiceSoap_RemovePermissionsResponse();

        executeSOAPRequest(
            request,
            "RemovePermissionsResponse",
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

        return responseData.getRemovePermissionsResult();
    }

    public boolean[] hasPermissionByTokenList(
        final String namespaceId,
        final String[] tokens,
        final _IdentityDescriptor descriptor,
        final int requestedPermissions,
        final boolean alwaysAllowAdministrators)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_HasPermissionByTokenList requestData = new _SecurityWebServiceSoap_HasPermissionByTokenList(
                    namespaceId,
                    tokens,
                    descriptor,
                    requestedPermissions,
                    alwaysAllowAdministrators);

        final SOAPRequest request = createSOAPRequest(
                "HasPermissionByTokenList",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "HasPermissionByTokenList");
                    }
                });

        final _SecurityWebServiceSoap_HasPermissionByTokenListResponse responseData = new _SecurityWebServiceSoap_HasPermissionByTokenListResponse();

        executeSOAPRequest(
            request,
            "HasPermissionByTokenListResponse",
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

        return responseData.getHasPermissionByTokenListResult();
    }

    public boolean[] hasPermissionByDescriptorList(
        final String namespaceId,
        final String token,
        final _IdentityDescriptor[] descriptors,
        final int requestedPermissions,
        final boolean alwaysAllowAdministrators)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_HasPermissionByDescriptorList requestData = new _SecurityWebServiceSoap_HasPermissionByDescriptorList(
                    namespaceId,
                    token,
                    descriptors,
                    requestedPermissions,
                    alwaysAllowAdministrators);

        final SOAPRequest request = createSOAPRequest(
                "HasPermissionByDescriptorList",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "HasPermissionByDescriptorList");
                    }
                });

        final _SecurityWebServiceSoap_HasPermissionByDescriptorListResponse responseData = new _SecurityWebServiceSoap_HasPermissionByDescriptorListResponse();

        executeSOAPRequest(
            request,
            "HasPermissionByDescriptorListResponse",
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

        return responseData.getHasPermissionByDescriptorListResult();
    }

    public boolean[] hasPermissionByPermissionsList(
        final String namespaceId,
        final String token,
        final _IdentityDescriptor descriptor,
        final int[] requestedPermissions,
        final boolean alwaysAllowAdministrators)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_HasPermissionByPermissionsList requestData = new _SecurityWebServiceSoap_HasPermissionByPermissionsList(
                    namespaceId,
                    token,
                    descriptor,
                    requestedPermissions,
                    alwaysAllowAdministrators);

        final SOAPRequest request = createSOAPRequest(
                "HasPermissionByPermissionsList",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "HasPermissionByPermissionsList");
                    }
                });

        final _SecurityWebServiceSoap_HasPermissionByPermissionsListResponse responseData = new _SecurityWebServiceSoap_HasPermissionByPermissionsListResponse();

        executeSOAPRequest(
            request,
            "HasPermissionByPermissionsListResponse",
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

        return responseData.getHasPermissionByPermissionsListResult();
    }

    public boolean[] hasWritePermission(
        final String namespaceId,
        final String token,
        final int[] requestedPermissions)
        throws TransportException, SOAPFault
    {
        final _SecurityWebServiceSoap_HasWritePermission requestData = new _SecurityWebServiceSoap_HasWritePermission(
                    namespaceId,
                    token,
                    requestedPermissions);

        final SOAPRequest request = createSOAPRequest(
                "HasWritePermission",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "HasWritePermission");
                    }
                });

        final _SecurityWebServiceSoap_HasWritePermissionResponse responseData = new _SecurityWebServiceSoap_HasWritePermissionResponse();

        executeSOAPRequest(
            request,
            "HasWritePermissionResponse",
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

        return responseData.getHasWritePermissionResult();
    }
}