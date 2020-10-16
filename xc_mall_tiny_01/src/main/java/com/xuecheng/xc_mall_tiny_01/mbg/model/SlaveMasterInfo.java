package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.io.Serializable;

public class SlaveMasterInfo implements Serializable {
    /**
     * The channel on which the slave is connected to a source. Used in Multisource Replication
     *
     * @mbggenerated
     */
    private String channelName;

    /**
     * Number of lines in the file.
     *
     * @mbggenerated
     */
    private Integer numberOfLines;

    /**
     * The master log position of the last read event.
     *
     * @mbggenerated
     */
    private Long masterLogPos;

    /**
     * The host name of the master.
     *
     * @mbggenerated
     */
    private String host;

    /**
     * The network port used to connect to the master.
     *
     * @mbggenerated
     */
    private Integer port;

    /**
     * The period (in seconds) that the slave will wait before trying to reconnect to the master.
     *
     * @mbggenerated
     */
    private Integer connectRetry;

    /**
     * Indicates whether the server supports SSL connections.
     *
     * @mbggenerated
     */
    private Boolean enabledSsl;

    /**
     * Whether to verify the server certificate.
     *
     * @mbggenerated
     */
    private Boolean sslVerifyServerCert;

    private Float heartbeat;

    /**
     * Number of reconnect attempts, to the master, before giving up.
     *
     * @mbggenerated
     */
    private Long retryCount;

    /**
     * Indicates whether GTIDs will be used to retrieve events from the master.
     *
     * @mbggenerated
     */
    private Boolean enabledAutoPosition;

    /**
     * Preference to get public key from master.
     *
     * @mbggenerated
     */
    private Boolean getPublicKey;

    /**
     * The name of the master binary log currently being read from the master.
     *
     * @mbggenerated
     */
    private String masterLogName;

    /**
     * The user name used to connect to the master.
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * The password used to connect to the master.
     *
     * @mbggenerated
     */
    private String userPassword;

    /**
     * The file used for the Certificate Authority (CA) certificate.
     *
     * @mbggenerated
     */
    private String sslCa;

    /**
     * The path to the Certificate Authority (CA) certificates.
     *
     * @mbggenerated
     */
    private String sslCapath;

    /**
     * The name of the SSL certificate file.
     *
     * @mbggenerated
     */
    private String sslCert;

    /**
     * The name of the cipher in use for the SSL connection.
     *
     * @mbggenerated
     */
    private String sslCipher;

    /**
     * The name of the SSL key file.
     *
     * @mbggenerated
     */
    private String sslKey;

    /**
     * Displays which interface is employed when connecting to the MySQL server
     *
     * @mbggenerated
     */
    private String bind;

    /**
     * The number of server IDs to be ignored, followed by the actual server IDs
     *
     * @mbggenerated
     */
    private String ignoredServerIds;

    /**
     * The master server uuid.
     *
     * @mbggenerated
     */
    private String uuid;

    /**
     * The file used for the Certificate Revocation List (CRL)
     *
     * @mbggenerated
     */
    private String sslCrl;

    /**
     * The path used for Certificate Revocation List (CRL) files
     *
     * @mbggenerated
     */
    private String sslCrlpath;

    /**
     * Tls version
     *
     * @mbggenerated
     */
    private String tlsVersion;

    /**
     * The file containing public key of master server.
     *
     * @mbggenerated
     */
    private String publicKeyPath;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public Long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getConnectRetry() {
        return connectRetry;
    }

    public void setConnectRetry(Integer connectRetry) {
        this.connectRetry = connectRetry;
    }

    public Boolean getEnabledSsl() {
        return enabledSsl;
    }

    public void setEnabledSsl(Boolean enabledSsl) {
        this.enabledSsl = enabledSsl;
    }

    public Boolean getSslVerifyServerCert() {
        return sslVerifyServerCert;
    }

    public void setSslVerifyServerCert(Boolean sslVerifyServerCert) {
        this.sslVerifyServerCert = sslVerifyServerCert;
    }

    public Float getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Float heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Long getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
    }

    public Boolean getEnabledAutoPosition() {
        return enabledAutoPosition;
    }

    public void setEnabledAutoPosition(Boolean enabledAutoPosition) {
        this.enabledAutoPosition = enabledAutoPosition;
    }

    public Boolean getGetPublicKey() {
        return getPublicKey;
    }

    public void setGetPublicKey(Boolean getPublicKey) {
        this.getPublicKey = getPublicKey;
    }

    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getSslCa() {
        return sslCa;
    }

    public void setSslCa(String sslCa) {
        this.sslCa = sslCa;
    }

    public String getSslCapath() {
        return sslCapath;
    }

    public void setSslCapath(String sslCapath) {
        this.sslCapath = sslCapath;
    }

    public String getSslCert() {
        return sslCert;
    }

    public void setSslCert(String sslCert) {
        this.sslCert = sslCert;
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    public String getSslKey() {
        return sslKey;
    }

    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    public String getIgnoredServerIds() {
        return ignoredServerIds;
    }

    public void setIgnoredServerIds(String ignoredServerIds) {
        this.ignoredServerIds = ignoredServerIds;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSslCrl() {
        return sslCrl;
    }

    public void setSslCrl(String sslCrl) {
        this.sslCrl = sslCrl;
    }

    public String getSslCrlpath() {
        return sslCrlpath;
    }

    public void setSslCrlpath(String sslCrlpath) {
        this.sslCrlpath = sslCrlpath;
    }

    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", numberOfLines=").append(numberOfLines);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", connectRetry=").append(connectRetry);
        sb.append(", enabledSsl=").append(enabledSsl);
        sb.append(", sslVerifyServerCert=").append(sslVerifyServerCert);
        sb.append(", heartbeat=").append(heartbeat);
        sb.append(", retryCount=").append(retryCount);
        sb.append(", enabledAutoPosition=").append(enabledAutoPosition);
        sb.append(", getPublicKey=").append(getPublicKey);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", sslCa=").append(sslCa);
        sb.append(", sslCapath=").append(sslCapath);
        sb.append(", sslCert=").append(sslCert);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", sslKey=").append(sslKey);
        sb.append(", bind=").append(bind);
        sb.append(", ignoredServerIds=").append(ignoredServerIds);
        sb.append(", uuid=").append(uuid);
        sb.append(", sslCrl=").append(sslCrl);
        sb.append(", sslCrlpath=").append(sslCrlpath);
        sb.append(", tlsVersion=").append(tlsVersion);
        sb.append(", publicKeyPath=").append(publicKeyPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}