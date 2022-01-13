import java.io.*;
import java.net.*;
/**
 * Beschreiben Sie hier die Klasse Client.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Server
{
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private String prefix = "Client: ";
    private List<String> netzbegriffeList= new List<String>();
    private static Reader reader = new Reader();
    public Server()
    {

    }

    public void start(int port) {

        reader.main(netzbegriffeList);

        while(true) {
            try {

                serverSocket = new ServerSocket(port);
                clientSocket = serverSocket.accept();
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));



                    String message = in.readLine();

                if(message != null || message != "") {
                    if("ip-adresse".equals(message.toLowerCase())) {
                        out.println("Eine IP-Adresse ist eine individuelle Adresse, die ein Gerät im Internet oder auf einem lokalen Netzwerk identifiziert. IP steht für „Internetprotokoll“, wobei es sich um einen Satz von Regeln handelt");
                        System.out.println(prefix + message);
                    }
                    else if("mac-adresse".equals(message.toLowerCase())) {
                        out.println("Die MAC-Adresse ist die Hardware-Adresse jedes einzelnen Netzadapters, die als eindeutiger Identifikator des Geräts in einem Rechnernetz dient. Man spricht auch von physischer Adresse oder Geräteadresse. Bei Apple wird sie auch Ethernet-ID, Airport-ID oder Wi-Fi-Adresse genannt, bei Microsoft Physikalische Adresse");
                        System.out.println(prefix + message);
                    }
                    else if("dns-server".equals(message.toLowerCase())) {
                        out.println("Als Standardgateway, manchmal auch nur Gateway oder Default-Gateway genannt, wird in IP-Umgebungen ein Router bezeichnet, an welchen alle IP-Pakete weitergeleitet werden, für die keine anderen Routing-Informationen gefunden wurden");
                    }
                    else if("ethernet".equals(message.toLowerCase())) {
                        out.println("Das Ethernet bezeichnet eine Technik für kabelgebundene Datennetze, die Software und/oder Hardware miteinander verbindet. Das geschieht meist über LAN-Kabel, deshalb wird Ethernet auch häufig als LAN-Technik angeführt. Ethernet erlaubt so den Datenaustausch zwischen Endgeräten");
                    }
                    else if("netzmaske".equals(message.toLowerCase())) {
                        out.println("Die Netzmaske, Netzwerkmaske oder Subnetzmaske legt in Rechnernetzen in Verbindung mit der IP-Adresse fest, welche IP-Adressen ein Gerät im eigenen Netz ohne die Zuhilfenahme eines Routers erreichen kann und für welche Zielnetze das Gerät Datenpakete an einen Router zwecks weiterer Vermittlung in andere Netze zustellen muss");
                    }
                    else if("gateway".equals(message.toLowerCase())) {
                        out.println("Das Wort Gateway [ˈgeɪtweɪ] (englisch für Ausfahrt und Einfahrt, wörtlich Torweg) bezeichnet in der Informatik eine Komponente (Hard- oder Software), welche zwischen zwei Systemen eine Verbindung herstellt. Ein IT-System, das seinen Kommunikationspartner nicht direkt kennt, wendet sich an sein Gateway. Das Gateway stellt die Brücke zur Kommunikation zwischen mehreren internen oder auch externen Netzwerkabschnitten dar");
                    }
                    else if("webadresse".equals(message.toLowerCase())) {
                        out.println("Eine Internetadresse, auch Domain oder URL genannt, ist eine Adresse, unter der Ihr Unternehmen im Internet gefunden werden kann. Jedes Land besitzt eine zentrale Registrierungsstelle, wo die Webadresse angemeldet wird");
                    }
                    else if("switch".equals(message.toLowerCase())) {
                        out.println("Switch (vom Englischen für „Schalter“, „Umschalter“ oder „Weiche“, auch Netzwerkweiche oder Verteiler genannt) bezeichnet ein Kopplungselement in Rechnernetzen, das Netzwerksegmente miteinander verbindet");
                    }
                    else if("server".equals(message.toLowerCase())) {
                        out.println("In der Informatik ist ein Server (englisch server, wörtlich Diener oder Bediensteter, im weiteren Sinn auch Dienst[1][2]) ein Computerprogramm oder ein Gerät, welches Funktionalitäten, Dienstprogramme, Daten oder andere Ressourcen bereitstellt, damit andere Computer oder Programme („Clients“) darauf zugreifen können, meist über ein Netzwerk");
                    }
                    else if("client".equals(message.toLowerCase())) {
                        out.println("Ein Client (über englisch client aus lateinisch cliens wörtlich für „Klient“ oder „Kunde“)[1] – auch clientseitige Anwendung, Clientanwendung oder Clientprogramm – bezeichnet ein Computerprogramm, das auf dem Endgerät eines Netzwerks ausgeführt wird und mit einem Server (Zentralrechner) kommuniziert. Man nennt auch ein Endgerät selbst, das Dienste von einem Server abruft, Client");
                    }
                    else if("router".equals(message.toLowerCase())) {
                        out.println("Router (['ruːtə(r)] oder ['raʊ̯tər]) oder Netzwerkrouter sind Netzwerkgeräte, die Netzwerkpakete zwischen mehreren Rechnernetzen weiterleiten können. Sie werden am häufigsten zur Internetanbindung, zur sicheren Kopplung mehrerer Standorte (Virtual Private Network) oder zur direkten Kopplung mehrerer lokaler Netzwerksegmente, gegebenenfalls mit Anpassung an unterschiedliche Netzwerktechniken (Ethernet, DSL, PPPoE, ISDN, ATM etc.) eingesetzt.");
                    }
                    else if("netzwerk".equals(message.toLowerCase())) {
                        out.println("In der Informationstechnologie bezeichnet ein Netzwerk die Verbindung von mindestens zwei Computersystemen, entweder per Kabel oder drahtlos über eine Funkverbindung. Das einfachste Netzwerk ist der Zusammenschluss von zwei Computern, die mit einem Kabel verbunden werden");
                    }
                    else if("lan".equals(message.toLowerCase())) {
                        out.println("Ein Local Area Network (englische Aussprache [ləʊkl ˈɛəɹɪə ˈnɛtwɜːk], zu Deutsch lokales oder örtliches Netzwerk), kurz LAN, ist ein Rechnernetz, das die Ausdehnung von Personal Area Networks übertrifft, die Ausdehnung von Metropolitan Area Networks, Wide Area Networks und Global Area Networks aber nicht erreicht. Ein LAN wird z. B. in Heimnetzen oder Unternehmen eingesetzt");
                    }
                    else if("gan".equals(message.toLowerCase())) {
                        out.println("Unter einem Global Area Network (GAN) versteht man ein Netz, das über unbegrenzte geographische Entfernungen mehrere Wide Area Networks verbinden kann. Dies kann zum Beispiel die Vernetzung weltweiter Standorte eines internationalen Unternehmens sein. Oft wird bei einem GAN Satelliten- oder Glasfaserübertragung eingesetzt");
                    }
                    else if("tcp".equals(message.toLowerCase())) {
                        out.println("Das englisch Transmission Control Protocol (TCP, deutsch Übertragungssteuerungsprotokoll) ist ein Netzwerkprotokoll, das definiert, auf welche Art und Weise Daten zwischen Netzwerkkomponenten ausgetauscht werden sollen");
                    }
                    else if("ram".equals(message.toLowerCase())) {
                        out.println("Random-Access Memory (der oder das;[1] englisch random[-]access memory, zu Deutsch: „Speicher mit wahlfreiem/direktem Zugriff“ = Direktzugriffsspeicher), abgekürzt RAM, ist ein Datenspeicher, der besonders bei Computern als Arbeitsspeicher Verwendung findet, meist in Form von mehreren Speicherbausteinen auf einem Speichermodul");
                    }
                    else if("wlan".equals(message.toLowerCase())) {
                        out.println("WLAN steht für Wireless Local Area Network, also ein drahtloses lokales Netzwerk. Das W weist darauf hin, dass die Verbindung zum Internet ohne Kabel möglich ist. Anders als beim LAN wird der Router per Funksignal mit dem Computer oder Smartphone verbunden - ganz ohne ein Kabel");
                    }
                    else if("https".equals(message.toLowerCase())) {
                        out.println("HTTPS (HyperText Transfer Protocol Secure) ist ein Internetkommunikationsprotokoll, das die Integrität und Vertraulichkeit des Datenverkehrs zwischen dem Computer des Nutzers und der Website schützt. Nutzer erwarten eine sichere Umgebung, wenn sie eine Website verwenden");
                    }
                    else if("css".equals(message.toLowerCase())) {
                        out.println("CSS (engl.: Cascading Style Sheets = gestufte Gestaltungsbögen) ist die Sprache, die Sie benutzen, um Ihre Webseite zu gestalten");
                    }
                    else {
                        out.println("Bitte wähle eine der angegebenen Optionen");
                        System.err.println("Client issued a non-valid command; " + message);
                    }


                }

            }
            catch (IOException e) {
                stop();
                System.out.println("Error: " + e);
            }
        }
    }

    public void stop() {
        try {
            in.close();
            out.close();
            serverSocket.close();
            clientSocket.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start(6666);
    }
}
