package in.ashwanik.pdp.visitor;

import lombok.Getter;

@Getter
abstract class DocumentPart {
    private final String text;

    DocumentPart(String text) {
        this.text = text;
    }

    abstract void accept(Visitor visitor);

}
