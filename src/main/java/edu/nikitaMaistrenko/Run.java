package edu.nikitaMaistrenko;

public class Run {
    public static void main(String[] args) {
        StaxWriter.creatAndWrite();
        NameAdditor.add("result.xml");
        PersonViewer.show("other.xml");
    }
}
