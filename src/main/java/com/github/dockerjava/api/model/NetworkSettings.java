/*
 * Created on 16.01.2016
 */
package com.github.dockerjava.api.model;

import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.core.RemoteApiVersion;

import javax.annotation.CheckForNull;

/**
 *
 * @author Marcus Linke
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetworkSettings {

    @JsonProperty("Bridge")
    private String bridge;

    @JsonProperty("SandboxID")
    private String sandboxId;

    @JsonProperty("HairpinMode")
    private Boolean hairpinMode;

    @JsonProperty("LinkLocalIPv6Address")
    private String linkLocalIPv6Address;

    @JsonProperty("LinkLocalIPv6PrefixLen")
    private Integer linkLocalIPv6PrefixLen;

    @JsonProperty("Ports")
    private Ports ports;

    @JsonProperty("SandboxKey")
    private String sandboxKey;

    @JsonProperty("SecondaryIPAddresses")
    private Object secondaryIPAddresses;

    @JsonProperty("SecondaryIPv6Addresses")
    private Object secondaryIPv6Addresses;

    @JsonProperty("EndpointID")
    private String endpointID;

    @JsonProperty("Gateway")
    private String gateway;

    @JsonProperty("PortMapping")
    private Map<String, Map<String, String>> portMapping;

    @JsonProperty("GlobalIPv6Address")
    private String globalIPv6Address;

    @JsonProperty("GlobalIPv6PrefixLen")
    private Integer globalIPv6PrefixLen;

    @JsonProperty("IPAddress")
    private String ipAddress;

    @JsonProperty("IPPrefixLen")
    private Integer ipPrefixLen;

    @JsonProperty("IPv6Gateway")
    private String ipV6Gateway;

    @JsonProperty("MacAddress")
    private String macAddress;

    @JsonProperty("Networks")
    private Map<String, Network> networks;

    /**
     * @deprecated since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @deprecated since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Integer getIpPrefixLen() {
        return ipPrefixLen;
    }

    /**
     * @deprecated since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getGateway() {
        return gateway;
    }

    public String getBridge() {
        return bridge;
    }

    /**
     * @deprecated since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Map<String, Map<String, String>> getPortMapping() {
        return portMapping;
    }

    /**
     * @deprecated since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getMacAddress() {
        return macAddress;
    }

    public Ports getPorts() {
        return ports;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getEndpointID() {
        return endpointID;
    }

    public String getIpV6Gateway() {
        return ipV6Gateway;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Map<String, Network> getNetworks() {
        return networks;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getSandboxId() {
        return sandboxId;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getSandboxKey() {
        return sandboxKey;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Object getSecondaryIPAddresses() {
        return secondaryIPAddresses;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Object getSecondaryIPv6Addresses() {
        return secondaryIPv6Addresses;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Boolean getHairpinMode() {
        return hairpinMode;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getLinkLocalIPv6Address() {
        return linkLocalIPv6Address;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Integer getLinkLocalIPv6PrefixLen() {
        return linkLocalIPv6PrefixLen;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public String getGlobalIPv6Address() {
        return globalIPv6Address;
    }

    /**
     * @since {@link RemoteApiVersion#VERSION_1_21}
     */
    public Integer getGlobalIPv6PrefixLen() {
        return globalIPv6PrefixLen;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Network {

        @JsonProperty("IPAMConfig")
        private String ipamConfig;

        /**
         * @since {@link RemoteApiVersion#VERSION_1_22}
         */
        @JsonProperty("NetworkID")
        private String networkID;

        @JsonProperty("EndpointID")
        private String endpointId;

        @JsonProperty("Gateway")
        private String gateway;

        @JsonProperty("IPAddress")
        private String ipAddress;

        @JsonProperty("IPPrefixLen")
        private Integer ipPrefixLen;

        @JsonProperty("IPv6Gateway")
        private String ipV6Gateway;

        @JsonProperty("GlobalIPv6Address")
        private String globalIPv6Address;

        @JsonProperty("GlobalIPv6PrefixLen")
        private Integer globalIPv6PrefixLen;

        @JsonProperty("MacAddress")
        private String macAddress;

        @CheckForNull
        public String getNetworkID() {
            return networkID;
        }

        public String getEndpointId() {
            return endpointId;
        }

        public String getGateway() {
            return gateway;
        }

        public String getIpAddress() {
            return ipAddress;
        }

        public Integer getIpPrefixLen() {
            return ipPrefixLen;
        }

        public String getIpV6Gateway() {
            return ipV6Gateway;
        }

        public String getGlobalIPv6Address() {
            return globalIPv6Address;
        }

        public Integer getGlobalIPv6PrefixLen() {
            return globalIPv6PrefixLen;
        }

        public String getMacAddress() {
            return macAddress;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }
}
