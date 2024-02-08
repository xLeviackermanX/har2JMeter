package har2jmeter

class JMeterHttpSampler {

    URL url

    String name

    String method

    String postData

    Map headers = [:]

    Map jsonPPs = [:]

    Map xmlPPs = [:]

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

class ThreadGroup {
    String name
    int users
    int rampUpTime
    int duration
    int loopCount
}
