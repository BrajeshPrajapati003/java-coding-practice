interface DocumentPrinter{
    void printDocument(String document);
    void cancelPrinting();
}

public class CustomDocumentPrinting {
    public static void main(String[] args) {
        DocumentPrinter documentPrinter = new DocumentPrinter() {
            @Override
            public void printDocument(String document){
                // Implement document printing logic here
                System.out.println("Printing document: " + document);
            }

            @Override
            public void cancelPrinting(){
                // Implement cancel printing logic here
                System.out.println("Document printing canceled");
            }
        };

        String document = "Sample Document";
        documentPrinter.printDocument(document);
        documentPrinter.cancelPrinting();
    }
}
