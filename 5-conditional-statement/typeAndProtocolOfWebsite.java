public class typeAndProtocolOfWebsite {
    public static void main(String[] args) {
        String url = "https://www.google.com";
        String protocol = url.substring(0, url.indexOf(":"));
        String type = url.substring(url.lastIndexOf(".") + 1);
        //  lastIndexOf search for the last occurence
        //  +1 because we want to extract the words after the periodt (move to the next)

        if (type.equals("com")) {
            System.out.println("Commercial");
        } else if (type.equals("org")) {
            System.out.println("Organization");
        } else if (type.equals("net")) {
            System.out.println("Network");
        } else if (type.equals("edu")) {
            System.out.println("Education");
        } else {
            System.out.println("Unknown");
        }

        if (protocol.equals("http")) {
            System.out.println("Hypertext Transfer Protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        } else if (protocol.equals("https")) {
            System.out.println("Hypertext Transfer Protocol Secure");
        } else {
            System.out.println("Unknown");
        }
    }
}
