package har2jmeter

class JMeterHttpSampler {

    URL url

    String method

    String postData

    Map headers = [:]

    Map jsonPPs = [:]

    Map arguments = [:]

    def getPort() {
        url.port != -1 ? url.port : ("HTTPS".equalsIgnoreCase(url.protocol) ? 443 : 80)
    }

    def getDomain() {
        url.host
    }

    def getProtocol() {
        url.protocol
    }

    def getPath() {
        url.path
    }

}

class JMeterBlock {
    String condition
    int loopCount
    String loopData
    Boolean repeatData
    // JMeterHttpSampler[] jmeterSamplers;
    List <JMeterHttpSampler> jmeterSamplers
}
