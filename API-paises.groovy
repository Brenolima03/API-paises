import groovy.json.JsonSlurper

def sc = new Scanner(System.in)
print "Digite o país: "
def pais = sc.nextLine()

try {
    // faz a requisição ao serviço restcountries
    def jsonObj = new JsonSlurper().parseText(new URL("https://restcountries.com/v3.1/name/${pais}").text)
    println jsonObj

} catch (e) {
    // trata o erro de requisição
    println e.message
}
