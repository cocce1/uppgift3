package code;


import code.proxy.ReverseProxyServer;

public class Main {
    public static void main(String[] args) {

        new ReverseProxyServer(8080).start();
    }
}