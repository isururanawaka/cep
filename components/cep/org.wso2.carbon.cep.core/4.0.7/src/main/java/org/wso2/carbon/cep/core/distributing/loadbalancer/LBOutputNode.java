package org.wso2.carbon.cep.core.distributing.loadbalancer;


public class LBOutputNode {

  private  String ip;
  private String port;


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
