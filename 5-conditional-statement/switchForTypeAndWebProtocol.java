public class switchForTypeAndWebProtocol {
    public static void main(String[] args) {
        String url = "https://www.google.com";
        String protocol = url.substring(0, url.indexOf(":"));
        String type = url.substring(url.lastIndexOf(".") + 1);
        //  lastIndexOf search for the last occurence
        //  +1 because we want to extract the words after the periodt (move to the next)

        switch (type) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "edu":
                System.out.println("Education");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

        switch (protocol) {
            case "http":
                System.out.println("Hypertext Transfer Protocol");
                break;
            case "ftp":
                System.out.println("File Transfer Protocol");
                break;
            case "https":
                System.out.println("Hypertext Transfer Protocol Secure");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
